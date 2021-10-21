package VistaMV;

import Controlador.ControlFactura;
import Controlador.ControlLogin;
import desplazable.Desface;
import java.util.Date;
import javax.swing.JFrame;

public class Factura extends javax.swing.JFrame {

    public static String res;
    Desface desplace;

    public Factura() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//PANTALLA COMPLETA
        escritorioFactura.setVisible(false);
        //
        jpLogo1.setBorder(new Fondo("/img/Logo.jpg"));
        res = "res";
         jPanel3.setVisible(false);
        desplace = new Desface();
         desplace.desplazarIzquierda(jPanel3, jPanel3.getX(), -110, 10, 10);
        btnTiket.setActionCommand("tiket");
        btnNuevoCliente.setActionCommand("NuevoCliente");
        btnCerrarCaja.setActionCommand("newCC");
        btnCliente.setActionCommand("SeleccionarCliente");
        btnProducto.setActionCommand("SeleccionarProducto");
        btnAgregarProducto.setActionCommand("agregarProducto");
        btnEliminarFila.setActionCommand("eliminarFila");
        btnAgregarProducto.setActionCommand("agregarProducto");
        rSDateFecha.setDatoFecha(new Date());
        btnVender.setActionCommand("vender");
        btnPrestamo.setActionCommand("prestamo");
        btnConsumo.setActionCommand("consumo");
        
       
        

    }

    public void iniciar() {
        this.setVisible(true);
    }

    public void setControlador(ControlLogin control) {
        escritorioFactura.addMouseListener(control);
    }

    public void setControladorF(ControlFactura controlF) {
        btnVender.addActionListener(controlF);
        btnPrestamo.addActionListener(controlF);
        btnConsumo.addActionListener(controlF);
        escritorioFactura.addMouseListener(controlF);
        btnTiket.addActionListener(controlF);
        btnNuevoCliente.addActionListener(controlF);
        btnCerrarCaja.addActionListener(controlF);
        btnCerrarFactura.addActionListener(controlF);
        btnCliente.addActionListener(controlF);
        btnProducto.addActionListener(controlF);
        tfCantidad.addKeyListener(controlF);
        tfEfectivo.addKeyListener(controlF);
        btnAgregarProducto.addActionListener(controlF);
        btnAgregarProducto.addActionListener(controlF);
        btnEliminarFila.addActionListener(controlF);
        
    }

    public void visibilidad(boolean bool) {
        this.btnNuevoCliente.setVisible(bool);
        this.btnTiket.setVisible(bool);
        this.lbNombreUsuario.setVisible(bool);
        this.btnCerrarCaja.setVisible(bool);
        this.btnCerrarFactura.setVisible(!bool);
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
        jMenu3 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jMenuItem2 = new javax.swing.JMenuItem();
        escritorioFactura = new javax.swing.JPanel();
        tfNombre = new principal.MaterialTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNFactura = new principal.MaterialTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDireccion = new principal.MaterialTextField();
        jLabel5 = new javax.swing.JLabel();
        rSDateFecha = new rojeru_san.componentes.RSDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tfProducto = new principal.MaterialTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfCantidad = new principal.MaterialTextField();
        jLabel9 = new javax.swing.JLabel();
        tfPrecioUni = new principal.MaterialTextField();
        jLabel10 = new javax.swing.JLabel();
        tfPrecioTotal1 = new principal.MaterialTextField();
        btnCliente = new rojeru_san.complementos.RSButtonHover();
        btnProducto = new rojeru_san.complementos.RSButtonHover();
        jScrollPane2 = new javax.swing.JScrollPane();
        miTb1 = new javax.swing.JTable();
        btnAgregarProducto = new rojeru_san.complementos.RSButtonHover();
        btnEliminarFila = new rojeru_san.complementos.RSButtonHover();
        tfTotalPagar = new principal.MaterialTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnPrestamo = new rojeru_san.complementos.RSButtonHover();
        btnVender = new rojeru_san.complementos.RSButtonHover();
        btnConsumo = new rojeru_san.complementos.RSButtonHover();
        tfEfectivo = new principal.MaterialTextField();
        tfCambio = new principal.MaterialTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNombreUsuario = new javax.swing.JLabel();
        btnCerrarFactura = new principal.MaterialButtonCircle();
        jpLogo1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnNuevoCliente = new rojeru_san.complementos.RSButtonHover();
        btnCerrarCaja = new rojeru_san.complementos.RSButtonHover();
        btnTiket = new rojeru_san.complementos.RSButtonHover();
        jLabel3 = new javax.swing.JLabel();

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

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Tienda");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setForeground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setModalExclusionType(null);
        setUndecorated(true);
        setSize(new java.awt.Dimension(10, 10));
        setState(5);
        setType(java.awt.Window.Type.POPUP);

        escritorioFactura.setBackground(new java.awt.Color(72, 139, 183));
        escritorioFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        escritorioFactura.setForeground(new java.awt.Color(255, 255, 255));
        escritorioFactura.setAutoscrolls(true);
        escritorioFactura.setFocusCycleRoot(true);
        escritorioFactura.setFocusTraversalPolicyProvider(true);
        escritorioFactura.setInheritsPopupMenu(true);

        tfNombre.setBackground(new java.awt.Color(213, 216, 221));
        tfNombre.setText("No Registrado");
        tfNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfNombre.setFocusable(false);
        tfNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfNombre.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Factura:");

        tfNFactura.setBackground(new java.awt.Color(213, 216, 221));
        tfNFactura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfNFactura.setFocusable(false);
        tfNFactura.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfNFactura.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfNFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNFacturaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cliente:");

        tfDireccion.setBackground(new java.awt.Color(213, 216, 221));
        tfDireccion.setText("No Registrado");
        tfDireccion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfDireccion.setFocusable(false);
        tfDireccion.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfDireccion.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDireccionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dirección:");

        tfProducto.setBackground(new java.awt.Color(213, 216, 221));
        tfProducto.setText("No Agregado");
        tfProducto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfProducto.setFocusable(false);
        tfProducto.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfProducto.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProductoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Producto:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cantidad:");

        tfCantidad.setBackground(new java.awt.Color(213, 216, 221));
        tfCantidad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfCantidad.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfCantidad.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantidadActionPerformed(evt);
            }
        });
        tfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantidadKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Precio Unitario:");

        tfPrecioUni.setBackground(new java.awt.Color(213, 216, 221));
        tfPrecioUni.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfPrecioUni.setFocusable(false);
        tfPrecioUni.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfPrecioUni.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfPrecioUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioUniActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio Total:");

        tfPrecioTotal1.setBackground(new java.awt.Color(213, 216, 221));
        tfPrecioTotal1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfPrecioTotal1.setFocusable(false);
        tfPrecioTotal1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfPrecioTotal1.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfPrecioTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioTotal1ActionPerformed(evt);
            }
        });

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar1.png"))); // NOI18N
        btnCliente.setActionCommand("SeleccionarCliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar1.png"))); // NOI18N
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        miTb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cantidad", "Producto", "P/U", "Total"
            }
        ));
        jScrollPane2.setViewportView(miTb1);

        btnAgregarProducto.setBackground(new java.awt.Color(38, 118, 38));
        btnAgregarProducto.setText("Agregar al Carrito");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnEliminarFila.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarFila.setText("Retirar");
        btnEliminarFila.setActionCommand("Eliminar");
        btnEliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFilaActionPerformed(evt);
            }
        });

        tfTotalPagar.setBackground(new java.awt.Color(213, 216, 221));
        tfTotalPagar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfTotalPagar.setFocusable(false);
        tfTotalPagar.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfTotalPagar.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalPagarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Total");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/factura.png"))); // NOI18N
        jLabel12.setText("Nueva Factura.");

        btnPrestamo.setBackground(new java.awt.Color(255, 153, 0));
        btnPrestamo.setText("Prestamo");
        btnPrestamo.setActionCommand("prestamo");
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnConsumo.setBackground(new java.awt.Color(102, 0, 0));
        btnConsumo.setText("Consumo");
        btnConsumo.setActionCommand("consumo");
        btnConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsumoActionPerformed(evt);
            }
        });

        tfEfectivo.setBackground(new java.awt.Color(213, 216, 221));
        tfEfectivo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfEfectivo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfEfectivo.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEfectivoActionPerformed(evt);
            }
        });

        tfCambio.setBackground(new java.awt.Color(213, 216, 221));
        tfCambio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfCambio.setFocusable(false);
        tfCambio.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfCambio.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCambioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Efectivo:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cambio:");

        lbNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(153, 0, 0));
        lbNombre.setText(".");

        javax.swing.GroupLayout escritorioFacturaLayout = new javax.swing.GroupLayout(escritorioFactura);
        escritorioFactura.setLayout(escritorioFacturaLayout);
        escritorioFacturaLayout.setHorizontalGroup(
            escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioFacturaLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioFacturaLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfPrecioTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioFacturaLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfPrecioUni, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioFacturaLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(tfNFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioFacturaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioFacturaLayout.createSequentialGroup()
                                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                        .addComponent(btnEliminarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)))
                                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        escritorioFacturaLayout.setVerticalGroup(
            escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(tfNFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioFacturaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(14, 14, 14)
                                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPrecioUni, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrecioTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSDateFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(escritorioFacturaLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(71, 139, 184));
        jPanel2.setForeground(new java.awt.Color(0, 204, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setDoubleBuffered(false);
        jPanel2.setEnabled(false);
        jPanel2.setFocusCycleRoot(true);
        jPanel2.setFocusTraversalPolicy(null);
        jPanel2.setFocusTraversalPolicyProvider(true);
        jPanel2.setInheritsPopupMenu(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de Factura");

        lbNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreUsuario.setText(".");

        btnCerrarFactura.setBackground(new java.awt.Color(220, 20, 20));
        btnCerrarFactura.setText("X");
        btnCerrarFactura.setActionCommand("cerrarFactura");
        btnCerrarFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarFacturaMouseClicked(evt);
            }
        });
        btnCerrarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLogo1Layout = new javax.swing.GroupLayout(jpLogo1);
        jpLogo1.setLayout(jpLogo1Layout);
        jpLogo1Layout.setHorizontalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        jpLogo1Layout.setVerticalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(lbNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCerrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lbNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(jpLogo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(72, 139, 183));
        jPanel3.setAutoscrolls(true);
        jPanel3.setFocusCycleRoot(true);
        jPanel3.setFocusTraversalPolicyProvider(true);
        jPanel3.setInheritsPopupMenu(true);

        btnNuevoCliente.setBackground(new java.awt.Color(72, 139, 183));
        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente1.png"))); // NOI18N
        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.setActionCommand("NuevoCliente");
        btnNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnNuevoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNuevoCliente.setIconTextGap(20);
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnCerrarCaja.setBackground(new java.awt.Color(72, 139, 183));
        btnCerrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario1.png"))); // NOI18N
        btnCerrarCaja.setText("Cerrar");
        btnCerrarCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCerrarCaja.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCerrarCaja.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCerrarCaja.setIconTextGap(40);
        btnCerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCajaActionPerformed(evt);
            }
        });

        btnTiket.setBackground(new java.awt.Color(72, 139, 183));
        btnTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tiket.png"))); // NOI18N
        btnTiket.setText("Pago");
        btnTiket.setAlignmentY(2.0F);
        btnTiket.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTiket.setHideActionText(true);
        btnTiket.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnTiket.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnTiket.setIconTextGap(40);
        btnTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiketActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu2.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnNuevoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addComponent(btnTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorioFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escritorioFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarFacturaActionPerformed
//        int opccion = JOptionPane.showConfirmDialog(null, "Deseas Salir?", "Confirmar salida",
//            JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
//        if(opccion == 0){
//            Login vista = new Login();
//            vista.show();
//            this.dispose();
//        }
        this.dispose();
    }//GEN-LAST:event_btnCerrarFacturaActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
//       String xm = Facturacion.s;
//        Facturacion vista = new Facturacion();
//        if((xm == null)){
//            escritorioFactura.add(vista);
//            vista.show();
//        }else{
//            JOptionPane.showMessageDialog(escritorioFactura, "Ventana ya abierta!!!");
//
//        }
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnCerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCajaActionPerformed
//        int opccion = JOptionPane.showConfirmDialog(null, "Deseas Salir de Facturacion?", "Confirmar salida", 
//               JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE); 
//        if(opccion == 0){
//         Login vista = new Login();
//        vista.show();
//        this.dispose();
//        }
    }//GEN-LAST:event_btnCerrarCajaActionPerformed

    private void btnTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTiketActionPerformed

    private void btnEliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFilaActionPerformed
        //        if(!existe()){
            //            if( !tfCodigo.getText().isEmpty()
                //                &&!tfDescrip.getText().isEmpty()
                //                &&!tfPrecio.getText().isEmpty()){
                //                double precio = Double.parseDouble(tfPrecio.getText());
                //                TablaProducto obj = new TablaProducto(tfCodigo.getText(),tfDescrip.getText(),precio);
                //                producto.add(obj);
                //                limpiar();
                //                mostrar();
                //
                //            }else{
                //                JOptionPane.showMessageDialog(null,"Campos Vacios","Error",JOptionPane.ERROR_MESSAGE);
                //            }
            //        }else{
            //            JOptionPane.showMessageDialog(null,"Codigo ya existe","Error",JOptionPane.ERROR_MESSAGE);
            //        }
    }//GEN-LAST:event_btnEliminarFilaActionPerformed

    private void tfTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalPagarActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        //        // TODO add your handling code here:
        //        if(!tfCliente.getText().isEmpty()
            //            && !tfDireccion.getText().isEmpty()
            //            && !tfCantidad.getText().isEmpty()
            //            //            && !rSDateFecha.getDatoFecha().isEmpty()
            //
            //        ){
            //
            //            //            Aqui voy hacer que se almacenen en la tabla
            //
            ////            limpiarVista();
            ////
            ////        }else{
            ////            actualizar();
            ////            JOptionPane.showMessageDialog(null,"Llenar todos los Campos","ERROR",JOptionPane.ERROR_MESSAGE);
            //        }
        //
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void tfPrecioTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioTotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioTotal1ActionPerformed

    private void tfPrecioUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioUniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioUniActionPerformed

    private void tfCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCantidadActionPerformed

    private void tfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDireccionActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        //        // TODO add your handling code here:
        //        if(!tfCliente.getText().isEmpty()
            //            && !tfDireccion.getText().isEmpty()
            //            && !tfCantidad.getText().isEmpty()
            //            //            && !rSDateFecha.getDatoFecha().isEmpty()
            //
            //        ){
            //
            //            //            Aqui voy hacer que se almacenen en la tabla
            //
            ////            limpiarVista();
            ////
            ////        }else{
            ////            actualizar();
            ////            JOptionPane.showMessageDialog(null,"Llenar todos los Campos","ERROR",JOptionPane.ERROR_MESSAGE);
            //        }
        //
    }//GEN-LAST:event_btnClienteActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed

    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProductoActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductoActionPerformed

    private void tfNFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNFacturaActionPerformed

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsumoActionPerformed

    private void tfEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEfectivoActionPerformed

    private void tfCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCambioActionPerformed

    private void tfCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantidadKeyTyped
         char c = evt.getKeyChar();

        if((c >= 46 && c <= 57 )){
            lbNombre.setText("");
        }else{
            lbNombre.setText("Solo Numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfCantidadKeyTyped

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (jPanel3.getX() == 0) {
            desplace.desplazarIzquierda(jPanel3, jPanel3.getX(), -110, 10, 10);
        } else if (jPanel3.getX() == -110) {
            desplace.desplazarDerecha(jPanel3, jPanel3.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnCerrarFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarFacturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarFacturaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojeru_san.complementos.RSButtonHover btnAgregarProducto;
    public rojeru_san.complementos.RSButtonHover btnCerrarCaja;
    public principal.MaterialButtonCircle btnCerrarFactura;
    public static rojeru_san.complementos.RSButtonHover btnCliente;
    public rojeru_san.complementos.RSButtonHover btnConsumo;
    public rojeru_san.complementos.RSButtonHover btnEliminarFila;
    public rojeru_san.complementos.RSButtonHover btnNuevoCliente;
    public rojeru_san.complementos.RSButtonHover btnPrestamo;
    public static rojeru_san.complementos.RSButtonHover btnProducto;
    public rojeru_san.complementos.RSButtonHover btnTiket;
    public rojeru_san.complementos.RSButtonHover btnVender;
    public static javax.swing.JPanel escritorioFactura;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpLogo1;
    private javax.swing.JLabel lbNombre;
    public javax.swing.JLabel lbNombreUsuario;
    public javax.swing.JTable miTb1;
    public rojeru_san.componentes.RSDateChooser rSDateFecha;
    public static principal.MaterialTextField tfCambio;
    public static principal.MaterialTextField tfCantidad;
    public static principal.MaterialTextField tfDireccion;
    public static principal.MaterialTextField tfEfectivo;
    public static principal.MaterialTextField tfNFactura;
    public static principal.MaterialTextField tfNombre;
    public static principal.MaterialTextField tfPrecioTotal1;
    public static principal.MaterialTextField tfPrecioUni;
    public static principal.MaterialTextField tfProducto;
    public static principal.MaterialTextField tfTotalPagar;
    // End of variables declaration//GEN-END:variables
}