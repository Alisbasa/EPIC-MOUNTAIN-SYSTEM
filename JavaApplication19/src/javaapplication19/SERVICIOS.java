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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Erick Ivan
 */
public class SERVICIOS extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    static JTextField paqueteria;
    static JComboBox tipoGasto;

    /**
     * Creates new form clienteNuevo
     */
    public SERVICIOS(JTextField paqueteria, JComboBox tipoGasto) {
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
        barra = new javax.swing.JPanel();
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
        jtPrecio = new javax.swing.JTextField();
        jlCosto = new javax.swing.JLabel();
        jlCosto1 = new javax.swing.JLabel();
        jtCosto = new javax.swing.JTextField();
        jpUbicacion = new javax.swing.JPanel();
        jtUnidades = new javax.swing.JTextField();
        jlUnidades = new javax.swing.JLabel();
        jcCond = new javax.swing.JComboBox<>();
        jlPack = new javax.swing.JLabel();
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

        barra.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(barra, java.awt.BorderLayout.LINE_END);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel10.setLayout(new java.awt.BorderLayout());

        LOGO.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel10.add(LOGO, java.awt.BorderLayout.LINE_START);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPRA EN TRANSITO PACKS");
        jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

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

        jtPrecio.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpTIG.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 110, 48));
        jtPrecio.setBackground(Colores.epicColorBajito);

        jlCosto.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlCosto.setForeground(new java.awt.Color(255, 255, 255));
        jlCosto.setText("PRECIO");
        jpTIG.add(jlCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 90, 30));

        jlCosto1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlCosto1.setForeground(new java.awt.Color(255, 255, 255));
        jlCosto1.setText("COSTO");
        jpTIG.add(jlCosto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 30));

        jtCosto.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpTIG.add(jtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, 48));
        jtPrecio.setBackground(Colores.epicColorBajito);

        jpDatos.add(jpTIG);

        jpUbicacion.setBackground(new java.awt.Color(51, 51, 51));
        jpUbicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUnidades.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtUnidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpUbicacion.add(jtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 48));
        jtUnidades.setBackground(Colores.epicColorBajito);

        jlUnidades.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlUnidades.setForeground(new java.awt.Color(255, 255, 255));
        jlUnidades.setText("Unidades");
        jpUbicacion.add(jlUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jcCond.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 13)); // NOI18N
        jcCond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Seminuevo", "Usado" }));
        jcCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCondActionPerformed(evt);
            }
        });
        jpUbicacion.add(jcCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 70, 50));

        jlPack.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlPack.setForeground(new java.awt.Color(255, 255, 255));
        jlPack.setText("CONDICION");
        jpUbicacion.add(jlPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 130, 30));

        jpDatos.add(jpUbicacion);

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
        jpDatos.add(jbRegistrar);
        jbRegistrar.setBackground(Colores.epicColor);

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

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrarMouseClicked
        String producto = jtProducto.getText();
        String desc = jtDesc.getText();
        String fecha = fechaActual();
        String cond = jcCond.getSelectedItem().toString();
        String pack = "    ";
        String costoNeto = Double.toString(Double.valueOf(jtCosto.getText())*Integer.valueOf(jtUnidades.getText()));
        String precioBaseNeto = Double.toString(Double.valueOf(jtPrecio.getText())*Integer.valueOf(jtUnidades.getText()));

        String [] inventario = {producto, desc, fecha, cond, pack};

        Escribir EscribirCRM = new Escribir();

        try {
            String[] data = {(String) fechaActual(), "Compra en Transito", jtProducto.getText(), jtCosto.getText(), (String) tipoGasto.getSelectedItem(), "VERDE", "0"};
            EscribirCRM.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
            EscribirCRM.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
            EscribirCRM.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Double.valueOf(data[6]), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
            String formula10 = "SUM(G2:G" + LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + ")";
            EscribirCRM.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula10, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos")+1), 6);
            
            EscribirCRM.escribirExcelInv("src\\excel\\comprasT.xlsx", "COMPRAS",inventario,5);
            
            //UNIDADES
            EscribirCRM.escribirCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", Integer.valueOf(jtUnidades.getText()), LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 6);

            //TIG
            Double TIG = Double.valueOf(jtPrecio.getText())/Double.valueOf(jtCosto.getText());
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", TIG, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 5);

            //COSTO UNIDAD
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", Double.valueOf(jtCosto.getText()), LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 7);
            //COSTO NETO
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", Double.valueOf(costoNeto), LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 8);

            //PRECIO BASE UNIDAD
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", Double.valueOf(jtPrecio.getText()), LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 9);

            //PRECIO BASE NETO
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", Double.valueOf(precioBaseNeto), LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 10);

            //PRECIO LOCAL UNIDAD
            Double precioL = (LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 9, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")) * 1.16);
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", precioL, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 11);

            //PRECIO LOCAL NETO
            Double precioNeto = EscribirCRM.Mulitplicar(6, 11,LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS") ,"src\\excel\\comprasT.xlsx", "COMPRAS");
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", precioNeto, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 12);

            //COMISION ML
            Double comisionML = ((LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 11, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"))) *.15)+5;
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", comisionML, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 15);

            //COMISION ML NETO
            Double comisionMLN = EscribirCRM.Mulitplicar(6, 15, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), "src\\excel\\comprasT.xlsx", "COMPRAS");
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", comisionMLN, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 16);

            // IVA UNIDAD
            Double IVA = (LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 9, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"))*0.16);
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", IVA, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 17);

            //IVA NETO
            Double ivaN = EscribirCRM.Mulitplicar(6, 17, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), "src\\excel\\comprasT.xlsx", "COMPRAS");
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", ivaN, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 18);

            //PRECIO ML
            Double precioML = EscribirCRM.SumarColumnasML(LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 9, 17, 15, "src\\excel\\Inventario.xlsx", "Inventario");
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", precioML, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 13);

            //PRECIOML NETO

            Double precioMLN = EscribirCRM.Mulitplicar(6, 13, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), "src\\excel\\comprasT.xlsx", "COMPRAS");
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", precioMLN, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 14);

            //UTILIDAD UNIDAD LOCAL
            Double utilidad = EscribirCRM.RestarColumnas(LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 11, 7, 17, "src\\excel\\comprasT.xlsx", "COMPRAS");
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", utilidad, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 19);

            //UTILIDAD LOCAL NETA
            Double utilidadLN = EscribirCRM.Mulitplicar(6, 19, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), "src\\excel\\comprasT.xlsx", "COMPRAS");
            EscribirCRM.escribirCeldaDouble("src\\excel\\comprasT.xlsx", "COMPRAS", utilidadLN, LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS"), 20);

            String formula = "SUM(I2:I" + (LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+ 1) + ")";
            EscribirCRM.escribirFormula("src\\excel\\comprasT.xlsx", "COMPRAS", formula,
                LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+1, 8);

            String formula2 = "SUM(K2:K" + (LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+ 1) + ")";
            EscribirCRM.escribirFormula("src\\excel\\comprasT.xlsx", "COMPRAS", formula2,
                LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+1, 10);

            String formula3 = "SUM(M2:M" + (LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+ 1) + ")";
            EscribirCRM.escribirFormula("src\\excel\\comprasT.xlsx", "COMPRAS", formula3,
                LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+1, 12);

            String formula4 = "SUM(O2:O" + (LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+ 1) + ")";
            EscribirCRM.escribirFormula("src\\excel\\comprasT.xlsx", "COMPRAS", formula4,
                LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+1, 14);

            String formula5 = "SUM(Q2:Q" + (LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+ 1) + ")";
            EscribirCRM.escribirFormula("src\\excel\\comprasT.xlsx", "COMPRAS", formula5,
                LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+1, 16);

            String formula6 = "SUM(S2:S" + (LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+ 1) + ")";
            EscribirCRM.escribirFormula("src\\excel\\comprasT.xlsx", "COMPRAS", formula6,
                LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+1, 18);

            String formula7 = "SUM(U2:U" + (LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+ 1) + ")";
            EscribirCRM.escribirFormula("src\\excel\\comprasT.xlsx", "COMPRAS", formula7,
                LeerExcel.contarRenglones("src\\excel\\comprasT.xlsx", "COMPRAS")+1, 20);
            Libros.actualiza();
            this.setVisible(false);

        } catch (IOException ex) {
            Logger.getLogger(SERVICIOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbRegistrarMouseClicked

    private void jcCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCondActionPerformed

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
            java.util.logging.Logger.getLogger(SERVICIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SERVICIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SERVICIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SERVICIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SERVICIOS(paqueteria, tipoGasto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jcCond;
    private javax.swing.JLabel jlCosto;
    private javax.swing.JLabel jlCosto1;
    private javax.swing.JLabel jlDesc;
    private javax.swing.JLabel jlDesc1;
    private javax.swing.JLabel jlPack;
    private javax.swing.JLabel jlUnidades;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpDescripcion;
    private javax.swing.JPanel jpPack;
    private javax.swing.JPanel jpTIG;
    private javax.swing.JPanel jpUbicacion;
    public static javax.swing.JTextField jtCosto;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtProducto;
    private javax.swing.JTextField jtUnidades;
    // End of variables declaration//GEN-END:variables
}
