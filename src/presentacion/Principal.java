package presentacion;

import conexion.ConexionBD;
import controladores.ControllerCargo;
import controladores.ControllerEmpleados;
import controladores.ControllerObra;
import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import modelo.Cargo;
import modelo.Empleados;
import modelo.Obra;

/**
 *
 * @author tolis
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setResizable(false);
        ocultarVentanas();
    }

    //OPCIONES OBRA   
    public boolean consultarObrasFlag;
    public boolean consultarObraFlag;
    public boolean crearObraFlag;
    public boolean modificarObraFlag;
    public boolean eliminarObraFlag;
    public boolean repHerramientasEnObraFlag;

    //OPCIONES CARGO   
    public boolean consultarCargosFlag;
    public boolean consultarCargoFlag;
    public boolean crearCargoFlag;
    public boolean modificarCargoFlag;
    public boolean eliminarCargoFlag;
    public boolean repHerramientasEnCargoFlag;

    //OPCIONES HERRAMIENTA   
    public boolean consultarHerramientasFlag;
    public boolean consultarHerramientaFlag;
    public boolean crearHerramientaFlag;
    public boolean modificarHerramientaFlag;
    public boolean eliminarHerramientaFlag;
    public boolean repHerramientasEnHerramientaFlag;

    //OPCIONES EMPLEADOS   
    public boolean consultarEmpleadosFlag;
    public boolean consultarEmpleadoFlag;
    public boolean crearEmpleadoFlag;
    public boolean modificarEmpleadoFlag;
    public boolean eliminarEmpleadoFlag;
    public boolean repHerramientasEnEmpleadoFlag;

    //INHABILITAR BANDERAS
    public void inhabilitarBanderasObra() {
        consultarObrasFlag = false;
        consultarObraFlag = false;
        crearObraFlag = false;
        modificarObraFlag = false;
        eliminarObraFlag = false;
        repHerramientasEnObraFlag = false;
    }

    public void inhabilitarBanderasCargo() {
        consultarCargosFlag = false;
        consultarCargoFlag = false;
        crearCargoFlag = false;
        modificarCargoFlag = false;
        eliminarCargoFlag = false;
        repHerramientasEnCargoFlag = false;
    }

    public void inhabilitarBanderasHerramienta() {
        consultarHerramientasFlag = false;
        consultarHerramientaFlag = false;
        crearHerramientaFlag = false;
        modificarHerramientaFlag = false;
        eliminarHerramientaFlag = false;
        repHerramientasEnHerramientaFlag = false;
    }

    public void inhabilitarBanderasEmpleado() {
        consultarEmpleadoFlag = false;
        consultarEmpleadoFlag = false;
        crearEmpleadoFlag = false;
        modificarEmpleadoFlag = false;
        eliminarEmpleadoFlag = false;
        repHerramientasEnObraFlag = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        ventanaCargo = new javax.swing.JInternalFrame();
        labelTituloCargo = new javax.swing.JLabel();
        labelOperacionCargo = new javax.swing.JLabel();
        labelNombreCargo = new javax.swing.JLabel();
        btEjecutarCargo = new javax.swing.JButton();
        tfNombreCargo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCargos = new javax.swing.JTable();
        labelIdCargo = new javax.swing.JLabel();
        tfIdCargo = new javax.swing.JTextField();
        menuOpcionesCargo = new javax.swing.JMenuBar();
        opcionConsultarCargo = new javax.swing.JMenu();
        consultarTodosLosCargos = new javax.swing.JMenuItem();
        consultarCargo = new javax.swing.JMenuItem();
        opcionCrearCargo = new javax.swing.JMenu();
        opcionModificarCargo = new javax.swing.JMenu();
        opcionEliminarCargo = new javax.swing.JMenu();
        ventanaEmpleado = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        labelTituloEmpleado = new javax.swing.JLabel();
        labelOperacionEmpleado = new javax.swing.JLabel();
        labelReportesEmpleado = new javax.swing.JLabel();
        labelIdEmpleado = new javax.swing.JLabel();
        labelNombresEmpleado = new javax.swing.JLabel();
        labelApellidosEmpleado = new javax.swing.JLabel();
        labelCargoEmpleado = new javax.swing.JLabel();
        labelFotoEmpleado = new javax.swing.JLabel();
        tfIdEmpleado = new javax.swing.JTextField();
        tfNombresEmpleado = new javax.swing.JTextField();
        cbCargoEmpleado = new javax.swing.JComboBox<>();
        tfApellidosEmpleado = new javax.swing.JTextField();
        labelImagenEmpleado = new javax.swing.JLabel();
        btEjecutarEmpleado = new javax.swing.JButton();
        btReporteHerramientasACargo = new javax.swing.JButton();
        btTomarFotoEmpleado = new javax.swing.JButton();
        menuOpcionEmpleado = new javax.swing.JMenuBar();
        opcionConsultarEmpleado = new javax.swing.JMenu();
        consultarEmpleados = new javax.swing.JMenuItem();
        consultarEmpleado = new javax.swing.JMenuItem();
        opcionCrearEmpleado = new javax.swing.JMenu();
        opcionModificarEmpelado = new javax.swing.JMenu();
        opcionEliminarEmpleado = new javax.swing.JMenu();
        ventanaHerramienta = new javax.swing.JInternalFrame();
        labelTituloHerramienta = new javax.swing.JLabel();
        labelIdHerramienta = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelLugarCompra = new javax.swing.JLabel();
        labelPrecioCompra = new javax.swing.JLabel();
        labelResponsable = new javax.swing.JLabel();
        labelReportesHerramienta = new javax.swing.JLabel();
        tfIdHerramienta = new javax.swing.JTextField();
        tfNombreHerramienta = new javax.swing.JTextField();
        tfLugarCompraHerramienta = new javax.swing.JTextField();
        tfPrecioCompraHerramienta = new javax.swing.JTextField();
        cbResponsableHerramienta = new javax.swing.JComboBox<>();
        labelEstadoHerramienta = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        labelFechaCompra = new javax.swing.JLabel();
        tfFechaCompraHerramienta = new javax.swing.JTextField();
        btRepoTiempoVida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHerramienta = new javax.swing.JTable();
        btTomarFotoHerramienta = new javax.swing.JButton();
        btEjecutarHerramienta = new javax.swing.JButton();
        labelOperacionHerramienta = new javax.swing.JLabel();
        menuOpcionesHerramientas = new javax.swing.JMenuBar();
        opcionConsultarHerramienta = new javax.swing.JMenu();
        consultarHerramientas = new javax.swing.JMenu();
        consultarHerramienta = new javax.swing.JMenu();
        opcionCrearHerramienta = new javax.swing.JMenu();
        opcionModificarHerramienta = new javax.swing.JMenu();
        opcionEliminarHerramienta = new javax.swing.JMenu();
        opcionMovimiento = new javax.swing.JMenu();
        entradaObra = new javax.swing.JMenu();
        salidaObra = new javax.swing.JMenu();
        ventanaObra = new javax.swing.JInternalFrame();
        labelTituloObra = new javax.swing.JLabel();
        labelIdObra = new javax.swing.JLabel();
        labelNombreObra = new javax.swing.JLabel();
        labelDireccionObra = new javax.swing.JLabel();
        tfIdObra = new javax.swing.JTextField();
        tfNombreObra = new javax.swing.JTextField();
        tfUbicacionObra = new javax.swing.JTextField();
        btEjecutarObra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaObras = new javax.swing.JTable();
        labelOperacionObra = new javax.swing.JLabel();
        labelReportesObra = new javax.swing.JLabel();
        btRepHerramientasEnObra = new javax.swing.JButton();
        menuOpcionesObra = new javax.swing.JMenuBar();
        opcionConsultarObra = new javax.swing.JMenu();
        consultarObras = new javax.swing.JMenuItem();
        consultarObra = new javax.swing.JMenuItem();
        opcionCrearObra = new javax.swing.JMenu();
        opcionModificarObra = new javax.swing.JMenu();
        opcionEliminarObra = new javax.swing.JMenu();
        menuElementos = new javax.swing.JMenuBar();
        menuObra = new javax.swing.JMenu();
        menuEmpleado = new javax.swing.JMenu();
        menuHerramienta = new javax.swing.JMenu();
        menuCargo = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL DE HERRAMIENTAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ventanaCargo.setMaximumSize(new java.awt.Dimension(700, 756));
        ventanaCargo.setPreferredSize(new java.awt.Dimension(700, 756));
        ventanaCargo.setVisible(true);

        labelTituloCargo.setText("CARGO");

        labelNombreCargo.setText("Cargo");

        btEjecutarCargo.setText("EJECUTAR");
        btEjecutarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEjecutarCargoActionPerformed(evt);
            }
        });

        tablaCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaCargos);

        labelIdCargo.setText("Identificacion");

        opcionConsultarCargo.setText("Consultar");

        consultarTodosLosCargos.setText("Todos los cargos");
        consultarTodosLosCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarTodosLosCargosActionPerformed(evt);
            }
        });
        opcionConsultarCargo.add(consultarTodosLosCargos);

        consultarCargo.setText("Cargo");
        consultarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCargoActionPerformed(evt);
            }
        });
        opcionConsultarCargo.add(consultarCargo);

        menuOpcionesCargo.add(opcionConsultarCargo);

        opcionCrearCargo.setText("Crear");
        opcionCrearCargo.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionCrearCargoMenuSelected(evt);
            }
        });
        menuOpcionesCargo.add(opcionCrearCargo);

        opcionModificarCargo.setText("Modificar");
        opcionModificarCargo.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionModificarCargoMenuSelected(evt);
            }
        });
        menuOpcionesCargo.add(opcionModificarCargo);

        opcionEliminarCargo.setText("Eliminar");
        opcionEliminarCargo.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionEliminarCargoMenuSelected(evt);
            }
        });
        menuOpcionesCargo.add(opcionEliminarCargo);

        ventanaCargo.setJMenuBar(menuOpcionesCargo);

        javax.swing.GroupLayout ventanaCargoLayout = new javax.swing.GroupLayout(ventanaCargo.getContentPane());
        ventanaCargo.getContentPane().setLayout(ventanaCargoLayout);
        ventanaCargoLayout.setHorizontalGroup(
            ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaCargoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEjecutarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(891, 891, 891))
            .addGroup(ventanaCargoLayout.createSequentialGroup()
                .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaCargoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaCargoLayout.createSequentialGroup()
                                .addComponent(labelTituloCargo)
                                .addGap(137, 137, 137)
                                .addComponent(labelOperacionCargo))
                            .addGroup(ventanaCargoLayout.createSequentialGroup()
                                .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNombreCargo)
                                    .addComponent(labelIdCargo))
                                .addGap(60, 60, 60)
                                .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNombreCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(tfIdCargo)))))
                    .addGroup(ventanaCargoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaCargoLayout.setVerticalGroup(
            ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaCargoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloCargo)
                    .addComponent(labelOperacionCargo))
                .addGap(37, 37, 37)
                .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdCargo)
                    .addComponent(tfIdCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreCargo)
                    .addComponent(tfNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btEjecutarCargo)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        ventanaEmpleado.setPreferredSize(new java.awt.Dimension(1256, 756));
        ventanaEmpleado.setVisible(true);

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaEmpleados);

        labelTituloEmpleado.setText("EMPLEADOS");

        labelReportesEmpleado.setText("REPORTES");

        labelIdEmpleado.setText("Identificación");

        labelNombresEmpleado.setText("Nombres");

        labelApellidosEmpleado.setText("Apellidos");

        labelCargoEmpleado.setText("Cargo");

        labelFotoEmpleado.setText("Foto");

        cbCargoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tfApellidosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidosEmpleadoActionPerformed(evt);
            }
        });

        labelImagenEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelImagenEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagenEmpleadoMouseClicked(evt);
            }
        });

        btEjecutarEmpleado.setText("EJECUTAR");
        btEjecutarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEjecutarEmpleadoActionPerformed(evt);
            }
        });

        btReporteHerramientasACargo.setText("HERRAMIENTAS A CARGO");

        btTomarFotoEmpleado.setText("TOMAR FOTO");
        btTomarFotoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTomarFotoEmpleadoActionPerformed(evt);
            }
        });

        opcionConsultarEmpleado.setText("Consultar");

        consultarEmpleados.setText("Todos los Empleados");
        consultarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpleadosActionPerformed(evt);
            }
        });
        opcionConsultarEmpleado.add(consultarEmpleados);

        consultarEmpleado.setText("Empleado");
        consultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpleadoActionPerformed(evt);
            }
        });
        opcionConsultarEmpleado.add(consultarEmpleado);

        menuOpcionEmpleado.add(opcionConsultarEmpleado);

        opcionCrearEmpleado.setText("Crear");
        opcionCrearEmpleado.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionCrearEmpleadoMenuSelected(evt);
            }
        });
        menuOpcionEmpleado.add(opcionCrearEmpleado);

        opcionModificarEmpelado.setText("Modificar");
        opcionModificarEmpelado.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionModificarEmpeladoMenuSelected(evt);
            }
        });
        menuOpcionEmpleado.add(opcionModificarEmpelado);

        opcionEliminarEmpleado.setText("Eliminar");
        opcionEliminarEmpleado.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionEliminarEmpleadoMenuSelected(evt);
            }
        });
        menuOpcionEmpleado.add(opcionEliminarEmpleado);

        ventanaEmpleado.setJMenuBar(menuOpcionEmpleado);

        javax.swing.GroupLayout ventanaEmpleadoLayout = new javax.swing.GroupLayout(ventanaEmpleado.getContentPane());
        ventanaEmpleado.getContentPane().setLayout(ventanaEmpleadoLayout);
        ventanaEmpleadoLayout.setHorizontalGroup(
            ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIdEmpleado)
                                    .addComponent(labelCargoEmpleado)
                                    .addComponent(labelApellidosEmpleado)
                                    .addComponent(labelNombresEmpleado))
                                .addGap(84, 84, 84)
                                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btEjecutarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(tfIdEmpleado)
                                    .addComponent(tfNombresEmpleado)
                                    .addComponent(cbCargoEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfApellidosEmpleado)))
                            .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                                .addComponent(labelTituloEmpleado)
                                .addGap(102, 102, 102)
                                .addComponent(labelOperacionEmpleado)))
                        .addGap(87, 87, 87)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelFotoEmpleado)
                            .addComponent(btTomarFotoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(labelImagenEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btReporteHerramientasACargo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelReportesEmpleado))))
                .addContainerGap())
        );
        ventanaEmpleadoLayout.setVerticalGroup(
            ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEmpleadoLayout.createSequentialGroup()
                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTituloEmpleado)
                            .addComponent(labelOperacionEmpleado)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFotoEmpleado)
                            .addComponent(labelReportesEmpleado))))
                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIdEmpleado)
                            .addComponent(tfIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombresEmpleado)
                            .addComponent(tfNombresEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelApellidosEmpleado)
                            .addComponent(tfApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCargoEmpleado)))
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btReporteHerramientasACargo))
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelImagenEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTomarFotoEmpleado)
                    .addComponent(btEjecutarEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        ventanaHerramienta.setPreferredSize(new java.awt.Dimension(1256, 752));
        ventanaHerramienta.setVisible(true);

        labelTituloHerramienta.setText("HERRAMIENTA");

        labelIdHerramienta.setText("Referencia");

        labelNombre.setText("Nombre");

        labelLugarCompra.setText("Lugar de compra");

        labelPrecioCompra.setText("Precio de compra");

        labelResponsable.setText("Responsable");

        labelReportesHerramienta.setText("REPORTES");

        tfLugarCompraHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLugarCompraHerramientaActionPerformed(evt);
            }
        });

        cbResponsableHerramienta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelEstadoHerramienta.setText("Estado");

        labelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelFechaCompra.setText("Fecha de compra");

        tfFechaCompraHerramienta.setToolTipText("MM/DD/AA");

        btRepoTiempoVida.setText("TIEMPO DE VIDA");

        tablaHerramienta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaHerramienta);

        btTomarFotoHerramienta.setText("TOMAR FOTO");
        btTomarFotoHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTomarFotoHerramientaActionPerformed(evt);
            }
        });

        btEjecutarHerramienta.setText("EJECUTAR");
        btEjecutarHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEjecutarHerramientaActionPerformed(evt);
            }
        });

        opcionConsultarHerramienta.setText("Consultar");

        consultarHerramientas.setText("Todas las herramientas");
        opcionConsultarHerramienta.add(consultarHerramientas);

        consultarHerramienta.setText("Herramienta");
        opcionConsultarHerramienta.add(consultarHerramienta);

        menuOpcionesHerramientas.add(opcionConsultarHerramienta);

        opcionCrearHerramienta.setText("Crear");
        menuOpcionesHerramientas.add(opcionCrearHerramienta);

        opcionModificarHerramienta.setText("Modificar");
        menuOpcionesHerramientas.add(opcionModificarHerramienta);

        opcionEliminarHerramienta.setText("Eliminar");
        menuOpcionesHerramientas.add(opcionEliminarHerramienta);

        opcionMovimiento.setText("Movimiento");

        entradaObra.setText("Entrada a Obra");
        opcionMovimiento.add(entradaObra);

        salidaObra.setText("Salida de Obra");
        opcionMovimiento.add(salidaObra);

        menuOpcionesHerramientas.add(opcionMovimiento);

        ventanaHerramienta.setJMenuBar(menuOpcionesHerramientas);

        javax.swing.GroupLayout ventanaHerramientaLayout = new javax.swing.GroupLayout(ventanaHerramienta.getContentPane());
        ventanaHerramienta.getContentPane().setLayout(ventanaHerramientaLayout);
        ventanaHerramientaLayout.setHorizontalGroup(
            ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                        .addComponent(labelTituloHerramienta)
                        .addGap(80, 80, 80)
                        .addComponent(labelOperacionHerramienta))
                    .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                        .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelLugarCompra)
                                    .addComponent(labelPrecioCompra)
                                    .addComponent(labelResponsable))
                                .addGap(48, 48, 48)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPrecioCompraHerramienta)
                                    .addComponent(cbResponsableHerramienta, 0, 272, Short.MAX_VALUE)
                                    .addComponent(tfLugarCompraHerramienta)))
                            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIdHerramienta)
                                    .addComponent(labelNombre)
                                    .addComponent(labelFechaCompra))
                                .addGap(49, 49, 49)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIdHerramienta)
                                    .addComponent(tfNombreHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(tfFechaCompraHerramienta))))
                        .addGap(79, 79, 79)
                        .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelEstadoHerramienta)
                            .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btTomarFotoHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelReportesHerramienta)
                    .addComponent(btRepoTiempoVida))
                .addGap(242, 242, 242))
            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(btEjecutarHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaHerramientaLayout.setVerticalGroup(
            ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloHerramienta)
                    .addComponent(labelReportesHerramienta)
                    .addComponent(labelOperacionHerramienta))
                .addGap(18, 18, 18)
                .addComponent(labelEstadoHerramienta)
                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                        .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelIdHerramienta)
                                    .addComponent(tfIdHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombre)
                                    .addComponent(tfNombreHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelFechaCompra)
                                    .addComponent(tfFechaCompraHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelLugarCompra)
                                    .addComponent(tfLugarCompraHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPrecioCompra)
                                    .addComponent(tfPrecioCompraHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelResponsable)
                                .addComponent(cbResponsableHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btTomarFotoHerramienta)))
                    .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btRepoTiempoVida)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEjecutarHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        ventanaObra.setVisible(true);

        labelTituloObra.setText("OBRA");

        labelIdObra.setText("Centro de Costo");

        labelNombreObra.setText("Nombre");

        labelDireccionObra.setText("Direccion");

        btEjecutarObra.setText("EJECUTAR");
        btEjecutarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEjecutarObraActionPerformed(evt);
            }
        });

        tablaObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaObras);

        labelReportesObra.setText("REPORTES");

        btRepHerramientasEnObra.setText("HERRAMIENTAS EN OBRA");

        opcionConsultarObra.setText("Consultar");

        consultarObras.setText("Todas las obras");
        consultarObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarObrasActionPerformed(evt);
            }
        });
        opcionConsultarObra.add(consultarObras);

        consultarObra.setText("Obra");
        consultarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarObraActionPerformed(evt);
            }
        });
        opcionConsultarObra.add(consultarObra);

        menuOpcionesObra.add(opcionConsultarObra);

        opcionCrearObra.setText("Crear");
        opcionCrearObra.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionCrearObraMenuSelected(evt);
            }
        });
        opcionCrearObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCrearObraActionPerformed(evt);
            }
        });
        menuOpcionesObra.add(opcionCrearObra);

        opcionModificarObra.setText("Modificar");
        opcionModificarObra.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionModificarObraMenuSelected(evt);
            }
        });
        menuOpcionesObra.add(opcionModificarObra);

        opcionEliminarObra.setText("Eliminar");
        opcionEliminarObra.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionEliminarObraMenuSelected(evt);
            }
        });
        menuOpcionesObra.add(opcionEliminarObra);

        ventanaObra.setJMenuBar(menuOpcionesObra);

        javax.swing.GroupLayout ventanaObraLayout = new javax.swing.GroupLayout(ventanaObra.getContentPane());
        ventanaObra.getContentPane().setLayout(ventanaObraLayout);
        ventanaObraLayout.setHorizontalGroup(
            ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaObraLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
                    .addGroup(ventanaObraLayout.createSequentialGroup()
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombreObra)
                            .addComponent(labelIdObra)
                            .addComponent(labelDireccionObra)
                            .addComponent(labelTituloObra))
                        .addGap(63, 63, 63)
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOperacionObra)
                            .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNombreObra)
                                .addComponent(tfUbicacionObra)
                                .addComponent(tfIdObra)
                                .addComponent(btEjecutarObra, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                        .addGap(257, 257, 257)
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelReportesObra)
                            .addComponent(btRepHerramientasEnObra, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ventanaObraLayout.setVerticalGroup(
            ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaObraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelTituloObra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelOperacionObra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelReportesObra))
                .addGap(31, 31, 31)
                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaObraLayout.createSequentialGroup()
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaObraLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelIdObra)
                                .addGap(21, 21, 21)
                                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombreObra)
                                    .addComponent(tfNombreObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btRepHerramientasEnObra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDireccionObra)
                            .addComponent(tfUbicacionObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfIdObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btEjecutarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        menuObra.setText("Obra");
        menuObra.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuObraMenuSelected(evt);
            }
        });
        menuElementos.add(menuObra);

        menuEmpleado.setText("Empleado");
        menuEmpleado.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuEmpleadoMenuSelected(evt);
            }
        });
        menuElementos.add(menuEmpleado);

        menuHerramienta.setText("Herramienta");
        menuHerramienta.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuHerramientaMenuSelected(evt);
            }
        });
        menuElementos.add(menuHerramienta);

        menuCargo.setText("Cargo");
        menuCargo.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuCargoMenuSelected(evt);
            }
        });
        menuElementos.add(menuCargo);

        setJMenuBar(menuElementos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventanaObra)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(ventanaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventanaObra)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1298, 847));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuObraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuObraMenuSelected
        ocultarVentanas();
        ventanaObra.setVisible(true);
        inhabilitarCamposObra();
    }//GEN-LAST:event_menuObraMenuSelected

    private void consultarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarObraActionPerformed
        inhabilitarBanderasObra();
        inhabilitarCamposObra();
        labelOperacionObra.setText("CONSULTAR");
        consultarObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        btEjecutarObra.setEnabled(true);


    }//GEN-LAST:event_consultarObraActionPerformed

    private void opcionCrearObraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionCrearObraMenuSelected
        inhabilitarBanderasObra();
        inhabilitarCamposObra();
        labelOperacionObra.setText("CREAR");
        crearObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        tfNombreObra.setEnabled(true);
        tfNombreObra.setBackground(Color.white);
        tfUbicacionObra.setEnabled(true);
        tfUbicacionObra.setBackground(Color.white);
        btEjecutarObra.setEnabled(true);
    }//GEN-LAST:event_opcionCrearObraMenuSelected

    private void opcionModificarObraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionModificarObraMenuSelected
        inhabilitarBanderasObra();
//        inhabilitarCamposObra();
        labelOperacionObra.setText("MODIFICAR");
        modificarObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        tfNombreObra.setEnabled(true);
        tfNombreObra.setBackground(Color.white);
        tfUbicacionObra.setEnabled(true);
        tfUbicacionObra.setBackground(Color.white);
        btEjecutarObra.setEnabled(true);
    }//GEN-LAST:event_opcionModificarObraMenuSelected

    private void opcionEliminarObraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionEliminarObraMenuSelected
        inhabilitarBanderasObra();
//        inhabilitarCamposObra();
        labelOperacionObra.setText("ELIMINAR");
        eliminarObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        btEjecutarObra.setEnabled(true);
    }//GEN-LAST:event_opcionEliminarObraMenuSelected

    private void consultarObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarObrasActionPerformed
        inhabilitarBanderasObra();
        inhabilitarCamposObra();
        labelOperacionObra.setText("CONSULTAR TODO");
        consultarObrasFlag = true;
        btEjecutarObra.setEnabled(true);

    }//GEN-LAST:event_consultarObrasActionPerformed

    private void btEjecutarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEjecutarObraActionPerformed
        if (consultarObrasFlag) {
            ControllerObra obraCt = new ControllerObra();
            obraCt.verObras(tablaObras);
            inhabilitarCamposObra();
        } else if (crearObraFlag) {
            Obra obra = new Obra();
            ControllerObra obraCt = new ControllerObra();
            obra.setIdObra(tfIdObra.getText());
            obra.setNombreObra(tfNombreObra.getText());
            obra.setDireccionObra(tfUbicacionObra.getText());
            obraCt.registrar(obra);
            inhabilitarCamposObra();
        } else if (modificarObraFlag) {
            Obra obra = new Obra();
            ControllerObra obraCt = new ControllerObra();
            obra.setIdObra(tfIdObra.getText());
            obra.setNombreObra(tfNombreObra.getText());
            obra.setDireccionObra(tfUbicacionObra.getText());
            obraCt.actualizar(obra);
            inhabilitarCamposObra();
        } else if (eliminarObraFlag) {
            Obra obra = new Obra();
            ControllerObra obraCt = new ControllerObra();
            obra.setIdObra(tfIdObra.getText());
//            obra.setNombreObra(tfNombreObra.getText());
//            obra.setDireccionObra(tfUbicacionObra.getText());
            obraCt.eliminar(obra);
            inhabilitarCamposObra();
        } else if (consultarObraFlag) {
            Obra obra = new Obra();
            ControllerObra obraCt = new ControllerObra();
            obra.setIdObra(tfIdObra.getText());
//            obra.setNombreObra(tfNombreObra.getText());
//            obra.setDireccionObra(tfUbicacionObra.getText());
//            obraCt.verObra(tablaObras, obra);
            obra = obraCt.consultarObra(obra);
            tfNombreObra.setText(obra.getNombreObra());
            tfUbicacionObra.setText(obra.getDireccionObra());
//            inhabilitarCamposObra();
        }
    }//GEN-LAST:event_btEjecutarObraActionPerformed

    private void tfLugarCompraHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLugarCompraHerramientaActionPerformed

    }//GEN-LAST:event_tfLugarCompraHerramientaActionPerformed

    private void tfApellidosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidosEmpleadoActionPerformed

    }//GEN-LAST:event_tfApellidosEmpleadoActionPerformed

    private void menuEmpleadoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuEmpleadoMenuSelected
        ocultarVentanas();
        ventanaEmpleado.setVisible(true);
        inhabilitarCamposEmpleado();
    }//GEN-LAST:event_menuEmpleadoMenuSelected

    private void menuHerramientaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuHerramientaMenuSelected
        ocultarVentanas();
        ventanaHerramienta.setVisible(true);
        inhabilitarCamposHerramienta();
    }//GEN-LAST:event_menuHerramientaMenuSelected

    private void menuCargoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuCargoMenuSelected
        ocultarVentanas();
        ventanaCargo.setVisible(true);
        inhabilitarCamposCargo();
    }//GEN-LAST:event_menuCargoMenuSelected

    private void btEjecutarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEjecutarCargoActionPerformed
        if (consultarCargosFlag) {
            ControllerCargo cargoCt = new ControllerCargo();
            cargoCt.verCargos(tablaCargos);
            inhabilitarCamposCargo();
        } else if (crearCargoFlag) {
            Cargo cargo = new Cargo();
            ControllerCargo cargoCt = new ControllerCargo();
            cargo.setIdCargo(Integer.parseInt(tfIdCargo.getText()));
            cargo.setNombreCargo(tfNombreCargo.getText());
            cargoCt.registrar(cargo);
            inhabilitarCamposCargo();
        } else if (modificarCargoFlag) {
            Cargo obra = new Cargo();
            ControllerCargo obraCt = new ControllerCargo();
            obra.setIdCargo(Integer.parseInt(tfIdCargo.getText()));
            obra.setNombreCargo(tfNombreCargo.getText());
            obraCt.actualizar(obra);
            inhabilitarCamposCargo();
        } else if (eliminarCargoFlag) {
            Cargo cargo = new Cargo();
            ControllerCargo obraCt = new ControllerCargo();
            cargo.setIdCargo(Integer.parseInt(tfIdCargo.getText()));
//            obra.setNombreCargo(tfNombreCargo.getText());
//            obra.setDireccionCargo(tfUbicacionCargo.getText());
            obraCt.eliminar(cargo);
            inhabilitarCamposCargo();
        } else if (consultarCargoFlag) {
            Cargo cargo = new Cargo();
            ControllerCargo cargoCt = new ControllerCargo();
            cargo.setIdCargo(Integer.parseInt(tfIdCargo.getText()));
//            obra.setNombreCargo(tfNombreCargo.getText());
//            obra.setDireccionCargo(tfUbicacionCargo.getText());
//            obraCt.verCargo(tablaCargos, obra);
            cargo = cargoCt.consultarCargo(cargo);
            tfNombreCargo.setText(cargo.getNombreCargo());
//            inhabilitarCamposCargo();
        }
    }//GEN-LAST:event_btEjecutarCargoActionPerformed

    private void opcionCrearCargoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionCrearCargoMenuSelected
        inhabilitarBanderasCargo();
        inhabilitarCamposCargo();
        labelOperacionCargo.setText("CREAR");
        crearCargoFlag = true;
        tfIdCargo.setEnabled(true);
        tfIdCargo.setBackground(Color.white);
        tfNombreCargo.setEnabled(true);
        tfNombreCargo.setBackground(Color.white);
        btEjecutarCargo.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_opcionCrearCargoMenuSelected

    private void opcionModificarCargoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionModificarCargoMenuSelected
        inhabilitarBanderasCargo();
//        inhabilitarCamposCargo();
        labelOperacionCargo.setText("MODIFICAR");
        modificarCargoFlag = true;
        tfIdCargo.setEnabled(true);
        tfIdCargo.setBackground(Color.white);
        tfNombreCargo.setEnabled(true);
        tfNombreCargo.setBackground(Color.white);
        btEjecutarCargo.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_opcionModificarCargoMenuSelected

    private void opcionEliminarCargoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionEliminarCargoMenuSelected
        inhabilitarBanderasCargo();
//        inhabilitarCamposCargo();
        labelOperacionCargo.setText("ELIMINAR");
        eliminarCargoFlag = true;
        tfIdCargo.setEnabled(true);
        tfIdCargo.setBackground(Color.white);
        btEjecutarCargo.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_opcionEliminarCargoMenuSelected

    private void consultarTodosLosCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarTodosLosCargosActionPerformed
        inhabilitarBanderasCargo();
        inhabilitarCamposCargo();
        labelOperacionCargo.setText("CONSULTAR TODO");
        consultarCargosFlag = true;
        btEjecutarCargo.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarTodosLosCargosActionPerformed

    private void consultarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCargoActionPerformed
        inhabilitarBanderasCargo();
        inhabilitarCamposCargo();
        labelOperacionCargo.setText("CONSULTAR");
        consultarCargoFlag = true;
        tfIdCargo.setEnabled(true);
        tfIdCargo.setBackground(Color.white);
        btEjecutarCargo.setEnabled(true);
        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_consultarCargoActionPerformed

    private void consultarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpleadosActionPerformed
        inhabilitarBanderasEmpleado();
        inhabilitarCamposEmpleado();
        labelOperacionEmpleado.setText("CONSULTAR TODO");
        consultarEmpleadosFlag = true;
        btEjecutarEmpleado.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarEmpleadosActionPerformed

    private void consultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpleadoActionPerformed
        inhabilitarBanderasEmpleado();
        inhabilitarCamposEmpleado();
        labelOperacionEmpleado.setText("CONSULTAR");
        consultarEmpleadoFlag = true;
        tfIdEmpleado.setEnabled(true);
        tfIdEmpleado.setBackground(Color.white);
        btEjecutarEmpleado.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarEmpleadoActionPerformed

    private void opcionCrearObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCrearObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionCrearObraActionPerformed

    private void opcionCrearEmpleadoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionCrearEmpleadoMenuSelected
        inhabilitarBanderasEmpleado();
        inhabilitarCamposEmpleado();
        labelOperacionEmpleado.setText("CREAR");
        crearEmpleadoFlag = true;
        tfIdEmpleado.setEnabled(true);
        tfIdEmpleado.setBackground(Color.white);
        tfNombresEmpleado.setEnabled(true);
        tfNombresEmpleado.setBackground(Color.white);
        tfApellidosEmpleado.setEnabled(true);
        tfApellidosEmpleado.setBackground(Color.white);
        cbCargoEmpleado.setEnabled(true);
        btTomarFotoEmpleado.setEnabled(true);
        btEjecutarEmpleado.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_opcionCrearEmpleadoMenuSelected

    private void opcionModificarEmpeladoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionModificarEmpeladoMenuSelected
        inhabilitarBanderasEmpleado();
//        inhabilitarCamposEmpleado();
        labelOperacionEmpleado.setText("MODIFICAR");
        modificarEmpleadoFlag = true;
        tfIdEmpleado.setEnabled(true);
        tfIdEmpleado.setBackground(Color.white);
        tfNombresEmpleado.setEnabled(true);
        tfNombresEmpleado.setBackground(Color.white);
        tfApellidosEmpleado.setEnabled(true);
        tfApellidosEmpleado.setBackground(Color.white);
        cbCargoEmpleado.setEnabled(true);
        btTomarFotoEmpleado.setEnabled(true);
        btEjecutarEmpleado.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionModificarEmpeladoMenuSelected

    private void opcionEliminarEmpleadoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionEliminarEmpleadoMenuSelected
        inhabilitarBanderasEmpleado();
        inhabilitarCamposEmpleado();
        labelOperacionEmpleado.setText("ELIMINAR");
        eliminarEmpleadoFlag = true;
        tfIdEmpleado.setEnabled(true);
        tfIdEmpleado.setBackground(Color.white);
        btEjecutarEmpleado.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionEliminarEmpleadoMenuSelected

    private void btEjecutarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEjecutarEmpleadoActionPerformed
        if (consultarEmpleadosFlag) {
            ControllerEmpleados empleadoCt = new ControllerEmpleados();
            empleadoCt.verEmpleados(tablaEmpleados);
            inhabilitarCamposEmpleado();
        } else if (crearEmpleadoFlag) {
            Empleados empleado = new Empleados();
            ControllerEmpleados empleadoCt = new ControllerEmpleados();
            empleado.setIdEmpleado(Integer.parseInt(tfIdEmpleado.getText()));
            empleado.setNombresEmpleado(tfNombresEmpleado.getText());
            empleado.setApellidosEmpleado(tfApellidosEmpleado.getText());
            empleado.setCargoEmpleado(cbCargoEmpleado.getSelectedItem().toString());
            empleado.setFotoEmpleado("test.jpg");
            empleadoCt.registrar(empleado);
            inhabilitarCamposEmpleado();
        } else if (modificarEmpleadoFlag) {
            Empleados empleado = new Empleados();
            ControllerEmpleados empleadoCt = new ControllerEmpleados();
            empleado.setIdEmpleado(Integer.parseInt(tfIdEmpleado.getText()));
            empleado.setNombresEmpleado(tfNombresEmpleado.getText());
            empleado.setApellidosEmpleado(tfApellidosEmpleado.getText());
            empleado.setCargoEmpleado(cbCargoEmpleado.getSelectedItem().toString());
            empleado.setFotoEmpleado("test.jpg");
            empleadoCt.actualizar(empleado);
            inhabilitarCamposEmpleado();
        } else if (eliminarEmpleadoFlag) {
            Empleados empleado = new Empleados();
            ControllerEmpleados empleadoCt = new ControllerEmpleados();
            empleado.setIdEmpleado(Integer.parseInt(tfIdEmpleado.getText()));
//            obra.setNombreEmpleado(tfNombreEmpleado.getText());
//            obra.setDireccionEmpleado(tfUbicacionEmpleado.getText());
            empleadoCt.eliminar(empleado);
            inhabilitarCamposEmpleado();
        } else if (consultarEmpleadoFlag) {
            Empleados empleado = new Empleados();
            ControllerEmpleados empleadoCt = new ControllerEmpleados();
            empleado.setIdEmpleado(Integer.parseInt(tfIdEmpleado.getText()));
//            obra.setNombreEmpleado(tfNombreEmpleado.getText());
//            obra.setDireccionEmpleado(tfUbicacionEmpleado.getText());
//            obraCt.verEmpleado(tablaEmpleados, obra);
            empleado = empleadoCt.consultarEmpleado(empleado);
            tfNombresEmpleado.setText(empleado.getNombresEmpleado());
            tfApellidosEmpleado.setText(empleado.getApellidosEmpleado());
            cbCargoEmpleado.setToolTipText(empleado.getCargoEmpleado());
            ImageIcon imagen = empleado.getFotoEmp();
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(labelImagenEmpleado.getWidth(), labelImagenEmpleado.getHeight(), Image.SCALE_DEFAULT));
            labelImagenEmpleado.setIcon(icono);

//            inhabilitarCamposEmpleado();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btEjecutarEmpleadoActionPerformed

    private void btTomarFotoHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTomarFotoHerramientaActionPerformed
        WebCamFoto webcam = new WebCamFoto();
        webcam.run();
    }//GEN-LAST:event_btTomarFotoHerramientaActionPerformed

    private void btTomarFotoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTomarFotoEmpleadoActionPerformed
        WebCamFoto webcam = new WebCamFoto();
        webcam.run();
    }//GEN-LAST:event_btTomarFotoEmpleadoActionPerformed

    private void labelImagenEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagenEmpleadoMouseClicked
        JFileChooser se = new JFileChooser();
        FileInputStream fis = null;
        int longitudBytes = 0;
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = se.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(se.getSelectedFile());
                longitudBytes = (int) se.getSelectedFile().length();

                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(labelImagenEmpleado.getWidth(), labelImagenEmpleado.getHeight(), Image.SCALE_DEFAULT);
                labelImagenEmpleado.setIcon(new ImageIcon(icono));
                labelImagenEmpleado.updateUI();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_labelImagenEmpleadoMouseClicked

    private void btEjecutarHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEjecutarHerramientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEjecutarHerramientaActionPerformed

    private void inhabilitarCamposObra() {
        tfIdObra.setEnabled(false);
        tfIdObra.setBackground(Color.gray);
        tfIdObra.setText("");
        tfNombreObra.setEnabled(false);
        tfNombreObra.setBackground(Color.gray);
        tfNombreObra.setText("");
        tfUbicacionObra.setEnabled(false);
        tfUbicacionObra.setBackground(Color.gray);
        tfUbicacionObra.setText("");
        btEjecutarObra.setEnabled(false);
        labelOperacionObra.setText("");
    }

    private void inhabilitarCamposCargo() {
        tfIdCargo.setEnabled(false);
        tfIdCargo.setBackground(Color.gray);
        tfIdCargo.setText("");
        tfNombreCargo.setEnabled(false);
        tfNombreCargo.setBackground(Color.gray);
        tfNombreCargo.setText("");
        btEjecutarCargo.setEnabled(false);
        labelOperacionCargo.setText("");
    }

    private void inhabilitarCamposEmpleado() {
        tfIdEmpleado.setEnabled(false);
        tfIdEmpleado.setBackground(Color.gray);
        tfIdEmpleado.setText("");
        tfNombresEmpleado.setEnabled(false);
        tfNombresEmpleado.setBackground(Color.gray);
        tfNombresEmpleado.setText("");
        tfApellidosEmpleado.setEnabled(false);
        tfApellidosEmpleado.setBackground(Color.gray);
        tfApellidosEmpleado.setText("");
        btEjecutarEmpleado.setEnabled(false);
        btTomarFotoEmpleado.setEnabled(false);
        labelOperacionEmpleado.setText("");
        cbCargoEmpleado.setEnabled(false);
        labelImagenEmpleado.setIcon(null);
    }

    private void inhabilitarCamposHerramienta() {
        tfIdHerramienta.setEnabled(false);
        tfIdHerramienta.setBackground(Color.gray);
        tfIdHerramienta.setText("");
        tfNombreHerramienta.setEnabled(false);
        tfNombreHerramienta.setBackground(Color.gray);
        tfNombreHerramienta.setText("");
        tfFechaCompraHerramienta.setEnabled(false);
        tfFechaCompraHerramienta.setBackground(Color.gray);
        tfFechaCompraHerramienta.setText("");
        tfLugarCompraHerramienta.setEnabled(false);
        tfLugarCompraHerramienta.setBackground(Color.gray);
        tfLugarCompraHerramienta.setText("");
        tfPrecioCompraHerramienta.setEnabled(false);
        tfPrecioCompraHerramienta.setBackground(Color.gray);
        tfPrecioCompraHerramienta.setText("");
        btEjecutarHerramienta.setEnabled(false);
        labelOperacionHerramienta.setText("");
        cbResponsableHerramienta.setEnabled(false);
        btTomarFotoHerramienta.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEjecutarCargo;
    private javax.swing.JButton btEjecutarEmpleado;
    private javax.swing.JButton btEjecutarHerramienta;
    private javax.swing.JButton btEjecutarObra;
    private javax.swing.JButton btRepHerramientasEnObra;
    private javax.swing.JButton btRepoTiempoVida;
    private javax.swing.JButton btReporteHerramientasACargo;
    private javax.swing.JButton btTomarFotoEmpleado;
    private javax.swing.JButton btTomarFotoHerramienta;
    private javax.swing.JComboBox<String> cbCargoEmpleado;
    private javax.swing.JComboBox<String> cbResponsableHerramienta;
    private javax.swing.JMenuItem consultarCargo;
    private javax.swing.JMenuItem consultarEmpleado;
    private javax.swing.JMenuItem consultarEmpleados;
    private javax.swing.JMenu consultarHerramienta;
    private javax.swing.JMenu consultarHerramientas;
    private javax.swing.JMenuItem consultarObra;
    private javax.swing.JMenuItem consultarObras;
    private javax.swing.JMenuItem consultarTodosLosCargos;
    private javax.swing.JMenu entradaObra;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelApellidosEmpleado;
    private javax.swing.JLabel labelCargoEmpleado;
    private javax.swing.JLabel labelDireccionObra;
    private javax.swing.JLabel labelEstadoHerramienta;
    private javax.swing.JLabel labelFechaCompra;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelFotoEmpleado;
    private javax.swing.JLabel labelIdCargo;
    private javax.swing.JLabel labelIdEmpleado;
    private javax.swing.JLabel labelIdHerramienta;
    private javax.swing.JLabel labelIdObra;
    public static javax.swing.JLabel labelImagenEmpleado;
    private javax.swing.JLabel labelLugarCompra;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreCargo;
    private javax.swing.JLabel labelNombreObra;
    private javax.swing.JLabel labelNombresEmpleado;
    private javax.swing.JLabel labelOperacionCargo;
    private javax.swing.JLabel labelOperacionEmpleado;
    private javax.swing.JLabel labelOperacionHerramienta;
    private javax.swing.JLabel labelOperacionObra;
    private javax.swing.JLabel labelPrecioCompra;
    private javax.swing.JLabel labelReportesEmpleado;
    private javax.swing.JLabel labelReportesHerramienta;
    private javax.swing.JLabel labelReportesObra;
    private javax.swing.JLabel labelResponsable;
    private javax.swing.JLabel labelTituloCargo;
    private javax.swing.JLabel labelTituloEmpleado;
    private javax.swing.JLabel labelTituloHerramienta;
    private javax.swing.JLabel labelTituloObra;
    private javax.swing.JMenu menuCargo;
    private javax.swing.JMenuBar menuElementos;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuHerramienta;
    private javax.swing.JMenu menuObra;
    private javax.swing.JMenuBar menuOpcionEmpleado;
    private javax.swing.JMenuBar menuOpcionesCargo;
    private javax.swing.JMenuBar menuOpcionesHerramientas;
    private javax.swing.JMenuBar menuOpcionesObra;
    private javax.swing.JMenu opcionConsultarCargo;
    private javax.swing.JMenu opcionConsultarEmpleado;
    private javax.swing.JMenu opcionConsultarHerramienta;
    private javax.swing.JMenu opcionConsultarObra;
    private javax.swing.JMenu opcionCrearCargo;
    private javax.swing.JMenu opcionCrearEmpleado;
    private javax.swing.JMenu opcionCrearHerramienta;
    private javax.swing.JMenu opcionCrearObra;
    private javax.swing.JMenu opcionEliminarCargo;
    private javax.swing.JMenu opcionEliminarEmpleado;
    private javax.swing.JMenu opcionEliminarHerramienta;
    private javax.swing.JMenu opcionEliminarObra;
    private javax.swing.JMenu opcionModificarCargo;
    private javax.swing.JMenu opcionModificarEmpelado;
    private javax.swing.JMenu opcionModificarHerramienta;
    private javax.swing.JMenu opcionModificarObra;
    private javax.swing.JMenu opcionMovimiento;
    private javax.swing.JMenu salidaObra;
    private javax.swing.JTable tablaCargos;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tablaHerramienta;
    private javax.swing.JTable tablaObras;
    private javax.swing.JTextField tfApellidosEmpleado;
    private javax.swing.JTextField tfFechaCompraHerramienta;
    private javax.swing.JTextField tfIdCargo;
    private javax.swing.JTextField tfIdEmpleado;
    private javax.swing.JTextField tfIdHerramienta;
    private javax.swing.JTextField tfIdObra;
    private javax.swing.JTextField tfLugarCompraHerramienta;
    private javax.swing.JTextField tfNombreCargo;
    private javax.swing.JTextField tfNombreHerramienta;
    private javax.swing.JTextField tfNombreObra;
    private javax.swing.JTextField tfNombresEmpleado;
    private javax.swing.JTextField tfPrecioCompraHerramienta;
    private javax.swing.JTextField tfUbicacionObra;
    private javax.swing.JInternalFrame ventanaCargo;
    private javax.swing.JInternalFrame ventanaEmpleado;
    private javax.swing.JInternalFrame ventanaHerramienta;
    private javax.swing.JInternalFrame ventanaObra;
    // End of variables declaration//GEN-END:variables

    private void ocultarVentanas() {
        ventanaObra.dispose();
        ventanaCargo.dispose();
        ventanaEmpleado.dispose();
        ventanaHerramienta.dispose();
    }

    public static ResultSet getTabla(String consulta) {
        Connection con = ConexionBD.connect();
        Statement st;
        ResultSet datos = null;
        try {
            st = con.createStatement();
            datos = st.executeQuery(consulta);
        } catch (SQLException ex) {

        }
        return datos;
    }
}
