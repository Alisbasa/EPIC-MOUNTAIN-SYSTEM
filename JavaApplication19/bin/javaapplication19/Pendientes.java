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
public final class Pendientes extends javax.swing.JFrame {

    int mousepX;
    int mousepY;

    /**
     * Creates new form clienteNuevo
     *
     * @param monto
     */
    public Pendientes() {
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
            compraT = new javax.swing.JComboBox(LeerExcel.rellenaCB2("src\\excel\\comprasT.xlsx", "COMPRAS", 0));
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

            jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("COMPRAS EN TRANSITO");
            jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
            jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

            jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

            jpDatos.setBackground(new java.awt.Color(51, 51, 51));
            jpDatos.setLayout(new java.awt.GridLayout());

            jpDescripcion.setBackground(new java.awt.Color(51, 51, 51));
            jpDescripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        }catch(IOException e){}
        compraT.setUI(PropiedadesCB2.createUI(compraT));
        compraT.setBackground(Color.white);
        jpDescripcion.add(compraT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 310, 40));

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
        jpDescripcion.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 50, 40));
        jbRegistrar.setBackground(Colores.epicColor);

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
        int fila = compraT.getSelectedIndex() + 1;
        String fecha = fechaActual();
        try {
            String tipo = LeerExcel.obtenerCelda("src\\excel\\comprasT.xlsx", "COMPRAS", 21, fila);

            Escribir EscribirExcel = new Escribir();

            String producto = LeerExcel.obtenerCelda("src\\excel\\comprasT.xlsx", "COMPRAS", 0, fila);
            String descripcion = LeerExcel.obtenerCelda("src\\excel\\comprasT.xlsx", "COMPRAS", 1, fila);
            String condicion = LeerExcel.obtenerCelda("src\\excel\\comprasT.xlsx", "COMPRAS", 3, fila);
            String pack = LeerExcel.obtenerCelda("src\\excel\\comprasT.xlsx", "COMPRAS", 4, fila);
            
            double costoNeto = LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 8, fila);
            

            String[] equipo = {fecha, producto, descripcion, Double.toString(costoNeto)};

            switch (tipo) {
                case "HERRAMIENTAS":
                    EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", tipo, equipo, 4);
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", tipo, costoNeto, LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", tipo), 3);
                    Escribir.removeRow("src\\excel\\comprasT.xlsx", "COMPRAS", fila);
                    break;
                case "EQUIPO DE TALLER":
                    EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", tipo, equipo, 4);
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", tipo, costoNeto, LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", tipo), 3);
                    Escribir.removeRow("src\\excel\\comprasT.xlsx", "COMPRAS", fila);
                    break;
                case "MOBILIARIO":
                    EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", tipo, equipo, 4);
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", tipo, costoNeto, LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", tipo), 3);
                    Escribir.removeRow("src\\excel\\comprasT.xlsx", "COMPRAS", fila);
                    break;
                case "EQUIPO DE LIMPIEZA":
                    EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", tipo, equipo, 4);
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", tipo, costoNeto, LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", tipo), 3);
                    Escribir.removeRow("src\\excel\\comprasT.xlsx", "COMPRAS", fila);
                    break;
                case "INVENTARIO PRINCIPAL":
                    double tig = LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 5, fila);
                    int unidades = (int) LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 6, fila);
                    double costoUnidad = LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 7, fila);
                    double precioBaseU = LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 9, fila);
                    double precioBaseNeto = LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 10, fila);
                    String[] inventario = {producto, descripcion, fecha, condicion, pack};

                    EscribirExcel.escribirExcelInv("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", inventario, 5);

                    //UNIDADES
                    EscribirExcel.escribirCeldaNumerica("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", unidades, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 6);

                    //TIG
                    Double TIG = tig;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", TIG, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 5);

                    //COSTO UNIDAD
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", costoUnidad, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 7);
                    //COSTO NETO
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", costoNeto, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 8);

                    //PRECIO BASE UNIDAD
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", precioBaseU, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 9);

                    //PRECIO BASE NETO
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", precioBaseNeto, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 10);

                    //PRECIO LOCAL UNIDAD
                    Double precioL = precioBaseU * 1.16;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", precioL, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 11);

                    //PRECIO LOCAL NETO
                    Double precioNeto = unidades * precioL;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", precioNeto, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 12);

                    //COMISION ML
                    Double comisionML = (precioL * .15) + 5;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", comisionML, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 15);

                    //COMISION ML NETO
                    Double comisionMLN = unidades * comisionML;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", comisionMLN, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 16);

                    // IVA UNIDAD
                    Double IVA = precioBaseU * 0.16;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", IVA, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 17);

                    //IVA NETO
                    Double ivaN = unidades * IVA;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", ivaN, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 18);

                    //PRECIO ML
                    Double precioML = precioBaseU + IVA + comisionML + 35;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", precioML, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 13);

                    //PRECIOML NETO
                    Double precioMLN = precioML * unidades;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", precioMLN, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 14);

                    //UTILIDAD UNIDAD LOCAL
                    Double utilidad = precioL - costoUnidad - IVA;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", utilidad, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 19);

                    //UTILIDAD LOCAL NETA
                    Double utilidadLN = unidades * utilidad;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", utilidadLN, LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN"), 20);

                    String formula = "SUM(I2:I" + (LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", formula,
                            LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1, 8);

                    String formula2 = "SUM(K2:K" + (LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", formula2,
                            LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1, 10);

                    String formula3 = "SUM(M2:M" + (LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", formula3,
                            LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1, 12);

                    String formula4 = "SUM(O2:O" + (LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", formula4,
                            LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1, 14);

                    String formula5 = "SUM(Q2:Q" + (LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", formula5,
                            LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1, 16);

                    String formula6 = "SUM(S2:S" + (LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", formula6,
                            LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1, 18);

                    String formula7 = "SUM(U2:U" + (LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN", formula7,
                            LeerExcel.contarRenglones("src\\excel\\Inventario.xlsx", "EPIC MOUNTAIN") + 1, 20);
                    Escribir.removeRow("src\\excel\\comprasT.xlsx", "COMPRAS", fila);

                    break;
                case "PACK DE VENTAS":
                    double tigP = LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 5, fila);
                    int unidadesP = (int) LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 6, fila);
                    double costoUnidadP = LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 7, fila);
                    double precioBaseUP = LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 9, fila);
                    double precioBaseNetoP = LeerExcel.obtenerCeldaNumerica("src\\excel\\comprasT.xlsx", "COMPRAS", 10, fila);
                    
                    String[] packs = {producto, descripcion, fecha, condicion, pack};

                    EscribirExcel.escribirExcelInv("src\\excel\\Packs.xlsx", pack, packs, 5);

                    //UNIDADES
                    EscribirExcel.escribirCeldaNumerica("src\\excel\\Packs.xlsx", pack, unidadesP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 6);

                    //TIG
                    Double TIGP = tigP;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, TIGP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 5);

                    //COSTO UNIDAD
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, costoUnidadP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 7);
                    //COSTO NETO
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, costoNeto, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 8);

                    //PRECIO BASE UNIDAD
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, precioBaseUP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 9);

                    //PRECIO BASE NETO
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, precioBaseNetoP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 10);

                    //PRECIO LOCAL UNIDAD
                    Double precioLP = precioBaseUP * 1.16;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, precioLP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 11);

                    //PRECIO LOCAL NETO
                    Double precioNetoP = unidadesP * precioLP;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, precioNetoP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 12);

                    //COMISION ML
                    Double comisionMLP = (precioLP * .15) + 5;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, comisionMLP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 15);

                    //COMISION ML NETO
                    Double comisionMLNP = unidadesP * comisionMLP;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, comisionMLNP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 16);

                    // IVA UNIDAD
                    Double IVAP = precioBaseUP * 0.16;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, IVAP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 17);

                    //IVA NETO
                    Double ivaNP = unidadesP * IVAP;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, ivaNP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 18);

                    //PRECIO ML
                    Double precioMLP = precioBaseUP + IVAP + comisionMLP + 35;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, precioMLP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 13);

                    //PRECIOML NETO
                    Double precioMLNP = precioMLP * unidadesP;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, precioMLNP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 14);

                    //UTILIDAD UNIDAD LOCAL
                    Double utilidadP = precioLP - costoUnidadP - IVAP;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, utilidadP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 19);

                    //UTILIDAD LOCAL NETA
                    Double utilidadLNP = unidadesP * utilidadP;
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Packs.xlsx", pack, utilidadLNP, LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack), 20);

                    String formulaP = "SUM(I2:I" + (LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Packs.xlsx", pack, formulaP,
                            LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1, 8);

                    String formula2P = "SUM(K2:K" + (LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Packs.xlsx", pack, formula2P,
                            LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1, 10);

                    String formula3P= "SUM(M2:M" + (LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Packs.xlsx", pack, formula3P,
                            LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1, 12);

                    String formula4P = "SUM(O2:O" + (LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Packs.xlsx", pack, formula4P,
                            LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1, 14);

                    String formula5P = "SUM(Q2:Q" + (LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Packs.xlsx", pack, formula5P,
                            LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1, 16);

                    String formula6P = "SUM(S2:S" + (LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Packs.xlsx", pack, formula6P,
                            LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1, 18);

                    String formula7P = "SUM(U2:U" + (LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Packs.xlsx", pack, formula7P,
                            LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", pack) + 1, 20);
                    Escribir.removeRow("src\\excel\\comprasT.xlsx", "COMPRAS", fila);
                    break;
                case "EGRESO":
                    Escribir.removeRow("src\\excel\\comprasT.xlsx", "COMPRAS", fila);
                    EscribirExcel.escribirCelda("src\\excel\\LibrosContables.xlsx", "Gastos", "EGRESO", LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 1);
                    break;

            }
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Pendientes.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> compraT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpDescripcion;
    // End of variables declaration//GEN-END:variables
}
