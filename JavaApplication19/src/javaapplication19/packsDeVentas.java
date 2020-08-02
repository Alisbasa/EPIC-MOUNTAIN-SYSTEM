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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Erick Ivan
 */
public class packsDeVentas extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    static JComboBox packsDisponibles;
    static JLabel desarrolloTipoP;
    static JLabel montoDesP;
    
    /**
     * Creates new form clienteNuevo
     * @param desarrolloTipoP
     * @param montoDesP
     */
    public packsDeVentas(JLabel desarrolloTipoP, JLabel montoDesP) throws IOException {
        initComponents();
        this.desarrolloTipoP = desarrolloTipoP;
        this.montoDesP = montoDesP;
        this.setExtendedState(NORMAL);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        packsDisponibles = new JComboBox(LeerExcel.obtenerHoja("src\\excel\\Packs.xlsx"));
        packsDisponibles.setBackground(Color.white);
        packsDisponibles.setUI(PropiedadesCB2.createUI(packsDisponibles));
        jpDescripcion.add(packsDisponibles);
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
        jlPack1 = new javax.swing.JLabel();
        jpPack = new javax.swing.JPanel();
        jlDesc = new javax.swing.JLabel();
        jtDesc = new javax.swing.JTextField();
        jpTIG = new javax.swing.JPanel();
        jlTIG = new javax.swing.JLabel();
        jtPack = new javax.swing.JTextField();
        jlPack = new javax.swing.JLabel();
        jcCondicion = new javax.swing.JComboBox<>();
        jpUbicacion = new javax.swing.JPanel();
        jlUnidades = new javax.swing.JLabel();
        jtUnidades = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR NUEVO ELEMENTO");
        jPanel10.add(jLabel1, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        jpDatos.setBackground(new java.awt.Color(51, 51, 51));
        jpDatos.setLayout(new java.awt.GridLayout(5, 0));

        jpDescripcion.setBackground(new java.awt.Color(51, 51, 51));

        jlPack1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlPack1.setForeground(new java.awt.Color(255, 255, 255));
        jlPack1.setText("PACK");
        jpDescripcion.add(jlPack1);

        jpDatos.add(jpDescripcion);

        jpPack.setBackground(new java.awt.Color(51, 51, 51));
        jpPack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlDesc.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlDesc.setForeground(new java.awt.Color(255, 255, 255));
        jlDesc.setText("DESCRIPCION");
        jpPack.add(jlDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 40));

        jtDesc.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtDesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescActionPerformed(evt);
            }
        });
        jpPack.add(jtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 310, 48));
        jtDesc.setBackground(Colores.epicColorBajito);

        jpDatos.add(jpPack);

        jpTIG.setBackground(new java.awt.Color(51, 51, 51));
        jpTIG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTIG.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlTIG.setForeground(new java.awt.Color(255, 255, 255));
        jlTIG.setText("PRECIO");
        jpTIG.add(jlTIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jtPack.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtPack.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpTIG.add(jtPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 48));
        jtPack.setBackground(Colores.epicColorBajito);

        jlPack.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlPack.setForeground(new java.awt.Color(255, 255, 255));
        jlPack.setText("CONDICION");
        jpTIG.add(jlPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, 30));

        jcCondicion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 13)); // NOI18N
        jcCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Seminuevo", "Usado" }));
        jpTIG.add(jcCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 90, 50));

        jpDatos.add(jpTIG);

        jpUbicacion.setBackground(new java.awt.Color(51, 51, 51));
        jpUbicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlUnidades.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlUnidades.setForeground(new java.awt.Color(255, 255, 255));
        jlUnidades.setText("UNIDADES");
        jpUbicacion.add(jlUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 130, 30));

        jtUnidades.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtUnidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpUbicacion.add(jtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 48));
        jtUnidades.setBackground(Colores.epicColorBajito);

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

        getContentPane().add(jpDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 350));

        jpBoton.setBackground(new java.awt.Color(51, 51, 51));
        jpBoton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jpBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 500, 70));

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
        String[] Registro = {desarrolloTipoP.getText(),
            jtDesc.getText(),
            fechaActual(),
            jcCondicion.getSelectedItem().toString(),
                             jtPack.getText(),
                             
                             Double.toString(Double.valueOf(jtPack.getText())/Double.valueOf(montoDesP.getText())),
                             jtUnidades.getText(),
                             montoDesP.getText(),
                             Double.toString(Double.valueOf(montoDesP.getText())*Integer.valueOf(jtUnidades.getText())),
                             
                             jtPack.getText(),
                             Double.toString(Double.valueOf(jtPack.getText())*Integer.valueOf(jtUnidades.getText()))}; 
        Escribir escribirExcel = new Escribir();
        try {
            escribirExcel.escribirExcelInv("src\\excel\\Packs.xlsx", packsDisponibles.getSelectedItem().toString(), Registro,10);
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx",packsDisponibles.getSelectedItem().toString() , Double.valueOf(Registro[8]), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles.getSelectedItem().toString()), 8);
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx",packsDisponibles.getSelectedItem().toString() , Double.valueOf(Registro[10]), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles.getSelectedItem().toString()), 10);
            String formula = "SUM(I2:I" + LeerExcel.contarRenglones("src\\excel\\Packs.xlsx",packsDisponibles.getSelectedItem().toString()) + ")";
            escribirExcel.escribirFormula("src\\excel\\Packs.xlsx", packsDisponibles.getSelectedItem().toString(), formula,LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles.getSelectedItem().toString())+1, 8);
            String formula2 = "SUM(K2:K" + LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles.getSelectedItem().toString()) + ")";
            escribirExcel.escribirFormula("src\\excel\\Packs.xlsx", packsDisponibles.getSelectedItem().toString(), formula2, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles.getSelectedItem().toString())+1, 10);
            
        } catch (IOException ex) {
            Logger.getLogger(packsDeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jbRegistrarMouseClicked

    public static String fechaActual(){
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM YY");
        return formatoFecha.format(fecha);
    }
    
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
            java.util.logging.Logger.getLogger(packsDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(packsDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(packsDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(packsDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new packsDeVentas(desarrolloTipoP, montoDesP).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(packsDeVentas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jcCondicion;
    private javax.swing.JLabel jlDesc;
    private javax.swing.JLabel jlPack;
    private javax.swing.JLabel jlPack1;
    private javax.swing.JLabel jlTIG;
    private javax.swing.JLabel jlUnidades;
    private javax.swing.JPanel jpBoton;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpDescripcion;
    private javax.swing.JPanel jpPack;
    private javax.swing.JPanel jpTIG;
    private javax.swing.JPanel jpUbicacion;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtPack;
    private javax.swing.JTextField jtUnidades;
    // End of variables declaration//GEN-END:variables
}
