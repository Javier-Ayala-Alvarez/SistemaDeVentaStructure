package VistaMA;


import Controlador.ControlMA;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import VistaMV.Fondo;

public class ProductoModi extends javax.swing.JDialog {

    DefaultTableModel modelo;
    public static String x;

    public ProductoModi(java.awt.Frame parent, boolean modal ) {
        super(parent, modal);
        initComponents();

        jpLogo1.setBorder(new Fondo("/img/Logo.jpg"));
        btAgregar.setActionCommand("Agregar");
        btModificar.setActionCommand("Modificar");
        btEliminar.setActionCommand("Eliminar");
        btGenerar.setActionCommand("Generar");
        dVence.setDatoFecha(new Date());
    }



    public void iniciar() {
        this.setVisible(true);
    }
    
    public void setControlador(ControlMA control1) {
        btAgregar.addActionListener(control1);
        btModificar.addActionListener(control1);
        btGenerar.addActionListener(control1);
        btEliminar.addActionListener(control1);
        tfBuscar.addKeyListener(control1);  
        jtDatos.addMouseListener(control1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        roboto1 = new efectos.Roboto();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        panelFondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCodigo = new principal.MaterialTextField();
        tfNombre = new principal.MaterialTextField();
        lbAlerta = new javax.swing.JLabel();
        jpLogo1 = new javax.swing.JPanel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSeparator2 = new javax.swing.JSeparator();
        btGenerar = new rojeru_san.complementos.RSButtonHover();
        btModificar = new rojeru_san.complementos.RSButtonHover();
        btAgregar = new rojeru_san.complementos.RSButtonHover();
        tfBuscar = new principal.MaterialTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCantidad = new principal.MaterialTextField();
        jLabel10 = new javax.swing.JLabel();
        dVence = new rojeru_san.componentes.RSDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfPrecioCompra = new principal.MaterialTextField();
        jLabel13 = new javax.swing.JLabel();
        tfMaximo = new principal.MaterialTextField();
        tfMinimo = new principal.MaterialTextField();
        jLabel14 = new javax.swing.JLabel();
        tfPrecioVenta = new principal.MaterialTextField();
        btEliminar = new rojeru_san.complementos.RSButtonHover();

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

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 970, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Codigo");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Productos: Gestion");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 420, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Buscar");
        panelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nombre");
        panelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 60));

        tfCodigo.setBackground(new java.awt.Color(213, 216, 221));
        tfCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setEnabled(false);
        tfCodigo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });
        panelFondo.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 220, 40));

        tfNombre.setBackground(new java.awt.Color(213, 216, 221));
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });
        panelFondo.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 320, 40));

        lbAlerta.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbAlerta.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 120, 40));

        javax.swing.GroupLayout jpLogo1Layout = new javax.swing.GroupLayout(jpLogo1);
        jpLogo1.setLayout(jpLogo1Layout);
        jpLogo1Layout.setHorizontalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpLogo1Layout.setVerticalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelFondo.add(jpLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        materialButtonCircle2.setBackground(new java.awt.Color(255, 0, 0));
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
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 50, 50));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Max", "Min", "Precio Comp.", "Precio Venta", "Precio Uni.", "Ganancia", "Vence", "Iva", "Estado", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 970, 220));
        panelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 20));

        btGenerar.setText("Generar");
        btGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarActionPerformed(evt);
            }
        });
        panelFondo.add(btGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 90, 40));

        btModificar.setBackground(new java.awt.Color(0, 102, 102));
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        panelFondo.add(btModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 160, 50));

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        panelFondo.add(btAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 160, 50));

        tfBuscar.setBackground(new java.awt.Color(213, 216, 221));
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBuscarKeyTyped(evt);
            }
        });
        panelFondo.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 230, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Maximo");
        panelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 100, 60));

        tfCantidad.setBackground(new java.awt.Color(213, 216, 221));
        tfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantidadKeyTyped(evt);
            }
        });
        panelFondo.add(tfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 320, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Cantidad");
        panelFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 60));
        panelFondo.add(dVence, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 310, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Precio C.");
        panelFondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 100, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Vence");
        panelFondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 60));

        tfPrecioCompra.setBackground(new java.awt.Color(213, 216, 221));
        tfPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioCompraActionPerformed(evt);
            }
        });
        tfPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrecioCompraKeyTyped(evt);
            }
        });
        panelFondo.add(tfPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 310, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Precio V.");
        panelFondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 100, 60));

        tfMaximo.setBackground(new java.awt.Color(213, 216, 221));
        tfMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaximoActionPerformed(evt);
            }
        });
        tfMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMaximoKeyTyped(evt);
            }
        });
        panelFondo.add(tfMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 90, 40));

        tfMinimo.setBackground(new java.awt.Color(213, 216, 221));
        tfMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMinimoActionPerformed(evt);
            }
        });
        tfMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMinimoKeyTyped(evt);
            }
        });
        panelFondo.add(tfMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 90, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Minimo");
        panelFondo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 100, 60));

        tfPrecioVenta.setBackground(new java.awt.Color(213, 216, 221));
        tfPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioVentaActionPerformed(evt);
            }
        });
        tfPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrecioVentaKeyTyped(evt);
            }
        });
        panelFondo.add(tfPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 310, 40));

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        panelFondo.add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped

        char c = evt.getKeyChar();

        if(!(c >= 46 && c <= 57 )){
            lbAlerta.setText("");
        }else{
            lbAlerta.setText("Solo letras");
            evt.consume();
        }
    }//GEN-LAST:event_tfNombreKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         x = null;
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        x = null;
    }//GEN-LAST:event_formWindowClosing

    private void materialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle1ActionPerformed


    }//GEN-LAST:event_materialButtonCircle1ActionPerformed

    private void materialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle2ActionPerformed

    }//GEN-LAST:event_materialButtonCircle2ActionPerformed

    private void jtDatosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDatosFocusLost

    }//GEN-LAST:event_jtDatosFocusLost

    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked


    }//GEN-LAST:event_jtDatosMouseClicked

    private void btGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarActionPerformed

    }//GEN-LAST:event_btGenerarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        
    }//GEN-LAST:event_btModificarActionPerformed

      
    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
      
    }//GEN-LAST:event_btAgregarActionPerformed

    private void materialButtonCircle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButtonCircle2MouseClicked
        this.dispose();
    }//GEN-LAST:event_materialButtonCircle2MouseClicked

    private void tfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarKeyTyped

    private void tfCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantidadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            lbAlerta.setText("");
        } else {
            lbAlerta.setText("Solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfCantidadKeyTyped

    private void tfPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecioCompraKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c >= 46 && c <= 57) {
            lbAlerta.setText("");
        } else {
            lbAlerta.setText("Solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfPrecioCompraKeyTyped

    private void tfPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioCompraActionPerformed

    private void tfMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaximoActionPerformed

    private void tfMaximoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMaximoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            lbAlerta.setText("");
        } else {
            lbAlerta.setText("Solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfMaximoKeyTyped

    private void tfMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMinimoActionPerformed

    private void tfMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMinimoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            lbAlerta.setText("");
        } else {
            lbAlerta.setText("Solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfMinimoKeyTyped

    private void tfPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecioVentaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c >= 46 && c <= 57) {
            lbAlerta.setText("");
        } else {
            lbAlerta.setText("Solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfPrecioVentaKeyTyped

    private void tfPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioVentaActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEliminarActionPerformed

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
    private rojeru_san.complementos.RSButtonHover btAgregar;
    public rojeru_san.complementos.RSButtonHover btEliminar;
    private rojeru_san.complementos.RSButtonHover btGenerar;
    private rojeru_san.complementos.RSButtonHover btModificar;
    public rojeru_san.componentes.RSDateChooser dVence;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpLogo1;
    public final javax.swing.JTable jtDatos = new javax.swing.JTable();
    private javax.swing.JLabel lbAlerta;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    public principal.MaterialTextField tfBuscar;
    public principal.MaterialTextField tfCantidad;
    public principal.MaterialTextField tfCodigo;
    public principal.MaterialTextField tfMaximo;
    public principal.MaterialTextField tfMinimo;
    public principal.MaterialTextField tfNombre;
    public principal.MaterialTextField tfPrecioCompra;
    public principal.MaterialTextField tfPrecioVenta;
    // End of variables declaration//GEN-END:variables

//    public void setCodigoProducto(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
