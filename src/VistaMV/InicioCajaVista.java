/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaMV;

import Controlador.ControlFactura;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author kathy
 */
public class InicioCajaVista extends javax.swing.JDialog {

    Calendar fechaActualCI = new GregorianCalendar();
    /**
     * Creates new form InicioCaja
     */
    public InicioCajaVista() {
    }

    public InicioCajaVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.btnIC.setActionCommand("AccesoIC");
//        this.cldFechaInicio.getFormatoFecha();
//        String y = this.cldFechaInicio.getFormatoFecha();
        this.setLocationRelativeTo(null);
        this.cldFechaInicio.setDatoFecha(new Date());
//        this.prueba.setText(y);
    }

    public void setControlador(ControlFactura control) {
        this.btnIC.addActionListener(control);
        this.panelIC.addMouseListener(control);
        this.codigoCaja.addActionListener(control);
        this.tfUsuId.addActionListener(control);
        this.lbCamLleIni.addMouseListener(control);
        this.lbDinero.addMouseListener(control);

    }

    public void iniciar() {
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIC = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cldFechaInicio = new rojeru_san.componentes.RSDateChooser();
        jLabel4 = new javax.swing.JLabel();
        tfDineroInicio = new javax.swing.JTextField();
        btnIC = new rojeru_san.complementos.RSButtonHover();
        lbCamLleIni = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigoCaja = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfUsuId = new javax.swing.JTextField();
        lbDinero = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelIC.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIO CAJA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fecha inicio: ");

        cldFechaInicio.setFormatoFecha("yyyy/MM/dd HH:mm:ss");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Dinero en caja:");

        tfDineroInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDineroInicioActionPerformed(evt);
            }
        });
        tfDineroInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDineroInicioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDineroInicioKeyTyped(evt);
            }
        });

        btnIC.setText("OK");
        btnIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnICActionPerformed(evt);
            }
        });

        lbCamLleIni.setForeground(new java.awt.Color(255, 51, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CodigoCaja:");

        codigoCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoCajaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Id_Usuario");

        lbDinero.setForeground(new java.awt.Color(153, 0, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciocaja1.png"))); // NOI18N

        javax.swing.GroupLayout panelICLayout = new javax.swing.GroupLayout(panelIC);
        panelIC.setLayout(panelICLayout);
        panelICLayout.setHorizontalGroup(
            panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelICLayout.createSequentialGroup()
                .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelICLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelICLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btnIC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelICLayout.createSequentialGroup()
                                .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cldFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelICLayout.createSequentialGroup()
                                        .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfUsuId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfDineroInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addComponent(lbDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelICLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelICLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCamLleIni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        panelICLayout.setVerticalGroup(
            panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelICLayout.createSequentialGroup()
                .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelICLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelICLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCamLleIni, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(codigoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(cldFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDineroInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(btnIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDineroInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDineroInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDineroInicioActionPerformed

    private void btnICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnICActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnICActionPerformed

    private void codigoCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoCajaActionPerformed

    private void tfDineroInicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDineroInicioKeyReleased
        
    }//GEN-LAST:event_tfDineroInicioKeyReleased

    private void tfDineroInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDineroInicioKeyTyped
        char vali = evt.getKeyChar();
        if (vali >= 46 && vali <= 57) {
            lbDinero.setText("");
        } else {
            lbDinero.setText("Digitar numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfDineroInicioKeyTyped

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
//            java.util.logging.Logger.getLogger(InicioCajaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InicioCajaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InicioCajaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InicioCajaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                InicioCajaV dialog = new InicioCajaV(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    jlbSolecito}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojeru_san.complementos.RSButtonHover btnIC;
    public rojeru_san.componentes.RSDateChooser cldFechaInicio;
    public javax.swing.JTextField codigoCaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel lbCamLleIni;
    public javax.swing.JLabel lbDinero;
    public javax.swing.JPanel panelIC;
    public javax.swing.JTextField tfDineroInicio;
    public javax.swing.JTextField tfUsuId;
    // End of variables declaration//GEN-END:variables
}
