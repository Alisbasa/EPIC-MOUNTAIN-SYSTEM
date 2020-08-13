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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Erick Ivan
 */
public final class desecharEquipo extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    JComboBox listaEq;
    JComboBox tipoEq;
    JButton jbRegistrar;
    /**
     * Creates new form clienteNuevo
     *
     * @param monto
     */
    public desecharEquipo() {
        initComponents();
        this.setExtendedState(NORMAL);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        jbRegistrar = new javax.swing.JButton();

        jbRegistrar.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N

        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));

        jbRegistrar.setText("OK");

        jbRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegistrarMouseClicked(evt);
            }
        });
        
        jbRegistrar.setBackground(Colores.epicColor);

        String[] lista = {"Herramientas", "Equipo de Taller", "Mobiliario", "Equipo de Limpieza"};
        tipoEq = new JComboBox (lista);
        tipoEq.setBackground(Color.white);
        tipoEq.setUI(PropiedadesCB2.createUI(tipoEq));
        tipoEq.setBounds(20, 20, 150, 30);
        jpDescripcion.add(tipoEq);
        
        jbRegistrar.setBounds(400, 20, 60, 30);
        jpDescripcion.add(jbRegistrar);
        
        tipoEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tipoEq.getSelectedItem().toString().equals("Herramientas")){
                    try {
                        jpDescripcion.removeAll();
                        jpDescripcion.revalidate();
                        jpDescripcion.repaint();
                        
                        listaEq = new JComboBox(LeerExcel.rellenaCB2("src\\excel\\Equipo.xlsx", "HERRAMIENTAS", 1));
                        listaEq.setBackground(Color.white);
                        listaEq.setUI(PropiedadesCB2.createUI(listaEq));
                        listaEq.setBounds(180, 20, 200, 30);
                        jpDescripcion.add(tipoEq);
                        jpDescripcion.add(listaEq);
                        jpDescripcion.add(jbRegistrar);
                        

                    } catch (IOException ex) {
                        Logger.getLogger(desecharEquipo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(tipoEq.getSelectedItem().toString().equals("Equipo de Taller")){
                    try {
                        jpDescripcion.removeAll();
                        jpDescripcion.revalidate();
                        jpDescripcion.repaint();
                        listaEq = new JComboBox(LeerExcel.rellenaCB2("src\\excel\\Equipo.xlsx", "EQUIPO DE TALLER", 1));
                        listaEq.setBackground(Color.white);
                        listaEq.setUI(PropiedadesCB2.createUI(listaEq));
                        listaEq.setBounds(180, 20, 200, 30);
                        jpDescripcion.add(tipoEq);
                        jpDescripcion.add(listaEq);
                        jpDescripcion.add(jbRegistrar);
                        
                    } catch (IOException ex) {
                        Logger.getLogger(desecharEquipo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(tipoEq.getSelectedItem().toString().equals("Mobiliario")){
                    try {
                        jpDescripcion.removeAll();
                        jpDescripcion.revalidate();
                        jpDescripcion.repaint();
                        listaEq = new JComboBox(LeerExcel.rellenaCB2("src\\excel\\Equipo.xlsx", "MOBILIARIO", 1));
                        listaEq.setBackground(Color.white);
                        listaEq.setUI(PropiedadesCB2.createUI(listaEq));
                        listaEq.setBounds(180, 20, 200, 30);
                        jpDescripcion.add(tipoEq);
                        jpDescripcion.add(listaEq);
                        jpDescripcion.add(jbRegistrar);
                        
                    } catch (IOException ex) {
                        Logger.getLogger(desecharEquipo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(tipoEq.getSelectedItem().toString().equals("Equipo de Limpieza")){
                    try {
                        jpDescripcion.removeAll();
                        jpDescripcion.revalidate();
                        jpDescripcion.repaint();
                        listaEq = new JComboBox(LeerExcel.rellenaCB2("src\\excel\\Equipo.xlsx", "Equipo de Limpieza", 1));
                        listaEq.setBackground(Color.white);
                        listaEq.setUI(PropiedadesCB2.createUI(listaEq));
                        listaEq.setBounds(180, 20, 200, 30);
                        jpDescripcion.add(tipoEq);
                        jpDescripcion.add(listaEq);
                        jpDescripcion.add(jbRegistrar);
                    } catch (IOException ex) {
                        Logger.getLogger(desecharEquipo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        

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
        jLabel1.setText("DESECHAR EQUIPO");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jpDatos.setBackground(new java.awt.Color(51, 51, 51));
        jpDatos.setLayout(new java.awt.GridLayout(1, 0));

        jpDescripcion.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jpDescripcionLayout = new javax.swing.GroupLayout(jpDescripcion);
        jpDescripcion.setLayout(jpDescripcionLayout);
        jpDescripcionLayout.setHorizontalGroup(
            jpDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jpDescripcionLayout.setVerticalGroup(
            jpDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

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

    private void jbRegistrarMouseClicked(java.awt.event.MouseEvent evt) {                                         

        try {
            Escribir escribirD = new Escribir();
            String tipo = tipoEq.getSelectedItem().toString();
            
            
            switch(tipo){
                case "Herramientas":
                    Double costoCompleto = LeerExcel.obtenerCeldaNumerica("src\\excel\\Equipo.xlsx", "HERRAMIENTAS", 3, (listaEq.getSelectedIndex()+1));
                    String [] data = {rellenarIngresos.fechaActual(), "Desecho", listaEq.getSelectedItem().toString(), Double.toString(costoCompleto), "  ", "   ", Double.toString(costoCompleto)};
                    escribirD.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                    escribirD.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula = "SUM(G2:G" + LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + ")";
                    escribirD.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos")+1), 6);
                    
                    Escribir.removeRow("src\\excel\\Equipo.xlsx", "HERRAMIENTAS", (listaEq.getSelectedIndex()+1));
                    Libros.actualiza();
                    close();
                    break;
                    
                case "Equipo de Taller":
                    Double costoCompleto2 = LeerExcel.obtenerCeldaNumerica("src\\excel\\Equipo.xlsx", "Equipo de Taller", 3, (listaEq.getSelectedIndex()+1));
                    String [] data2 = {rellenarIngresos.fechaActual(), "Desecho", listaEq.getSelectedItem().toString(), Double.toString(costoCompleto2), "  ", "   ", Double.toString(costoCompleto2)};
                    escribirD.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data2, 7);
                    escribirD.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data2[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula2 = "SUM(G2:G" + LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + ")";
                    escribirD.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos")+1), 6);
                    
                    Escribir.removeRow("src\\excel\\Equipo.xlsx", "Equipo de Taller", (listaEq.getSelectedIndex()+1));
                    Libros.actualiza();
                    close();
                break;
                
                case "Mobiliario":
                    Double costoCompleto3 = LeerExcel.obtenerCeldaNumerica("src\\excel\\Equipo.xlsx", "Mobiliario", 3, (listaEq.getSelectedIndex()+1));
                    String [] data3 = {rellenarIngresos.fechaActual(), "Desecho", listaEq.getSelectedItem().toString(), Double.toString(costoCompleto3), "  ", "   ", Double.toString(costoCompleto3)};
                    escribirD.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data3, 7);
                    escribirD.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data3[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula3 = "SUM(G2:G" + LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + ")";
                    escribirD.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula3, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos")+1), 6);
                    
                    Escribir.removeRow("src\\excel\\Equipo.xlsx", "Mobiliario", (listaEq.getSelectedIndex()+1));
                    Libros.actualiza();
                    close();
                break;
                
                case "Equipo de Limpieza":
                    Double costoCompleto4 = LeerExcel.obtenerCeldaNumerica("src\\excel\\Equipo.xlsx", "Equipo de Limpieza", 3, (listaEq.getSelectedIndex()+1));
                    String [] data4 = {rellenarIngresos.fechaActual(), "Desecho", listaEq.getSelectedItem().toString(), Double.toString(costoCompleto4), "  ", "   ", Double.toString(costoCompleto4)};
                    escribirD.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data4, 7);
                    escribirD.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data4[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula4 = "SUM(G2:G" + LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + ")";
                    escribirD.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula4, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos")+1), 6);
                    Escribir.removeRow("src\\excel\\Equipo.xlsx", "Equipo de Limpieza", (listaEq.getSelectedIndex()+1));
                    Libros.actualiza();
                    close();
                break;
       
            }

        }catch (IOException ex) {
            Logger.getLogger(desecharEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void close(){
        this.dispose();
    }
    
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
            java.util.logging.Logger.getLogger(desecharEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desecharEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desecharEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desecharEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpDatos;
    public static javax.swing.JPanel jpDescripcion;
    // End of variables declaration//GEN-END:variables
}
