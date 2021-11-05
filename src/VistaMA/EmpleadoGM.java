package VistaMA;

import Controlador.ControlMA;
import static VistaLogin.Login.LogoE;
import VistaMV.Fondo;

public class EmpleadoGM extends javax.swing.JDialog {

  //  public static String x;
    
    public EmpleadoGM(java.awt.Frame parent, boolean modal,boolean parametro) {
        super(parent, modal);

        initComponents();
        this.setLocation(40, 80);
       setEstado(parametro);
        jpLogo1.setBorder(new Fondo(LogoE));
         btnModificar.setActionCommand("Modificar");
         btnEliminar1.setActionCommand("Eliminar");
         
         
    }
    
    public void iniciar() {
        this.setVisible(true);
    }
    
     public void setEstado(boolean estado){
       if (!estado) {
    
            btnModificar.setVisible(false);
            btnEliminar1.setVisible(false);
        }else{
            btnModificar.setVisible(true);
            btnEliminar1.setVisible(true);
        }
    }
      public void setControlador(ControlMA control){
        this.btnModificar.addActionListener(control);
         this.btnEliminar1.addActionListener(control);
        this.tbEmpleados.addMouseListener(control);
        this.buscar.addKeyListener(control);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialButtonCircle1 = new principal.MaterialButtonCircle();
        jLabel2 = new javax.swing.JLabel();
        panelFondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jpLogo1 = new javax.swing.JPanel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmpleados = new javax.swing.JTable();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        btnEliminar1 = new rojeru_san.complementos.RSButtonHover();
        buscar = new principal.MaterialTextField();
        jLabel1 = new javax.swing.JLabel();
        alerta1 = new javax.swing.JLabel();

        materialButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle1.setText("X");
        materialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle1ActionPerformed(evt);
            }
        });

        jLabel2.setText("TOTAL");

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
        panelFondo.setMinimumSize(new java.awt.Dimension(1050, 590));
        panelFondo.setPreferredSize(new java.awt.Dimension(1050, 590));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1050, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Empleado");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 210, 60));

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
        materialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle2ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 50, 50));

        tbEmpleados.setBackground(new java.awt.Color(218, 220, 222));
        tbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio Compra", "Precio Unitario", "Cantidad", "Maximo", "Minimo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbEmpleados);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1000, 410));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelFondo.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 130, 40));

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        panelFondo.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 130, 40));

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        panelFondo.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 9, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 40, 60));
        panelFondo.add(alerta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void materialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle1ActionPerformed
        

    }//GEN-LAST:event_materialButtonCircle1ActionPerformed

    private void materialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle2ActionPerformed
        this.dispose();
             
    }//GEN-LAST:event_materialButtonCircle2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

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
    public rojeru_san.complementos.RSButtonHover btnEliminar1;
    public rojeru_san.complementos.RSButtonHover btnModificar;
    public principal.MaterialTextField buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpLogo1;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    public javax.swing.JPanel panelFondo;
    public javax.swing.JTable tbEmpleados;
    // End of variables declaration//GEN-END:variables
}
