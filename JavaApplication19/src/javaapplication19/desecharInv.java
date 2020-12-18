/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication19.inventarioPrincipal.fechaActual;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Erick Ivan
 */
public final class desecharInv extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    int numeroUnidades = 1;

    /**
     * Creates new form clienteNuevo
     *
     * @param monto
     */
    public desecharInv() {
        initComponents();

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
        jLabel1 = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        jpDescripcion = new javax.swing.JPanel();
        try{
            inventario = new javax.swing.JComboBox(LeerExcel.rellenaCB2(rutas.excel+"\\INVENTARIOS.xlsx", "EPIC MOUNTAIN", 0));
            jbRegistrar = new javax.swing.JButton();
            unidades = new javax.swing.JComboBox();

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

            jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("DESECHAR INVENTARIO");
            jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
            jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

            jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

            jpDatos.setBackground(new java.awt.Color(51, 51, 51));
            jpDatos.setLayout(new java.awt.GridLayout(1, 0));

            jpDescripcion.setBackground(new java.awt.Color(51, 51, 51));
            jpDescripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        }catch(IOException e){}
        inventario.setUI(PropiedadesCB2.createUI(inventario));
        inventario.setBackground(Color.white);
        jpDescripcion.add(inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 40));

        jbRegistrar.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("OK");
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
        jpDescripcion.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, 40));
        jbRegistrar.setBackground(Colores.epicColor);

        unidades.setBackground(Color.white);
        unidades.setUI(PropiedadesCB2.createUI(unidades));
        jpDescripcion.add(unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 80, 40));
        inventario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int indexInventario = 1;

                indexInventario = inventario.getSelectedIndex();
                try {
                    numeroUnidades =(int) LeerExcel.obtenerCeldaNumerica("src//excel/INVENTARIOS.xlsx", "EPIC MOUNTAIN", 6, indexInventario + 1);
                } catch (IOException ex) {
                    Logger.getLogger(Rellenar.class.getName()).log(Level.SEVERE, null, ex);
                }
                unidades.removeAllItems();
                for (int i = 1; i <= numeroUnidades; i++) {
                    unidades.addItem(Integer.toString(i));
                }
            }
        });

        jpDatos.add(jpDescripcion);

        getContentPane().add(jpDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();
        this.setLocation(kordinatX - mousepX, kordinatY - mousepY);

    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrarMouseClicked
        try {
            Escribir escribirD = new Escribir();
            Double costoInv = LeerExcel.obtenerCeldaNumerica(rutas.excel+ "\\INVENTARIOS.xlsx", "EPIC MOUNTAIN", 7, (inventario.getSelectedIndex()+1));
            int unidadesSelec = Integer.valueOf(unidades.getSelectedItem().toString());
            Double costoCompleto = costoInv * unidadesSelec;

            String[] data = {fechaActual(), "Desecho Inventario", inventario.getSelectedItem().toString(), Double.toString(costoCompleto), "  ", "VERDE", Double.toString(costoCompleto)};
          
            escribirD.escribirExcelInv(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos", data, 7);
            escribirD.escribirCeldaDouble(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos", Double.valueOf(data[3]), LeerExcel.contarRenglones(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos"), 3);
            escribirD.escribirCeldaDouble(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos", Double.valueOf(data[6]), LeerExcel.contarRenglones(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos"), 6);
            String formula = "SUM(G2:G" + LeerExcel.contarRenglones(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos") + ")";
            escribirD.escribirFormula(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos", formula, (LeerExcel.contarRenglones(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos") + 1), 6);
            
            if (numeroUnidades - unidadesSelec == 0) {
                Escribir.removeRow(rutas.excel+ "\\INVENTARIOS.xlsx", "EPIC MOUNTAIN", (inventario.getSelectedIndex() + 1));
            }else{
                escribirD.escribirCeldaNumerica(rutas.excel+ "\\INVENTARIOS.xlsx", "EPIC MOUNTAIN", numeroUnidades - unidadesSelec, inventario.getSelectedIndex()+1, 6);
                 String inventarioHoja = "EPIC MOUNTAIN";

                    int suma = (int) LeerExcel.obtenerCeldaNumerica(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, 6, inventario.getSelectedIndex()+1);
                    double costoUnidad = LeerExcel.obtenerCeldaNumerica(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, 7, inventario.getSelectedIndex()+1);
                    double precioBaseUnidad = LeerExcel.obtenerCeldaNumerica(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, 9, inventario.getSelectedIndex()+1);
                    Double precioML = LeerExcel.obtenerCeldaNumerica("src//excel/INVENTARIOS.xlsx", inventarioHoja, 13, inventario.getSelectedIndex()+1);
                    Double iva = LeerExcel.obtenerCeldaNumerica("src//excel/INVENTARIOS.xlsx", inventarioHoja, 17, inventario.getSelectedIndex()+1);
                    Double comisionML = LeerExcel.obtenerCeldaNumerica("src//excel/INVENTARIOS.xlsx", inventarioHoja, 15, inventario.getSelectedIndex()+1);
                    Double utilidadShop = LeerExcel.obtenerCeldaNumerica("src//excel/INVENTARIOS.xlsx", inventarioHoja, 19, inventario.getSelectedIndex()+1);

                    //COSTO NETO
                    escribirD.escribirCeldaDouble(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, (suma * costoUnidad), inventario.getSelectedIndex()+1, 8);
                    //PRECIO BASE NETO
                    escribirD.escribirCeldaDouble(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, suma * (precioBaseUnidad), inventario.getSelectedIndex()+1, 10);
                    //PRECIO LOCAL NETO
                    Double precioNeto = escribirD.Mulitplicar(6, 11, inventario.getSelectedIndex()+1, rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja);
                    escribirD.escribirCeldaDouble(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, precioNeto, inventario.getSelectedIndex()+1, 12);
                    //COMISION ML NETO

                    escribirD.escribirCeldaDouble(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, comisionML * suma, inventario.getSelectedIndex()+1, 16);

                    //IVA NETO
                    escribirD.escribirCeldaDouble(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, suma * iva, inventario.getSelectedIndex()+1, 18);
                    //PRECIOML NETO

                    escribirD.escribirCeldaDouble(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, suma * precioML, inventario.getSelectedIndex()+1, 14);

                    //UTILIDAD LOCAL NETA
                    escribirD.escribirCeldaDouble(rutas.excel+ "\\INVENTARIOS.xlsx", inventarioHoja, suma * utilidadShop, inventario.getSelectedIndex()+1, 20);
            }
            
            Libros.actualiza();
            this.dispose();

        } catch (IOException ex) {
            Logger.getLogger(desecharInv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbRegistrarMouseClicked

    public static String fechaActual() {
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
            java.util.logging.Logger.getLogger(desecharInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desecharInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desecharInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desecharInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpDescripcion;
    public javax.swing.JComboBox<String> unidades;
    // End of variables declaration//GEN-END:variables
}
