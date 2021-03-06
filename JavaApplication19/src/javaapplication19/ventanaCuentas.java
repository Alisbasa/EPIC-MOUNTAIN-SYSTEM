/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication19.Libros.listaGastos;
import static javaapplication19.Libros.listaIngresos;
import static javaapplication19.rellenarIngresos.fechaActual;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Erick Ivan
 */
public class ventanaCuentas extends javax.swing.JFrame {

    int mousepX;
    int mousepY;


    /**
     * Creates new form clienteNuevo
     *
     * @param nombre
     * @param monto
     */
    public ventanaCuentas() {
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
        LOGO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        jpDescripcion = new javax.swing.JPanel();
        jlDesc = new javax.swing.JLabel();
        bbva = new javax.swing.JTextField();
        jpPack = new javax.swing.JPanel();
        jlPack = new javax.swing.JLabel();
        caja = new javax.swing.JTextField();
        jpTIG = new javax.swing.JPanel();
        mp = new javax.swing.JTextField();
        jlCosto = new javax.swing.JLabel();
        jpUbicacion = new javax.swing.JPanel();
        liberar = new javax.swing.JTextField();
        jlUnidades = new javax.swing.JLabel();
        jpBoton = new javax.swing.JPanel();
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

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CUENTA DE CORTE");
        jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jpDatos.setBackground(new java.awt.Color(51, 51, 51));
        jpDatos.setLayout(new java.awt.GridLayout(5, 0));

        jpDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        jpDescripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlDesc.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jlDesc.setForeground(new java.awt.Color(255, 255, 255));
        jlDesc.setText("BBVA");
        jpDescripcion.add(jlDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        bbva.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        bbva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bbva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbvaActionPerformed(evt);
            }
        });
        jpDescripcion.add(bbva, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 370, 48));
        caja.setBackground(Colores.epicColorBajito);

        jpDatos.add(jpDescripcion);

        jpPack.setBackground(new java.awt.Color(51, 51, 51));
        jpPack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPack.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jlPack.setForeground(new java.awt.Color(255, 255, 255));
        jlPack.setText("CAJA");
        jpPack.add(jlPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 30));

        caja.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        caja.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaActionPerformed(evt);
            }
        });
        jpPack.add(caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 370, 48));
        caja.setBackground(Colores.epicColorBajito);

        jpDatos.add(jpPack);

        jpTIG.setBackground(new java.awt.Color(51, 51, 51));
        jpTIG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mp.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        mp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpTIG.add(mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 270, 48));
        mp.setBackground(Colores.epicColorBajito);

        jlCosto.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlCosto.setForeground(new java.awt.Color(255, 255, 255));
        jlCosto.setText("MERCADO PAGO");
        jpTIG.add(jlCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 30));

        jpDatos.add(jpTIG);

        jpUbicacion.setBackground(new java.awt.Color(51, 51, 51));
        jpUbicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        liberar.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        liberar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpUbicacion.add(liberar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 200, 48));
        liberar.setBackground(Colores.epicColorBajito);

        jlUnidades.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlUnidades.setForeground(new java.awt.Color(255, 255, 255));
        jlUnidades.setText("POR LIBERAR");
        jpUbicacion.add(jlUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 30));

        jpDatos.add(jpUbicacion);

        jpBoton.setBackground(new java.awt.Color(51, 51, 51));
        jpBoton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jpBoton.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 170, 60));
        jbRegistrar.setBackground(Colores.epicColor);

        jpDatos.add(jpBoton);

        getContentPane().add(jpDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 410));

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
            Escribir escribirCuentas = new Escribir();
            escribirCuentas.crearHojaCorte(rutas.excel+ "\\Corte.xlsx", fechaActual());
            
            escribirCuentas.escribirCelda(rutas.excel+ "\\Corte.xlsx", fechaActual(), rellenarIngresos.fechaActual(), 1, 1);
            escribirCuentas.escribirCelda(rutas.excel+ "\\Corte.xlsx", fechaActual(), "BBVA", 1, 1);
            escribirCuentas.escribirCelda(rutas.excel+ "\\Corte.xlsx", fechaActual(), "CAJA", 2, 1);
            escribirCuentas.escribirCelda(rutas.excel+ "\\Corte.xlsx", fechaActual(), "MERCADO PAGO", 3, 1);
            escribirCuentas.escribirCelda(rutas.excel+ "\\Corte.xlsx", fechaActual(), "X LIBERAR", 4, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "COMPRAS EN TRANSITO", 5, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "COSTO DE INVENTARIO", 6, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "EQUIPO Y MOBILIARIO", 7, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "DEUDAS A COBRAR", 8, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "DEUDAS A PAGAR", 9, 1);
            escribirCuentas.escribirCeldaV(rutas.excel+ "\\Corte.xlsx", fechaActual(), "TOTAL EN CAPITAL", 10, 1);
            escribirCuentas.escribirCeldaV(rutas.excel+ "\\Corte.xlsx", fechaActual(), "TOTAL NETO", 11, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "CAPITAL ANTERIOR", 12, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "GASTOS TOTALES", 13, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "INGRESOS TOTALES", 14, 1);
            escribirCuentas.escribirCelda(rutas.excel+ "\\Corte.xlsx", fechaActual(), "FUGAS", 15, 1);
            escribirCuentas.escribirCelda(rutas.excel+ "\\Corte.xlsx", fechaActual(), "EXTRA", 16, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "EGRESOS", 17, 1);
            escribirCuentas.escribirCeldaGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), "UTILIDADES", 18, 1);
            escribirCuentas.escribirCeldaV(rutas.excel+ "\\Corte.xlsx", fechaActual(), "UTILIDAD/PERDIDA", 19, 1);
            escribirCuentas.escribirCeldaV(rutas.excel+ "\\Corte.xlsx", fechaActual(), "TOTAL EN CAPITAL", 20, 1);
            
            escribirCuentas.escribirCeldaV(rutas.excel+ "\\Corte.xlsx", fechaActual(), "LO QUE HAY", 10, 0);
            escribirCuentas.escribirCeldaV(rutas.excel+ "\\Corte.xlsx", fechaActual(), "LO QUE DEBE HABER", 20, 0);

            escribirCuentas.escribirCeldaDouble(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(Double.valueOf(bbva.getText())), 1, 2);
            escribirCuentas.escribirCeldaDouble(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(Double.valueOf(caja.getText())), 2, 2);
            escribirCuentas.escribirCeldaDouble(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(Double.valueOf(mp.getText())), 3, 2);
            escribirCuentas.escribirCeldaDouble(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(Double.valueOf(liberar.getText())), 4, 2);
            
            Double comprasT = Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+ "\\COMPRAS EN TRANSITO.xlsx", "COMPRAS", (LeerExcel.contarRenglones(rutas.excel+ "\\COMPRAS EN TRANSITO.xlsx", "COMPRAS")+1), 8));
            escribirCuentas.escribirCeldaDoubleGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(comprasT), 5, 2);
            
            Double costoInventario = Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+ "\\INVENTARIOS.xlsx", "EPIC MOUNTAIN", (LeerExcel.contarRenglones(rutas.excel+ "\\INVENTARIOS.xlsx", "EPIC MOUNTAIN")+1), 8));
            escribirCuentas.escribirCeldaDoubleGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(costoInventario), 6, 2);
            
            Double herramientas = Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+ "\\EQUIPO Y MOBILIARIO.xlsx", "Herramientas", (LeerExcel.contarRenglones(rutas.excel+ "\\EQUIPO Y MOBILIARIO.xlsx", "Herramientas")+1), 3));
            Double eqTaller = Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+ "\\EQUIPO Y MOBILIARIO.xlsx", "Equipo de Taller", (LeerExcel.contarRenglones(rutas.excel+ "\\EQUIPO Y MOBILIARIO.xlsx", "Equipo de Taller")+1), 3));
            Double mob = Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+ "\\EQUIPO Y MOBILIARIO.xlsx", "Mobiliario", (LeerExcel.contarRenglones(rutas.excel+ "\\EQUIPO Y MOBILIARIO.xlsx", "Mobiliario")+1), 3));
            Double eqLim = Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+ "\\EQUIPO Y MOBILIARIO.xlsx", "Equipo de Limpieza", (LeerExcel.contarRenglones(rutas.excel+ "\\EQUIPO Y MOBILIARIO.xlsx", "Equipo de Limpieza")+1), 3));
            
            Double eqMob = herramientas + eqTaller + mob + eqLim;
            escribirCuentas.escribirCeldaDoubleGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(eqMob), 7, 2);
            
            Double deudasC = Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+ "\\DEUDAS A COBRAR.xlsx", "deudasCobrar", (LeerExcel.contarRenglones(rutas.excel+ "\\DEUDAS A COBRAR.xlsx", "deudasCobrar")+1), 2));
            escribirCuentas.escribirCeldaDoubleGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(deudasC), 8, 2);
            
            Double deudasP = Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+ "\\DEUDAS A PAGAR.xlsx", "deudasPagar", (LeerExcel.contarRenglones(rutas.excel+ "\\DEUDAS A PAGAR.xlsx", "deudasPagar")+1), 2));
            escribirCuentas.escribirCeldaDoubleGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(deudasP), 9, 2);
            
            String sumaTotalCapital = "SUM(C2:C9)";
            escribirCuentas.escribirFormula(rutas.excel+ "\\Corte.xlsx", fechaActual(), sumaTotalCapital, 10, 2);
            
            Double totalNeto = Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+ "\\Corte.xlsx", fechaActual(), 9, 2)) - deudasP;
            escribirCuentas.escribirCeldaDoubleV(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(totalNeto), 11, 2);
            
            
            double sumaUtilidades=  Escribir.SumarFile(LeerExcel.buscaVerdes(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Ingresos")+1, LeerExcel.contarRenglones(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Ingresos"), 6, rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Ingresos");
                      
            escribirCuentas.escribirCeldaDoubleGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(sumaUtilidades), 18, 2);
            
            
             double sumaEgresos=  Escribir.SumarFile(LeerExcel.buscaVerdes(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos")+1, LeerExcel.contarRenglones(rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos"), 6, rutas.excel+ "\\LIBROS DE CONTROL.xlsx", "Gastos");
                      
            escribirCuentas.escribirCeldaDoubleGF(rutas.excel+ "\\Corte.xlsx", fechaActual(), Utilidades.roundTwoDecimals(sumaEgresos), 17, 2);
            
            
            String gastosTotales = "SUM(C18+C16)";
            escribirCuentas.escribirFormulaPacks(rutas.excel+ "\\Corte.xlsx", fechaActual(), gastosTotales, 13 , 2);
            
            
            String ingresos = "SUM(C18+C6)";
            escribirCuentas.escribirFormulaPacks(rutas.excel+ "\\Corte.xlsx", fechaActual(), ingresos, 14, 2);
            
            String up = "C15 - C14";
            escribirCuentas.escribirFormula(rutas.excel+ "\\Corte.xlsx", fechaActual(), up, 19, 2);
            
            String totalC = "SUM(C13+C19+C17-C18-C16)";
            escribirCuentas.escribirFormula(rutas.excel+ "\\Corte.xlsx", fechaActual(), totalC, 20, 2);
            
            
            rellenarIngresos rellenarCorte = new rellenarIngresos();
            rellenarGastos rellenarCorteG = new rellenarGastos();
            
            rellenarCorte.corte( listaIngresos);
            rellenarCorteG.corte( listaGastos);
            
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(ventanaCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }

        

    }//GEN-LAST:event_jbRegistrarMouseClicked

    public static String fechaActual() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd MMMM YY HH mm");
        return formatoFecha.format(fecha);
    }

    private void cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaActionPerformed

    private void bbvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbvaActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JTextField bbva;
    private javax.swing.JTextField caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlCosto;
    private javax.swing.JLabel jlDesc;
    private javax.swing.JLabel jlPack;
    private javax.swing.JLabel jlUnidades;
    private javax.swing.JPanel jpBoton;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpDescripcion;
    private javax.swing.JPanel jpPack;
    private javax.swing.JPanel jpTIG;
    private javax.swing.JPanel jpUbicacion;
    private javax.swing.JTextField liberar;
    private javax.swing.JTextField mp;
    // End of variables declaration//GEN-END:variables
}
