/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionBD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Empleados;
import interfaces.IEmpleadosDao;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import jdk.internal.org.xml.sax.InputSource;
import modelo.Cargo;
import presentacion.Principal;

/**
 *
 * @author tolis
 */
public class EmpleadosDaoImpl implements IEmpleadosDao {

    @Override
    public boolean registrarNuevoEmpleado(Empleados empleado) {
        boolean registrar = false;
        Connection con;
        try {
            con = ConexionBD.connect();
            File archivoImg = new File(empleado.getFotoEmpleado().toString());
            int idCargo = consultarIdCargoPorNombreCargo(empleado);
            String sql = "INSERT INTO empleados (idEmpleado, nombresEmpleado, apellidosEmpleado, idCargo, fotoEmpleado)" + "VALUES (?,?,?,?,?);";
            FileInputStream convertir_imagen = new FileInputStream(archivoImg);
            PreparedStatement psql = con.prepareStatement(sql);
            psql.setInt(1, empleado.getIdEmpleado());
            psql.setString(2, empleado.getNombresEmpleado());
            psql.setString(3, empleado.getApellidosEmpleado());
            psql.setInt(4, idCargo);
            psql.setBlob(5, convertir_imagen, archivoImg.length());
            psql.executeUpdate();
            registrar = true;
            psql.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");

        } catch (FileNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error insertando al empleado" + ex);
        }

        return registrar;
    }

    @Override
    public ResultSet obtenerEmpleados() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idEmpleado, nombresEmpleado, apellidosEmpleado, idCargo "
                + "FROM empleados ORDER BY idEmpleado";
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
//            stm.close();
//            rs.close();
//            con.close();
        } catch (Exception e) {
            System.out.println("implementacion.EmpleadosDaoImpl.obtenerEmpleados()");
            e.printStackTrace();
        }

        return rs;
    }

    @Override
    public boolean actualizarEmpleado(Empleados empleado) {
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;
        int idCargo = consultarIdCargoPorNombreCargo(empleado);

        String sql = "UPDATE empleados SET idEmpleado=" + empleado.getIdEmpleado() + ", nombresEmpleado='" + empleado.getNombresEmpleado()
                + "', apellidosEmpleado='" + empleado.getApellidosEmpleado() + "', idCargo='" + idCargo
                + "', fotoEmpleado='" + empleado.getFotoEmpleado() + "' WHERE idEmpleado=" + empleado.getIdEmpleado();
        try {
            connect = ConexionBD.connect();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminarEmpleado(Empleados empleado) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM empleados WHERE idEmpleado=" + empleado.getIdEmpleado();
        try {
            connect = ConexionBD.connect();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }

    @Override
    public ResultSet obtenerEmpleado(Empleados empleado) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idEmpleado, nombresEmpleado, apellidosEmpleado, cargoEmpleado, fotoEmpleado "
                + "FROM empleados WHERE idEmpleado = " + empleado.getIdEmpleado() + ";";
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
    public Empleados consultarEmpleado(Empleados empleado) {
        ImageIcon ii = getFoto(empleado);
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        String s = consultarNombreCargoPorIdCargo(empleado);
        String sql = "SELECT idEmpleado, nombresEmpleado, ApellidosEmpleado, idCargo, fotoEmpleado FROM empleados WHERE idEmpleado = " + empleado.getIdEmpleado() + ";";
        Empleados e = new Empleados();

        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                e.setIdEmpleado(rs.getInt(1));
                e.setNombresEmpleado(rs.getString(2));
                e.setApellidosEmpleado(rs.getString(3));
                e.setCargoEmpleado(s);
                e.setFotoEmpleado(rs.getString(5));

//                Blob bytesImagen = rs.getBlob("fotoEmpleado");
//                byte[] bytesLeidos = bytesImagen.getBytes(1, (int) bytesImagen.length());
//
//                ImageIcon image = new ImageIcon(bytesLeidos);
                e.setFotoEmp(ii);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: Clase EmpleadosDaoImple, método consultarEmpleados");
            ex.printStackTrace();
        }
        return e;
    }

    public int consultarIdCargoPorNombreCargo(Empleados empleado) {

        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "select idCargo from cargo where nombreCargo = '" + empleado.getCargoEmpleado() + "';";
        Cargo c = new Cargo();

        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                c.setIdCargo(rs.getInt(1));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return c.getIdCargo();
    }

    public String consultarNombreCargoPorIdCargo(Empleados empleado) {

        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "select nombreCargo from cargo where idCargo = " + empleado.getCargoEmpleado() + ";";
        Cargo c = new Cargo();

        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                c.setNombreCargo(rs.getString(1));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return c.getNombreCargo();
    }

    public ImageIcon getFoto(Empleados empleado) {

        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT fotoEmpleado FROM empleados WHERE idEmpleado = " + empleado.getIdEmpleado() + ";";
        ImageIcon ii = null;
        InputStream is = null;
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            if (rs.next()) {
                is = rs.getBinaryStream(1);
                BufferedImage bi =  ImageIO.read(is);
                ii = new ImageIcon(bi);
            }
        } catch (Exception e) {
        }
        return ii;
    }
}
