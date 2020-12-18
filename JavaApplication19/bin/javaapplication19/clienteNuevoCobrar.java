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
import static javaapplication19.packsDeVentas.desarrolloTipoP;
import static javaapplication19.rellenarIngresos.fechaActual;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Erick Ivan
 */
public class clienteNuevoCobrar extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    static JComboBox inventario;
    static JComboBox unidadesCB;
    static JComboBox plataforma;
    static JComboBox cliente;
    static JLabel unidades;
    static String precioExcel;

    /**
     * Creates new form clienteNuevo
     * @param precioExcel
     * @param unidades
     */
    public clienteNuevoCobrar(String precioExcel,JComboBox inventario, JComboBox unidadesCB, JComboBox plataforma, JComboBox cliente) {;
        initComponents();
         this.inventario = inventario;
        this.unidadesCB = unidadesCB;
        this.plataforma = plataforma;
        this.cliente = cliente;
        this.precioExcel = precioExcel;
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
        jpNombre = new javax.swing.JPanel();
        jtNombre = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jpNumero = new javax.swing.JPanel();
        jtNumero = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        jpCorreo = new javax.swing.JPanel();
        jtCorreo = new javax.swing.JTextField();
        jlCorreo = new javax.swing.JLabel();
        jpUbicacion = new javax.swing.JPanel();
        jtUbicacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jpBoton = new javax.swing.JPanel();
        jbRegistrar = new javax.swing.JButton();

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
        jLabel1.setText("REGISTRAR NUEVO CLIENTE");
        jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jpDatos.setBackground(new java.awt.Color(51, 51, 51));
        jpDatos.setLayout(new java.awt.GridLayout(5, 0));

        jpNombre.setBackground(new java.awt.Color(51, 51, 51));
        jpNombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtNombre.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtNombre.setToolTipText("hola");
        jpNombre.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 370, 48));
        jtNombre.setBackground(Colores.epicColorBajito);
        jtNombre.getAccessibleContext().setAccessibleName("hola");

        jlNombre.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("Nombre");
        jpNombre.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        jpDatos.add(jpNombre);

        jpNumero.setBackground(new java.awt.Color(51, 51, 51));
        jpNumero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtNumero.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpNumero.add(jtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 370, 48));
        jtNumero.setBackground(Colores.epicColorBajito);

        jlNumero.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlNumero.setForeground(new java.awt.Color(255, 255, 255));
        jlNumero.setText("Numero");
        jpNumero.add(jlNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        jpDatos.add(jpNumero);

        jpCorreo.setBackground(new java.awt.Color(51, 51, 51));
        jpCorreo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtCorreo.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpCorreo.add(jtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 380, 48));
        jtCorreo.setBackground(Colores.epicColorBajito);

        jlCorreo.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jlCorreo.setText("Correo");
        jpCorreo.add(jlCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        jpDatos.add(jpCorreo);

        jpUbicacion.setBackground(new java.awt.Color(51, 51, 51));
        jpUbicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUbicacion.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtUbicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpUbicacion.add(jtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 340, 48));
        jtUbicacion.setBackground(Colores.epicColorBajito);

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ubicacion");
        jpUbicacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

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
        String[] Registro = {jtNombre.getText(),jtNumero.getText(),jtCorreo.getText(),jtUbicacion.getText(),""}; 
        
        Escribir EscribirCRM = new Escribir();
        rellenarIngresos vender = new rellenarIngresos();
        try {
            
            
            EscribirCRM.escribirExcelClientes(rutas.excel+"\\CRM.xlsx", "Clientes", Registro);
            vender.vender(inventario, unidadesCB, plataforma, jtNombre.getText(), cliente);

            //Escribe en Excel individual y crea hoja
            EscribirCRM.crearHoja(rutas.excel+"\\DEUDAS A COBRAR.xlsx", jtNombre.getText(), "FECHA", "MONTO");
            String[] ventaInd = {fechaActual(), precioExcel};
            EscribirCRM.escribirExcelInv(rutas.excel+"\\DEUDAS A COBRAR.xlsx", jtNombre.getText(), ventaInd, 2);
            EscribirCRM.escribirCeldaDouble(rutas.excel+"\\DEUDAS A COBRAR.xlsx", jtNombre.getText(), Double.valueOf(precioExcel), LeerExcel.contarRenglones(rutas.excel+"\\DEUDAS A COBRAR.xlsx", jtNombre.getText()), 1);
            String formulaInd = "SUM(B2:B" + LeerExcel.contarRenglones(rutas.excel+"\\DEUDAS A COBRAR.xlsx", jtNombre.getText()) + ")";
            EscribirCRM.escribirFormula(rutas.excel+"\\DEUDAS A COBRAR.xlsx", jtNombre.getText(), formulaInd, (LeerExcel.contarRenglones(rutas.excel+"\\DEUDAS A COBRAR.xlsx", jtNombre.getText())+1), 1);
            //Escribe en Excel general
            String [] ventaC = {fechaActual(), jtNombre.getText(), precioExcel};
            EscribirCRM.escribirExcelInv(rutas.excel+"\\DEUDAS A COBRAR.xlsx", "deudasCobrar", ventaC, 3);
            EscribirCRM.escribirCeldaDouble(rutas.excel+"\\DEUDAS A COBRAR.xlsx", "deudasCobrar", Double.valueOf(precioExcel), LeerExcel.contarRenglones(rutas.excel+"\\DEUDAS A COBRAR.xlsx", "deudasCobrar"), 2);
            String formula = "SUM(C2:C" + (LeerExcel.contarRenglones(rutas.excel+"\\DEUDAS A COBRAR.xlsx", "deudasCobrar")+1) + ")";
            EscribirCRM.escribirFormula(rutas.excel+"\\DEUDAS A COBRAR.xlsx", "deudasCobrar", formula, (LeerExcel.contarRenglones(rutas.excel+"\\DEUDAS A COBRAR.xlsx", "deudasCobrar")+1), 2);
        
            
            this.setVisible(false);
        } catch (IOException ex) {
                    Caption ventanaEx = new Caption("Recuerda cerrar Excel");
                    ventanaEx.setVisible(true);
        }
         catch (IllegalArgumentException ex) {
                    Caption ventanaEx = new Caption(jtNombre.getText()+ " es un deudor registrado");
                    ventanaEx.setVisible(true);
        }
        
    }//GEN-LAST:event_jbRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(clienteNuevoCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clienteNuevoCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clienteNuevoCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clienteNuevoCobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new clienteNuevoCobrar(precioExcel,inventario, unidadesCB, plataforma, cliente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel cerrarIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JPanel jpBoton;
    private javax.swing.JPanel jpCorreo;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpNombre;
    private javax.swing.JPanel jpNumero;
    private javax.swing.JPanel jpUbicacion;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtUbicacion;
    private javax.swing.JPanel maxi;
    private javax.swing.JLabel maxiIcon;
    // End of variables declaration//GEN-END:variables
}
