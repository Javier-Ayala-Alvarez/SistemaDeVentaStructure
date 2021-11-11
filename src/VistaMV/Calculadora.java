package VistaMV;

import Controlador.ControlFactura;
import Estructura.pilas.EvaluarExpresion;
import Estructura.pilas.Pila;
import javax.swing.table.DefaultTableModel;

public class Calculadora extends javax.swing.JDialog {

    Pila pilita;
    EvaluarExpresion ev;

    public Calculadora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pilita = new Pila();

    }

    public void iniciar() {
        this.setVisible(true);
    }

    public void setControlador(ControlFactura control1) {
//        tfBuscar.addKeyListener(control1);
//        jtDatos.addMouseListener(control1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        roboto1 = new efectos.Roboto();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        tfOperacion = new principal.MaterialTextField();
        panelFondo = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tfOperacion1 = new principal.MaterialTextField();
        materialButtonCircle4 = new principal.MaterialButtonCircle();
        materialButtonCircle5 = new principal.MaterialButtonCircle();
        materialButtonCircle6 = new principal.MaterialButtonCircle();
        materialButtonCircle7 = new principal.MaterialButtonCircle();
        materialButtonCircle8 = new principal.MaterialButtonCircle();
        materialButtonCircle9 = new principal.MaterialButtonCircle();
        materialButtonCircle10 = new principal.MaterialButtonCircle();
        materialButtonCircle11 = new principal.MaterialButtonCircle();
        materialButtonCircle12 = new principal.MaterialButtonCircle();
        materialButtomRectangle2 = new principal.MaterialButtomRectangle();
        materialButtonCircle13 = new principal.MaterialButtonCircle();
        materialButtonCircle14 = new principal.MaterialButtonCircle();
        materialButtonCircle15 = new principal.MaterialButtonCircle();
        materialButtonCircle16 = new principal.MaterialButtonCircle();
        materialButtomRectangle7 = new principal.MaterialButtomRectangle();
        materialButton1 = new principal.MaterialButton();
        materialButtonCircle18 = new principal.MaterialButtonCircle();
        materialButton2 = new principal.MaterialButton();

        materialButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle1.setText("X");
        materialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle1ActionPerformed(evt);
            }
        });

        tfOperacion.setBackground(new java.awt.Color(213, 216, 221));
        tfOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOperacionActionPerformed(evt);
            }
        });
        tfOperacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfOperacionKeyTyped(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelFondo.setBackground(new java.awt.Color(153, 153, 153));
        panelFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 390, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Calculadora");
        panelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 30));

        tfOperacion1.setBackground(new java.awt.Color(213, 216, 221));
        tfOperacion1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfOperacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOperacion1ActionPerformed(evt);
            }
        });
        tfOperacion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfOperacion1KeyTyped(evt);
            }
        });
        panelFondo.add(tfOperacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 40));

        materialButtonCircle4.setForeground(null);
        materialButtonCircle4.setText("7");
        materialButtonCircle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle4ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        materialButtonCircle5.setForeground(null);
        materialButtonCircle5.setText("8");
        materialButtonCircle5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle5ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        materialButtonCircle6.setForeground(null);
        materialButtonCircle6.setText("9");
        materialButtonCircle6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle6ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        materialButtonCircle7.setForeground(null);
        materialButtonCircle7.setText("4");
        materialButtonCircle7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle7ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        materialButtonCircle8.setForeground(null);
        materialButtonCircle8.setText("5");
        materialButtonCircle8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle8ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        materialButtonCircle9.setForeground(null);
        materialButtonCircle9.setText("6");
        materialButtonCircle9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle9ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        materialButtonCircle10.setForeground(null);
        materialButtonCircle10.setText("3");
        materialButtonCircle10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle10ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        materialButtonCircle11.setForeground(null);
        materialButtonCircle11.setText("2");
        materialButtonCircle11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle11ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        materialButtonCircle12.setForeground(null);
        materialButtonCircle12.setText("1");
        materialButtonCircle12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle12ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        materialButtomRectangle2.setBackground(new java.awt.Color(255, 51, 51));
        materialButtomRectangle2.setForeground(null);
        materialButtomRectangle2.setText("DEL");
        materialButtomRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtomRectangle2ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtomRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        materialButtonCircle13.setBackground(new java.awt.Color(0, 102, 102));
        materialButtonCircle13.setForeground(null);
        materialButtonCircle13.setText("x");
        materialButtonCircle13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle13ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        materialButtonCircle14.setBackground(new java.awt.Color(0, 102, 102));
        materialButtonCircle14.setForeground(null);
        materialButtonCircle14.setText("/");
        materialButtonCircle14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle14ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        materialButtonCircle15.setBackground(new java.awt.Color(0, 102, 102));
        materialButtonCircle15.setForeground(null);
        materialButtonCircle15.setText("-");
        materialButtonCircle15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle15ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        materialButtonCircle16.setBackground(new java.awt.Color(0, 102, 102));
        materialButtonCircle16.setForeground(null);
        materialButtonCircle16.setText("+");
        materialButtonCircle16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle16ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        materialButtomRectangle7.setBackground(new java.awt.Color(255, 51, 51));
        materialButtomRectangle7.setForeground(null);
        materialButtomRectangle7.setText("AC");
        materialButtomRectangle7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtomRectangle7ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtomRectangle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        materialButton1.setForeground(null);
        materialButton1.setText("0");
        materialButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton1ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, -1));

        materialButtonCircle18.setForeground(null);
        materialButtonCircle18.setText(".");
        materialButtonCircle18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle18ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 40, -1));

        materialButton2.setBackground(new java.awt.Color(0, 153, 153));
        materialButton2.setForeground(null);
        materialButton2.setText("=");
        materialButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton2ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 40, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void tfOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOperacionActionPerformed

    private void tfOperacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOperacionKeyTyped

    }//GEN-LAST:event_tfOperacionKeyTyped

    private void tfOperacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOperacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOperacion1ActionPerformed

    private void tfOperacion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOperacion1KeyTyped

    }//GEN-LAST:event_tfOperacion1KeyTyped

    private void materialButtonCircle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle4ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+7);
    }//GEN-LAST:event_materialButtonCircle4ActionPerformed

    private void materialButtonCircle5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle5ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+8);
    }//GEN-LAST:event_materialButtonCircle5ActionPerformed

    private void materialButtonCircle6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle6ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+9);
    }//GEN-LAST:event_materialButtonCircle6ActionPerformed

    private void materialButtonCircle7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle7ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+4);
    }//GEN-LAST:event_materialButtonCircle7ActionPerformed

    private void materialButtonCircle8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle8ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+5);
    }//GEN-LAST:event_materialButtonCircle8ActionPerformed

    private void materialButtonCircle9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle9ActionPerformed
       tfOperacion1.setText(tfOperacion1.getText()+6);
    }//GEN-LAST:event_materialButtonCircle9ActionPerformed

    private void materialButtonCircle10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle10ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+3);
    }//GEN-LAST:event_materialButtonCircle10ActionPerformed

    private void materialButtonCircle11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle11ActionPerformed
       tfOperacion1.setText(tfOperacion1.getText()+2);
    }//GEN-LAST:event_materialButtonCircle11ActionPerformed

    private void materialButtonCircle12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle12ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+1);
    }//GEN-LAST:event_materialButtonCircle12ActionPerformed

    private void materialButtonCircle13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle13ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+"*");
    }//GEN-LAST:event_materialButtonCircle13ActionPerformed

    private void materialButtonCircle14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle14ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+"/");
    }//GEN-LAST:event_materialButtonCircle14ActionPerformed

    private void materialButtonCircle15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle15ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+"-");
    }//GEN-LAST:event_materialButtonCircle15ActionPerformed

    private void materialButtonCircle16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle16ActionPerformed
        tfOperacion1.setText(tfOperacion1.getText()+"+");
    }//GEN-LAST:event_materialButtonCircle16ActionPerformed

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton1ActionPerformed
       tfOperacion1.setText(tfOperacion1.getText()+0);
    }//GEN-LAST:event_materialButton1ActionPerformed

    private void materialButtonCircle18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle18ActionPerformed
       tfOperacion1.setText(tfOperacion1.getText()+".");
    }//GEN-LAST:event_materialButtonCircle18ActionPerformed

    private void materialButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton2ActionPerformed
        ev = new EvaluarExpresion(tfOperacion1.getText());

        tfOperacion1.setText(String.valueOf(ev.getEvaluarPost()));
    }//GEN-LAST:event_materialButton2ActionPerformed

    private void materialButtomRectangle7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtomRectangle7ActionPerformed
        tfOperacion1.setText("");
    }//GEN-LAST:event_materialButtomRectangle7ActionPerformed

    private void materialButtomRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtomRectangle2ActionPerformed
       
        String cadena = tfOperacion1.getText();
        cadena = cadena.replaceFirst(".$","");
	tfOperacion1.setText(cadena);
    }//GEN-LAST:event_materialButtomRectangle2ActionPerformed

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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator3;
    private principal.MaterialButtomRectangle materialButtomRectangle2;
    private principal.MaterialButtomRectangle materialButtomRectangle7;
    private principal.MaterialButton materialButton1;
    private principal.MaterialButton materialButton2;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle10;
    private principal.MaterialButtonCircle materialButtonCircle11;
    private principal.MaterialButtonCircle materialButtonCircle12;
    private principal.MaterialButtonCircle materialButtonCircle13;
    private principal.MaterialButtonCircle materialButtonCircle14;
    private principal.MaterialButtonCircle materialButtonCircle15;
    private principal.MaterialButtonCircle materialButtonCircle16;
    private principal.MaterialButtonCircle materialButtonCircle18;
    private principal.MaterialButtonCircle materialButtonCircle4;
    private principal.MaterialButtonCircle materialButtonCircle5;
    private principal.MaterialButtonCircle materialButtonCircle6;
    private principal.MaterialButtonCircle materialButtonCircle7;
    private principal.MaterialButtonCircle materialButtonCircle8;
    private principal.MaterialButtonCircle materialButtonCircle9;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    private principal.MaterialTextField tfOperacion;
    private principal.MaterialTextField tfOperacion1;
    // End of variables declaration//GEN-END:variables
}
