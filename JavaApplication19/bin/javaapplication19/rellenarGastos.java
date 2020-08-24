/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication19.rellenarIngresos.fechaActual;
import static javaapplication19.rellenarIngresos.fechaActualEscribir;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class rellenarGastos {

    public List<JPanel> panelesGastos;
    public int indice = 0;
    static JLabel iconoInventario;
    static JLabel iconoLibros;
    static JLabel iconoPacks = new JLabel();

    public rellenarGastos() {
        panelesGastos = new ArrayList<>();
    }

    static void botonBorrarDeudorC(JLabel boton, String filepath, String hoja) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Escribir EscribirExcel = new Escribir();
                    Escribir.saldarDeuda(filepath, hoja, LeerExcel.obtenerIndexHoja(filepath, hoja));
                    String formula = "SUM(C2:C" + (LeerExcel.contarRenglones("src\\excel\\DeudasC.xlsx", "deudasCobrar") + 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\DeudasC.xlsx", "deudasCobrar", formula, (LeerExcel.contarRenglones("src\\excel\\DeudasC.xlsx", "deudasCobrar") + 1), 2);
                    //Escribir.removeRow("src//excel/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones("src//excel/LibrosContables.xlsx", "Gastos"));
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //Iconos.scaleImage("cancelG", boton, 20);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //Iconos.scaleImage(img, boton, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        boton.addMouseListener(botonV);
    }
    
    void botonBorrar(JLabel boton, JPanel padre, JPanel hijo, int panelIndex, String img, String filepath, String hoja) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                padre.remove(hijo);
                panelesGastos.remove(hijo);
                padre.updateUI();
                try {
                    Escribir.removeRow(filepath, hoja, LeerExcel.contarRenglones(filepath, hoja));
                    //Escribir.removeRow("src//excel/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones("src//excel/LibrosContables.xlsx", "Gastos"));
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("cancelG", boton, 20);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage(img, boton, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        boton.addMouseListener(botonV);
    }

    static void botonBorrarInd(JLabel boton, String filepath, String hoja) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Escribir.removeRow(filepath, hoja, LeerExcel.contarRenglones(filepath, hoja));
                    Libros.actualiza();
                    //Escribir.removeRow("src//excel/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones("src//excel/LibrosContables.xlsx", "Gastos"));
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //Iconos.scaleImage("cancelG", boton, 20);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //Iconos.scaleImage(img, boton, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        boton.addMouseListener(botonV);
    }

    static void botonBorrarAditamento(JLabel boton, String filepath, String hoja, int folio) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Escribir escribirA = new Escribir();
                    Double restaCosto = LeerExcel.obtenerCeldaNumerica(filepath, hoja, 7, folio) - LeerExcel.obtenerCeldaNumerica("src\\excel\\LibrosContables.xlsx", "Gastos", 3,
                            LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"));
                    escribirA.escribirCeldaDouble(filepath, hoja, restaCosto, folio, 7);

                    Escribir escribirVentas = new Escribir();
                    String inventario = "EPIC MOUNTAIN";

                    int suma = (int) LeerExcel.obtenerCeldaNumerica("src\\excel\\inventario.xlsx", inventario, 6, folio);
                    double costoUnidad = LeerExcel.obtenerCeldaNumerica("src\\excel\\inventario.xlsx", inventario, 7, folio);
                    double precioBaseUnidad = LeerExcel.obtenerCeldaNumerica("src\\excel\\inventario.xlsx", inventario, 9, folio);
                    Double precioML = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", inventario, 13, folio);
                    Double iva = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", inventario, 17, folio);
                    Double comisionML = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", inventario, 15, folio);
                    Double utilidadShop = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", inventario, 19, folio);

                    //COSTO NETO
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, (suma * costoUnidad), folio, 8);
                    //PRECIO BASE NETO
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, suma * (precioBaseUnidad), folio, 10);
                    //PRECIO LOCAL NETO
                    Double precioNeto = escribirVentas.Mulitplicar(6, 11, folio, "src\\excel\\Inventario.xlsx", inventario);
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, precioNeto, folio, 12);
                    //COMISION ML NETO

                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, comisionML * suma, folio, 16);

                    //IVA NETO
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, suma * iva, folio, 18);
                    //PRECIOML NETO

                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, suma * precioML, folio, 14);

                    //UTILIDAD LOCAL NETA
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, suma * utilidadShop, folio, 20);

                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("cancelG", boton, 20);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("inventarioG", boton, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        boton.addMouseListener(botonV);
    }

    static void botonBorrarHoja(JLabel boton, String filepath, int hoja) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {

                    Escribir.eliminarHoja2(filepath, hoja);

                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("cancelG", boton, 20);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("inventarioG", boton, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        boton.addMouseListener(botonV);
    }

    //Pone Gasto: Desarollo: Equipo y Mob
    void botonDesEquipo(JComboBox tipo, JTextField desarrolloTipoE, JTextField descripcion, JTextField montoDes, JLabel iconoOkDesarrolloEq, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonV = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {

                    scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                    panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    panelGasto.setLayout(new GridLayout(1, 5));
                    panelGasto.setBackground(Colores.epicColorBajito);
                    panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                    panelGasto.setMaximumSize(new Dimension(550, 40));
                    panelGasto.setPreferredSize(new Dimension(550, 100));

                    JLabel fecha = new JLabel();
                    fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    fecha.setText(fechaActual());

                    JLabel desarrolloLista = new JLabel();
                    desarrolloLista.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    desarrolloLista.setText(desarrolloTipoE.getText());

                    JLabel precio = new JLabel();
                    precio.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    precio.setText("$" + montoDes.getText());

                    JLabel gasto = new JLabel();
                    gasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    gasto.setText("$0");

                    JLabel icono = new JLabel();
                    icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                    Iconos.scaleImage("equipoG", icono, 25);

                    if (tipo.getSelectedItem().toString().equals("Herramientas")) {
                        String[] equipo = {(String) fechaActual(), desarrolloTipoE.getText(), descripcion.getText(), montoDes.getText()};
                        Escribir EscribirExcel = new Escribir();

                        EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", "Herramientas", equipo, 4);
                        EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", "Herramientas", Utilidades.roundTwoDecimals(Double.valueOf(montoDes.getText())), LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Herramientas"), 3);
                        String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Herramientas") + 1) + ")";
                        EscribirExcel.escribirFormula("src\\excel\\Equipo.xlsx", "Herramientas", formula, LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Herramientas") + 1, 3);

                    } else if (tipo.getSelectedItem().toString().equals("Equipo de Taller")) {
                        String[] equipo = {(String) fechaActual(), desarrolloTipoE.getText(), descripcion.getText(), montoDes.getText()};
                        Escribir EscribirExcel = new Escribir();

                        EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", "Equipo de Taller", equipo, 4);
                        EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", "Equipo de Taller", Double.valueOf(montoDes.getText()), LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Taller"), 3);
                        String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Taller") + 1) + ")";
                        EscribirExcel.escribirFormula("src\\excel\\Equipo.xlsx", "Equipo de Taller", formula, (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Taller") + 1), 3);

                    } else if (tipo.getSelectedItem().toString().equals("Mobiliario")) {
                        String[] equipo = {(String) fechaActual(), desarrolloTipoE.getText(), descripcion.getText(), montoDes.getText()};
                        Escribir EscribirExcel = new Escribir();

                        EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", "Mobiliario", equipo, 4);
                        EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", "Mobiliario", Double.valueOf(montoDes.getText()), LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Mobiliario"), 3);
                        String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Mobiliario") + 1) + ")";
                        EscribirExcel.escribirFormula("src\\excel\\Equipo.xlsx", "Mobiliario", formula, (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Mobiliario") + 1), 3);

                    } else if (tipo.getSelectedItem().toString().equals("Equipo de Limpieza")) {
                        String[] equipo = {(String) fechaActual(), desarrolloTipoE.getText(), descripcion.getText(), montoDes.getText()};
                        Escribir EscribirExcel = new Escribir();

                        EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", "Equipo de Limpieza", equipo, 4);
                        EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", "Equipo de Limpieza", Double.valueOf(montoDes.getText()), LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Limpieza"), 3);
                        String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Limpieza") + 1) + ")";
                        EscribirExcel.escribirFormula("src\\excel\\Equipo.xlsx", "Equipo de Limpieza", formula, (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Limpieza") + 1), 3);

                    }

                    String tipoEquipo;

                    tipoEquipo = tipo.getSelectedItem().toString();// LeerExcel.obtenerCelda("src//excel/LibrosContables.xlsx", "Gastos", 4,
                    // LeerExcel.contarRenglones("src//excel/LibrosContables.xlsx", "Gastos"));

                    switch (tipoEquipo) {
                        case "Herramientas":
                            botonBorrarInd(icono, "src\\excel\\Equipo.xlsx", "HERRAMIENTAS");
                            break;

                        case "Equipo de Taller":
                            botonBorrarInd(icono, "src\\excel\\Equipo.xlsx", "Equipo de Taller");
                            break;

                        case "Mobiliario":
                            botonBorrarInd(icono, "src\\excel\\Equipo.xlsx", "Mobiliario");
                            break;

                        case "Equipo de Limpieza":
                            botonBorrarInd(icono, "src\\excel\\Equipo.xlsx", "Equipo de Limpieza");
                            break;

                    }

                    String[] data = {(String) fechaActual(), tipo.getSelectedItem().toString(), desarrolloTipoE.getText(), montoDes.getText(), tipoEquipo, "VERDE", "0"};

                    Escribir escribirVentas = new Escribir();

                    escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";

                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(0), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);

                    listaGastos.add(panelGasto, 1);
                    panelesGastos.add(panelGasto);

                    botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto), "equipoG", "src//excel/LibrosContables.xlsx", "Gastos");

                    panelGasto.add(fecha);
                    panelGasto.add(desarrolloLista);
                    panelGasto.add(precio);
                    panelGasto.add(gasto);
                    panelGasto.add(icono);

                    indice++;
                    panelPadre.removeAll();
                    panelPadre.updateUI();
                    listaGastos.updateUI();
                } catch (IOException ex) {
                    Caption ventanaEx = new Caption("Recuerda cerrar Excel");
                    ventanaEx.setVisible(true);

                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkDesarrolloEq, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDesarrolloEq, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkDesarrolloEq.addMouseListener(botonV);
    }
    String tipoI2;

    //Pone Gasto: Desarollo: Inventario
    void botonDesInv(JTextField desarrolloTipoI, JComboBox producto, JTextField montoDesI, JLabel iconoOkDesarrolloI, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonV = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 5));
                panelGasto.setBackground(Colores.epicColorBajito);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(550, 40));
                panelGasto.setPreferredSize(new Dimension(550, 100));;

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel desarrolloListaI = new JLabel();
                desarrolloListaI.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                desarrolloListaI.setText(desarrolloTipoI.getText());
                tipoI2 = desarrolloTipoI.getText();

                JLabel productoAg = new JLabel();
                producto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                productoAg.setText((String) producto.getSelectedItem());

                JLabel precioI = new JLabel();
                precioI.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                precioI.setText(montoDesI.getText());

                JLabel precioIPanel = new JLabel();
                precioIPanel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                precioIPanel.setText("$" + montoDesI.getText());

                JLabel variacion = new JLabel();
                variacion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                variacion.setText("$0");

                iconoInventario = new JLabel();
                iconoInventario.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                Iconos.scaleImage("inventarioG", iconoInventario, 25);
                listaGastos.add(panelGasto, 1);
                panelesGastos.add(panelGasto);

                botonBorrar(iconoInventario, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto), "inventarioG", "src//excel/LibrosContables.xlsx", "Gastos");;

                botonBorrarInd(iconoInventario, "src\\excel\\Inventario.xlsx", "Inventario");

                panelGasto.add(fecha);
                panelGasto.add(desarrolloListaI);
                panelGasto.add(precioIPanel);
                panelGasto.add(variacion);
                panelGasto.add(iconoInventario);

                String[] data = {(String) fechaActual(), "Inventario", desarrolloTipoI.getText(), montoDesI.getText(), (String) producto.getSelectedItem(), "VERDE", variacion.getText()};

                Escribir escribirVentas = new Escribir();

                if (producto.getSelectedItem().toString().equals("Nuevo")) {
                    inventarioPrincipal inv = new inventarioPrincipal(desarrolloListaI, precioI);
                    inv.setVisible(true);
                    try {

                        escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                        escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
                        String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";

                        escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(0), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                        String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                        escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                        escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);

                    } catch (IOException ex) {
                        Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                if (producto.getSelectedItem().toString().equals("Existente")) {
                    InventarioExistente inv;
                    try {
                        inv = new InventarioExistente();
                        inv.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                if (producto.getSelectedItem().toString().equals("Aditamento")) {
                   
                    try {
                        InventarioAditamento inv = new InventarioAditamento(precioI, desarrolloListaI);
                        inv.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaGastos.updateUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkDesarrolloI, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDesarrolloI, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkDesarrolloI.addMouseListener(botonV);
    }

    //Pone Gasto: Desarollo: Packs
    void botonDesP(JTextField desarrolloTipoP, JComboBox tipoPack, JTextField montoDesP, JTextField precio, JLabel iconoOkDesarrolloP, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonV = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               

                    scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                    panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    panelGasto.setLayout(new GridLayout(1, 4));
                    panelGasto.setBackground(Colores.epicColorBajito);
                    panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                    panelGasto.setMaximumSize(new Dimension(550, 40));
                    panelGasto.setPreferredSize(new Dimension(550, 100));

                    JLabel fecha = new JLabel();
                    fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    fecha.setText(fechaActual());

                    JLabel desarrolloLista = new JLabel();
                    desarrolloLista.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    desarrolloLista.setText(desarrolloTipoP.getText());
                    JLabel costo = new JLabel();
                    costo.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    JLabel variacion = new JLabel();
                    variacion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));

                    if (tipoPack.getSelectedItem().toString().equals("Rellenar Pack")) {
                        try{
                        packsDeVentas inv;

                        inv = new packsDeVentas(desarrolloLista, precio, desarrolloTipoP);
                        inv.setVisible(true);
                        costo.setText("$" + montoDesP.getText());
                        variacion.setText("$0");
                         }catch(IOException ex) {
                    Caption ventanaEx = new Caption("Recuerda cerrar Excel");
                    ventanaEx.setVisible(true);}

                    } else {
                        costo.setText("$ " + montoDesP.getText());
                        variacion.setText("$0");
                    }

                    if (tipoPack.getSelectedItem().toString().equals("Nuevo")) {
                        try {

                            Escribir escribirVentas = new Escribir();
                            escribirVentas.crearHojaPack("src\\excel\\Packs.xlsx", desarrolloTipoP.getText());
                            escribirVentas.escribirCeldaDoubleVerde("src\\excel\\Packs.xlsx", desarrolloTipoP.getText(), Utilidades.roundTwoDecimals(Double.valueOf(montoDesP.getText())), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", desarrolloTipoP.getText()), 8);
                            escribirVentas.escribirCeldaDoubleVerde("src\\excel\\Packs.xlsx", desarrolloTipoP.getText(), Utilidades.roundTwoDecimals(Double.valueOf(precio.getText())), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", desarrolloTipoP.getText()), 10);
                            escribirVentas.escribirCeldaDoubleVerde("src\\excel\\Packs.xlsx", desarrolloTipoP.getText(), Utilidades.roundTwoDecimals(Double.valueOf(precio.getText()) / Double.valueOf(montoDesP.getText())), LeerExcel.contarRenglones("src\\excel\\Packs.xlsx", desarrolloTipoP.getText()), 5);
                            botonBorrarHoja(iconoPacks, "src\\excel\\Packs.xlsx", LeerExcel.obtenerNumeroHojas("src\\excel\\Packs.xlsx") - 1);
                            botonBorrar(iconoPacks, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto), "packsG", "src//excel/LibrosContables.xlsx", "Gastos");

                            String[] data = {(String) fechaActual(), "Pack de Ventas", desarrolloTipoP.getText(), montoDesP.getText(), "    ", "VERDE", "   "};

                            escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);

                            escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
                            String formula = ("SUM(D2:D" + LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";

                            escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(0), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                            String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";

                            escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                            escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);

                            panelGasto.add(fecha);
                            panelGasto.add(desarrolloLista);
                            panelGasto.add(costo);
                            panelGasto.add(variacion);
                            panelGasto.add(iconoPacks);
                            iconoPacks.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                            Iconos.scaleImage("packsG", iconoPacks, 25);
                            listaGastos.add(panelGasto, 1);
                            panelesGastos.add(panelGasto);
                        } catch (IOException ex) {
                            Caption ventanaEx = new Caption("Recuerda cerrar Excel");
                            ventanaEx.setVisible(true);
                        }

                    }

                    indice++;
                    panelPadre.removeAll();
                    panelPadre.updateUI();
                    listaGastos.updateUI();

            }

            @Override
            public void mousePressed(MouseEvent e
            ) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e
            ) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e
            ) {
                Iconos.scaleImage("okh", iconoOkDesarrolloP, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e
            ) {
                Iconos.scaleImage("ok", iconoOkDesarrolloP, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkDesarrolloP.addMouseListener(botonV);
    }

    //Pone Gasto: Desarollo: Compras en Transito
    void botonDesCT(JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre, JComboBox productoCT, JTextField paqueteria, JTextField costoInv, JTextField costoE, JTextField costoP, JLabel iconoOkDesarrolloCT) {
        MouseListener botonV = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 4));
                panelGasto.setBackground(Colores.amarillo);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(550, 40));
                panelGasto.setPreferredSize(new Dimension(550, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel icono = new JLabel();
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                Iconos.scaleImage("packsG", icono, 25);

                JLabel costoCT = new JLabel();
                if (productoCT.getSelectedItem().toString().equals("INVENTARIO PRINCIPAL")) {

                    inventarioPrincipalCT inventarioP = new inventarioPrincipalCT(paqueteria, productoCT);
                    inventarioP.setVisible(true);
                    costoCT.setText(costoInv.getText());

                } else if (productoCT.getSelectedItem().toString().equals("HERRAMIENTAS")) {

                    equipoymobCT equipo = new equipoymobCT(paqueteria, productoCT);
                    equipo.setVisible(true);

                } else if (productoCT.getSelectedItem().toString().equals("EQUIPO DE TALLER")) {

                    equipoymobCT equipo = new equipoymobCT(paqueteria, productoCT);
                    equipo.setVisible(true);

                } else if (productoCT.getSelectedItem().toString().equals("MOBILIARIO")) {

                    equipoymobCT equipo = new equipoymobCT(paqueteria, productoCT);
                    equipo.setVisible(true);

                } else if (productoCT.getSelectedItem().toString().equals("EQUIPO DE LIMPIEZA")) {

                    equipoymobCT equipo = new equipoymobCT(paqueteria, productoCT);
                    equipo.setVisible(true);

                } else if (productoCT.getSelectedItem().toString().equals("PACK DE VENTAS")) {

                    packsCT packs = new packsCT(paqueteria, productoCT);
                    packs.setVisible(true);
                }else if (productoCT.getSelectedItem().toString().equals("EGRESO")) {

                    egresoCT packs = new egresoCT(paqueteria, productoCT);
                    packs.setVisible(true);
                }
                

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaGastos.updateUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkDesarrolloCT, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDesarrolloCT, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkDesarrolloCT.addMouseListener(botonV);
    }

    //Para rellenar un Gasto:deudas
    void botonDeudas(JComboBox deudas, JTextField montoDeuda, JLabel iconoOkDeudas, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonC = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    //CREAR PANEL
                    scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    PanelCurvoSinSombra panelGastoC = new PanelCurvoSinSombra();
                    panelGastoC.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    panelGastoC.setLayout(new GridLayout(1, 4));
                    panelGastoC.setBackground(Colores.epicColorBajito);
                    panelGastoC.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                    panelGastoC.setMaximumSize(new Dimension(550, 40));
                    panelGastoC.setPreferredSize(new Dimension(550, 100));;
                    //SET PANEL
                    JLabel fecha = new JLabel();
                    fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    fecha.setText(fechaActual());

                    JLabel deudasPagar = new JLabel();
                    deudasPagar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    deudasPagar.setText((String) deudas.getSelectedItem());

                    JLabel precio = new JLabel();
                    precio.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    precio.setText(montoDeuda.getText());
                    JLabel precioP = new JLabel();
                    precioP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    precioP.setText("$ " + montoDeuda.getText());

                    JLabel variacion = new JLabel();
                    variacion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    variacion.setText("$ " + montoDeuda.getText());

                    JLabel icono = new JLabel();
                    icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                    Iconos.scaleImage("DeudasPG_1", icono, 25);

                    //ESCRIBIR EXCEL LIBROS
                    String[] data = {(String) fechaActual(), "Deudas a Pagar", (String) deudasPagar.getText(), precio.getText(), "", "VERDE", precio.getText()};
                    String[] deuda = {fechaActual(), precio.getText()};

                    Escribir escribirVentas = new Escribir();

                    escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);

                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";

                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);

                    escribirVentas.escribirExcelInv("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString(), deuda, 2);
                    escribirVentas.escribirCeldaDouble("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString(), Double.valueOf(precio.getText()) * (-1), (LeerExcel.contarRenglones("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString())), 1);
                    String formula3 = escribirVentas.Sumar(2, (LeerExcel.contarRenglones("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString()) + 1), 'b');
                    escribirVentas.escribirFormula("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString(), formula3, (LeerExcel.contarRenglones("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString()) + 1), 1);

                    //AGREGAR PANEL
                    listaGastos.add(panelGastoC, 1);
                    panelesGastos.add(panelGastoC);//Ingresa el panelVenta a la arraylist panelesInresos

                    botonBorrar(icono, listaGastos, panelGastoC, panelesGastos.indexOf(panelGastoC), "DeudasPG", "src//excel/LibrosContables.xlsx", "Gastos");

                    panelGastoC.add(fecha);
                    panelGastoC.add(deudasPagar);
                    panelGastoC.add(precioP);
                    panelGastoC.add(variacion);
                    panelGastoC.add(icono);

                    indice++;
                    panelPadre.removeAll();
                    panelPadre.updateUI();
                    listaGastos.updateUI();
                } catch (IOException ex) {
                    Caption ventanaEx = new Caption("Recuerda cerrar Excel");
                    ventanaEx.setVisible(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkDeudas, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDeudas, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkDeudas.addMouseListener(botonC);
    }

    //Para rellenar un Gasto:impuesto
    void botonImpuestoG(JTextField impuesto, JTextField montoImpuesto, JLabel iconoOkImpuesto, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonImp = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 5));
                panelGasto.setBackground(Colores.epicColorBajito);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(550, 40));
                panelGasto.setPreferredSize(new Dimension(550, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel imp = new JLabel();
                imp.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                imp.setText(impuesto.getText());

                JLabel variacion = new JLabel();
                variacion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                variacion.setText("$" + montoImpuesto.getText());
                
                JLabel montoImpues = new JLabel();
                montoImpues.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                montoImpues.setText("$" + montoImpuesto.getText());

                JLabel icono = new JLabel();
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                Iconos.scaleImage("impuestoG", icono, 25);
                listaGastos.add(panelGasto, 1);
                panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

                botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto), "impuestoG", "src//excel/LibrosContables.xlsx", "Gastos");

                panelGasto.add(fecha);
                panelGasto.add(imp);
                panelGasto.add(montoImpues);
                panelGasto.add(variacion);
                panelGasto.add(icono);

                String[] data = {(String) fechaActual(), "Impuesto", (String) imp.getText(), montoImpuesto.getText(), "", "VERDE", montoImpuesto.getText()};

                Escribir escribirVentas = new Escribir();
                try {

                    escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);

                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaGastos.updateUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkImpuesto, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkImpuesto, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkImpuesto.addMouseListener(botonImp);
    }

    //Para rellenar un Gasto:mantenimiento
    void botonMantenimiento(JTextField mantenimiento, JTextField montoMant, JLabel iconoOkMantenimiento, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonI = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 4));
                panelGasto.setBackground(Colores.epicColorBajito);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(550, 40));
                panelGasto.setPreferredSize(new Dimension(550, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel descripcion = new JLabel();
                descripcion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                descripcion.setText(mantenimiento.getText());

                JLabel precioMant = new JLabel();
                precioMant.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                precioMant.setText("$ " + montoMant.getText());
                JLabel gasto = new JLabel();
                gasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                gasto.setText("$ " + montoMant.getText());

                JLabel icono = new JLabel();
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                Iconos.scaleImage("mantenimientoG", icono, 25);
                listaGastos.add(panelGasto, 1);
                panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

                botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto), "mantenimientoG", "src//excel/LibrosContables.xlsx", "Gastos");

                panelGasto.add(fecha);
                panelGasto.add(descripcion);
                panelGasto.add(precioMant);
                panelGasto.add(gasto);
                panelGasto.add(icono);

                String[] data = {(String) fechaActual(), "Mantenimiento", (String) descripcion.getText(), montoMant.getText(), "", "VERDE", montoMant.getText()};

                Escribir escribirVentas = new Escribir();
                try {

                    escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";

                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaGastos.updateUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkMantenimiento, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkMantenimiento, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkMantenimiento.addMouseListener(botonI);
    }

    //Para rellenar un Gasto:suministros
    void botonSuministros(JTextField suministro, JTextField montoSum, JLabel iconoOkSuministros, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonImp = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 4));
                panelGasto.setBackground(Colores.epicColorBajito);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(550, 40));
                panelGasto.setPreferredSize(new Dimension(550, 100));;

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel sum = new JLabel();
                sum.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                sum.setText(suministro.getText());

                JLabel monto = new JLabel();
                monto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                monto.setText("$ " + montoSum.getText());

                JLabel icono = new JLabel();
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                Iconos.scaleImage("suministrosG", icono, 25);
                listaGastos.add(panelGasto, 1);
                panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

                botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto), "mantenimientoG", "src//excel/LibrosContables.xlsx", "Gastos");

                panelGasto.add(fecha);
                panelGasto.add(sum);
                panelGasto.add(monto);
                panelGasto.add(new JLabel(""));
                panelGasto.add(icono);

                String[] data = {(String) fechaActual(), "Suministros", (String) sum.getText(), monto.getText(), "", "VERDE", monto.getText()};

                Escribir escribirVentas = new Escribir();
                try {

                    escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);

                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaGastos.updateUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkSuministros, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkSuministros, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkSuministros.addMouseListener(botonImp);
    }

    //Para rellenar un Gasto:publicidad
    public void botonPublicidad(JTextField publicidad, JTextField montoPublicidad, JLabel iconoOkPublicidad, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonPub = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 4));
                panelGasto.setBackground(Colores.epicColorBajito);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(550, 40));
                panelGasto.setPreferredSize(new Dimension(550, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel pub = new JLabel();
                pub.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                pub.setText(publicidad.getText());

                JLabel monto = new JLabel();
                monto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                monto.setText("$ " + montoPublicidad.getText());

                JLabel icono = new JLabel();
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                Iconos.scaleImage("publicidadG", icono, 25);
                listaGastos.add(panelGasto, 1);
                panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

                botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto), "publicidadG", "src//excel/LibrosContables.xlsx", "Gastos");

                panelGasto.add(fecha);
                panelGasto.add(pub);
                panelGasto.add(monto);
                panelGasto.add(new JLabel(""));
                panelGasto.add(icono);

                String[] data = {(String) fechaActual(), "Mantenimiento", (String) pub.getText(), monto.getText(), "", "VERDE", monto.getText()};

                Escribir escribirVentas = new Escribir();
                try {

                    escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";

                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaGastos.updateUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkPublicidad, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkPublicidad, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkPublicidad.addMouseListener(botonPub);
    }

    //Para rellenar un Gasto:transporte
    public void botonTransporte(JTextField transporte, JTextField montoTrans, JLabel iconoOkTransporte, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonImp = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 4));
                panelGasto.setBackground(Colores.epicColorBajito);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(550, 40));
                panelGasto.setPreferredSize(new Dimension(550, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel trans = new JLabel();
                trans.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                trans.setText(transporte.getText());

                JLabel monto = new JLabel();
                monto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                monto.setText("$ " + montoTrans.getText());

                JLabel icono = new JLabel();
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                Iconos.scaleImage("transporteG", icono, 25);
                listaGastos.add(panelGasto, 1);
                panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

                botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto), "transporteG", "src//excel/LibrosContables.xlsx", "Gastos");

                panelGasto.add(fecha);
                panelGasto.add(trans);
                panelGasto.add(monto);
                panelGasto.add(new JLabel(""));
                panelGasto.add(icono);

                String[] data = {(String) fechaActual(), "Transporte", (String) trans.getText(), monto.getText(), "", "VERDE", monto.getText()};

                Escribir escribirVentas = new Escribir();
                try {

                    escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";

                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);

                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaGastos.updateUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkTransporte, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkTransporte, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkTransporte.addMouseListener(botonImp);
    }

    //Para rellenar un Gasto:Honorarios
    public void botonHonorarios(JTextField honorarios, JTextField montoHonor, JLabel iconoOkHonorarios, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonImp = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 4));
                panelGasto.setBackground(Colores.epicColorBajito);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(550, 40));
                panelGasto.setPreferredSize(new Dimension(550, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel hon = new JLabel();
                hon.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                hon.setText(honorarios.getText());

                JLabel monto = new JLabel();
                monto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                monto.setText("$ " + montoHonor.getText());

                JLabel icono = new JLabel();
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                Iconos.scaleImage("honorariosG", icono, 25);
                listaGastos.add(panelGasto, 1);
                panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

                botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto), "honorariosG", "src//excel/LibrosContables.xlsx", "Gastos");

                panelGasto.add(fecha);
                panelGasto.add(hon);
                panelGasto.add(monto);
                panelGasto.add(new JLabel(""));
                panelGasto.add(icono);

                String[] data = {(String) fechaActual(), "Honorarios", (String) hon.getText(), monto.getText(), "", "VERDE", monto.getText()};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";

                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula2, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);

                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaGastos.updateUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkHonorarios, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkHonorarios, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkHonorarios.addMouseListener(botonImp);
    }

    //Para rellenar un Gasto:reducInv
   

    //Para rellenar un Gasto:desechoEqui
    public void botonDesecho(JComboBox tipo, JLabel iconoOkDes, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre) {
        MouseListener botonImp = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 4));
                panelGasto.setBackground(Colores.epicColorBajito);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(550, 40));
                panelGasto.setPreferredSize(new Dimension(550, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel montoD = new JLabel();
                Escribir EscribirExcel = new Escribir();

                if (tipo.getSelectedItem().toString().equals("Inventario")) {
                    desecharInv inv = new desecharInv();
                    inv.setVisible(true);
                }

                if (tipo.getSelectedItem().toString().equals("Equipo y Mob.")) {
                    desecharEquipo eq = new desecharEquipo();
                    eq.setVisible(true);
                }

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaGastos.updateUI();

            }

            @Override
            public void mousePressed(MouseEvent e
            ) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e
            ) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e
            ) {
                Iconos.scaleImage("okh", iconoOkDes, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e
            ) {
                Iconos.scaleImage("ok", iconoOkDes, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkDes.addMouseListener(botonImp);
    }

    public void botonDev(JComboBox cliente, JComboBox ventas, String venta, JLabel iconoOkDev, JPanel listaIngresos, JPanel panelPadre, JPanel panelAbuelo) {
        MouseListener botonDev = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {

                    PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                    panelIngreso.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    panelIngreso.setLayout(new GridLayout(1, 5));
                    panelIngreso.setBackground(Colores.epicColorBajito);
                    panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                    panelIngreso.setMaximumSize(new Dimension(550, 40));
                    panelIngreso.setPreferredSize(new Dimension(550, 100));

                    JLabel fecha = new JLabel();
                    fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    fecha.setText(fechaActual());

                    JLabel dev = new JLabel();
                    dev.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    dev.setText(ventas.getSelectedItem().toString());
                    JLabel icono = new JLabel();
                    Iconos.scaleImage("inventarioG", icono, 30);
                    icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));

                    
                   
                    int folio = (int) LeerExcel.obtenerCeldaNumerica("src//excel/historialCompras.xlsx", cliente.getSelectedItem().toString(), 23, ventas.getSelectedIndex() + 1);
                    
                    String plataforma = LeerExcel.obtenerCelda("src\\excel\\Ventas.xlsx", fechaActualEscribir().toUpperCase(), 21, folio);
                    double precio = 0;
                    double variacion = LeerExcel.obtenerCeldaNumerica("src\\excel\\Ventas.xlsx", fechaActualEscribir().toUpperCase(), 20, folio);

                    switch (plataforma) {
                        case "Mercado Libre":
                            precio = LeerExcel.obtenerCeldaNumerica("src\\excel\\Ventas.xlsx", fechaActualEscribir().toUpperCase(), 14, folio);
                            break;
                        case "Local":
                            precio = LeerExcel.obtenerCeldaNumerica("src\\excel\\Ventas.xlsx", fechaActualEscribir().toUpperCase(), 9, folio);
                            break;
                    }
                    //REGRESAR VENTA A INVENTARIO
                    String mesVenta = LeerExcel.obtenerCelda("src//excel/historialCompras.xlsx", cliente.getSelectedItem().toString(), 2, ventas.getSelectedIndex() + 1);
                    Utilidades.revertirUnidades("src\\excel\\Ventas.xlsx", mesVenta, folio);
                    Escribir.removeRow("src//excel/historialCompras.xlsx", cliente.getSelectedItem().toString(), ventas.getSelectedIndex() + 1);

                    JLabel montoDevolucion = new JLabel();
                    montoDevolucion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    montoDevolucion.setText("$" + Double.toString(precio));

                    JLabel variacionL = new JLabel();
                    variacionL.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    variacionL.setText("$" + Double.toString(variacion));

                    listaIngresos.add(panelIngreso, 1);
                    panelesGastos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos
                    //  botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "inventarioG");
                    panelIngreso.add(fecha);
                    panelIngreso.add(dev);
                    panelIngreso.add(montoDevolucion);
                    panelIngreso.add(variacionL);
                    panelIngreso.add(icono);

                    String[] data = {(String) fechaActual(), "Devolucion", dev.getText(), Double.toString(precio), "   ", "VERDE", Double.toString(variacion)};

                    Escribir escribirVentas = new Escribir();

                    
                    escribirVentas.escribirExcelInv("src\\excel\\LibrosContables.xlsx", "Gastos", data, 7);
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[3])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 3);
                    escribirVentas.escribirCeldaDouble("src\\excel\\LibrosContables.xlsx", "Gastos", Utilidades.roundTwoDecimals(Double.valueOf(data[6])), LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"), 6);
                    String formula3 = "SUM(G2:G" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    String formula4 = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1) + ")";
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula3, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 6);
                    escribirVentas.escribirFormula("src\\excel\\LibrosContables.xlsx", "Gastos", formula4, (LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos") + 1), 3);
                } catch (IOException ex) {
                    Caption ventanaEx = new Caption("Recuerda cerrar Excel");
                    ventanaEx.setVisible(true);
                }

                indice++;
                panelPadre.removeAll();
                panelPadre.updateUI();
                listaIngresos.updateUI();

            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Iconos.scaleImage("okh", iconoOkDev, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDev, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkDev.addMouseListener(botonDev);
    }

    public static String fechaActual() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM");
        return formatoFecha.format(fecha).toUpperCase();
    }

    public void rellenarLibro(JPanel listaGastos) throws IOException {

        listaGastos.removeAll();
        JPanel TOP = new JPanel();
        TOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        TOP.setLayout(new GridLayout(1, 5));
        TOP.setBackground(Color.WHITE);
        TOP.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
        TOP.setMaximumSize(new Dimension(550, 40));
        TOP.setPreferredSize(new Dimension(550, 100));

        JLabel fechaTOP = new JLabel();
        fechaTOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        fechaTOP.setForeground(Colores.gris);
        fechaTOP.setText("FECHA");

        JLabel nombreTOP = new JLabel();
        nombreTOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        nombreTOP.setForeground(Colores.gris);
        nombreTOP.setText("");
        Iconos.scaleImage("mountain", nombreTOP, 30, 15);

        JLabel montoTOP = new JLabel();
        montoTOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        montoTOP.setForeground(Colores.gris);
        montoTOP.setText("MONTO");

        JLabel ingresosTOP = new JLabel();
        ingresosTOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        ingresosTOP.setForeground(Colores.gris);
        ingresosTOP.setText("VARIACIÓN");

        TOP.add(fechaTOP);
        TOP.add(nombreTOP);
        TOP.add(montoTOP);
        TOP.add(ingresosTOP);
        TOP.add(new JLabel(""));

        listaGastos.add(TOP, 0);
        if (!LeerExcel.tablaVacia("src\\excel\\LibrosContables.xlsx", "Gastos")) {
            try {
                for (int i = 1; i <= LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"); i++) {
                    PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                    panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    panelGasto.setLayout(new GridLayout(1, 5));
                    panelGasto.setBackground(Colores.epicColorBajito);
                    panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                    panelGasto.setMaximumSize(new Dimension(550, 40));
                    panelGasto.setPreferredSize(new Dimension(550, 100));

                    JLabel fecha = new JLabel();
                    fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    fecha.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 0, i));

                    JLabel dev = new JLabel();
                    dev.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    dev.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 2, i));

                    JLabel monto = new JLabel();
                    monto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    monto.setText("$" + LeerExcel.obtenerCeldaNumerica("src\\excel\\LibrosContables.xlsx", "Gastos", 3, i));

                    JLabel gasto = new JLabel();
                    gasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    gasto.setText("$" + LeerExcel.obtenerCeldaNumerica("src\\excel\\LibrosContables.xlsx", "Gastos", 6, i));

                    String IconoTipo = "VentasG";
                    String tipo = LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 1, i);
                    switch (tipo) {
                        case "Herramientas":
                            IconoTipo = "equipoG";
                            break;
                        case "Equipo de Taller":
                            IconoTipo = "equipoG";
                            break;
                        case "Mobiliario":
                            IconoTipo = "equipoG";
                            break;
                        case "Equipo de Limpieza":
                            IconoTipo = "equipoG";
                            break;
                        case "Inventario":
                            IconoTipo = "inventarioG";
                            break;
                        case "Pack de Ventas":
                            IconoTipo = "packsG";
                            break;
                        case "Compra en Transito":
                            IconoTipo = "Comprash";

                            break;
                        case "Deudas a Pagar":
                            IconoTipo = "DeudasPG_1";
                            break;
                        case "Impuesto":
                            IconoTipo = "impuestoG";
                            break;
                        case "Mantenimiento":
                            IconoTipo = "mantenimientoG";
                            break;
                        case "Transporte":
                            IconoTipo = "transporteG";
                            break;
                        case "Honorarios":
                            IconoTipo = "honorariosG";
                            break;
                        case "Reduccion de Inventario":
                            IconoTipo = "inventarioG";
                            break;
                    }
                    String colorR = LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 5, i);
                switch (colorR) {
                    case "VERDE":
                        panelGasto.setBackground(Colores.epicColorBajito);
                        Escribir escribir = new Escribir();
                        
                        break;
                    
                    case "GRIS":
                        panelGasto.setBackground(Colores.grisBajito);
                        break;

                }

                    iconoLibros = new JLabel();
                    Iconos.scaleImage(IconoTipo, iconoLibros, 30);
                    iconoLibros.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                    listaGastos.add(panelGasto, 1);
                    panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

                    panelGasto.add(fecha);
                    panelGasto.add(dev);
                    panelGasto.add(monto);
                    panelGasto.add(gasto);
                    panelGasto.add(iconoLibros);

                    indice++;
                    listaGastos.updateUI();

                }
            } catch (IOException ex) {
                Caption ventanaEx = new Caption("Recuerda cerrar Excel");
                ventanaEx.setVisible(true);
            }

        }
    }
    
    public void corte(JPanel listaGastos) throws IOException{
         listaGastos.removeAll();
        JPanel TOP = new JPanel();
        TOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        TOP.setLayout(new GridLayout(1, 5));
        TOP.setBackground(Color.WHITE);
        TOP.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
        TOP.setMaximumSize(new Dimension(550, 40));
        TOP.setPreferredSize(new Dimension(550, 100));

        JLabel fechaTOP = new JLabel();
        fechaTOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        fechaTOP.setForeground(Colores.gris);
        fechaTOP.setText("FECHA");

        JLabel nombreTOP = new JLabel();
        nombreTOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        nombreTOP.setForeground(Colores.gris);
        nombreTOP.setText("");
        Iconos.scaleImage("mountain", nombreTOP, 30, 15);

        JLabel montoTOP = new JLabel();
        montoTOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        montoTOP.setForeground(Colores.gris);
        montoTOP.setText("MONTO");

        JLabel ingresosTOP = new JLabel();
        ingresosTOP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        ingresosTOP.setForeground(Colores.gris);
        ingresosTOP.setText("VARIACIÓN");

        TOP.add(fechaTOP);
        TOP.add(nombreTOP);
        TOP.add(montoTOP);
        TOP.add(ingresosTOP);
        TOP.add(new JLabel(""));

        listaGastos.add(TOP, 0);
        if (!LeerExcel.tablaVacia("src\\excel\\LibrosContables.xlsx", "Gastos")) {
            try {
                for (int i = 1; i <= LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"); i++) {
                    PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                    panelGasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    panelGasto.setLayout(new GridLayout(1, 5));
                    panelGasto.setBackground(Colores.epicColorBajito);
                    panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                    panelGasto.setMaximumSize(new Dimension(550, 40));
                    panelGasto.setPreferredSize(new Dimension(550, 100));

                    JLabel fecha = new JLabel();
                    fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    fecha.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 0, i));

                    JLabel dev = new JLabel();
                    dev.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    dev.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 2, i));

                    JLabel monto = new JLabel();
                    monto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    monto.setText("$" + LeerExcel.obtenerCeldaNumerica("src\\excel\\LibrosContables.xlsx", "Gastos", 3, i));

                    JLabel gasto = new JLabel();
                    gasto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    gasto.setText("$" + LeerExcel.obtenerCeldaNumerica("src\\excel\\LibrosContables.xlsx", "Gastos", 6, i));

                    String IconoTipo = "VentasG";
                    String tipo = LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 1, i);
                    switch (tipo) {
                        case "Herramientas":
                            IconoTipo = "equipoG";
                            break;
                        case "Equipo de Taller":
                            IconoTipo = "equipoG";
                            break;
                        case "Mobiliario":
                            IconoTipo = "equipoG";
                            break;
                        case "Equipo de Limpieza":
                            IconoTipo = "equipoG";
                            break;
                        case "Inventario":
                            IconoTipo = "inventarioG";
                            break;
                        case "Pack de Ventas":
                            IconoTipo = "packsG";
                            break;
                        case "Compra en Transito":
                            IconoTipo = "Comprash";

                            break;
                        case "Deudas a Pagar":
                            IconoTipo = "DeudasPG_1";
                            break;
                        case "Impuesto":
                            IconoTipo = "impuestoG";
                            break;
                        case "Mantenimiento":
                            IconoTipo = "mantenimientoG";
                            break;
                        case "Transporte":
                            IconoTipo = "transporteG";
                            break;
                        case "Honorarios":
                            IconoTipo = "honorariosG";
                            break;
                        case "Reduccion de Inventario":
                            IconoTipo = "inventarioG";
                            break;
                    }
                    
                    String colorR = LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 5, i);
                switch (colorR) {
                    case "VERDE":
                        panelGasto.setBackground(Colores.grisBajito);
                        Escribir escribir = new Escribir();
                        escribir.escribirCelda("src\\excel\\LibrosContables.xlsx", "Gastos", "GRIS", i, 5);
                        break;
                    
                    case "GRIS":
                        panelGasto.setBackground(Colores.grisBajito);
                        break;

                }

                    iconoLibros = new JLabel();
                    Iconos.scaleImage(IconoTipo, iconoLibros, 30);
                    iconoLibros.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                    listaGastos.add(panelGasto, 1);
                    panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

                    panelGasto.add(fecha);
                    panelGasto.add(dev);
                    panelGasto.add(monto);
                    panelGasto.add(gasto);
                    panelGasto.add(iconoLibros);

                    indice++;
                    listaGastos.updateUI();

                }
            } catch (IOException ex) {
                Caption ventanaEx = new Caption("Recuerda cerrar Excel");
                ventanaEx.setVisible(true);
            }

        }
    }

}
/*cambios 
equisde 
equisde eequisde

*/
