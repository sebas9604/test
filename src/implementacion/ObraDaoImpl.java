/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionBD;
import interfaces.IObraDao;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Obra;

/**
 *
 * @author jlinares
 */
public class ObraDaoImpl implements IObraDao {

    @Override
    public boolean registrarNuevaObra(Obra obra) {
        boolean registrar = false;
        Connection con;
        try {

            ResultSet rs;
            rs = obtenerObra(obra);
            if(!rs.next()){
            String sql = "INSERT INTO obra (idObra, nombreObra, direccionObra) " + "VALUES (?,?,?);";
            con = ConexionBD.connect();
            PreparedStatement psql = con.prepareStatement(sql);
            psql.setString(1, obra.getIdObra());
            psql.setString(2, obra.getNombreObra());
            psql.setString(3, obra.getDireccionObra());
            psql.executeUpdate();
            registrar = true;
            psql.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");
            }else{
            JOptionPane.showMessageDialog(null, "Ya existe un registro con la identificación: " + obra.getIdObra());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error insertando al obra" + ex);
        }

        return registrar;
    }

    @Override
    public ResultSet obtenerObras() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idObra, nombreObra, direccionObra "
                + "FROM obra ORDER BY idObra";
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
//            stm.close();
//            rs.close();
//            con.close();
        } catch (Exception e) {
        }

        return rs;
    }

    @Override
    public boolean actualizarObra(Obra obra) {
        Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
  try {
      ResultSet rs;
      rs = obtenerObra(obra);
      
      if(rs.next()){
        String sql = "UPDATE obra SET idObra='" + obra.getIdObra()
                + "', nombreObra='" + obra.getNombreObra()
                + "', direccionObra='" + obra.getDireccionObra()
                + "' WHERE idObra=" + obra.getIdObra();
      
            connect = ConexionBD.connect();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
            JOptionPane.showMessageDialog(null, "Operación Exitosa");
      }else{
                  JOptionPane.showMessageDialog(null, "El registro no existe");
      }
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminarObra(Obra obra) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;

        try {
            ResultSet rs = obtenerObra(obra);
            if (rs.next()) {

                String sql = "DELETE FROM obra WHERE idObra = "
                        + obra.getIdObra() + ";";

                connect = ConexionBD.connect();
                stm = connect.createStatement();
                stm.execute(sql);
                eliminar = true;
                JOptionPane.showMessageDialog(null, "Operación Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "El registro no existe");

            }
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;

    }

    @Override
    public ResultSet obtenerObra(Obra obra) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idObra, nombreObra, direccionObra "
                + "FROM obra WHERE idObra = " + obra.getIdObra() + ";";
        System.out.println(sql);
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
//            stm.close();
//            rs.close();
//            con.close();
        } catch (Exception e) {
        }

        return rs;
    }

    @Override
    public Obra consultarObra(Obra obra) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null; 
        
        String sql = "SELECT idObra, nombreObra, direccionObra FROM obra WHERE idObra = " + obra.getIdObra() + ";";
        Obra o =new Obra();
     
        	try {			
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
			if (rs.next()) {
				o.setIdObra(rs.getString(1));
				o.setNombreObra(rs.getString(2));
				o.setDireccionObra(rs.getString(3));
                                
			}
			stm.close();
			rs.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ObraDaoImple, método consultarObra");
			e.printStackTrace();
		}
        return o;

    }

}
