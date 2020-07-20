/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Erick Ivan
 */
public class inventarioPrincipal extends javax.swing.JFrame {
    int mousepX;
    int mousepY;

    /**
     * Creates new form clienteNuevo
     */
    public inventarioPrincipal() {
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
        barra = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        cerrarIcon = new javax.swing.JLabel();
        maxi = new javax.swing.JPanel();
        maxiIcon = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpDatos = new javax.swing.JPanel();
        jpDescripcion = new javax.swing.JPanel();
        jtDesc = new javax.swing.JTextField();
        jlDesc = new javax.swing.JLabel();
        jpPack = new javax.swing.JPanel();
        jlPack = new javax.swing.JLabel();
        jcPack = new javax.swing.JComboBox<>();
        jcPack1 = new javax.swing.JComboBox<>();
        jlPack1 = new javax.swing.JLabel();
        jpTIG = new javax.swing.JPanel();
        jlTIG = new javax.swing.JLabel();
        jtTIG = new javax.swing.JTextField();
        jpUbicacion = new javax.swing.JPanel();
        jtUnidades = new javax.swing.JTextField();
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

        barra.setPreferredSize(new java.awt.Dimension(80, 30));

        cerrar.setBackground(new java.awt.Color(51, 51, 51));
        cerrar.setPreferredSize(new java.awt.Dimension(40, 40));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });
        cerrar.setLayout(new java.awt.BorderLayout());

        cerrarIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.add(cerrarIcon, java.awt.BorderLayout.CENTER);

        maxi.setBackground(new java.awt.Color(51, 51, 51));
        maxi.setPreferredSize(new java.awt.Dimension(40, 40));
        maxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxiMouseExited(evt);
            }
        });
        maxi.setLayout(new java.awt.BorderLayout());

        maxiIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxi.add(maxiIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(maxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(barra, java.awt.BorderLayout.LINE_END);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel10.setLayout(new java.awt.BorderLayout());

        LOGO.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel10.add(LOGO, java.awt.BorderLayout.LINE_START);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR NUEVO PACK");
        jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jpDatos.setBackground(new java.awt.Color(51, 51, 51));
        jpDatos.setLayout(new java.awt.GridLayout(5, 0));

        jpDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        jpDescripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtDesc.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtDesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescActionPerformed(evt);
            }
        });
        jpDescripcion.add(jtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 370, 48));
        jtDesc.setBackground(Colores.epicColorBajito);

        jlDesc.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jlDesc.setForeground(new java.awt.Color(255, 255, 255));
        jlDesc.setText("DESCRIPCION");
        jpDescripcion.add(jlDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        jpDatos.add(jpDescripcion);

        jpPack.setBackground(new java.awt.Color(51, 51, 51));
        jpPack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPack.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlPack.setForeground(new java.awt.Color(255, 255, 255));
        jlPack.setText("CONDICION");
        jpPack.add(jlPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 130, 30));

        jcPack.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 13)); // NOI18N
        jcPack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Seminuevo", "Usado" }));
        jpPack.add(jcPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 90, 50));

        jcPack1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 13)); // NOI18N
        jcPack1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack1", "Pack2", "Pack3" }));
        jpPack.add(jcPack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 50));

        jlPack1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlPack1.setForeground(new java.awt.Color(255, 255, 255));
        jlPack1.setText("PACK");
        jpPack.add(jlPack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 30));

        jpDatos.add(jpPack);

        jpTIG.setBackground(new java.awt.Color(51, 51, 51));
        jpTIG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTIG.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlTIG.setForeground(new java.awt.Color(255, 255, 255));
        jlTIG.setText("PRECIO BASE POR UNIDAD");
        jpTIG.add(jlTIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 310, 30));

        jtTIG.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtTIG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpTIG.add(jtTIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 160, 48));
        jtTIG.setBackground(Colores.epicColorBajito);

        jpDatos.add(jpTIG);

        jpUbicacion.setBackground(new java.awt.Color(51, 51, 51));
        jpUbicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUnidades.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtUnidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpUbicacion.add(jtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 120, 48));
        jtUnidades.setBackground(Colores.epicColorBajito);

        jlUnidades.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlUnidades.setForeground(new java.awt.Color(255, 255, 255));
        jlUnidades.setText("Unidades");
        jpUbicacion.add(jlUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, 30));

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
    
    public void changeColor(JPanel hover,Color rand){
        hover.setBackground(rand);
    }
    
    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        changeColor(cerrar, Color.red);       // TODO add your handling code here:
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        changeColor(cerrar, new Color(51,51,51));
    }//GEN-LAST:event_cerrarMouseExited

    private void maxiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMouseClicked
        this.setExtendedState(ICONIFIED);
        /*if(this.getExtendedState()!=Libros.MAXIMIZED_BOTH){
            this.setExtendedState(Libros.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Libros.NORMAL);
        }*/
    }//GEN-LAST:event_maxiMouseClicked

    private void maxiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMouseEntered
        changeColor(maxi, new Color(34,180,115));
    }//GEN-LAST:event_maxiMouseEntered

    private void maxiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMouseExited
        changeColor(maxi, new Color(51,51,51));
    }//GEN-LAST:event_maxiMouseExited

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
        String[] inventario = {}; 
        Escribir EscribirCRM = new Escribir();
        try {
            EscribirCRM.escribirExcel("src\\excel\\CRM.xlsx", "CLIENTES", inventario);
        } catch (IOException ex) {
            Logger.getLogger(inventarioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jbRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(inventarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventarioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel cerrarIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jcPack;
    private javax.swing.JComboBox<String> jcPack1;
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
    private javax.swing.JTextField jtTIG;
    private javax.swing.JTextField jtUnidades;
    private javax.swing.JPanel maxi;
    private javax.swing.JLabel maxiIcon;
    // End of variables declaration//GEN-END:variables
}
