package VistaMA;
import Controlador.ControlFactura;
import Controlador.ControlMA;
import static VistaLogin.Login.LogoE;
import VistaMV.Factura;
import javax.swing.table.DefaultTableModel;
import VistaMV.Fondo;
import java.util.Date;

public class ClienteMA extends javax.swing.JDialog {

    DefaultTableModel modelo;
    public static String x;

    public ClienteMA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jpLogo1.setBorder(new Fondo(LogoE));
        btnModificar.setActionCommand("Modificar");
        btnGuardar.setActionCommand("Guardar");
         
        

                    
    }
    public void iniciar() {
        this.setVisible(true);
    }
     public void setControlador(ControlMA control1) {
        btnModificar.addActionListener(control1);
        btnGuardar.addActionListener(control1);
        tfBuscar.addKeyListener(control1);
        jtDatos.addMouseListener(control1);
        
    }
     public void setControlador(ControlFactura control1) {
        btnModificar.addActionListener(control1);
        btnGuardar.addActionListener(control1);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfBuscar = new principal.MaterialTextField();
        jpLogo1 = new javax.swing.JPanel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tfDireccion = new principal.MaterialTextField();
        lbDirrecion = new javax.swing.JLabel();
        tfNombre = new principal.MaterialTextField();
        tfApellido = new principal.MaterialTextField();
        tfTelefono = new principal.MaterialTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        lbtelefono = new javax.swing.JLabel();
        btnGuardar = new rojeru_san.complementos.RSButtonHover();

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Buscar...");
        panelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 80, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Apellido");
        panelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        tfBuscar.setBackground(new java.awt.Color(213, 216, 221));
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBuscarKeyTyped(evt);
            }
        });
        panelFondo.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 160, 30));

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
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 50, 50));

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

        btnModificar.setBackground(new java.awt.Color(0, 102, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelFondo.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 160, 50));
        panelFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 610, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Cliente / Mostrar / Modificar");
        panelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 340, 60));

        tfDireccion.setBackground(new java.awt.Color(213, 216, 221));
        tfDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDireccionKeyTyped(evt);
            }
        });
        panelFondo.add(tfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 400, 40));

        lbDirrecion.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbDirrecion.setForeground(new java.awt.Color(255, 0, 0));
        lbDirrecion.setText(".");
        panelFondo.add(lbDirrecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 70, -1));

        tfNombre.setBackground(new java.awt.Color(213, 216, 221));
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });
        panelFondo.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 400, 40));

        tfApellido.setBackground(new java.awt.Color(213, 216, 221));
        tfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoKeyTyped(evt);
            }
        });
        panelFondo.add(tfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 400, 40));

        tfTelefono.setBackground(new java.awt.Color(213, 216, 221));
        tfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoKeyTyped(evt);
            }
        });
        panelFondo.add(tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 400, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Direccion");
        panelFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Nombre");
        panelFondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Telefono");
        panelFondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        lbNombre.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 0, 0));
        lbNombre.setText(".");
        panelFondo.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 70, -1));

        lbApellido.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbApellido.setForeground(new java.awt.Color(255, 0, 0));
        lbApellido.setText(".");
        panelFondo.add(lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 70, -1));

        lbtelefono.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbtelefono.setForeground(new java.awt.Color(255, 0, 0));
        lbtelefono.setText(".");
        panelFondo.add(lbtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 70, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
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

    private void tfDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDireccionKeyTyped
        
    }//GEN-LAST:event_tfDireccionKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

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

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
        char c = evt.getKeyChar();

        if(!(c >= 46 && c <= 57 )){
            lbNombre.setText("");
        }else{
            lbNombre.setText("Letras");
            evt.consume();
        }
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoKeyTyped
        char c = evt.getKeyChar();

        if(!(c >= 46 && c <= 57 )){
            lbApellido.setText("");
        }else{
            lbApellido.setText("Letras");
            evt.consume();
        }
    }//GEN-LAST:event_tfApellidoKeyTyped

    private void tfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyTyped
        char c = evt.getKeyChar();

        if((c >= 46 && c <= 57 )){
            lbtelefono.setText("");
        }else{
            lbtelefono.setText("numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfTelefonoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

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
    public rojeru_san.complementos.RSButtonHover btnGuardar;
    public rojeru_san.complementos.RSButtonHover btnModificar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpLogo1;
    public static final javax.swing.JTable jtDatos = new javax.swing.JTable();
    public javax.swing.JLabel lbApellido;
    public javax.swing.JLabel lbDirrecion;
    public javax.swing.JLabel lbNombre;
    public javax.swing.JLabel lbtelefono;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    public static principal.MaterialTextField tfApellido;
    public static principal.MaterialTextField tfBuscar;
    public static principal.MaterialTextField tfDireccion;
    public static principal.MaterialTextField tfNombre;
    public static principal.MaterialTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
