package VistaMA;

import Controlador.ControlMA;
import static VistaLogin.Login.LogoE;
import VistaMV.Fondo;
import java.util.Date;

public class VistaUsuario extends javax.swing.JDialog {

    public static String x;

    public VistaUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        x = "x";
       
        this.btnGuardar.setActionCommand("Agregar");
        this.tfUsuario.setEditable(false);
        
    }

    public VistaUsuario() {
     
    }
    
    public void setControladorMA(ControlMA controlMA){
       this.btnGuardar.addActionListener(controlMA);
       this.tfCombobox.addItemListener(controlMA);
       this.tfContraseña.addKeyListener(controlMA);
       
    }

    public void iniciar() {
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        roboto1 = new efectos.Roboto();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        panelFondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfUsuario = new principal.MaterialTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfCombobox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        hhu = new javax.swing.JLabel();
        tfContraseña = new principal.MaterialTextField();
        btnGuardar = new rojeru_san.complementos.RSButtonHover();
        alerta1 = new javax.swing.JLabel();

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
        panelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 920, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Generar Usuario");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 210, 60));

        materialButtonCircle2.setBackground(new java.awt.Color(219, 211, 247));
        materialButtonCircle2.setText("X");
        materialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle2ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 50, 50));

        jPanel1.setBackground(new java.awt.Color(219, 211, 247));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Usuario");

        tfUsuario.setBackground(new java.awt.Color(213, 216, 221));
        tfUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfUsuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfUsuario.setSelectionColor(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 770, 60));

        jPanel2.setBackground(new java.awt.Color(219, 211, 247));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Empleado");

        tfCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajero", "Administrador", "Supervisor", " " }));
        tfCombobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfComboboxMouseClicked(evt);
            }
        });
        tfCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(tfCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tfCombobox)
                        .addContainerGap())
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 690, 60));

        jPanel4.setBackground(new java.awt.Color(219, 211, 247));

        hhu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        hhu.setForeground(new java.awt.Color(102, 102, 102));
        hhu.setText("Contraseña");

        tfContraseña.setBackground(new java.awt.Color(213, 216, 221));
        tfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfContraseñaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(hhu, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hhu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 700, 60));

        btnGuardar.setText("Guardar");
        panelFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        alerta1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        alerta1.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(alerta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 360, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        x = null;
    }//GEN-LAST:event_formWindowClosed

    public void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    public void materialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle1ActionPerformed


    }//GEN-LAST:event_materialButtonCircle1ActionPerformed

    public void materialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle2ActionPerformed
        this.dispose();
        x = null;
    }//GEN-LAST:event_materialButtonCircle2ActionPerformed

    public void tfComboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfComboboxMouseClicked
//        if (opc == 1) {
//            btnGuardar.setEnabled(true);
//        } else {
//            btnModificar.setEnabled(true);
//        }
    }//GEN-LAST:event_tfComboboxMouseClicked

    public void tfComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfComboboxActionPerformed

    public void tfContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContraseñaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseñaKeyTyped

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
    public javax.swing.JLabel alerta1;
    public rojeru_san.complementos.RSButtonHover btnGuardar;
    private javax.swing.JLabel hhu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    public javax.swing.JComboBox<String> tfCombobox;
    public principal.MaterialTextField tfContraseña;
    public principal.MaterialTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
