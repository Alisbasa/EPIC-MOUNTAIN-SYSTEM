/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication19.rellenarGastos.fechaActual;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Erick Ivan
 */
public class equipoymobCT extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    static JTextField paqueteria;
    static JComboBox tipoGasto;

    /**
     * Creates new form clienteNuevo
     */
    public equipoymobCT(JTextField paqueteria, JComboBox tipoGasto) {
        initComponents();
        this.paqueteria = paqueteria;
        this.tipoGasto = tipoGasto;
        this.setExtendedState(NORMAL);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        jpDescripcion = new javax.swing.JPanel();
        jtProducto = new javax.swing.JTextField();
        jlDesc = new javax.swing.JLabel();
        jpPack = new javax.swing.JPanel();
        jtDesc = new javax.swing.JTextField();
        jlDesc1 = new javax.swing.JLabel();
        jpTIG = new javax.swing.JPanel();
        jlCosto1 = new javax.swing.JLabel();
        jtCosto = new javax.swing.JTextField();
        jpUbicacion = new javax.swing.JPanel();
        jbRegistrar = new javax.swing.JButton();
        jpBoton = new javax.swing.JPanel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 40));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel10.setLayout(new java.awt.BorderLayout());

        LOGO.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel10.add(LOGO, java.awt.BorderLayout.LINE_START);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPRA EN TRANSITO EQUIPO Y MOB.");
        jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jpDatos.setBackground(new java.awt.Color(51, 51, 51));
        jpDatos.setLayout(new java.awt.GridLayout(5, 0));

        jpDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        jpDescripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtProducto.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtProductoActionPerformed(evt);
            }
        });
        jpDescripcion.add(jtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 340, 48));
        jtProducto.setBackground(Colores.epicColorBajito);

        jlDesc.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jlDesc.setForeground(new java.awt.Color(255, 255, 255));
        jlDesc.setText("PRODUCTO");
        jpDescripcion.add(jlDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 50));

        jpDatos.add(jpDescripcion);

        jpPack.setBackground(new java.awt.Color(51, 51, 51));
        jpPack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtDesc.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtDesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescActionPerformed(evt);
            }
        });
        jpPack.add(jtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 370, 48));
        jtProducto.setBackground(Colores.epicColorBajito);

        jlDesc1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jlDesc1.setForeground(new java.awt.Color(255, 255, 255));
        jlDesc1.setText("DESCRIPCION");
        jpPack.add(jlDesc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 30));

        jpDatos.add(jpPack);

        jpTIG.setBackground(new java.awt.Color(51, 51, 51));
        jpTIG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlCosto1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlCosto1.setForeground(new java.awt.Color(255, 255, 255));
        jlCosto1.setText("COSTO");
        jpTIG.add(jlCosto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, 30));

        jtCosto.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpTIG.add(jtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 130, 48));
        jtCosto.setBackground(Colores.epicColorBajito);

        jpDatos.add(jpTIG);

        jpUbicacion.setBackground(new java.awt.Color(51, 51, 51));
        jpUbicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbRegistrar.setFont(new java.awt.Font("Franklin Gothic Book", 2, 24)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegistrarMouseClicked(evt);
            }
        });
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });
        jpUbicacion.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 170, 60));
        jbRegistrar.setBackground(Colores.epicColor);

        jpDatos.add(jpUbicacion);

        jpBoton.setBackground(new java.awt.Color(51, 51, 51));
        jpBoton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpDatos.add(jpBoton);

        getContentPane().add(jpDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void changeColor(JPanel hover,Color rand){
        hover.setBackground(rand);
    }
    
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();
        this.setLocation(kordinatX-mousepX, kordinatY-mousepY);

    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX = evt.getX();
        mousepY =evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRegistrarActionPerformed
    
    private void jbRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrarMouseClicked
        String producto = jtProducto.getText();
        String desc = jtDesc.getText();
        String fecha = fechaActual();
        
        String [] compraE = {producto, desc, fecha};
        
        Escribir escribirE = new Escribir();
        
        try {
            escribirE.escribirExcelInv("src\\excel\\comprasT.xlsx", "COMPRAS", compraE, 3);
            escribirE.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", Double.valueOf(jtCosto.getText()), LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 3);
            escribirE.escribirCelda("src\\excel\\comprasT.xlsx", "COMPRAS", tipoGasto.getSelectedItem().toString(), LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 21);
            escribirE.escribirCelda("src\\excel\\comprasT.xlsx", "COMPRAS", paqueteria.getText(), LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 22);
            String[] data = {(String) fechaActual(), "Compra en Transito", jtProducto.getText(), jtCosto.getText(), (String) tipoGasto.getSelectedItem(), "VERDE", "   "};
        } catch (IOException ex) {
            Logger.getLogger(equipoymobCT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        this.setVisible(false);    
    }//GEN-LAST:event_jbRegistrarMouseClicked
    

    
    public static String fechaActual(){
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM YY");
        return formatoFecha.format(fecha);
    }
    
    private void jtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtProductoActionPerformed

    private void jtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(equipoymobCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(equipoymobCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(equipoymobCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(equipoymobCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new equipoymobCT(paqueteria, tipoGasto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlCosto1;
    private javax.swing.JLabel jlDesc;
    private javax.swing.JLabel jlDesc1;
    private javax.swing.JPanel jpBoton;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpDescripcion;
    private javax.swing.JPanel jpPack;
    private javax.swing.JPanel jpTIG;
    private javax.swing.JPanel jpUbicacion;
    public static javax.swing.JTextField jtCosto;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtProducto;
    // End of variables declaration//GEN-END:variables
}
