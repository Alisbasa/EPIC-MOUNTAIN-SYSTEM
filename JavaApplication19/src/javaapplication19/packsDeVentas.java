/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import javaapplication19.rellenarGastos;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication19.rellenarGastos.botonBorrarInd;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Erick Ivan
 */
public class packsDeVentas extends javax.swing.JFrame {

    int mousepX;
    int mousepY;

    static JLabel desarrolloTipoP;
    static JTextField precio;
    static JTextField pieza;
    //static String costoPack;
    /**
     * Creates new form clienteNuevo
     *
     * @param desarrolloTipoP
     * @param precio
     * @throws java.io.IOException
     */
    public packsDeVentas(JLabel desarrolloTipoP,JTextField precio,JTextField pieza) throws IOException {
        

        this.desarrolloTipoP = desarrolloTipoP;
        this.precio = precio;
        this.pieza = pieza;
        initComponents();
        this.setExtendedState(NORMAL);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
//        packsDisponibles = new JComboBox(LeerExcel.obtenerHoja("src\\excel\\Packs.xlsx"));
//        packsDisponibles.setBackground(Color.white);
//        packsDisponibles.setUI(PropiedadesCB2.createUI(packsDisponibles));
//        jpDescripcion.add(packsDisponibles);
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
        String[] arr={""};
        try{
            arr = LeerExcel.obtenerHoja("src\\excel\\Packs.xlsx");
        }catch(Exception e){}
        packsDisponibles2 = new javax.swing.JComboBox(arr);
        jPanel2 = new javax.swing.JPanel();
        jlPack2 = new javax.swing.JLabel();
        jtPieza = new javax.swing.JTextField(pieza.getText());
        jpPack = new javax.swing.JPanel();
        jlDesc = new javax.swing.JLabel();
        jtDesc = new javax.swing.JTextField();
        jpTIG = new javax.swing.JPanel();
        jlTIG = new javax.swing.JLabel();
        jtCosto = new javax.swing.JTextField();
        jlPack = new javax.swing.JLabel();
        jcCondicion = new javax.swing.JComboBox<>();
        jpUbicacion = new javax.swing.JPanel();
        jlPrecio = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField(new javax.swing.JTextField(precio.getText()));
        jlUnidades1 = new javax.swing.JLabel();
        jtUnidades = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR NUEVO ELEMENTO");
        jPanel10.add(jLabel1, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        jpDatos.setBackground(new java.awt.Color(51, 51, 51));
        jpDatos.setLayout(new java.awt.GridLayout(6, 0));

        jpDescripcion.setBackground(new java.awt.Color(51, 51, 51));
        jpDescripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPack1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlPack1.setForeground(new java.awt.Color(255, 255, 255));
        jlPack1.setText("PACK");
        jpDescripcion.add(jlPack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        packsDisponibles2.removeItemAt(0);
        packsDisponibles2.setBackground(Color.white);
        packsDisponibles2.setUI(PropiedadesCB2.createUI(packsDisponibles2));
        packsDisponibles2.setModel(new javax.swing.DefaultComboBoxModel<>(arr));
        jpDescripcion.add(packsDisponibles2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 200, 30));

        jpDatos.add(jpDescripcion);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPack2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlPack2.setForeground(new java.awt.Color(255, 255, 255));
        jlPack2.setText("PIEZA");
        jPanel2.add(jlPack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jtPieza.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPiezaActionPerformed(evt);
            }
        });
        jPanel2.add(jtPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 340, 50));

        jpDatos.add(jPanel2);

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
        jpPack.add(jtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 340, 48));
        jtDesc.setBackground(Colores.epicColorBajito);

        jpDatos.add(jpPack);

        jpTIG.setBackground(new java.awt.Color(51, 51, 51));
        jpTIG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTIG.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlTIG.setForeground(new java.awt.Color(255, 255, 255));
        jlTIG.setText("COSTO");
        jpTIG.add(jlTIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 30));

        jtCosto.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpTIG.add(jtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 100, 48));
        jtCosto.setBackground(Colores.epicColorBajito);

        jlPack.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlPack.setForeground(new java.awt.Color(255, 255, 255));
        jlPack.setText("CONDICION");
        jpTIG.add(jlPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 130, 30));

        jcCondicion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 13)); // NOI18N
        jcCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Seminuevo", "Usado" }));
        jpTIG.add(jcCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 50));

        jpDatos.add(jpTIG);

        jpUbicacion.setBackground(new java.awt.Color(51, 51, 51));

        jlPrecio.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jlPrecio.setText("PRECIO");
        jpUbicacion.add(jlPrecio);

        jtPrecio.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPrecio.setPreferredSize(new java.awt.Dimension(100, 40));
        jpUbicacion.add(jtPrecio);
        jtPrecio.setBackground(Colores.epicColorBajito);

        jlUnidades1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jlUnidades1.setForeground(new java.awt.Color(255, 255, 255));
        jlUnidades1.setText("UNIDADES");
        jpUbicacion.add(jlUnidades1);

        jtUnidades.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        jtUnidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtUnidades.setPreferredSize(new java.awt.Dimension(100, 40));
        jpUbicacion.add(jtUnidades);
        jtPrecio.setBackground(Colores.epicColorBajito);

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
        jpBoton.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 250, 50));
        jbRegistrar.setBackground(Colores.epicColor);

        jpDatos.add(jpBoton);

        getContentPane().add(jpDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 430));

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
            //costoPack = jtCosto.getText();
            
            
            double tig = LeerExcel.obtenerCeldaNumerica("src\\excel\\Packs.xlsx", desarrolloTipoP.getText() , LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", desarrolloTipoP.getText()), 5);
        } catch (IOException ex) {
            Logger.getLogger(packsDeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
                        double costoDiv = Doubleprecio.getText();
        
        String[] Registro = {jtPieza.getText(),
            jtDesc.getText(),
            fechaActual(),
            jcCondicion.getSelectedItem().toString(),
            packsDisponibles2.getSelectedItem().toString(),
            Double.toString(Double.valueOf(jtPrecio.getText()) / Double.valueOf(jtCosto.getText())),
            jtUnidades.getText(),
            jtCosto.getText(),
            Double.toString(Double.valueOf(jtCosto.getText()) * Integer.valueOf(jtUnidades.getText())),
            jtPrecio.getText(),
            Double.toString(Double.valueOf(jtUnidades.getText()) * Integer.valueOf(jtPrecio.getText()))};
        
            
        Escribir escribirExcel = new Escribir();
        try {
            
            //PACKS DE VENTAS
            escribirExcel.escribirExcelInv("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), Registro, 10);
            
            //UNIDADES
            escribirExcel.escribirCeldaNumerica("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), Integer.valueOf(jtUnidades.getText()), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 6);
            
            //TIG
            Double TIG = Double.valueOf(jtPrecio.getText())/Double.valueOf(precio.getText());
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), TIG, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 5);
            
            //COSTO UNIDAD
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), Double.valueOf(precio.getText()), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 7);
            
            //COSTO NETO
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), Double.valueOf(jtCosto.getText()) * Integer.valueOf(jtUnidades.getText()), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 8);
            
            //PRECIO BASE UNIDAD
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), Double.valueOf(jtPrecio.getText()), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 9);
            
            //PRECIO BASE NETO
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), Double.valueOf(jtUnidades.getText()) * Integer.valueOf(jtPrecio.getText()), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 10);
            
            //PRECIO LOCAL UNIDAD
            Double precioL = (LeerExcel.obtenerCeldaNumerica("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), 9, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString())) * 1.16);
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), precioL, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 11);
            
            //PRECIO LOCAL NETO
            Double precioNeto = escribirExcel.Mulitplicar(6, 11,LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) ,"src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString());
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), precioNeto, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 12);
            
            //COMISION ML
            Double comisionML = ((LeerExcel.obtenerCeldaNumerica("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), 11, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()))) *.15)+5;
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), comisionML, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 15);
            
            //COMISION ML NETO
            Double comisionMLN = escribirExcel.Mulitplicar(6, 15, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), "src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString());
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), comisionMLN, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 16);
            
            // IVA UNIDAD
            Double IVA = (LeerExcel.obtenerCeldaNumerica("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), 9, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()))*0.16);
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), IVA, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 17);
            
            //IVA NETO
            Double ivaN = escribirExcel.Mulitplicar(6, 17, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), "src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString());
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), ivaN, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 18);
            
            //PRECIO ML
            Double precioML = escribirExcel.SumarColumnasML(LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 9, 17, 15, "src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString());
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), precioML, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 13);
            
            //PRECIOML NETO
            
            Double precioMLN = escribirExcel.Mulitplicar(6, 13, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), "src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString());
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), precioMLN, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 14);
            

            //UTILIDAD UNIDAD LOCAL
            Double utilidad = escribirExcel.RestarColumnas(LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 11, 7, 17, "src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString());
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), utilidad, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 19);
            
            //UTILIDAD LOCAL NETA
            Double utilidadLN = escribirExcel.Mulitplicar(6, 19, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), "src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString());
            escribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), utilidadLN, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()), 20);
            
            String formula = "SUM(I2:I" + LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + ")";
            escribirExcel.escribirFormula("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), formula, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + 1, 8);
            
            String formula2 = "SUM(K2:K" + LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + ")";
            escribirExcel.escribirFormula("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), formula2, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + 1, 10);
            
            String formula3 = "SUM(M2:M" + LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + ")";
            escribirExcel.escribirFormula("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), formula3, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + 1, 12);
            
            String formula4 = "SUM(O2:O" + LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + ")";
            escribirExcel.escribirFormula("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), formula4, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + 1, 14);
            
            String formula5 = "SUM(Q2:Q" + LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + ")";
            escribirExcel.escribirFormula("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), formula5, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + 1, 16);
            
            String formula6 = "SUM(S2:S" + LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + ")";
            escribirExcel.escribirFormula("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), formula6, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + 1, 18);
            
            String formula7 = "SUM(U2:U" + LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + ")";
            escribirExcel.escribirFormula("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString(), formula7, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString()) + 1, 20);
            
            
            //INVENTARIO PRINCIPAL
            escribirExcel.escribirExcelInv("src\\excel\\Inventario.xlsx", "Inventario", Registro, 10);
            
            //UNIDADES
            escribirExcel.escribirCeldaNumerica("src\\excel\\Inventario.xlsx", "Inventario", Integer.valueOf(jtUnidades.getText()), LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 6);
            
            //TIG
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", TIG, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 5);
            
            //COSTO UNIDAD
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", Double.valueOf(precio.getText()), LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 7);
            
            //COSTO NETO
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", Double.valueOf(jtCosto.getText()) * Integer.valueOf(jtUnidades.getText()), LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 8);
            
            //PRECIO BASE UNIDAD
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", Double.valueOf(jtPrecio.getText()), LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 9);
            
            //PRECIO BASE NETO
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", Double.valueOf(jtUnidades.getText()) * Integer.valueOf(jtPrecio.getText()), LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 10);
            
            //PRECIO LOCAL UNIDAD 
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", precioL, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 11);
            
            //PRECIO LOCAL NETO
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", precioNeto, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 12);
            
            //COMISION ML
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", comisionML, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 15);
            
            //COMISION ML NETO
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", comisionMLN, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 16);
            
            // IVA UNIDAD         
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", IVA, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 17);
            
            //IVA NETO     
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", ivaN, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 18);
            
            //PRECIO ML
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", precioML, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 13);
            
            //PRECIOML NETO
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", precioMLN, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 14);
            

            //UTILIDAD UNIDAD LOCAL
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", utilidad, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 19);
            
            //UTILIDAD LOCAL NETA
            escribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", utilidadLN, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario"), 20);
            
            //FORMULAS INVENTARIO
            escribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "Inventario", formula, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario") + 1, 8);

            escribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "Inventario", formula2, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario") + 1, 10);
            
            escribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "Inventario", formula3, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario") + 1, 12);
            
            escribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "Inventario", formula4, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario") + 1, 14);
            
            escribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "Inventario", formula5, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario") + 1, 16);

            escribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "Inventario", formula6, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario") + 1, 18);
            
            escribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "Inventario", formula7, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "Inventario") + 1, 20);
            
            
        } catch (IOException ex) {
            Logger.getLogger(packsDeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         botonBorrarInd(rellenarGastos.iconoPacks, "src\\excel\\Packs.xlsx", packsDisponibles2.getSelectedItem().toString());
        
        this.setVisible(false);
    }//GEN-LAST:event_jbRegistrarMouseClicked

    public static String fechaActual() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM YY");
        return formatoFecha.format(fecha);
    }

    private void jtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescActionPerformed

    private void jtPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPiezaActionPerformed

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
                    new packsDeVentas(desarrolloTipoP,precio,pieza).setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jcCondicion;
    private javax.swing.JLabel jlDesc;
    private javax.swing.JLabel jlPack;
    private javax.swing.JLabel jlPack1;
    private javax.swing.JLabel jlPack2;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlTIG;
    private javax.swing.JLabel jlUnidades1;
    private javax.swing.JPanel jpBoton;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpDescripcion;
    private javax.swing.JPanel jpPack;
    private javax.swing.JPanel jpTIG;
    private javax.swing.JPanel jpUbicacion;
    private javax.swing.JTextField jtCosto;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtPieza;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtUnidades;
    private javax.swing.JComboBox<String> packsDisponibles2;
    // End of variables declaration//GEN-END:variables
}
