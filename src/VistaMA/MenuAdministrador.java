package VistaMA;
import Controlador.ControlLogin;
import Controlador.ControlMA;
import VistaMV.Fondo;
import desplazable.Desface;
import javax.swing.JFrame;


public class MenuAdministrador extends javax.swing.JFrame {

    Desface desplace;
    public static String xm;
    public static int opcion;


    public MenuAdministrador() {
        initComponents();
        desplace = new Desface();

        noVisible();
     this.setExtendedState(JFrame.MAXIMIZED_BOTH);//PANTALLA COMPLETA
        
        xm = "xm";
        jpProductos.setBorder(new Fondo("/img/producto2.png"));
        jpCliente.setBorder(new Fondo("/img/cliente2.png"));

        menuVenta.setActionCommand("menuVenta");
        btnRegistrarFacturaItem.setActionCommand("registrarFacturaItem");

        menuProductos.setActionCommand("menuProductos");
        this.guardarProducto.setActionCommand("guardarProducto");
        this.consultarProducto.setActionCommand("consultarProducto");
        //para empleado
        menuEmpleado.setActionCommand("menuEmpleado");
        this.guardarEmpleado.setActionCommand("guardarEmpleado");
        this.guardarUsuario.setActionCommand("guardarUsuario");
        this.ConsultarUsuario.setActionCommand("consultarUsuario");
        this.consultarEmpleado.setActionCommand("consultarEmpleado");
        this.guardarBono.setActionCommand("guardarBono");
        this.ConsultarBono.setActionCommand("consultarBono");
        //fin Empleado
        menuCliente.setActionCommand("menuCliente");
        this.consultarCliente.setActionCommand("consultarCliente");
        menuGDS.setActionCommand("menuGDS");
        this.opcionesGDS.setActionCommand("opcionesGDS");
        this.opcionesGDS1.setActionCommand("opcionesGDS1");
        this.modificarEmpresa.setActionCommand("modificarEmpresa");
        this.consultarEmpresa.setActionCommand("consultarEmpresa");
        //para reportes
        this.reporteVentas.setActionCommand("reporteVentas");
        this.reporteGasto.setActionCommand("reporteGasto");
        /*ActionCommand de los Botones principales*/
       

        btnCerrarMenuAdmin.setActionCommand("cerrarMenu");
    }

    public void iniciar() {

        this.setVisible(true);
        cambio();
    }

    public void setControlador(ControlLogin control) {
        jpEscritorio1.addMouseListener(control);
        btnCerrarMenuAdmin.addActionListener(control);
    }

    public void setControladorMA(ControlMA controlMA) {

        /*Esta función envía los botones y demás recursos al ControlMA para ser usados por esa clase*/
 /*Agregando menus y sub-botones*/
        menuVenta.addActionListener(controlMA);
        jpEscritorio1.addMouseListener(controlMA);
        this.btnRegistrarFacturaItem.addActionListener(controlMA);

        this.menuProductos.addActionListener(controlMA);
        this.guardarProducto.addActionListener(controlMA);
        this.consultarProducto.addActionListener(controlMA);
        this.guardarEmpleado.addActionListener(controlMA);
        this.ConsultarUsuario.addActionListener(controlMA);
        this.guardarUsuario.addActionListener(controlMA);
        this.consultarEmpleado.addActionListener(controlMA);
        this.ConsultarBono.addActionListener(controlMA);
        this.guardarBono.addActionListener(controlMA);
        this.menuCliente.addActionListener(controlMA);
        this.consultarCliente.addActionListener(controlMA);
        this.opcionesGDS.addActionListener(controlMA);
        this.opcionesGDS1.addActionListener(controlMA);
        this.consultarEmpresa.addActionListener(controlMA);
        this.modificarEmpresa.addActionListener(controlMA);
        this.reporteVentas.addActionListener(controlMA);
        this.reporteGasto.addActionListener(controlMA);

        /*Agregando botones principales*/
    

        btnCerrarMenuAdmin.addActionListener(controlMA);
    }

    public void noVisible() {

        btnRegistrarFacturaItem.setVisible(false);

        guardarProducto.setVisible(false);
        consultarProducto.setVisible(false);

        consultarEmpleado.setVisible(false);
        guardarEmpleado.setVisible(false);
        ConsultarUsuario.setVisible(false);
        guardarUsuario.setVisible(false);
        ConsultarBono.setVisible(false);
        guardarBono.setVisible(false);

        consultarCliente.setVisible(false);

        opcionesGDS.setVisible(false);
        opcionesGDS1.setVisible(false);

        modificarEmpresa.setVisible(false);
        consultarEmpresa.setVisible(false);

        reporteVentas.setVisible(false);
        reporteGasto.setVisible(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuItem4 = new javax.swing.JMenuItem();
        materialShadowCircle1 = new efectos.MaterialShadowCircle();
        materialShadowCircle2 = new efectos.MaterialShadowCircle();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        rSDateChooserBeanInfo1 = new rojeru_san.componentes.RSDateChooserBeanInfo();
        jpEscritorio1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrarMenuAdmin = new principal.MaterialButtonCircle();
        lbEmpresa1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        jpProductos = new javax.swing.JPanel();
        lbProducto1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        jpCliente = new javax.swing.JPanel();
        lbClienteT = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        menuVenta = new rojeru_san.complementos.RSButtonHover();
        btnRegistrarFacturaItem = new rojeru_san.complementos.RSButtonHover();
        menuProductos = new rojeru_san.complementos.RSButtonHover();
        guardarProducto = new rojeru_san.complementos.RSButtonHover();
        consultarProducto = new rojeru_san.complementos.RSButtonHover();
        menuEmpleado = new rojeru_san.complementos.RSButtonHover();
        consultarEmpleado = new rojeru_san.complementos.RSButtonHover();
        guardarEmpleado = new rojeru_san.complementos.RSButtonHover();
        ConsultarUsuario = new rojeru_san.complementos.RSButtonHover();
        guardarUsuario = new rojeru_san.complementos.RSButtonHover();
        ConsultarBono = new rojeru_san.complementos.RSButtonHover();
        guardarBono = new rojeru_san.complementos.RSButtonHover();
        menuCliente = new rojeru_san.complementos.RSButtonHover();
        consultarCliente = new rojeru_san.complementos.RSButtonHover();
        menuGDS = new rojeru_san.complementos.RSButtonHover();
        opcionesGDS = new rojeru_san.complementos.RSButtonHover();
        opcionesGDS1 = new rojeru_san.complementos.RSButtonHover();
        btnVentas18 = new rojeru_san.complementos.RSButtonHover();
        modificarEmpresa = new rojeru_san.complementos.RSButtonHover();
        consultarEmpresa = new rojeru_san.complementos.RSButtonHover();
        MenuReportes = new rojeru_san.complementos.RSButtonHover();
        reporteVentas = new rojeru_san.complementos.RSButtonHover();
        reporteGasto = new rojeru_san.complementos.RSButtonHover();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        jMenuItem4.setText("jMenuItem4");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Tienda");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setModalExclusionType(null);
        setUndecorated(true);
        setSize(new java.awt.Dimension(10, 10));
        setState(5);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpEscritorio1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(13, 177, 8));
        jPanel2.setForeground(new java.awt.Color(255, 0, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empresa:");

        btnCerrarMenuAdmin.setBackground(new java.awt.Color(220, 20, 20));
        btnCerrarMenuAdmin.setText("X");
        btnCerrarMenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarMenuAdminActionPerformed(evt);
            }
        });

        lbEmpresa1.setBackground(new java.awt.Color(255, 255, 255));
        lbEmpresa1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lbEmpresa1.setForeground(new java.awt.Color(255, 255, 255));
        lbEmpresa1.setText(".");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu2.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addComponent(lbEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrarMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmpresa1)
                            .addComponent(jLabel2))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(13, 177, 8));

        jpProductos.setBackground(new java.awt.Color(13, 177, 8));

        javax.swing.GroupLayout jpProductosLayout = new javax.swing.GroupLayout(jpProductos);
        jpProductos.setLayout(jpProductosLayout);
        jpProductosLayout.setHorizontalGroup(
            jpProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jpProductosLayout.setVerticalGroup(
            jpProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        lbProducto1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbProducto1.setText("$0:00");

        jLabel8.setText("Productos ingresados");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbProducto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbProducto1))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panel6.setBackground(new java.awt.Color(13, 177, 8));

        jpCliente.setBackground(new java.awt.Color(13, 177, 8));

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        lbClienteT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbClienteT.setText("0:00");

        jLabel16.setText("Cliente");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(lbClienteT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                        .addComponent(lbClienteT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(86, 86, 86));

        menuVenta.setBackground(new java.awt.Color(86, 86, 86));
        menuVenta.setBorder(null);
        menuVenta.setText("* Ventas ");
        menuVenta.setColorHover(new java.awt.Color(102, 102, 102));
        menuVenta.setColorTextHover(new java.awt.Color(255, 51, 51));
        menuVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuVenta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuVenta.setVerifyInputWhenFocusTarget(false);
        menuVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentaActionPerformed(evt);
            }
        });

        btnRegistrarFacturaItem.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarFacturaItem.setBorder(null);
        btnRegistrarFacturaItem.setForeground(new java.awt.Color(250, 102, 102));
        btnRegistrarFacturaItem.setText("- Registro");
        btnRegistrarFacturaItem.setColorHover(new java.awt.Color(141, 207, 255));
        btnRegistrarFacturaItem.setColorText(new java.awt.Color(141, 207, 255));
        btnRegistrarFacturaItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrarFacturaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFacturaItemActionPerformed(evt);
            }
        });

        menuProductos.setBackground(new java.awt.Color(86, 86, 86));
        menuProductos.setBorder(null);
        menuProductos.setText("* Producto");
        menuProductos.setColorHover(new java.awt.Color(102, 102, 102));
        menuProductos.setColorTextHover(new java.awt.Color(255, 51, 51));
        menuProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosActionPerformed(evt);
            }
        });

        guardarProducto.setBackground(new java.awt.Color(102, 102, 102));
        guardarProducto.setBorder(null);
        guardarProducto.setText("- Producto");
        guardarProducto.setColorText(new java.awt.Color(141, 207, 255));
        guardarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoActionPerformed(evt);
            }
        });

        consultarProducto.setBackground(new java.awt.Color(102, 102, 102));
        consultarProducto.setBorder(null);
        consultarProducto.setText("- Consulta");
        consultarProducto.setColorText(new java.awt.Color(141, 207, 255));
        consultarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        consultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarProductoActionPerformed(evt);
            }
        });

        menuEmpleado.setBackground(new java.awt.Color(86, 86, 86));
        menuEmpleado.setBorder(null);
        menuEmpleado.setText("* Empleado");
        menuEmpleado.setColorHover(new java.awt.Color(102, 102, 102));
        menuEmpleado.setColorTextHover(new java.awt.Color(255, 51, 51));
        menuEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadoActionPerformed(evt);
            }
        });

        consultarEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        consultarEmpleado.setBorder(null);
        consultarEmpleado.setText("- Consulta Empleado");
        consultarEmpleado.setColorText(new java.awt.Color(141, 207, 255));
        consultarEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        consultarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultarEmpleadoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consultarEmpleadoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                consultarEmpleadoMouseReleased(evt);
            }
        });
        consultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpleadoActionPerformed(evt);
            }
        });
        consultarEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultarEmpleadoKeyPressed(evt);
            }
        });

        guardarEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        guardarEmpleado.setBorder(null);
        guardarEmpleado.setText("- Añadir Empleado");
        guardarEmpleado.setColorText(new java.awt.Color(141, 207, 255));
        guardarEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEmpleadoActionPerformed(evt);
            }
        });

        ConsultarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        ConsultarUsuario.setBorder(null);
        ConsultarUsuario.setText("- Consulta Usuario");
        ConsultarUsuario.setColorText(new java.awt.Color(141, 207, 255));
        ConsultarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuarioActionPerformed(evt);
            }
        });

        guardarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        guardarUsuario.setBorder(null);
        guardarUsuario.setText("- Añadir Usuario");
        guardarUsuario.setColorText(new java.awt.Color(141, 207, 255));
        guardarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarUsuarioActionPerformed(evt);
            }
        });

        ConsultarBono.setBackground(new java.awt.Color(102, 102, 102));
        ConsultarBono.setBorder(null);
        ConsultarBono.setText("- Consulta Bono");
        ConsultarBono.setColorText(new java.awt.Color(141, 207, 255));
        ConsultarBono.setHideActionText(true);
        ConsultarBono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ConsultarBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarBonoActionPerformed(evt);
            }
        });

        guardarBono.setBackground(new java.awt.Color(102, 102, 102));
        guardarBono.setBorder(null);
        guardarBono.setText("- Añadir Bono");
        guardarBono.setColorText(new java.awt.Color(141, 207, 255));
        guardarBono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guardarBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBonoActionPerformed(evt);
            }
        });

        menuCliente.setBackground(new java.awt.Color(86, 86, 86));
        menuCliente.setBorder(null);
        menuCliente.setText("* Cliente");
        menuCliente.setColorHover(new java.awt.Color(102, 102, 102));
        menuCliente.setColorTextHover(new java.awt.Color(255, 51, 51));
        menuCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });

        consultarCliente.setBackground(new java.awt.Color(102, 102, 102));
        consultarCliente.setBorder(null);
        consultarCliente.setText("- Consulta");
        consultarCliente.setColorText(new java.awt.Color(141, 207, 255));
        consultarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        consultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarClienteActionPerformed(evt);
            }
        });

        menuGDS.setBackground(new java.awt.Color(86, 86, 86));
        menuGDS.setBorder(null);
        menuGDS.setText("* Pago");
        menuGDS.setColorHover(new java.awt.Color(102, 102, 102));
        menuGDS.setColorTextHover(new java.awt.Color(255, 51, 51));
        menuGDS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuGDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGDSActionPerformed(evt);
            }
        });

        opcionesGDS.setBackground(new java.awt.Color(102, 102, 102));
        opcionesGDS.setBorder(null);
        opcionesGDS.setText("- Administrativo");
        opcionesGDS.setColorText(new java.awt.Color(141, 207, 255));
        opcionesGDS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opcionesGDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesGDSActionPerformed(evt);
            }
        });

        opcionesGDS1.setBackground(new java.awt.Color(102, 102, 102));
        opcionesGDS1.setBorder(null);
        opcionesGDS1.setText("- Empleado");
        opcionesGDS1.setColorText(new java.awt.Color(141, 207, 255));
        opcionesGDS1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opcionesGDS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesGDS1ActionPerformed(evt);
            }
        });

        btnVentas18.setBackground(new java.awt.Color(86, 86, 86));
        btnVentas18.setBorder(null);
        btnVentas18.setText("* Configuracion");
        btnVentas18.setColorHover(new java.awt.Color(102, 102, 102));
        btnVentas18.setColorTextHover(new java.awt.Color(255, 51, 51));
        btnVentas18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentas18ActionPerformed(evt);
            }
        });

        modificarEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        modificarEmpresa.setBorder(null);
        modificarEmpresa.setText("- Modificar");
        modificarEmpresa.setColorText(new java.awt.Color(141, 207, 255));
        modificarEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        modificarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEmpresaActionPerformed(evt);
            }
        });

        consultarEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        consultarEmpresa.setBorder(null);
        consultarEmpresa.setText("- Consultar");
        consultarEmpresa.setColorText(new java.awt.Color(141, 207, 255));
        consultarEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        consultarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpresaActionPerformed(evt);
            }
        });

        MenuReportes.setBackground(new java.awt.Color(86, 86, 86));
        MenuReportes.setBorder(null);
        MenuReportes.setText("* Reportes");
        MenuReportes.setColorHover(new java.awt.Color(102, 102, 102));
        MenuReportes.setColorTextHover(new java.awt.Color(255, 51, 51));
        MenuReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReportesActionPerformed(evt);
            }
        });

        reporteVentas.setBackground(new java.awt.Color(102, 102, 102));
        reporteVentas.setBorder(null);
        reporteVentas.setText("- Ventas por mes");
        reporteVentas.setColorText(new java.awt.Color(141, 207, 255));
        reporteVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteVentasActionPerformed(evt);
            }
        });

        reporteGasto.setBackground(new java.awt.Color(102, 102, 102));
        reporteGasto.setBorder(null);
        reporteGasto.setText("- Gastos Empresariales ");
        reporteGasto.setColorText(new java.awt.Color(141, 207, 255));
        reporteGasto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reporteGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteGastoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(opcionesGDS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(opcionesGDS1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(consultarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(consultarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConsultarBono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(guardarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(ConsultarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(guardarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(consultarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guardarBono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(consultarEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuGDS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(menuVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(menuProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(menuEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(menuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnVentas18, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(reporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(MenuReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarFacturaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(reporteGasto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(menuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarFacturaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultarBono, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarBono, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuGDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionesGDS, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionesGDS1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reporteGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpEscritorio1Layout = new javax.swing.GroupLayout(jpEscritorio1);
        jpEscritorio1.setLayout(jpEscritorio1Layout);
        jpEscritorio1Layout.setHorizontalGroup(
            jpEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscritorio1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jpEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpEscritorio1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(365, 365, 365)
                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(168, Short.MAX_VALUE))))
        );
        jpEscritorio1Layout.setVerticalGroup(
            jpEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscritorio1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jpEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpEscritorio1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpEscritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpEscritorio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpEscritorio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        xm = null;
    }//GEN-LAST:event_formWindowClosing

    private void menuVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentaActionPerformed
        noVisible();
        btnRegistrarFacturaItem.setVisible(true);
    }//GEN-LAST:event_menuVentaActionPerformed

    private void btnRegistrarFacturaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFacturaItemActionPerformed
        cambio();
    }//GEN-LAST:event_btnRegistrarFacturaItemActionPerformed
    public void cambio() {
        desplace.desplazarIzquierda(jPanel6, jPanel6.getX(), -150, 10, 10);
    }
    private void menuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosActionPerformed
        noVisible();
        guardarProducto.setVisible(true);
        consultarProducto.setVisible(true);
    }//GEN-LAST:event_menuProductosActionPerformed

    private void guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_guardarProductoActionPerformed

    private void consultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarProductoActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_consultarProductoActionPerformed

    private void menuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadoActionPerformed
        noVisible();
        consultarEmpleado.setVisible(true);
        guardarEmpleado.setVisible(true);
        ConsultarUsuario.setVisible(true);
        guardarUsuario.setVisible(true);
        ConsultarBono.setVisible(true);
        guardarBono.setVisible(true);
    }//GEN-LAST:event_menuEmpleadoActionPerformed

    private void consultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpleadoActionPerformed
        cambio();
    }//GEN-LAST:event_consultarEmpleadoActionPerformed

    private void guardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEmpleadoActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_guardarEmpleadoActionPerformed

    private void ConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuarioActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarUsuarioActionPerformed

    private void guardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarUsuarioActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_guardarUsuarioActionPerformed

    private void ConsultarBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarBonoActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarBonoActionPerformed

    private void guardarBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBonoActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_guardarBonoActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        noVisible();
        consultarCliente.setVisible(true);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void consultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarClienteActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_consultarClienteActionPerformed

    private void menuGDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGDSActionPerformed

        noVisible();
        opcionesGDS.setVisible(true);
        opcionesGDS1.setVisible(true);
    }//GEN-LAST:event_menuGDSActionPerformed

    private void opcionesGDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesGDSActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_opcionesGDSActionPerformed

    private void opcionesGDS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesGDS1ActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_opcionesGDS1ActionPerformed

    private void btnVentas18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentas18ActionPerformed
        noVisible();
        modificarEmpresa.setVisible(true);
        consultarEmpresa.setVisible(true);
    }//GEN-LAST:event_btnVentas18ActionPerformed

    private void modificarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEmpresaActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_modificarEmpresaActionPerformed

    private void consultarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpresaActionPerformed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_consultarEmpresaActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        noVisible();
        if (jPanel6.getX() == 0) {
            desplace.desplazarIzquierda(jPanel6, jPanel6.getX(), -150, 10, 10);
        } else if (jPanel6.getX() == -150) {
            desplace.desplazarDerecha(jPanel6, jPanel6.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void consultarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarEmpleadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarEmpleadoMouseClicked

    private void consultarEmpleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarEmpleadoMousePressed
        //cambio();
    }//GEN-LAST:event_consultarEmpleadoMousePressed

    private void consultarEmpleadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarEmpleadoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarEmpleadoMouseReleased

    private void consultarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarEmpleadoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarEmpleadoMouseEntered

    private void consultarEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultarEmpleadoKeyPressed
        cambio();         // TODO add your handling code here:
    }//GEN-LAST:event_consultarEmpleadoKeyPressed

    private void btnCerrarMenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarMenuAdminActionPerformed

    }//GEN-LAST:event_btnCerrarMenuAdminActionPerformed

    private void MenuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReportesActionPerformed

        noVisible(); 
        reporteVentas.setVisible(true);
        reporteGasto.setVisible(true);
    }//GEN-LAST:event_MenuReportesActionPerformed

    private void reporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteVentasActionPerformed
        cambio(); 
    }//GEN-LAST:event_reporteVentasActionPerformed

    private void reporteGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteGastoActionPerformed
        cambio(); 
    }//GEN-LAST:event_reporteGastoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojeru_san.complementos.RSButtonHover ConsultarBono;
    public rojeru_san.complementos.RSButtonHover ConsultarUsuario;
    public rojeru_san.complementos.RSButtonHover MenuReportes;
    public principal.MaterialButtonCircle btnCerrarMenuAdmin;
    public rojeru_san.complementos.RSButtonHover btnRegistrarFacturaItem;
    public rojeru_san.complementos.RSButtonHover btnVentas18;
    public rojeru_san.complementos.RSButtonHover consultarCliente;
    public rojeru_san.complementos.RSButtonHover consultarEmpleado;
    public rojeru_san.complementos.RSButtonHover consultarEmpresa;
    public rojeru_san.complementos.RSButtonHover consultarProducto;
    public rojeru_san.complementos.RSButtonHover guardarBono;
    public rojeru_san.complementos.RSButtonHover guardarEmpleado;
    public rojeru_san.complementos.RSButtonHover guardarProducto;
    public rojeru_san.complementos.RSButtonHover guardarUsuario;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel jpCliente;
    public javax.swing.JPanel jpEscritorio1;
    private javax.swing.JPanel jpProductos;
    public static javax.swing.JLabel lbClienteT;
    public static javax.swing.JLabel lbEmpresa1;
    public static javax.swing.JLabel lbProducto1;
    private efectos.MaterialShadowCircle materialShadowCircle1;
    private efectos.MaterialShadowCircle materialShadowCircle2;
    public rojeru_san.complementos.RSButtonHover menuCliente;
    public rojeru_san.complementos.RSButtonHover menuEmpleado;
    public rojeru_san.complementos.RSButtonHover menuGDS;
    public rojeru_san.complementos.RSButtonHover menuProductos;
    public rojeru_san.complementos.RSButtonHover menuVenta;
    public rojeru_san.complementos.RSButtonHover modificarEmpresa;
    public rojeru_san.complementos.RSButtonHover opcionesGDS;
    public rojeru_san.complementos.RSButtonHover opcionesGDS1;
    public javax.swing.JPanel panel3;
    public javax.swing.JPanel panel6;
    private rojeru_san.componentes.RSDateChooserBeanInfo rSDateChooserBeanInfo1;
    public rojeru_san.complementos.RSButtonHover reporteGasto;
    public rojeru_san.complementos.RSButtonHover reporteVentas;
    // End of variables declaration//GEN-END:variables
}
