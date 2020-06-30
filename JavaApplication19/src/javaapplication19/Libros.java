/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Libros extends javax.swing.JFrame {

    /**
     * Creates new form Libros
     */
    public Libros() {
        initComponents();
        scaleImage("inventario",inventarioIcon);
        scaleImage("Packs",packsIcon);
        scaleImage("Suministros",suministrosIcon);
        scaleImage("Cuentas",cuentasIcon);
        scaleImage("Estrategia",estrategiaIcon);
        scaleImage("Planeacion",planeacionIcon);
        scaleImage("CRM",crmIcon);
        scaleImage("Ventas",ventasIcon);
        scaleImage("Proveedores",provedoresIcon);
        scaleImage("Deudas_P",pagarIcon);
        scaleImage("Deudas_C",cobrarIcon);
        scaleImage("Equipo",equipoIcon);
        
    }
    //Esta funcion cambia el tam;o de las imagenes y las asigna a su respectivo label
    public void scaleImage(String icono,JLabel label){
        ImageIcon icon = new ImageIcon("C:\\Users\\Usuario\\Desktop\\Desarrollo\\EPIC-MOUNTAIN-SYSTEM\\JavaApplication19\\src\\img\\"+ icono +".png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(inventarioIcon.getHeight(),inventarioIcon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelnventario1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        crmIcon = new javax.swing.JLabel();
        panelnventario6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ventasIcon = new javax.swing.JLabel();
        panelnventario7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        provedoresIcon = new javax.swing.JLabel();
        panelnventario8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pagarIcon = new javax.swing.JLabel();
        panelnventario9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cobrarIcon = new javax.swing.JLabel();
        panelnventario10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        equipoIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelnventario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inventarioIcon = new javax.swing.JLabel();
        panelPacks = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        packsIcon = new javax.swing.JLabel();
        panelnventario2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        suministrosIcon = new javax.swing.JLabel();
        panelnventario3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cuentasIcon = new javax.swing.JLabel();
        panelnventario4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        estrategiaIcon = new javax.swing.JLabel();
        panelnventario5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        planeacionIcon = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(130, 470));
        jPanel2.setLayout(new java.awt.GridLayout(6, 1));

        panelnventario1.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario1.setLayout(new java.awt.BorderLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CRM");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario1.add(jLabel7, java.awt.BorderLayout.PAGE_END);

        crmIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crmIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        crmIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario1.add(crmIcon, java.awt.BorderLayout.CENTER);

        jPanel2.add(panelnventario1);

        panelnventario6.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario6.setLayout(new java.awt.BorderLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VENTAS");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario6.add(jLabel8, java.awt.BorderLayout.PAGE_END);

        ventasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventasIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        ventasIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario6.add(ventasIcon, java.awt.BorderLayout.CENTER);

        jPanel2.add(panelnventario6);

        panelnventario7.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario7.setLayout(new java.awt.BorderLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PROVEDORES");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario7.add(jLabel9, java.awt.BorderLayout.PAGE_END);

        provedoresIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        provedoresIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        provedoresIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario7.add(provedoresIcon, java.awt.BorderLayout.CENTER);

        jPanel2.add(panelnventario7);

        panelnventario8.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario8.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DEUDAS A PAGAR");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario8.add(jLabel10, java.awt.BorderLayout.PAGE_END);

        pagarIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagarIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        pagarIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario8.add(pagarIcon, java.awt.BorderLayout.CENTER);

        jPanel2.add(panelnventario8);

        panelnventario9.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario9.setLayout(new java.awt.BorderLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DEUDAS A COBRAR");
        jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario9.add(jLabel11, java.awt.BorderLayout.PAGE_END);

        cobrarIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cobrarIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        cobrarIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario9.add(cobrarIcon, java.awt.BorderLayout.CENTER);

        jPanel2.add(panelnventario9);

        panelnventario10.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario10.setLayout(new java.awt.BorderLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("EQUIPO Y MOB.");
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario10.add(jLabel12, java.awt.BorderLayout.PAGE_END);

        equipoIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipoIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        equipoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario10.add(equipoIcon, java.awt.BorderLayout.CENTER);

        jPanel2.add(panelnventario10);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(130, 470));
        jPanel3.setLayout(new java.awt.GridLayout(6, 1));

        panelnventario.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVENTARIO");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        inventarioIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventarioIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        inventarioIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario.add(inventarioIcon, java.awt.BorderLayout.CENTER);

        jPanel3.add(panelnventario);

        panelPacks.setBackground(new java.awt.Color(51, 51, 51));
        panelPacks.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PACKS");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelPacks.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        packsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        packsIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        packsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPacks.add(packsIcon, java.awt.BorderLayout.CENTER);

        jPanel3.add(panelPacks);

        panelnventario2.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario2.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SUMINISTROS");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario2.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        suministrosIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suministrosIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        suministrosIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario2.add(suministrosIcon, java.awt.BorderLayout.CENTER);

        jPanel3.add(panelnventario2);

        panelnventario3.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario3.setLayout(new java.awt.BorderLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CUENTAS");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario3.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        cuentasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuentasIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        cuentasIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario3.add(cuentasIcon, java.awt.BorderLayout.CENTER);

        jPanel3.add(panelnventario3);

        panelnventario4.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario4.setLayout(new java.awt.BorderLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ESTRATEGIA");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario4.add(jLabel5, java.awt.BorderLayout.PAGE_END);

        estrategiaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrategiaIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        estrategiaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario4.add(estrategiaIcon, java.awt.BorderLayout.CENTER);

        jPanel3.add(panelnventario4);

        panelnventario5.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario5.setLayout(new java.awt.BorderLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PLANEACIÓN");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelnventario5.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        planeacionIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        planeacionIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        planeacionIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario5.add(planeacionIcon, java.awt.BorderLayout.CENTER);

        jPanel3.add(panelnventario5);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cobrarIcon;
    private javax.swing.JLabel crmIcon;
    private javax.swing.JLabel cuentasIcon;
    private javax.swing.JLabel equipoIcon;
    private javax.swing.JLabel estrategiaIcon;
    private javax.swing.JLabel inventarioIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel packsIcon;
    private javax.swing.JLabel pagarIcon;
    private javax.swing.JPanel panelPacks;
    private javax.swing.JPanel panelnventario;
    private javax.swing.JPanel panelnventario1;
    private javax.swing.JPanel panelnventario10;
    private javax.swing.JPanel panelnventario2;
    private javax.swing.JPanel panelnventario3;
    private javax.swing.JPanel panelnventario4;
    private javax.swing.JPanel panelnventario5;
    private javax.swing.JPanel panelnventario6;
    private javax.swing.JPanel panelnventario7;
    private javax.swing.JPanel panelnventario8;
    private javax.swing.JPanel panelnventario9;
    private javax.swing.JLabel planeacionIcon;
    private javax.swing.JLabel provedoresIcon;
    private javax.swing.JLabel suministrosIcon;
    private javax.swing.JLabel ventasIcon;
    // End of variables declaration//GEN-END:variables
}
