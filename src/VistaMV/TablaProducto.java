
package VistaMV;

import Controlador.ControlFactura;
import java.awt.Dimension;
import java.awt.Toolkit;


public class TablaProducto extends java.awt.Dialog {
public static String prod;
  
    public TablaProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width/3, height/5);		
        //setLocationRelativeTo(null);
        setLocation(155,90);
        prod = "s";
        this.setResizable(false);
    }
    
    public void setControlador(ControlFactura ctrl){
        tbUnica.addMouseListener(ctrl);
    }
    
    public void iniciar(){
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUnica = new javax.swing.JTable();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCTO");
        add(jLabel1, java.awt.BorderLayout.CENTER);

        tbUnica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tbUnica);

        add(jScrollPane1, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
         prod = null;
    }//GEN-LAST:event_closeDialog

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbUnica;
    // End of variables declaration//GEN-END:variables
}
