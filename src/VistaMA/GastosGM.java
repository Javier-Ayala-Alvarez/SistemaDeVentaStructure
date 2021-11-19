package VistaMA;
import Controlador.ControlMA;
import static VistaLogin.Login.LogoE;
import javax.swing.table.DefaultTableModel;
import VistaMV.Fondo;
import java.awt.Color;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class GastosGM extends javax.swing.JDialog {

    DefaultTableModel modelo;
    public static String x;

    public GastosGM(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
        
        btnAgregar.setActionCommand("Agregar");
        btnEliminar.setActionCommand("Eliminar");
        btnModificar.setActionCommand("Modificar");
        btnGenerar.setActionCommand("Generar");
        btnCategoria.setActionCommand("Categoria");
        dFecha.setDatoFecha(new Date());
        btnBuscar.setActionCommand("buscarGasto");
        btnRegresar.setActionCommand("regresar");
        this.btnRegresar.setVisible(false);

                    
    }
    public void iniciar() {
        this.setVisible(true);
    }
     public void setControlador(ControlMA control1) {
        btnAgregar.addActionListener(control1);
        btnEliminar.addActionListener(control1);
        btnModificar.addActionListener(control1);
        btnGenerar.addActionListener(control1);
        tfBuscar.addKeyListener(control1);
        jtDatos.addMouseListener(control1);
        jtDatosReporte.addMouseListener(control1);
        cbTipo.addItemListener(control1);
        btnCategoria.addActionListener(control1);
        btnRegresar.addActionListener(control1);
        btnBuscar.addActionListener(control1);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        roboto1 = new efectos.Roboto();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        tfCodigo = new principal.MaterialTextField();
        tfBuscar = new principal.MaterialTextField();
        dFecha = new rojeru_san.componentes.RSDateChooser();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnGenerar = new rojeru_san.complementos.RSButtonHover();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        btnEliminar = new rojeru_san.complementos.RSButtonHover();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbCodigo18 = new javax.swing.JLabel();
        lbTotalReporte = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDatosReporte = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbCodigo1 = new javax.swing.JLabel();
        tfPago1 = new principal.MaterialTextField();
        jLabel11 = new javax.swing.JLabel();
        lbPago = new javax.swing.JLabel();
        materialButtonCircle3 = new principal.MaterialButtonCircle();
        btnCategoria = new rojeru_san.complementos.RSButtonHover();
        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        materialButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle1.setText("X");
        materialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelFondo.setBackground(new java.awt.Color(219, 211, 247));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Pago");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Codigo");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Buscar...");
        panelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 80, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Efectivo");
        panelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 30));

        cbTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTipoMouseClicked(evt);
            }
        });
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        panelFondo.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 400, 40));

        tfCodigo.setBackground(new java.awt.Color(213, 216, 221));
        tfCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setFocusable(false);
        tfCodigo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });
        panelFondo.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 300, 40));

        tfBuscar.setBackground(new java.awt.Color(213, 216, 221));
        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBuscarKeyTyped(evt);
            }
        });
        panelFondo.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 160, 30));

        dFecha.setColorBackground(new java.awt.Color(0, 102, 102));
        dFecha.setColorButtonHover(new java.awt.Color(0, 102, 102));
        dFecha.setColorForeground(new java.awt.Color(0, 102, 102));
        panelFondo.add(dFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 400, 40));

        materialButtonCircle2.setBackground(new java.awt.Color(219, 211, 247));
        materialButtonCircle2.setText("X");
        materialButtonCircle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialButtonCircle2MouseClicked(evt);
            }
        });
        materialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle2ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 50, 50));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Fecha", "Impuesto"
            }
        ));
        jtDatos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDatosFocusLost(evt);
            }
        });
        jtDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDatos);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 580, 160));

        btnGenerar.setBackground(new java.awt.Color(0, 102, 102));
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        panelFondo.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 90, -1));

        btnModificar.setBackground(new java.awt.Color(0, 102, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelFondo.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 160, 50));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 153, 153));
        btnEliminar.setText("Eliminar");
        btnEliminar.setActionCommand("Eliminar3");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 160, 50));

        btnAgregar.setText("Agregar");
        btnAgregar.setActionCommand("Agregar1");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelFondo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 160, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 102, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Reporte");

        lbCodigo18.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo18.setForeground(new java.awt.Color(0, 0, 153));
        lbCodigo18.setText("Total....................................");

        lbTotalReporte.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbTotalReporte.setForeground(new java.awt.Color(0, 0, 153));
        lbTotalReporte.setText("$0.00");

        jtDatosReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cant...", "Categoria", "Total"
            }
        ));
        jScrollPane2.setViewportView(jtDatosReporte);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lbCodigo18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTotalReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo18)
                    .addComponent(lbTotalReporte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 350, 450));
        panelFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 960, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Pagos Administrativos/ Agregar/ Modificar / Eliminar / Reporte");
        panelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 680, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Reporte");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        lbCodigo1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo1.setForeground(new java.awt.Color(255, 0, 0));
        lbCodigo1.setText("Impuesto");
        panelFondo.add(lbCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 120, 40));

        tfPago1.setBackground(new java.awt.Color(213, 216, 221));
        tfPago1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPago1FocusLost(evt);
            }
        });
        tfPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPago1ActionPerformed(evt);
            }
        });
        tfPago1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPago1KeyTyped(evt);
            }
        });
        panelFondo.add(tfPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 400, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Fecha");
        panelFondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 20));

        lbPago.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbPago.setForeground(new java.awt.Color(255, 0, 0));
        lbPago.setText(".");
        panelFondo.add(lbPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 210, 70, -1));

        materialButtonCircle3.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle3.setText("X");
        materialButtonCircle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialButtonCircle3MouseClicked(evt);
            }
        });
        materialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle3ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 50, 50));

        btnCategoria.setBackground(new java.awt.Color(219, 211, 247));
        btnCategoria.setBorder(null);
        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guardar.png"))); // NOI18N
        btnCategoria.setActionCommand("Categoria");
        btnCategoria.setColorHover(new java.awt.Color(255, 255, 255));
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        panelFondo.add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 50, 40));

        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panelFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 30));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        x = null;
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        x = null;
    }//GEN-LAST:event_formWindowClosing

    private void materialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle1ActionPerformed
    }//GEN-LAST:event_materialButtonCircle1ActionPerformed

    private void tfPago1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPago1KeyTyped
        char c = evt.getKeyChar();
//!validadDecimal(this.tfPago1.getText()))
        if(c >= 46 && c <= 57 ){
            lbPago.setText("");
        }else{
            lbPago.setText("numeros, decimal");
            evt.consume();
        }
    }//GEN-LAST:event_tfPago1KeyTyped
public boolean validadDecimal(String pago){
        String patron = "[0-9]\\.\\[0-9]";
        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(pago);
        return mat.matches();
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked

    }//GEN-LAST:event_jtDatosMouseClicked

    private void jtDatosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDatosFocusLost

    }//GEN-LAST:event_jtDatosFocusLost

    private void materialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle2ActionPerformed

    }//GEN-LAST:event_materialButtonCircle2ActionPerformed

    private void materialButtonCircle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButtonCircle2MouseClicked
        this.dispose();
    }//GEN-LAST:event_materialButtonCircle2MouseClicked

    private void tfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyTyped
        

    }//GEN-LAST:event_tfBuscarKeyTyped

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed

    }//GEN-LAST:event_tfCodigoActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    private void cbTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTipoMouseClicked

    }//GEN-LAST:event_cbTipoMouseClicked

    private void materialButtonCircle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButtonCircle3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButtonCircle3MouseClicked

    private void materialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButtonCircle3ActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void tfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyReleased
     
    }//GEN-LAST:event_tfBuscarKeyReleased

    private void tfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyPressed
       
    }//GEN-LAST:event_tfBuscarKeyPressed

    private void tfPago1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPago1FocusLost

    }//GEN-LAST:event_tfPago1FocusLost

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void tfPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPago1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPago1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojeru_san.complementos.RSButtonHover btnAgregar;
    public javax.swing.JButton btnBuscar;
    public rojeru_san.complementos.RSButtonHover btnCategoria;
    public rojeru_san.complementos.RSButtonHover btnEliminar;
    public rojeru_san.complementos.RSButtonHover btnGenerar;
    public rojeru_san.complementos.RSButtonHover btnModificar;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JComboBox<String> cbTipo;
    public rojeru_san.componentes.RSDateChooser dFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public static final javax.swing.JTable jtDatos = new javax.swing.JTable();
    public static javax.swing.JTable jtDatosReporte;
    private javax.swing.JLabel lbCodigo1;
    private javax.swing.JLabel lbCodigo18;
    public javax.swing.JLabel lbPago;
    public static javax.swing.JLabel lbTotalReporte;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private principal.MaterialButtonCircle materialButtonCircle3;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    public static principal.MaterialTextField tfBuscar;
    public static principal.MaterialTextField tfCodigo;
    public static principal.MaterialTextField tfPago1;
    // End of variables declaration//GEN-END:variables
}
