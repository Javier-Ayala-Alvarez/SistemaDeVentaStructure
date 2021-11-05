package VistaMA;

import Controlador.ControlMA;
import static VistaLogin.Login.LogoE;
import VistaMV.Fondo;

public class RegistrosDeVentas extends javax.swing.JDialog {

    //MenuAdministrador menuAd;
    public static String x;
    
    public RegistrosDeVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        x = "x";
        btnDetalle.setActionCommand("Detalle");
        
    }
     public void setControlador(ControlMA control1) {
       jtDatos.addMouseListener(control1);
        tfBuscar.addKeyListener(control1);
        btnDetalle.addActionListener(control1);
        
        
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
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panelFondoRV = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnCerrarRV = new principal.MaterialButtonCircle();
        lbTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tfBuscar = new principal.MaterialTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDetalle = new rojeru_san.complementos.RSButtonHover();

        materialButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle1.setText("X");
        materialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle1ActionPerformed(evt);
            }
        });

        jLabel2.setText("TOTAL");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Buscar...");

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

        panelFondoRV.setBackground(new java.awt.Color(219, 211, 247));
        panelFondoRV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelFondoRV.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Factura");
        panelFondoRV.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 60));

        btnCerrarRV.setBackground(new java.awt.Color(219, 211, 247));
        btnCerrarRV.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrarRV.setText("X");
        btnCerrarRV.setFont(new java.awt.Font("Aharoni", 2, 17)); // NOI18N
        btnCerrarRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRVActionPerformed(evt);
            }
        });
        panelFondoRV.add(btnCerrarRV, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 50, 50));

        lbTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(0, 0, 0));
        lbTotal.setText(".");
        panelFondoRV.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 130, -1));

        jtDatos.setBackground(new java.awt.Color(255, 255, 255));
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nº Factura", "Fecha", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtDatos);

        panelFondoRV.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 750, 310));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("TOTAL:");
        panelFondoRV.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        tfBuscar.setBackground(new java.awt.Color(255, 255, 255));
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBuscarKeyTyped(evt);
            }
        });
        panelFondoRV.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 160, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Buscar...");
        panelFondoRV.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 50));

        btnDetalle.setText("Detalle");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });
        panelFondoRV.add(btnDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoRV, javax.swing.GroupLayout.PREFERRED_SIZE, 747, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoRV, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        x = null;
        //menuAd.mostrarPaneles(true);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void materialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle1ActionPerformed
        

    }//GEN-LAST:event_materialButtonCircle1ActionPerformed

    private void btnCerrarRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRVActionPerformed
        this.dispose();
        //menuAd.mostrarPaneles(true);
        x = null;
    }//GEN-LAST:event_btnCerrarRVActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyTyped

    }//GEN-LAST:event_tfBuscarKeyTyped

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed

    }//GEN-LAST:event_btnDetalleActionPerformed

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
    public principal.MaterialButtonCircle btnCerrarRV;
    public rojeru_san.complementos.RSButtonHover btnDetalle;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jtDatos;
    public static javax.swing.JLabel lbTotal;
    private principal.MaterialButtonCircle materialButtonCircle1;
    public javax.swing.JPanel panelFondoRV;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    public static principal.MaterialTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
