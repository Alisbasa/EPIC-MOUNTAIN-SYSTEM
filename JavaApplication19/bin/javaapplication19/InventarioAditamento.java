/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication19.inventarioPrincipal.fechaActual;
import static javaapplication19.rellenarGastos.fechaActual;
import static javaapplication19.rellenarGastos.iconoInventario;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Erick Ivan
 */
public class InventarioAditamento extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    JComboBox inventarioCB;
    static JLabel monto;
    int folio;
    static JLabel nombre;
    
    /**
     * Creates new form clienteNuevo
     */
    public InventarioAditamento(JLabel monto, JLabel nombre) throws IOException {
        initComponents();
        this.monto = monto;
        this.nombre = nombre;
        this.setExtendedState(NORMAL);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        inventarioCB = new JComboBox(LeerExcel.rellenaCB2("src//excel/Inventario.xlsx", "EPIC MOUNTAIN", 0));
        inventarioCB.setBackground(Color.white);
        inventarioCB.setUI(PropiedadesCB2.createUI(inventarioCB));
        jpDescripcion.add(inventarioCB);
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
        labelInvEx = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        jpDescripcion = new javax.swing.JPanel();
        jlDesc1 = new javax.swing.JLabel();
        jbRegistrar = new javax.swing.JButton();

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

        labelInvEx.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        labelInvEx.setForeground(new java.awt.Color(255, 255, 255));
        labelInvEx.setText("SELECCIONAR PRODUCTO");
        jPanel10.add(labelInvEx, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jpDatos.setBackground(new java.awt.Color(51, 51, 51));
        jpDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        jpDescripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 1, 1, 1));

        jlDesc1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jlDesc1.setForeground(new java.awt.Color(255, 255, 255));
        jlDesc1.setText("INVENTARIO");
        jpDescripcion.add(jlDesc1);

        jpDatos.add(jpDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 82));

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
        jpDatos.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, 60));
        jbRegistrar.setBackground(Colores.epicColor);

        getContentPane().add(jpDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 160));

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
        try {
            String inventario6 = "EPIC MOUNTAIN";
            double sumaCosto = LeerExcel.obtenerCeldaNumerica("src\\excel\\Inventario.xlsx", inventario6, 7, inventarioCB.getSelectedIndex() + 1) + Double.valueOf(monto.getText());
            double sumaPrecio = LeerExcel.obtenerCeldaNumerica("src\\excel\\Inventario.xlsx", inventario6, 9, inventarioCB.getSelectedIndex() + 1) + Double.valueOf(monto.getText());
            int unidades = (int) LeerExcel.obtenerCeldaNumerica("src\\excel\\Inventario.xlsx", inventario6, 6, inventarioCB.getSelectedIndex() + 1);

            Escribir escribirInv = new Escribir();
            System.out.println(sumaCosto);
             
            
   
            
            //TIG
            Double TIG = sumaPrecio/sumaCosto;
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, TIG, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", inventario6), 5);
            
            //COSTO NETO
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, (unidades*sumaCosto), (inventarioCB.getSelectedIndex()+1), 8);
            
            //PRECIO BASE NETO
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, (unidades*sumaPrecio), (inventarioCB.getSelectedIndex()+1), 10);
            
            //PRECIO LOCAL UNIDAD
            Double precioL = (LeerExcel.obtenerCeldaNumerica("src\\excel\\Inventario.xlsx", inventario6, 9, (inventarioCB.getSelectedIndex()+1)) * 1.16);
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, precioL, (inventarioCB.getSelectedIndex()+1), 11);

            //PRECIO LOCAL NETO
            Double precioNeto = escribirInv.Mulitplicar(6, 11, (inventarioCB.getSelectedIndex()+1), "src\\excel\\Inventario.xlsx", inventario6);
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, precioNeto, (inventarioCB.getSelectedIndex()+1), 12);

            //COMISION ML
            Double comisionML = ((LeerExcel.obtenerCeldaNumerica("src\\excel\\Inventario.xlsx", inventario6, 11, (inventarioCB.getSelectedIndex()+1))) * .15) + 5;
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, comisionML, (inventarioCB.getSelectedIndex()+1), 15);

            //COMISION ML NETO
            Double comisionMLN = escribirInv.Mulitplicar(6, 15, (inventarioCB.getSelectedIndex()+1), "src\\excel\\Inventario.xlsx", inventario6);
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, comisionMLN, (inventarioCB.getSelectedIndex()+1), 16);

            // IVA UNIDAD
            Double IVA = (LeerExcel.obtenerCeldaNumerica("src\\excel\\Inventario.xlsx", inventario6, 9, (inventarioCB.getSelectedIndex()+1)) * 0.16);
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, IVA, (inventarioCB.getSelectedIndex()+1), 17);

            //IVA NETO
            Double ivaN = escribirInv.Mulitplicar(6, 17, (inventarioCB.getSelectedIndex()+1), "src\\excel\\Inventario.xlsx", inventario6);
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, ivaN, (inventarioCB.getSelectedIndex()+1), 18);

            //PRECIO ML
            Double precioML = escribirInv.SumarColumnasML((inventarioCB.getSelectedIndex()+1), 9, 17, 15, "src\\excel\\Inventario.xlsx", inventario6);
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, precioML, (inventarioCB.getSelectedIndex()+1), 13);

            //PRECIOML NETO
            Double precioMLN = escribirInv.Mulitplicar(6, 13,(inventarioCB.getSelectedIndex()+1), "src\\excel\\Inventario.xlsx", inventario6);
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, precioMLN, (inventarioCB.getSelectedIndex()+1), 14);

            //UTILIDAD UNIDAD LOCAL
            Double utilidad = escribirInv.RestarColumnas((inventarioCB.getSelectedIndex()+1), 11, 7, 17, "src\\excel\\Inventario.xlsx", inventario6);
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, utilidad, (inventarioCB.getSelectedIndex()+1), 19);
            //UTILIDAD LOCAL NETA
            Double utilidadLN = escribirInv.Mulitplicar(6, 19, (inventarioCB.getSelectedIndex()+1), "src\\excel\\Inventario.xlsx", inventario6);
            escribirInv.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario6, utilidadLN, (inventarioCB.getSelectedIndex()+1), 20);
            
            
            String[] data = {(String) fechaActual(), inventario6, nombre.getText() + " agregados a:" + inventarioCB.getSelectedItem().toString(), monto.getText(), "Aditamento", "VERDE", "0"};
            
                escribirInv.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                escribirInv.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(0), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                folio = inventarioCB.getSelectedIndex() + 1;
                /*escribirInv.escribirCeldaNumerica("src\\excel\\LibrosContables.xlsx", "Gastos", folio, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos")+1), 7);
                    System.out.println(folio);*/
            escribirInv.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(monto.getText())), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
            String formula = "SUM(D2:D" + LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + ")";

            escribirInv.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(0)), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
            String formula2 = "SUM(G2:G" + LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + ")";
            escribirInv.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
            escribirInv.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos")+1), 6);
            Libros.actualiza();
            rellenarGastos.botonBorrarAditamento(rellenarGastos.iconoLibros, "src\\excel\\Inventario.xlsx", inventario6, folio);
            rellenarGastos.botonBorrarInd(rellenarGastos.iconoLibros, "src\\excel\\LibrosContables.xlsx", "Gastos");
 


            
            
        } catch (IOException ex) {
            Logger.getLogger(InventarioAditamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jbRegistrarMouseClicked

    public static String fechaActual(){
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM YY");
        return formatoFecha.format(fecha);
    }
    
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
            java.util.logging.Logger.getLogger(InventarioAditamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioAditamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioAditamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioAditamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            @Override
            public void run() {
                try {
                    new InventarioAditamento(nombre, monto).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InventarioAditamento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlDesc1;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpDescripcion;
    private javax.swing.JLabel labelInvEx;
    // End of variables declaration//GEN-END:variables
}
