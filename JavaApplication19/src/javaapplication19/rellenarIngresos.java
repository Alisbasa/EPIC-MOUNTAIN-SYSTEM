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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javaapplication19.Rellenar;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class rellenarIngresos {

    public List<JPanel> panelesIngresos;
    public int indice = 0;

    public List<String> deudoresCompras;

    private String excelLibros = rutas.excel+"/LibrosContables.xlsx";
    
    JLabel iconoVentas = new JLabel();
    static JLabel iconoDeudaC = new JLabel();
    static JLabel iconoLibrosRI = new JLabel();
    
    public rellenarIngresos() {
        panelesIngresos = new ArrayList<>();
        
    }

    void botonBorrar(JLabel boton, JPanel padre, JPanel hijo, int panelIndex, String img) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                padre.remove(hijo);
                panelesIngresos.remove(hijo);
                padre.updateUI();
                try {
                    Escribir.removeRow(rutas.excel+"/LibrosContables.xlsx", "Ingresos", LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"));
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

    void botonBorrarInd(JLabel boton, String filepath, String hoja) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Escribir.removeRow(filepath, hoja, LeerExcel.contarRenglones(filepath, hoja));
                    //Escribir.removeRow(rutas.excel+"/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Gastos"));
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

     static void botonBorrarClientes(JLabel boton, String filepath, String hoja) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Escribir.removeRow(filepath, hoja, LeerExcel.contarRenglones(filepath, hoja));
                    //Escribir.removeRow(rutas.excel+"/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Gastos"));
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
    
     static void botonBorrarDeudor(JLabel boton, String filepath, String hoja) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Escribir EscribirExcel = new Escribir();
                    Escribir.saldarDeuda(filepath, hoja, LeerExcel.obtenerIndexHoja(filepath, hoja));
                    String formula = "SUM(C2:C" + (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "DeudasPagar") + 1) + ")";
                    EscribirExcel.escribirFormula(rutas.excel+"/DeudasP.xlsx", "DeudasPagar", formula, (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "DeudasPagar") + 1), 2);
                    //Escribir.removeRow(rutas.excel+"/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Gastos"));
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
     
    static void botonBorrarDeudaP(JLabel boton, String filepath, String hoja, int indice, double monto) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Escribir EscribirExcel = new Escribir();
                    Double restaDeuda = LeerExcel.obtenerCeldaNumerica(filepath, "deudasPagar", 2, indice) - monto;
                    EscribirExcel.escribirCeldaDouble(filepath, "deudasPagar", restaDeuda, indice, 2);
                    Escribir.removeRow(filepath, hoja, LeerExcel.contarRenglones(filepath, hoja));
                    String formulaInd = "SUM(B2:B" + (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", hoja)) + ")";
                    EscribirExcel.escribirFormula(rutas.excel+"/DeudasP.xlsx", hoja, formulaInd, (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", hoja) + 1), 1);
                    
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

    static void revertirUnidades(JLabel boton, String filepath, String hoja) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    boolean finder = false;
                    String inventario7 = "EPIC MOUNTAIN";
                    for (int i = 0; i <= LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario7); i++) {
                        if ((LeerExcel.obtenerCelda(filepath, hoja, 0, LeerExcel.contarRenglones(filepath, hoja))).equals(LeerExcel.obtenerCelda(rutas.excel+"/Inventario.xlsx", inventario7, 0, i))) {
                            finder = true;
                            int suma = (int) (LeerExcel.obtenerCeldaNumerica(filepath, hoja, 6, LeerExcel.contarRenglones(filepath, hoja))) + (int) LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario7, 6, i);
                            Escribir escribirVentas = new Escribir();
                            escribirVentas.escribirCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario7, suma, i, 6);
                            double costoUnidad = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario7, 7, i);
                            double precioBaseUnidad = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario7, 9, i);
                            Double precioML = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario7, 13, i);
                            Double iva = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario7, 17, i);
                            Double comisionML = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario7, 15, i);
                            Double utilidadShop = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario7, 19, i);

                            //COSTO NETO
                            escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario7, (suma * costoUnidad), i, 8);
                            //PRECIO BASE NETO
                            escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario7, suma * (precioBaseUnidad), i, 10);
                            //PRECIO LOCAL NETO
                            Double precioNeto = escribirVentas.Mulitplicar(6, 11, i, rutas.excel+"/Inventario.xlsx", inventario7);
                            escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario7, precioNeto, i, 12);
                            //COMISION ML NETO

                            escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario7, comisionML * suma, i, 16);

                            //IVA NETO
                            escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario7, suma * iva, i, 18);
                            //PRECIOML NETO

                            escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario7, suma * precioML, i, 14);

                            //UTILIDAD LOCAL NETA
                            escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario7, suma * utilidadShop, i, 20);
                            
                            

                        }

                    }
                    if (finder == false) {
                        devolverUltimaVenta(fechaActualEscribir().toUpperCase());
                        formulas();

                    }

                    //Escribir.removeRow(rutas.excel+"/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Gastos"));
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

    //Pone ingreso: venta
    void botonVenta(JTextField monto, JComboBox inventario, JLabel iconoOkV, JScrollPane scrollIngresos, JPanel listaIngresos, JComboBox plataformacb, JComboBox cliente, JComboBox unidades, JPanel panelPadre) {
        MouseListener botonV = new MouseListener() {

            @Override
            @SuppressWarnings("empty-statement")
            public void mouseClicked(MouseEvent e) {
                try {
                    //CREANDO PANEL
                    scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                    panelIngreso.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    panelIngreso.setLayout(new GridLayout(1, 5));
                    panelIngreso.setBackground(Colores.epicColorBajito);
                    panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                    panelIngreso.setMaximumSize(new Dimension(550, 40));
                    panelIngreso.setPreferredSize(new Dimension(550, 100));
                    //FECHA
                    JLabel fecha = new JLabel();
                    fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    fecha.setText(fechaActual());
                    //INVENTARIO
                    JLabel inventarioLista = new JLabel();
                    
                    inventarioLista.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    inventarioLista.setText((String) inventario.getSelectedItem());
                    int numeroLista = inventario.getSelectedIndex() + 1;
                    int numeroPlataforma = 9;
                    if (plataformacb.getSelectedIndex() == 0) {
                        numeroPlataforma = 13;
                    }

                    //MONTO
                    String precioExcel = "precio";
                    String inventario8 = "EPIC MOUNTAIN";
                    precioExcel = String.valueOf(Utilidades.roundTwoDecimals(LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario8, numeroPlataforma, numeroLista) * (Integer.valueOf(unidades.getSelectedItem().toString()))));
                    JLabel precio = new JLabel();
                    precio.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    precio.setText("$" + precioExcel);
                    //UTILIDADES
                    String utilidadExcel = "precio";
                    utilidadExcel = String.valueOf(Utilidades.roundTwoDecimals(LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario8, 19, numeroLista) * (Integer.valueOf(unidades.getSelectedItem().toString()))));
                    JLabel utilidad = new JLabel();
                    utilidad.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    utilidad.setText("$" + utilidadExcel);
                    //PLATAFORMA
                    JLabel plataforma = new JLabel();
                    plataforma.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    plataforma.setText((String) plataformacb.getSelectedItem());
                    //ICONO
                    
                    Iconos.scaleImage("VentasG", iconoVentas, 25);
                    iconoVentas.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                    //BORRAR
                    botonBorrar(iconoVentas, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "ventasG");
                    revertirUnidades(iconoVentas, rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase());
                    botonBorrarInd(iconoVentas, rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase());
                    if(!cliente.getSelectedItem().toString().equals( "Nuevo Cliente")) 
                        botonBorrarClientes(iconoVentas, rutas.excel+"/historialCompras.xlsx", cliente.getSelectedItem().toString());
                    
//                try {
//                    //borrarVenta();
//                } catch (IOException ex) {
//                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
//                }

                    String[] data = {(String) fechaActual(), "Venta", (String) inventario.getSelectedItem(), precioExcel, plataforma.getText(), "VERDE", utilidadExcel};

                    Escribir escribirVentas = new Escribir();

                    //System.out.println(LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()));
                    escribirVentas.escribirExcelInv(rutas.excel+"/LibrosContables.xlsx", "Ingresos", data, 7);
                    
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(precioExcel)), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                    escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 3);
                    
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(utilidadExcel)), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                    escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula2, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 6);

                    if (cliente.getSelectedItem().toString() == "Nuevo Cliente") {
                        clienteNuevo clienteC = new clienteNuevo(inventario, unidades, plataformacb, cliente, iconoOkV);
                        clienteC.setVisible(true);
                        
                    } else {
                        vender(inventario, unidades, plataformacb, cliente.getSelectedItem().toString(), cliente);
                        historialCHH(cliente.getSelectedItem().toString(), cliente, plataformacb);
                    }
                    listaIngresos.add(panelIngreso, 1);
                    panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos
                    panelIngreso.add(fecha);
                    panelIngreso.add(inventarioLista);
                    panelIngreso.add(precio);
                    panelIngreso.add(utilidad);
                    panelIngreso.add(iconoVentas);
                    indice++;
                    panelPadre.removeAll();
                    panelPadre.updateUI();
                    listaIngresos.updateUI();
                    ActualizarInventarios actualiza =new ActualizarInventarios();
                    actualiza.setVisible(true);
                } catch (IOException ex) {
                    Caption ventanaEx = new Caption("Recuerda cerrar Excel");
                     Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
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
                Iconos.scaleImage("okh", iconoOkV, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkV, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkV.addMouseListener(botonV);
    }

    //Para rellenar un ingreso:credito
    void botonCredito(JTextField montoC, JTextField inversor, JLabel iconoOkC, JScrollPane scrollIngresos, JPanel listaIngresos, JPanel panelPadre) {
        MouseListener botonC = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {

                    scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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

                    JLabel credito = new JLabel();
                    credito.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    credito.setText(inversor.getText());

                    JLabel precio = new JLabel();
                    precio.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    precio.setText("$ " + montoC.getText());
                    
                    JLabel variacion = new JLabel();
                    variacion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    variacion.setText("$ " + montoC.getText());

                    JLabel icono = new JLabel();
                    Iconos.scaleImage("CreditoG", icono, 25);
                    icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                    listaIngresos.add(panelIngreso, 1);
                    panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos
                    botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "CreditoG");
                    botonBorrarDeudor(icono, rutas.excel+"/DeudasP.xlsx", inversor.getText());
                    botonBorrarInd(icono, rutas.excel+"/DeudasP.xlsx", "DeudasPagar");

                    panelIngreso.add(fecha);
                    panelIngreso.add(credito);
                    panelIngreso.add(precio);
                    panelIngreso.add(variacion);
                    panelIngreso.add(icono);

                    String[] data = {(String) fechaActual(), "Crédito", (String) inversor.getText(), montoC.getText(), "    ", "VERDE", montoC.getText()};

                    String[] deuda = {(String) fechaActual(), inversor.getText(), montoC.getText()};

                    Escribir escribirVentas = new Escribir();

                    escribirVentas.escribirExcelInv(rutas.excel+"/LibrosContables.xlsx", "Ingresos", data, 7);
                    
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(montoC.getText())), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                    escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 3);
                    
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(montoC.getText())), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                    escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula2, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 6);
                    
                    Escribir EscribirExcel = new Escribir();

                    EscribirExcel.escribirExcelInv(rutas.excel+"/DeudasP.xlsx", "DeudasPagar", deuda, 3);
                    EscribirExcel.escribirCeldaDouble(rutas.excel+"/DeudasP.xlsx", "DeudasPagar", Double.valueOf(deuda[2]), LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "DeudasPagar"), 2);
                    String formula3 = "SUM(C2:C" + (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "DeudasPagar") + 1) + ")";
                    EscribirExcel.escribirFormula(rutas.excel+"/DeudasP.xlsx", "DeudasPagar", formula3, (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "DeudasPagar") + 1), 2);
                    EscribirExcel.ruta(rutas.excel+"/DeudasP.xlsx", inversor.getText(), "FECHA", "MONTO");
                    String[] deudaInd = {fechaActual(), montoC.getText()};
                    EscribirExcel.escribirExcelInv(rutas.excel+"/DeudasP.xlsx", inversor.getText(), deudaInd, 2);
                    EscribirExcel.escribirCeldaDouble(rutas.excel+"/DeudasP.xlsx", inversor.getText(), Double.valueOf(montoC.getText()), (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", inversor.getText())), 1);
                    //String formula2 = "SUM(B2:B" + (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", inversor.getText())+1) + ")";
                    //EscribirExcel.escribirFormula(rutas.excel+"/DeudasP.xlsx", inversor.getText(), formula2, (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", inversor.getText())+1), 1);

                    indice++;
                    panelPadre.removeAll();
                    panelPadre.updateUI();
                    listaIngresos.updateUI();
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
                Iconos.scaleImage("okh", iconoOkC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkC.addMouseListener(botonC);
    }

    //Para rellenar un ingreso:inversion
    public void botonInversion(JTextField montoI, JTextField inversorI, JLabel iconoOkI, JScrollPane scrollIngresos, JPanel listaIngresos, JPanel panelPadre) {
        MouseListener botonI = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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

                    JLabel inversionista = new JLabel();
                    inversionista.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    inversionista.setText(inversorI.getText());

                    JLabel precioI = new JLabel();
                    precioI.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    precioI.setText("$" + montoI.getText());

                    JLabel variacion = new JLabel();
                    variacion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    variacion.setText("$" + montoI.getText());

                    JLabel icono = new JLabel();
                    Iconos.scaleImage("InversionG", icono, 25);
                    icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));

                    botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "inversionG");
                    botonBorrarDeudor(icono, rutas.excel+"/DeudasP.xlsx", inversorI.getText());

                    String[] data = {(String) fechaActual(), "Inversión", (String) inversorI.getText(), montoI.getText(), "    ", "VERDE", montoI.getText()};

                    Escribir escribirVentas = new Escribir();
                    try {
                        escribirVentas.escribirExcelInv(rutas.excel+"/LibrosContables.xlsx", "Ingresos", data, 7);
                        escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(montoI.getText())), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 3);
                        String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 3);

                        escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(montoI.getText())), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 6);
                        String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula2, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 6);
                    
                    } catch (IOException ex) {
                        Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String[] inversion = {(String) fechaActual(), inversorI.getText(), montoI.getText()};

                    Escribir EscribirExcel = new Escribir();

                    EscribirExcel.escribirExcelInv(rutas.excel+"/DeudasP.xlsx", "DeudasPagar", inversion, 3);
                    EscribirExcel.escribirCeldaDouble(rutas.excel+"/DeudasP.xlsx", "DeudasPagar", Double.valueOf(inversion[2]), LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "DeudasPagar"), 2);
                    String formula = "SUM(C2:C" + (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "DeudasPagar") + 1) + ")";
                    EscribirExcel.escribirFormula(rutas.excel+"/DeudasP.xlsx", "DeudasPagar", formula, (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "DeudasPagar") + 1), 2);
                    EscribirExcel.ruta(rutas.excel+"/DeudasP.xlsx", inversorI.getText(), "FECHA", "MONTO");
                    String[] deudaInd = {fechaActual(), montoI.getText()};
                    EscribirExcel.escribirExcelInv(rutas.excel+"/DeudasP.xlsx", inversorI.getText(), deudaInd, 2);
                    EscribirExcel.escribirCeldaDouble(rutas.excel+"/DeudasP.xlsx", inversorI.getText(), Double.valueOf(montoI.getText()), (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", inversorI.getText())), 1);

                    panelIngreso.add(fecha);
                    panelIngreso.add(inversionista);
                    panelIngreso.add(precioI);
                    panelIngreso.add(variacion);
                    panelIngreso.add(icono);
                    listaIngresos.add(panelIngreso, 1);
                    panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                    botonBorrarInd(icono, rutas.excel+"/DeudasP.xlsx", "DeudasPagar");

                    indice++;
                    panelPadre.removeAll();
                    panelPadre.updateUI();
                    listaIngresos.updateUI();
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
                Iconos.scaleImage("okh", iconoOkI, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkI, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkI.addMouseListener(botonI);
    }

    //Para rellenar un ingreso:impuesto
    public void botonImpuesto(JTextField montoImp, JTextField impuesto, JLabel iconoOkImp, JScrollPane scrollIngresos, JPanel listaIngresos, JPanel panelPadre) {
        MouseListener botonImp = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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

                JLabel imp = new JLabel();
                imp.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                imp.setText(impuesto.getText());

                JLabel montoImpuesto = new JLabel();
                montoImpuesto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                montoImpuesto.setText("$ " + montoImp.getText());
                
                JLabel variacion = new JLabel();
                    variacion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    variacion.setText("$" + montoImp.getText());

                JLabel icono = new JLabel();
                Iconos.scaleImage("impuestoG", icono, 30);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso, 1);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos
                botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "impuestoG");
                panelIngreso.add(fecha);
                panelIngreso.add(imp);
                panelIngreso.add(montoImpuesto);
                panelIngreso.add(variacion);
                panelIngreso.add(icono);

                String[] data = {(String) fechaActual(), "Impuesto a favor", (String) impuesto.getText(), montoImp.getText(), "    ", "VERDE", montoImp.getText()};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcelInv(rutas.excel+"/LibrosContables.xlsx", "Ingresos", data, 7);
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(montoImp.getText())), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                    escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 3);
                    
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(montoImp.getText())), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                    escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula2, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 6);
                    
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
                Iconos.scaleImage("okh", iconoOkImp, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkImp, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkImp.addMouseListener(botonImp);
    }

    //Para rellenar un ingreso: deuda a Cobrar
    public void botonDeudaC(JTextField montoDeuC, JComboBox deudor, JLabel iconoOkDeudasC, JScrollPane scrollIngresos, JPanel listaIngresos, JPanel panelPadre) {
        MouseListener botonDeuC = new MouseListener() {

            @Override
            @SuppressWarnings("empty-statement")
            public void mouseClicked(MouseEvent e) {
                try {
                    scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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

                    JLabel deuda = new JLabel();
                    deuda.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    deuda.setText((String) deudor.getSelectedItem());

                    JLabel montoDeudaC = new JLabel();
                    montoDeudaC.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    montoDeudaC.setText(montoDeuC.getText());

                    JLabel montoDeudaCPanel = new JLabel();
                    montoDeudaCPanel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    montoDeudaCPanel.setText("$" + montoDeuC.getText());

                    JLabel utilidadDeudaCPanel = new JLabel();
                    utilidadDeudaCPanel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    utilidadDeudaCPanel.setText("$" + montoDeuC.getText());

                    
                    Iconos.scaleImage("DeudasCG", iconoDeudaC, 30);
                    iconoDeudaC.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));

                    //Ingresa el panelVenta a la arraylist panelesInresos
                    botonBorrar(iconoDeudaC, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "DeudasCG");

                    String[] data = {(String) fechaActualConA(), Double.toString(Double.valueOf(montoDeudaC.getText()) * -1)};
                    String[] dataLibros = {(String) fechaActual(), "Deuda a Cobrar", (String) deuda.getText(), montoDeudaC.getText(), "", "VERDE", "0"};
                    Escribir escribirVentas = new Escribir();

                    

                      
                    

                    if (deudor.getSelectedItem().toString().equals("Nuevo")) {

                        String[] dataLibros2 = {(String) fechaActual(), "Nueva deuda", (String) deuda.getText(), montoDeudaC.getText(), "", "VERDE", "0"};
                       

                        DeudaCobrar deudorNuevo = new DeudaCobrar(montoDeudaC, dataLibros2);

                        deudorNuevo.setVisible(true);
                        panelIngreso.add(fecha);
                        panelIngreso.add(deuda);
                        panelIngreso.add(montoDeudaCPanel);
                        panelIngreso.add(utilidadDeudaCPanel);
                        panelIngreso.add(iconoDeudaC);

                    }else{
                        
                          //EXCEL INDIVIDUAL
                        escribirVentas.escribirExcelInv(rutas.excel+"/LibrosContables.xlsx", "Ingresos", dataLibros, 7);
                        
                       escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(0), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 3);
                        String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 3);

                        escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(montoDeudaC.getText())), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 6);
                        String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula2, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 6);
                    

                        escribirVentas.escribirExcelInv(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString(), data, 2);
                        escribirVentas.escribirCeldaDouble(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString(), Double.valueOf(montoDeudaC.getText()) * (-1), LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString()), 1);
                        String formula3 = escribirVentas.Sumar(2, (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString()) + 1), 'b');
                        escribirVentas.escribirFormula(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString(), formula3, (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString()) + 1), 1);

                        Double suma = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString(), 1, (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString()) + 1));
                        escribirVentas.escribirCeldaDouble(rutas.excel+"/DeudasC.xlsx", "deudasCobrar", suma, deudor.getSelectedIndex()+1, 2);
                        String formulaLibro = "SUM(C2:C" + (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", "deudasCobrar")) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/DeudasC.xlsx", "deudasCobrar", formulaLibro, (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", "deudasCobrar") + 1), 2);

                        listaIngresos.add(panelIngreso, 1);
                        panelesIngresos.add(panelIngreso);

                        panelIngreso.add(fecha);
                        panelIngreso.add(deuda);
                        panelIngreso.add(montoDeudaCPanel);
                        utilidadDeudaCPanel.setText("$0.00");

                        panelIngreso.add(utilidadDeudaCPanel);
                        panelIngreso.add(iconoDeudaC);
                        
                    
                        if (Double.valueOf(LeerExcel.obtenerCeldaFormula(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString(),(LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", deudor.getSelectedItem().toString())+1), 1)) == 0) {
                            Escribir.saldarDeuda(rutas.excel+"/DeudasC.xlsx", "deudasCobrar", deudor.getSelectedIndex()+1);
                            
                        }
                    }   
                    
                    indice++;
                    panelPadre.removeAll();
                    panelPadre.updateUI();
                    listaIngresos.updateUI();
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
                Iconos.scaleImage("okh", iconoOkDeudasC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDeudasC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };
        iconoOkDeudasC.addMouseListener(botonDeuC);
    }

    //Pone ingreso: venta
    void botonVentaC(JTextField monto, JComboBox inventario, JLabel iconoOkVentasC, JScrollPane scrollIngresos, JPanel listaIngresos, JComboBox plataformacb, JComboBox cliente, JComboBox unidades, JPanel panelPadre) {
        MouseListener botonVC = new MouseListener() {

            @Override
            @SuppressWarnings("empty-statement")
            public void mouseClicked(MouseEvent e) {
                try {
                    scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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

                    JLabel inventarioLista = new JLabel();
                    inventarioLista.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    inventarioLista.setText((String) inventario.getSelectedItem());
                    int numeroLista = inventario.getSelectedIndex() + 1;
                    int numeroPlataforma = 9;
                    if (plataformacb.getSelectedIndex() == 0) {
                        numeroPlataforma = 13;
                    }

                    String precioExcel = "precio";
                    String inventario14 = "EPIC MOUNTAIN";

                    precioExcel = String.valueOf(LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario14, numeroPlataforma, numeroLista) * (unidades.getSelectedIndex() + 1));

                    String utilidadExcel = "precio";

                    utilidadExcel = String.valueOf(Utilidades.roundTwoDecimals(LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario14, 19, numeroLista) * (Integer.valueOf(unidades.getSelectedItem().toString()))));

                    JLabel precio = new JLabel();
                    precio.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));

                    precio.setText("$" + precioExcel);

                    JLabel utilidad = new JLabel();
                    utilidad.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));

                    utilidad.setText("$" + utilidadExcel);

                    JLabel plataforma = new JLabel();
                    plataforma.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    plataforma.setText((String) plataformacb.getSelectedItem());

                    JLabel icono = new JLabel();
                    Iconos.scaleImage("ventasC", icono, 25);
                    icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                    ;//Ingresa el panelVenta a la arraylist panelesInresos

                    
//                

                    String[] data = {(String) fechaActual(), "Venta a Cobrar", (String) inventario.getSelectedItem(), precioExcel, plataforma.getText(), "VERDE", utilidadExcel};

                    Escribir escribirVentas = new Escribir();

                    escribirVentas.escribirExcelInv(rutas.excel+"/LibrosContables.xlsx", "Ingresos", data,7);
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(precioExcel)), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                    escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 3);
                    
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Utilidades.roundTwoDecimals(Double.valueOf(utilidadExcel)), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 6);
                    String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                    escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula2, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 6);
                    
                    //Condicional para verificar que exista la hoja y si es asi escriba en la existente
                    String[] hojas = LeerExcel.obtenerHoja(rutas.excel+"/DeudasC.xlsx");
                    String stCliente = cliente.getSelectedItem().toString();

                    boolean hojaEncontrada = false;
                    for (int i = 0; i < LeerExcel.obtenerNumeroHojas(rutas.excel+"/DeudasC.xlsx"); i++) {
                        if (hojas[i].equals(cliente.getSelectedItem().toString())) {
                            hojaEncontrada = true;
                            Double suma = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/DeudasC.xlsx", "deudasCobrar", 2, i) + Double.valueOf(precioExcel);
                            escribirVentas.escribirCeldaDouble(rutas.excel+"/DeudasC.xlsx", "deudasCobrar", suma, LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", "deudasCobrar"), 2);
                        }
                        //escribirVentas.crearHoja(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString(), "FECHA", "MONTO");
                    }
                    if (hojaEncontrada == true) {
                        //Escribe en Excel individual y crea hoja
                        String[] ventaInd = {fechaActual(), precioExcel};
                        escribirVentas.escribirExcelInv(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString(), ventaInd, 2);
                        escribirVentas.escribirCeldaDouble(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString(), Double.valueOf(precioExcel), LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString()), 1);
                        String formulaInd = "SUM(B2:B" + (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString()) + 1) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString(), formulaInd, (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString()) + 1), 1);

                        //Escribe en Excel general deudasCobrar                       
                        String formulaD = escribirVentas.Sumar(2, LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", "deudasCobrar") + 1, 'c');
                        escribirVentas.escribirFormula(rutas.excel+"/DeudasC.xlsx", "deudasCobrar", formulaD, (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", "deudasCobrar") + 1), 2);
                        vender(inventario, unidades, plataformacb, cliente.getSelectedItem().toString(), cliente);
                        historialCHH(stCliente, cliente, plataformacb);
                    } else if (cliente.getSelectedItem().toString().equals("Nuevo Cliente")) {
                        clienteNuevoCobrar clienteN = new clienteNuevoCobrar(precioExcel, inventario, unidades, plataformacb, cliente);
                        clienteN.setVisible(true);

                    } else {
                        //Escribe en Excel individual y crea hoja
                        escribirVentas.ruta(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString(), "FECHA", "MONTO");
                        String[] ventaInd = {fechaActual(), precioExcel};
                        escribirVentas.escribirExcelInv(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString(), ventaInd, 2);
                        escribirVentas.escribirCeldaDouble(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString(), Double.valueOf(precioExcel), LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString()), 1);
                        String formulaInd = "SUM(B2:B" + LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString()) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString(), formulaInd, (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", cliente.getSelectedItem().toString()) + 1), 1);

                        //Escribe en Excel general deudasCobrar
                        String[] ventaC = {fechaActual(), cliente.getSelectedItem().toString(), precioExcel};
                        escribirVentas.escribirExcelInv(rutas.excel+"/DeudasC.xlsx", "deudasCobrar", ventaC, 3);
                        escribirVentas.escribirCeldaDouble(rutas.excel+"/DeudasC.xlsx", "deudasCobrar", Double.valueOf(precioExcel), LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", "deudasCobrar"), 2);
                        String formulaC = escribirVentas.Sumar(2, LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", "deudasCobrar"), 'c');
                        escribirVentas.escribirFormula(rutas.excel+"/DeudasC.xlsx", "deudasCobrar", formulaC, (LeerExcel.contarRenglones(rutas.excel+"/DeudasC.xlsx", "deudasCobrar") + 1), 2);
                        vender(inventario, unidades, plataformacb, cliente.getSelectedItem().toString(), cliente);

                        historialCHH(stCliente, cliente, plataformacb);
                    }
                    
                    botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "Ventas");
                    revertirUnidades(icono, rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase());
                    //Para borrar de Ventas a cobrar la fila de excel general y hoja individual

                    
                    botonBorrarInd(icono, rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase());
                    //FALTA BORRAR DEUDA C

                    
                    
                    panelIngreso.add(fecha);
                    panelIngreso.add(inventarioLista);
                    panelIngreso.add(precio);
                    panelIngreso.add(utilidad);
                    panelIngreso.add(icono);
                    listaIngresos.add(panelIngreso, 1);
                    panelesIngresos.add(panelIngreso);
                    indice++;
                    panelPadre.removeAll();
                    panelPadre.updateUI();
                    listaIngresos.updateUI();

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
                Iconos.scaleImage("okh", iconoOkVentasC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkVentasC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkVentasC.addMouseListener(botonVC);
    }

    //Para rellenar un ingreso: Deuda Pagar Existente
    public void botonDeuPE(JTextField montoDeuPE, JComboBox deudasPE, JLabel iconoOkDeuPE, JScrollPane scrollIngresos, JPanel listaIngresos, JPanel panelPadre) {
        MouseListener botonDPE = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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

                    JLabel deudor = new JLabel();
                    deudor.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    deudor.setText(deudasPE.getSelectedItem().toString());

                    JLabel montoDeuda = new JLabel();
                    montoDeuda.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    montoDeuda.setText("$" + montoDeuPE.getText());

                    JLabel variacion = new JLabel();
                    variacion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    variacion.setText("$" + montoDeuPE.getText());

                    
                    JLabel icono = new JLabel();
                    Iconos.scaleImage("DeudasPG", icono, 25);
                    icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));

                    botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "DeudasPG");

                    String[] data = {(String) fechaActual(), "Deuda a Pagar", (String) deudasPE.getSelectedItem().toString(), montoDeuPE.getText(), "    ", "VERDE", montoDeuPE.getText()};
                    Escribir escribirVentas = new Escribir();
                    //Escribe en Excel individual y crea hoja
                    
                    
                    String[] ventaInd = {fechaActual(), montoDeuPE.getText()};
                    escribirVentas.escribirExcelInv(rutas.excel+"/DeudasP.xlsx", deudasPE.getSelectedItem().toString(), ventaInd, 2);
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/DeudasP.xlsx", deudasPE.getSelectedItem().toString(), Double.valueOf(montoDeuPE.getText()), LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", deudasPE.getSelectedItem().toString()), 1);
                    String formulaInd = "SUM(B2:B" + (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", deudasPE.getSelectedItem().toString()) + 1) + ")";
                    escribirVentas.escribirFormula(rutas.excel+"/DeudasP.xlsx", deudasPE.getSelectedItem().toString(), formulaInd, (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", deudasPE.getSelectedItem().toString()) + 1), 1);
                    
                    Double suma = (LeerExcel.obtenerCeldaNumerica(rutas.excel+"/DeudasP.xlsx", "deudasPagar", 2, (deudasPE.getSelectedIndex()+2))) + (Double.valueOf(montoDeuPE.getText()));
                    escribirVentas.escribirCeldaDouble(rutas.excel+"/DeudasP.xlsx", "deudasPagar", suma, (deudasPE.getSelectedIndex()+2), 2);
                    
                    //Escribe en Excel general deudasPagar                      
                    String formula = escribirVentas.Sumar(2, LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "deudasPagar") + 1, 'c');
                    escribirVentas.escribirFormula(rutas.excel+"/DeudasP.xlsx", "deudasPagar", formula, (LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", "deudasPagar") + 1), 2);

                    try {
                        escribirVentas.escribirExcelInv(rutas.excel+"/LibrosContables.xlsx", "Ingresos", data,7);
                        escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Double.valueOf(montoDeuPE.getText()), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 3);
                        String formula2 = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula2, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 3);

                        escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Double.valueOf(montoDeuPE.getText()), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 6);
                        String formula3 = "SUM(G2:G" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula3, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 6);
                    
                    } catch (IOException ex) {
                        Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    panelIngreso.add(fecha);
                    panelIngreso.add(deudor);
                    panelIngreso.add(montoDeuda);
                    panelIngreso.add(variacion);
                    panelIngreso.add(icono);
                    listaIngresos.add(panelIngreso, 1);
                    panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos
                    
                    if(LeerExcel.contarRenglones(rutas.excel+"/DeudasP.xlsx", deudasPE.getSelectedItem().toString()) == 1){
                        botonBorrarDeudor(icono, rutas.excel+"/DeudasP.xlsx", deudasPE.getSelectedItem().toString());    
                    }else{
                        Double monto = Double.valueOf(montoDeuPE.getText());
                        botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "DeudasPG");
                        botonBorrarDeudaP(icono, rutas.excel+"/DeudasP.xlsx", deudasPE.getSelectedItem().toString(), (deudasPE.getSelectedIndex()+2), monto);
                        
                    }
                    
                    indice++;
                    panelPadre.removeAll();
                    panelPadre.updateUI();
                    listaIngresos.updateUI();
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
                Iconos.scaleImage("okh", iconoOkDeuPE, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDeuPE, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkDeuPE.addMouseListener(botonDPE);
    }

    //Pone Ingreso: Aportacion
    void botonAport(JComboBox tipoAport, JTextField producto, JTextField montoAport, JComboBox tipoEquipo, JTextField descripcion, JLabel iconoOkAport, JScrollPane scrollIngresos, JPanel listaIngresos, JPanel panelPadre) {
        MouseListener botonV = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try {

                    scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                    PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                    panelIngreso.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    panelIngreso.setLayout(new GridLayout(1, 5));
                    panelIngreso.setBackground(Colores.epicColorBajito);
                    panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                    panelIngreso.setMaximumSize(new Dimension(550, 40));
                    panelIngreso.setPreferredSize(new Dimension(550, 100));;

                    JLabel fecha = new JLabel();
                    fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    fecha.setText(fechaActual());

                    JLabel productoA = new JLabel();
                    productoA.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    productoA.setText(producto.getText());

                    JLabel montoA = new JLabel();
                    montoA.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    montoA.setText(montoAport.getText());
                    JLabel montoAP = new JLabel();
                    montoAP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    montoAP.setText("$" + montoAport.getText());

                    JLabel variacion = new JLabel();
                    variacion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                    variacion.setText("$" + montoAport.getText());

                    JLabel icono = new JLabel();

                    icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));

                    if (tipoAport.getSelectedItem().toString().equals("Inventario Principal")) {
                        inventarioPrincipalReg inv = new inventarioPrincipalReg(productoA, montoA);
                        inv.setVisible(true);
                        Iconos.scaleImage("inventarioG", icono, 25);
                        botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "inventarioG");
                        botonBorrarInd(icono, rutas.excel+"/Inventario.xlsx", "Inventario");
                    } else {
                        Iconos.scaleImage("equipoG", icono, 25);
                        if (tipoEquipo.getSelectedItem().toString().equals("Herramientas")) {

                            String[] equipo = {(String) fechaActual(), producto.getText(), descripcion.getText(), montoAport.getText()};
                            Escribir EscribirExcel = new Escribir();

                            EscribirExcel.escribirExcelInv(rutas.excel+"/Equipo.xlsx", "Herramientas", equipo, 4);
                            EscribirExcel.escribirCeldaDouble(rutas.excel+"/Equipo.xlsx", "Herramientas", Double.valueOf(montoAport.getText()), LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Herramientas"), 3);
                            String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Herramientas") + 1) + ")";
                            EscribirExcel.escribirFormula(rutas.excel+"/Equipo.xlsx", "Herramientas", formula, LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Herramientas") + 1, 3);
                            botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "equipoG");
                            botonBorrarInd(icono, rutas.excel+"/Equipo.xlsx", tipoEquipo.getSelectedItem().toString());
                        } else if (tipoEquipo.getSelectedItem().toString().equals("Equipo de Taller")) {

                            String[] equipo = {(String) fechaActual(), producto.getText(), descripcion.getText(), montoAport.getText()};
                            Escribir EscribirExcel = new Escribir();

                            EscribirExcel.escribirExcelInv(rutas.excel+"/Equipo.xlsx", "Equipo de Taller", equipo, 4);
                            EscribirExcel.escribirCeldaDouble(rutas.excel+"/Equipo.xlsx", "Equipo de Taller", Double.valueOf(montoAport.getText()), LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Equipo de Taller"), 3);
                            String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Equipo de Taller") + 1) + ")";
                            EscribirExcel.escribirFormula(rutas.excel+"/Equipo.xlsx", "Equipo de Taller", formula, (LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Equipo de Taller") + 1), 3);
                            botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "equipoG");
                            botonBorrarInd(icono, rutas.excel+"/Equipo.xlsx", tipoEquipo.getSelectedItem().toString());
                        } else if (tipoEquipo.getSelectedItem().toString().equals("Mobiliario")) {

                            String[] equipo = {(String) fechaActual(), producto.getText(), descripcion.getText(), montoAport.getText()};
                            Escribir EscribirExcel = new Escribir();

                            EscribirExcel.escribirExcelInv(rutas.excel+"/Equipo.xlsx", "Mobiliario", equipo, 4);
                            EscribirExcel.escribirCeldaDouble(rutas.excel+"/Equipo.xlsx", "Mobiliario", Double.valueOf(montoAport.getText()), LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Mobiliario"), 3);
                            String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Mobiliario") + 1) + ")";
                            EscribirExcel.escribirFormula(rutas.excel+"/Equipo.xlsx", "Mobiliario", formula, (LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Mobiliario") + 1), 3);
                            botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "equipoG");
                            botonBorrarInd(icono, rutas.excel+"/Equipo.xlsx", tipoEquipo.getSelectedItem().toString());
                        } else if (tipoEquipo.getSelectedItem().toString().equals("Equipo de Limpieza")) {

                            String[] equipo = {(String) fechaActual(), producto.getText(), descripcion.getText(), montoAport.getText()};
                            Escribir EscribirExcel = new Escribir();

                            EscribirExcel.escribirExcelInv(rutas.excel+"/Equipo.xlsx", "Equipo de Limpieza", equipo, 4);
                            EscribirExcel.escribirCeldaDouble(rutas.excel+"/Equipo.xlsx", "Equipo de Limpieza", Double.valueOf(montoAport.getText()), LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Equipo de Limpieza"), 3);
                            String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Equipo de Limpieza") + 1) + ")";
                            EscribirExcel.escribirFormula(rutas.excel+"/Equipo.xlsx", "Equipo de Limpieza", formula, (LeerExcel.contarRenglones(rutas.excel+"/Equipo.xlsx", "Equipo de Limpieza") + 1), 3);
                            botonBorrar(icono, listaIngresos, panelIngreso, panelesIngresos.indexOf(panelIngreso), "equipoG");
                            botonBorrarInd(icono, rutas.excel+"/Equipo.xlsx", tipoEquipo.getSelectedItem().toString());
                        }
                        String[] data = {(String) fechaActual(), "Aportacion EyM", producto.getText(), montoA.getText(), "  ", "VERDE", montoA.getText()};

                        Escribir escribirVentas = new Escribir();

                        escribirVentas.escribirExcelInv(rutas.excel+"/LibrosContables.xlsx", "Ingresos", data,7);
                        escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Double.valueOf(montoA.getText()), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 3);
                        String formula = "SUM(D2:D" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 3);

                        escribirVentas.escribirCeldaDouble(rutas.excel+"/LibrosContables.xlsx", "Ingresos", Double.valueOf(montoA.getText()), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), 6);
                        String formula2 = "SUM(G2:G" + (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1) + ")";
                        escribirVentas.escribirFormula(rutas.excel+"/LibrosContables.xlsx", "Ingresos", formula2, (LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos") + 1), 6);
                    
                    }

                    panelIngreso.add(fecha);
                    panelIngreso.add(productoA);
                    panelIngreso.add(montoAP);
                    panelIngreso.add(variacion);
                    panelIngreso.add(icono);
                    listaIngresos.add(panelIngreso, 1);
                    panelesIngresos.add(panelIngreso);

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
                Iconos.scaleImage("okh", iconoOkAport, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkAport, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkAport.addMouseListener(botonV);
    }
    
    void botonServicios(JComboBox tipoServicios,  JComboBox cliente, JLabel iconoOkV, JScrollPane scrollIngresos, JPanel listaIngresos, JPanel panelPadre) {
        MouseListener botonV = new MouseListener() {

            @Override
            @SuppressWarnings("empty-statement")
            public void mouseClicked(MouseEvent e) {
               
                      

                    if (cliente.getSelectedItem().toString() == "Nuevo Cliente") {
                        SERVICIOS ventanaS = new SERVICIOS(tipoServicios.getSelectedItem().toString(),cliente);
                    ventanaS.setVisible(true);
                        
                    } else {
                       botonBorrarClientes(iconoVentas, rutas.excel+"/historialCompras.xlsx", cliente.getSelectedItem().toString());

                                                
                        
                        
                         SERVICIOS ventanaS = new SERVICIOS(tipoServicios.getSelectedItem().toString(),cliente);
                    ventanaS.setVisible(true);
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
                Iconos.scaleImage("okh", iconoOkV, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkV, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkV.addMouseListener(botonV);
    }

    public static String fechaActual() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM");
        return formatoFecha.format(fecha).toUpperCase();
    }

    public static String fechaActualEscribir() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MMMM");
        return formatoFecha.format(fecha);
    }

    public void rellenarLibro(JPanel listaIngresos) throws IOException {
        listaIngresos.removeAll();
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

        listaIngresos.add(TOP, 0);

        if (!LeerExcel.tablaVacia(rutas.excel+"/LibrosContables.xlsx", "Ingresos")) {

            for (int i = 1; i <= LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"); i++) {
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.epicColorBajito);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(550, 40));
                panelIngreso.setPreferredSize(new Dimension(550, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(LeerExcel.obtenerCelda(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 0, i));

                JLabel dev = new JLabel();
                dev.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                dev.setText(LeerExcel.obtenerCelda(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 2, i));

                JLabel montoDevolucion = new JLabel();
                montoDevolucion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                montoDevolucion.setText("$" + LeerExcel.obtenerCeldaNumerica(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 3, i));

                JLabel plataforma = new JLabel();
                plataforma.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                plataforma.setText("$" + LeerExcel.obtenerCeldaNumerica(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 6, i));

                String IconoTipo = "VentasG";
                String tipo = LeerExcel.obtenerCelda(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 1, i);
                switch (tipo) {
                    case "Venta":
                        IconoTipo = "VentasG";
                        break;
                    case "Inversión":
                        IconoTipo = "inversionG";
                        break;
                    case "Crédito":
                        IconoTipo = "CreditoG";
                        break;
                    case "Deuda a Cobrar":
                        IconoTipo = "DeudasCG";

                        break;
                    case "Nueva deuda":
                        IconoTipo = "DeudasC";

                        break;

                    case "Impuesto a favor":
                        IconoTipo = "impuestoG";
                        break;
                    case "Venta a Cobrar":
                        IconoTipo = "ventasC";

                        break;
                    case "Devolucion":
                        IconoTipo = "devolucionG";
                        break;
                    case "Deuda a Pagar":
                        IconoTipo = "DeudasPG";
                        break;
                    case "Aportacion Inv":
                        IconoTipo = "inventarioG";
                        break;
                    case "Aportacion EyM":
                        IconoTipo = "equipoG";
                        break;
                }

                String colorR = LeerExcel.obtenerCelda(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 5, i);
                switch (colorR) {
                    case "VERDE":
                        panelIngreso.setBackground(Colores.epicColorBajito);
                        break;
                    /*case "AMARILLO":
                        panelIngreso.setBackground(Colores.amarillo);
                        break;*/
                    case "GRIS":
                        panelIngreso.setBackground(Colores.grisBajito);
                        break;

                }

                JLabel iconoLibrosRI = new JLabel();
                Iconos.scaleImage(IconoTipo, iconoLibrosRI, 30);
                iconoLibrosRI.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso, 1);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(dev);
                panelIngreso.add(montoDevolucion);
                panelIngreso.add(plataforma);
                panelIngreso.add(iconoLibrosRI);

                indice++;
                listaIngresos.updateUI();
            }
        }

    }

    public void vender(JComboBox inventario, JComboBox unidadesCB, JComboBox medioVenta, String cliente, JComboBox clienteCB) throws IOException {
        String fecha = fechaActual();

        int seleccion = inventario.getSelectedIndex() + 1;
        try {
            String inventario9 = "EPIC MOUNTAIN";
            String venta = LeerExcel.obtenerCelda(rutas.excel+"/inventario.xlsx", inventario9, 0, seleccion);
            String descripion = LeerExcel.obtenerCelda(rutas.excel+"/inventario.xlsx", inventario9, 1, seleccion);
            String condicion = LeerExcel.obtenerCelda(rutas.excel+"/inventario.xlsx", inventario9, 3, seleccion);
            String pack = LeerExcel.obtenerCelda(rutas.excel+"/inventario.xlsx", inventario9, 4, seleccion);
            double tig = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario9, 5, seleccion);
            String unidades = unidadesCB.getSelectedItem().toString();
            String costoUnidad = Double.toString(LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario9, 7, seleccion));

            String costoNeto = Double.toString(Integer.parseInt(unidades) * Double.parseDouble(costoUnidad));
            String precioBaseUnidad = Double.toString(LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario9, 9, seleccion));
            String precioBaseNeto = Double.toString(Integer.parseInt(unidades) * Double.parseDouble(precioBaseUnidad));

            String[] data = {venta, descripion, fecha, condicion, pack, Double.toString(tig), unidades, costoUnidad, costoNeto, precioBaseUnidad, precioBaseNeto};

            Escribir escribirVentas = new Escribir();

            //Escribe arreglo de Strings
            escribirVentas.escribirExcelInv(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), data, 10);

            //escribirVentas.escribirCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"), LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 23);
            //Escribe unidades como int
            escribirVentas.escribirCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), Integer.valueOf(data[6]), LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 6);

            //Escribe costo*unidad como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), Double.valueOf(data[7]), LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 7);

            //Escribe costo neto como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), Double.valueOf(data[8]), LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 8);

            //Escribe preciobase*unidad como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), Double.valueOf(data[9]), LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 9);

            //Escribe tig como double
            Double tigBien = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 9, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase())) / LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 7, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), tigBien, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 5);

            //Escribe precio base neto como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), Double.valueOf(data[10]), LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 10);

            //Escribe precio shop*unidad como double
            Double precioShop = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, 11, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), precioShop, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 11);

            //Escribe precio shop neto como doble
            Double precioShopN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, 12, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), precioShopN, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 12);

            //Escribe precio Ml por unidad como doble
            Double precioML = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, 13, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), precioML, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 13);

            //Escribe precio Ml neto como doble
            Double precioMLN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, 14, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), precioMLN, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 14);

            //Escribe comision ML como doble
            Double comisionML = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, 15, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), comisionML, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 15);

            //Escribe comison ML neta
            Double comisionMLN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, 16, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), comisionMLN, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 16);

            //Escribe IVA * unidad
            Double iva = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, 17, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), iva, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 17);

            //Escribe IVA neto
            Double ivaN = iva * Integer.valueOf(unidades);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), ivaN, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 18);

            //Escribe utilidadShop * unidad
            Double utilidadShop = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, 19, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), utilidadShop, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 19);

            //Escribe utilidadShop neta
            Double utilidadShopN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, 20, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), utilidadShopN, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 20);

            //Escribe utilidad ML * unidad
            //Escribe medio de venta
            escribirVentas.escribirCelda(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), medioVenta.getSelectedItem().toString(), LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 21);

            //Escribe destino
            String destino = LeerExcel.obtenerCelda(rutas.excel+"/CRM.xlsx", "CLIENTES", 3, clienteCB.getSelectedIndex() + 1);
            escribirVentas.escribirCelda(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), destino, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 22);

            //Escribe formula de costo neto en suma
            String formula = "SUM(I2:I" + (LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), formula, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1, 8);

            //Escribe formula de precio base neto en suma
            String formula2 = "SUM(K2:K" + (LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), formula2, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1, 10);

            //Escribe formula de precio local neto en suma
            String formula3 = "SUM(M2:M" + (LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), formula3, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1, 12);

            //Escribe formula de precio ml neto en suma
            String formula4 = "SUM(O2:O" + (LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), formula4, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1, 14);

            //Escribe formula de comision ml neta en suma
            String formula5 = "SUM(Q2:Q" + (LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), formula5, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1, 16);

            //Escribe formula de IVA neta en suma
            String formula6 = "SUM(S2:S" + (LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), formula6, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1, 18);

            //Escribe formula de utilidad local neta en suma
            String formula7 = "SUM(U2:U" + (LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), formula7, LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()) + 1, 20);

            int restaUnidades = unidadesCB.getItemCount() - Integer.valueOf(unidades);

            // escribirVentas.borrarCelda(rutas.excel+"/Inventario.xlsx", "Inventario", unidadesCB.getSelectedIndex(), 6);
            if (restaUnidades == 0) {
                Escribir.removeRow(rutas.excel+"/Inventario.xlsx", inventario9, inventario.getSelectedIndex() + 1);
            } else {
                escribirVentas.escribirCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario9, restaUnidades, inventario.getSelectedIndex() + 1, 6);
                //COSTO NETO
                escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario9, (restaUnidades * Double.valueOf(costoUnidad)), inventario.getSelectedIndex() + 1, 8);
                //PRECIO BASE NETO
                escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario9, restaUnidades * Double.valueOf(precioBaseUnidad), inventario.getSelectedIndex() + 1, 10);
                //PRECIO LOCAL NETO
                Double precioNeto = escribirVentas.Mulitplicar(6, 11, inventario.getSelectedIndex() + 1, rutas.excel+"/Inventario.xlsx", inventario9);
                escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario9, precioNeto, inventario.getSelectedIndex() + 1, 12);
                //COMISION ML NETO

                escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario9, comisionML * restaUnidades, inventario.getSelectedIndex() + 1, 16);

                //IVA NETO
                escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario9, restaUnidades * iva, inventario.getSelectedIndex() + 1, 18);
                //PRECIOML NETO

                escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario9, restaUnidades * precioML, inventario.getSelectedIndex() + 1, 14);

                //UTILIDAD LOCAL NETA
                escribirVentas.escribirCeldaDouble(rutas.excel+"/Inventario.xlsx", inventario9, restaUnidades * utilidadShop, inventario.getSelectedIndex() + 1, 20);
            }

        } catch (NullPointerException e) {
            Caption ventanaEx = new Caption("Olvidaste llenar algún campo");
            Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, e);
            ventanaEx.setVisible(true);

        }

    }

    public void historialCHH(String cliente, JComboBox clienteCB, JComboBox medioVenta) throws IOException {
        String filepathCompras = rutas.excel+"/historialCompras.xlsx";
        String[] hojas = LeerExcel.obtenerHoja(filepathCompras);
        
        boolean hojaEncontrada = false;
        for (int i = 0; i < LeerExcel.obtenerNumeroHojas(filepathCompras); i++) {
            if (hojas[i].equals(cliente)) {
                hojaEncontrada = true;
            }
            //escribirVentas.crearHoja(rutas.excel+"/DeudasC.xlsx", cliente, "FECHA", "MONTO");
        }
        String filepathVentas = rutas.excel+"/Ventas.xlsx";
        if (hojaEncontrada == true) {
            //Escribe en Excel y crea hoja
            
            //crear.crearHojaPacks(rutas.excel+"/historialCompras.xlsx", cliente);

            String venta = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 0, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String descripion = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 1, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String condicion = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 3, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String pack = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 4, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            Double tig = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 5, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            int unidades = (int) LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 6, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            double costoUnidad = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 7, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));

            String costoNeto = Double.toString(unidades * costoUnidad);
            String precioBaseUnidad = Double.toString(LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 9, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase())));
            String precioBaseNeto = Double.toString(unidades * Double.parseDouble(precioBaseUnidad));

            String[] data = {venta, descripion, fechaActualEscribir().toUpperCase(), condicion, pack, Double.toString(tig), Integer.toString(unidades), Double.toString(costoUnidad), costoNeto, precioBaseUnidad, precioBaseNeto};

            Escribir escribirVentas = new Escribir();

            //Escribe arreglo de Strings
            escribirVentas.escribirExcelInv(filepathCompras, cliente, data, 10);

            //Escribe unidades como int
            escribirVentas.escribirCeldaNumerica(filepathCompras, cliente, Integer.valueOf(data[6]), LeerExcel.contarRenglones(filepathCompras, cliente), 6);

            //Escribe costo*unidad como double
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, Double.valueOf(data[7]), LeerExcel.contarRenglones(filepathCompras, cliente), 7);
            //Escribe costo neto como double
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, Double.valueOf(data[8]), LeerExcel.contarRenglones(filepathCompras, cliente), 8);

            //Escribe preciobase*unidad como double
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, Double.valueOf(data[9]), LeerExcel.contarRenglones(filepathCompras, cliente), 9);

            //Escribe tig como double
            Double tigBien = LeerExcel.obtenerCeldaNumerica(filepathCompras, cliente, 9, LeerExcel.contarRenglones(filepathCompras, cliente)) / LeerExcel.obtenerCeldaNumerica(filepathCompras, cliente, 7, LeerExcel.contarRenglones(filepathCompras, cliente));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, tigBien, LeerExcel.contarRenglones(filepathCompras, cliente), 5);

            //Escribe precio base neto como double
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, Double.valueOf(data[10]), LeerExcel.contarRenglones(filepathCompras, cliente), 10);

            //Escribe precio shop*unidad como double
            Double precioShop = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 11, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, precioShop, LeerExcel.contarRenglones(filepathCompras, cliente), 11);

            //Escribe precio shop neto como doble
            Double precioShopN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 12, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, precioShopN, LeerExcel.contarRenglones(filepathCompras, cliente), 12);

            //Escribe precio Ml por unidad como doble
            Double precioML = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 13, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, precioML, LeerExcel.contarRenglones(filepathCompras, cliente), 13);

            //Escribe precio Ml neto como doble
            Double precioMLN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 14, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, precioMLN, LeerExcel.contarRenglones(filepathCompras, cliente), 14);

            //Escribe comision ML como doble
            Double comisionML = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 15, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, comisionML, LeerExcel.contarRenglones(filepathCompras, cliente), 15);

            //Escribe comison ML neta
            Double comisionMLN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 16, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, comisionMLN, LeerExcel.contarRenglones(filepathCompras, cliente), 16);

            //Escribe IVA * unidad
            Double iva = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 17, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, iva, LeerExcel.contarRenglones(filepathCompras, cliente), 17);

            //Escribe IVA neto
            Double ivaN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 18, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, ivaN, LeerExcel.contarRenglones(filepathCompras, cliente), 18);

            //Escribe utilidadShop * unidad
            Double utilidadShop = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 19, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, utilidadShop, LeerExcel.contarRenglones(filepathCompras, cliente), 19);

            //Escribe utilidadShop neta
            Double utilidadShopN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 20, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, utilidadShopN, LeerExcel.contarRenglones(filepathCompras, cliente), 20);

            //Escribe formula de costo neto en suma
            String formula = "SUM(I2:I" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 8);

            //Escribe formula de precio base neto en suma
            String formula2 = "SUM(K2:K" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula2, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 10);

            //Escribe formula de precio local neto en suma
            String formula3 = "SUM(M2:M" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula3, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 12);

            //Escribe formula de precio ml neto en suma
            String formula4 = "SUM(O2:O" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula4, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 14);

            //Escribe formula de comision ml neta en suma
            String formula5 = "SUM(Q2:Q" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula5, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 16);

            //Escribe formula de IVA neta en suma
            String formula6 = "SUM(S2:S" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula6, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 18);

            //Escribe formula de utilidad local neta en suma
            String formula7 = "SUM(U2:U" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula7, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 20);

            //Escribe medio de venta
            escribirVentas.escribirCelda(filepathCompras, cliente, medioVenta.getSelectedItem().toString(), LeerExcel.contarRenglones(filepathCompras, cliente), 21);

            //Escribe destino
            String destino = LeerExcel.obtenerCelda(rutas.excel+"/CRM.xlsx", "CLIENTES", 3, clienteCB.getSelectedIndex() + 1);
            escribirVentas.escribirCelda(filepathCompras, cliente, destino, LeerExcel.contarRenglones(filepathCompras, cliente), 22);

            //Escribe Folio
            int folio = LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase());
            escribirVentas.escribirCeldaNumerica(filepathCompras, cliente, folio, LeerExcel.contarRenglones(filepathCompras, cliente), 23);

        } else {
            Escribir crear = new Escribir();
            String filepathCliente = rutas.excel+"/historialCompras.xlsx";
           
            
            
            crear.crearHojaFormatoInventario(filepathCliente, cliente);

            String venta = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 0, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String descripion = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 1, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String condicion = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 3, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String pack = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 4, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            Double tig = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 5, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            int unidades = (int) LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 6, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            double costoUnidad = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 7, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));

            String costoNeto = Double.toString(unidades * costoUnidad);
            String precioBaseUnidad = Double.toString(LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 9, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase())));
            String precioBaseNeto = Double.toString(unidades * Double.valueOf(precioBaseUnidad));

            String[] data = {venta, descripion, fechaActual(), condicion, pack, Double.toString(tig), Integer.toString(unidades), Double.toString(costoUnidad), costoNeto, precioBaseUnidad, precioBaseNeto};

            Escribir escribirVentas = new Escribir();

            //Escribe arreglo de Strings
            escribirVentas.escribirExcelInv(filepathCliente, cliente, data, 10);

            //Escribe unidades como int
            escribirVentas.escribirCeldaNumerica(filepathCliente, cliente, Integer.valueOf(data[6]), LeerExcel.contarRenglones(filepathCliente, cliente), 6);

            //Escribe costo*unidad como double
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, Double.valueOf(data[7]), LeerExcel.contarRenglones(filepathCliente, cliente), 7);
            //Escribe costo neto como double
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, Double.valueOf(data[8]), LeerExcel.contarRenglones(filepathCliente, cliente), 8);

            //Escribe preciobase*unidad como double
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, Double.valueOf(precioBaseUnidad), LeerExcel.contarRenglones(filepathCliente, cliente), 9);

            //Escribe tig como double
            Double tigBien = LeerExcel.obtenerCeldaNumerica(filepathCliente, cliente, 9, LeerExcel.contarRenglones(filepathCliente, cliente)) / LeerExcel.obtenerCeldaNumerica(filepathCliente, cliente, 7, LeerExcel.contarRenglones(filepathCliente, cliente));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, tigBien, LeerExcel.contarRenglones(filepathCliente, cliente), 5);

            //Escribe precio base neto como double
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, Double.valueOf(precioBaseNeto), LeerExcel.contarRenglones(filepathCliente, cliente), 10);

            //Escribe precio shop*unidad como double
            Double precioShop = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 11, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, precioShop, LeerExcel.contarRenglones(filepathCliente, cliente), 11);

            //Escribe precio shop neto como doble
            Double precioShopN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 12, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, precioShopN, LeerExcel.contarRenglones(filepathCliente, cliente), 12);

            //Escribe precio Ml por unidad como doble
            Double precioML = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 13, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, precioML, LeerExcel.contarRenglones(filepathCliente, cliente), 13);

            //Escribe precio Ml neto como doble
            Double precioMLN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 14, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, precioMLN, LeerExcel.contarRenglones(filepathCliente, cliente), 14);

            //Escribe comision ML como doble
            Double comisionML = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 15, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, comisionML, LeerExcel.contarRenglones(filepathCliente, cliente), 15);

            //Escribe comison ML neta
            Double comisionMLN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 16, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, comisionMLN, LeerExcel.contarRenglones(filepathCliente, cliente), 16);

            //Escribe IVA * unidad
            Double iva = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 17, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, iva, LeerExcel.contarRenglones(filepathCliente, cliente), 17);

            //Escribe IVA neto
            Double ivaN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 18, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, ivaN, LeerExcel.contarRenglones(filepathCliente, cliente), 18);

            //Escribe utilidadShop * unidad
            Double utilidadShop = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 19, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, utilidadShop, LeerExcel.contarRenglones(filepathCliente, cliente), 19);

            //Escribe utilidadShop neta
            Double utilidadShopN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 20, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, utilidadShopN, LeerExcel.contarRenglones(filepathCliente, cliente), 20);

            //Escribe formula de costo neto en suma
            String formula = "SUM(I2:I" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 8);

            //Escribe formula de precio base neto en suma
            String formula2 = "SUM(K2:K" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula2, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 10);

            //Escribe formula de precio local neto en suma
            String formula3 = "SUM(M2:M" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula3, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 12);

            //Escribe formula de precio ml neto en suma
            String formula4 = "SUM(O2:O" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula4, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 14);

            //Escribe formula de comision ml neta en suma
            String formula5 = "SUM(Q2:Q" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula5, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 16);

            //Escribe formula de IVA neta en suma
            String formula6 = "SUM(S2:S" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula6, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 18);

            //Escribe formula de utilidad local neta en suma
            String formula7 = "SUM(U2:U" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula7, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 20);

            //Escribe medio de venta
            escribirVentas.escribirCelda(filepathCliente, cliente, medioVenta.getSelectedItem().toString(), LeerExcel.contarRenglones(filepathCliente, cliente), 21);

            //Escribe destino
            String destino = LeerExcel.obtenerCelda(rutas.excel+"/CRM.xlsx", "CLIENTES", 3, clienteCB.getSelectedIndex() + 1);
            escribirVentas.escribirCelda(filepathCliente, cliente, destino, LeerExcel.contarRenglones(filepathCliente, cliente), 22);

            //Escribe Folio
            int folio = LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase());
            escribirVentas.escribirCeldaNumerica(filepathCliente, cliente, folio, LeerExcel.contarRenglones(filepathCliente, cliente), 23);
        }
        
       
    }
    public void historialCHHServ(String cliente, JComboBox clienteCB, String destino2 ) throws IOException {
        String filepathCompras = rutas.excel+"/historialCompras.xlsx";
        String[] hojas = LeerExcel.obtenerHoja(filepathCompras);
        
        boolean hojaEncontrada = false;
        for (int i = 0; i < LeerExcel.obtenerNumeroHojas(filepathCompras); i++) {
            if (hojas[i].equals(cliente)) {
                hojaEncontrada = true;
            }
            //escribirVentas.crearHoja(rutas.excel+"/DeudasC.xlsx", cliente, "FECHA", "MONTO");
        }
        String filepathVentas = rutas.excel+"/Ventas.xlsx";
        if (hojaEncontrada == true) {
            //Escribe en Excel y crea hoja
            
            //crear.crearHojaPacks(rutas.excel+"/historialCompras.xlsx", cliente);

            String venta = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 0, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String descripion = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 1, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String condicion = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 3, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String pack = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 4, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            Double tig = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 5, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            int unidades = (int) LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 6, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            double costoUnidad = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 7, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));

            String costoNeto = Double.toString(unidades * costoUnidad);
            String precioBaseUnidad = Double.toString(LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 9, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase())));
            String precioBaseNeto = Double.toString(unidades * Double.parseDouble(precioBaseUnidad));

            String[] data = {venta, descripion, fechaActualEscribir(), condicion, pack, Double.toString(tig), Integer.toString(unidades), Double.toString(costoUnidad), costoNeto, precioBaseUnidad, precioBaseNeto};

            Escribir escribirVentas = new Escribir();

            //Escribe arreglo de Strings
            escribirVentas.escribirExcelInv(filepathCompras, cliente, data, 10);

            //Escribe unidades como int
            escribirVentas.escribirCeldaNumerica(filepathCompras, cliente, Integer.valueOf(data[6]), LeerExcel.contarRenglones(filepathCompras, cliente), 6);

            //Escribe costo*unidad como double
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, Double.valueOf(data[7]), LeerExcel.contarRenglones(filepathCompras, cliente), 7);
            //Escribe costo neto como double
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, Double.valueOf(data[8]), LeerExcel.contarRenglones(filepathCompras, cliente), 8);

            //Escribe preciobase*unidad como double
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, Double.valueOf(data[9]), LeerExcel.contarRenglones(filepathCompras, cliente), 9);

            //Escribe tig como double
            Double tigBien = LeerExcel.obtenerCeldaNumerica(filepathCompras, cliente, 9, LeerExcel.contarRenglones(filepathCompras, cliente)) / LeerExcel.obtenerCeldaNumerica(filepathCompras, cliente, 7, LeerExcel.contarRenglones(filepathCompras, cliente));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, tigBien, LeerExcel.contarRenglones(filepathCompras, cliente), 5);

            //Escribe precio base neto como double
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, Double.valueOf(data[10]), LeerExcel.contarRenglones(filepathCompras, cliente), 10);

            //Escribe precio shop*unidad como double
            Double precioShop = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 11, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, precioShop, LeerExcel.contarRenglones(filepathCompras, cliente), 11);

            //Escribe precio shop neto como doble
            Double precioShopN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 12, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, precioShopN, LeerExcel.contarRenglones(filepathCompras, cliente), 12);

            //Escribe precio Ml por unidad como doble
            Double precioML = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 13, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, precioML, LeerExcel.contarRenglones(filepathCompras, cliente), 13);

            //Escribe precio Ml neto como doble
            Double precioMLN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 14, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, precioMLN, LeerExcel.contarRenglones(filepathCompras, cliente), 14);

            //Escribe comision ML como doble
            Double comisionML = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 15, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, comisionML, LeerExcel.contarRenglones(filepathCompras, cliente), 15);

            //Escribe comison ML neta
            Double comisionMLN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 16, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, comisionMLN, LeerExcel.contarRenglones(filepathCompras, cliente), 16);

            //Escribe IVA * unidad
            Double iva = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 17, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, iva, LeerExcel.contarRenglones(filepathCompras, cliente), 17);

            //Escribe IVA neto
            Double ivaN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 18, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, ivaN, LeerExcel.contarRenglones(filepathCompras, cliente), 18);

            //Escribe utilidadShop * unidad
            Double utilidadShop = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 19, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, utilidadShop, LeerExcel.contarRenglones(filepathCompras, cliente), 19);

            //Escribe utilidadShop neta
            Double utilidadShopN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 20, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, utilidadShopN, LeerExcel.contarRenglones(filepathCompras, cliente), 20);

            //Escribe formula de costo neto en suma
            String formula = "SUM(I2:I" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 8);

            //Escribe formula de precio base neto en suma
            String formula2 = "SUM(K2:K" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula2, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 10);

            //Escribe formula de precio local neto en suma
            String formula3 = "SUM(M2:M" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula3, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 12);

            //Escribe formula de precio ml neto en suma
            String formula4 = "SUM(O2:O" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula4, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 14);

            //Escribe formula de comision ml neta en suma
            String formula5 = "SUM(Q2:Q" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula5, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 16);

            //Escribe formula de IVA neta en suma
            String formula6 = "SUM(S2:S" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula6, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 18);

            //Escribe formula de utilidad local neta en suma
            String formula7 = "SUM(U2:U" + (LeerExcel.contarRenglones(filepathCompras, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCompras, cliente, formula7, LeerExcel.contarRenglones(filepathCompras, cliente) + 1, 20);

            //Escribe medio de venta
            escribirVentas.escribirCelda(filepathCompras, cliente, "", LeerExcel.contarRenglones(filepathCompras, cliente), 21);

            //Escribe destino
            String destino = destino2;
            escribirVentas.escribirCelda(filepathCompras, cliente, destino, LeerExcel.contarRenglones(filepathCompras, cliente), 22);

            //Escribe Folio
            int folio = LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase());
            escribirVentas.escribirCeldaNumerica(filepathCompras, cliente, folio, LeerExcel.contarRenglones(filepathCompras, cliente), 23);

        } else {
            Escribir crear = new Escribir();
            String filepathCliente = rutas.excel+"/historialCompras.xlsx";
           
            
            
            crear.crearHojaFormatoInventario(filepathCliente, cliente);

            String venta = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 0, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String descripion = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 1, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String condicion = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 3, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            String pack = LeerExcel.obtenerCelda(filepathVentas, fechaActualEscribir().toUpperCase(), 4, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            Double tig = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 5, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            int unidades = (int) LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 6, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            double costoUnidad = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 7, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));

            String costoNeto = Double.toString(unidades * costoUnidad);
            String precioBaseUnidad = Double.toString(LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 9, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase())));
            String precioBaseNeto = Double.toString(unidades * Double.valueOf(precioBaseUnidad));

            String[] data = {venta, descripion, fechaActual(), condicion, pack, Double.toString(tig), Integer.toString(unidades), Double.toString(costoUnidad), costoNeto, precioBaseUnidad, precioBaseNeto};

            Escribir escribirVentas = new Escribir();

            //Escribe arreglo de Strings
            escribirVentas.escribirExcelInv(filepathCliente, cliente, data, 10);

            //Escribe unidades como int
            escribirVentas.escribirCeldaNumerica(filepathCliente, cliente, Integer.valueOf(data[6]), LeerExcel.contarRenglones(filepathCliente, cliente), 6);

            //Escribe costo*unidad como double
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, Double.valueOf(data[7]), LeerExcel.contarRenglones(filepathCliente, cliente), 7);
            //Escribe costo neto como double
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, Double.valueOf(data[8]), LeerExcel.contarRenglones(filepathCliente, cliente), 8);

            //Escribe preciobase*unidad como double
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, Double.valueOf(precioBaseUnidad), LeerExcel.contarRenglones(filepathCliente, cliente), 9);

            //Escribe tig como double
            Double tigBien = LeerExcel.obtenerCeldaNumerica(filepathCliente, cliente, 9, LeerExcel.contarRenglones(filepathCliente, cliente)) / LeerExcel.obtenerCeldaNumerica(filepathCliente, cliente, 7, LeerExcel.contarRenglones(filepathCliente, cliente));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, tigBien, LeerExcel.contarRenglones(filepathCliente, cliente), 5);

            //Escribe precio base neto como double
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, Double.valueOf(precioBaseNeto), LeerExcel.contarRenglones(filepathCliente, cliente), 10);

            //Escribe precio shop*unidad como double
            Double precioShop = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 11, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, precioShop, LeerExcel.contarRenglones(filepathCliente, cliente), 11);

            //Escribe precio shop neto como doble
            Double precioShopN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 12, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, precioShopN, LeerExcel.contarRenglones(filepathCliente, cliente), 12);

            //Escribe precio Ml por unidad como doble
            Double precioML = 0.0 ;
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, precioML, LeerExcel.contarRenglones(filepathCliente, cliente), 13);

            //Escribe precio Ml neto como doble
            Double precioMLN = 0.0;
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, precioMLN, LeerExcel.contarRenglones(filepathCliente, cliente), 14);

            //Escribe comision ML como doble
            Double comisionML = 0.0;
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, comisionML, LeerExcel.contarRenglones(filepathCliente, cliente), 15);

            //Escribe comison ML neta
            Double comisionMLN =0.0;
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, comisionMLN, LeerExcel.contarRenglones(filepathCliente, cliente), 16);

            //Escribe IVA * unidad
            Double iva = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 17, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, iva, LeerExcel.contarRenglones(filepathCliente, cliente), 17);

            //Escribe IVA neto
            Double ivaN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 18, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCompras, cliente, ivaN, LeerExcel.contarRenglones(filepathCliente, cliente), 18);

            //Escribe utilidadShop * unidad
            Double utilidadShop = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 19, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, utilidadShop, LeerExcel.contarRenglones(filepathCliente, cliente), 19);

            //Escribe utilidadShop neta
            Double utilidadShopN = LeerExcel.obtenerCeldaNumerica(filepathVentas, fechaActualEscribir().toUpperCase(), 20, LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase()));
            escribirVentas.escribirCeldaDouble(filepathCliente, cliente, utilidadShopN, LeerExcel.contarRenglones(filepathCliente, cliente), 20);

            //Escribe formula de costo neto en suma
            String formula = "SUM(I2:I" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 8);

            //Escribe formula de precio base neto en suma
            String formula2 = "SUM(K2:K" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula2, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 10);

            //Escribe formula de precio local neto en suma
            String formula3 = "SUM(M2:M" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula3, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 12);

            //Escribe formula de precio ml neto en suma
            String formula4 = "SUM(O2:O" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula4, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 14);

            //Escribe formula de comision ml neta en suma
            String formula5 = "SUM(Q2:Q" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula5, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 16);

            //Escribe formula de IVA neta en suma
            String formula6 = "SUM(S2:S" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula6, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 18);

            //Escribe formula de utilidad local neta en suma
            String formula7 = "SUM(U2:U" + (LeerExcel.contarRenglones(filepathCliente, cliente) + 1) + ")";
            escribirVentas.escribirFormula(filepathCliente, cliente, formula7, LeerExcel.contarRenglones(filepathCliente, cliente) + 1, 20);

            //Escribe medio de venta
            escribirVentas.escribirCelda(filepathCliente, cliente, "SERVICIO".toString(), LeerExcel.contarRenglones(filepathCliente, cliente), 21);

            //Escribe destino
            String destino = LeerExcel.obtenerCelda(rutas.excel+"/CRM.xlsx", "CLIENTES", 3, clienteCB.getSelectedIndex() + 1);
            escribirVentas.escribirCelda(filepathCliente, cliente, destino, LeerExcel.contarRenglones(filepathCliente, cliente), 22);

            //Escribe Folio
            int folio = LeerExcel.contarRenglones(filepathVentas, fechaActualEscribir().toUpperCase());
            escribirVentas.escribirCeldaNumerica(filepathCliente, cliente, folio, LeerExcel.contarRenglones(filepathCliente, cliente), 23);
        }
        
       
    }

    public void devolver(JComboBox devo) throws IOException {
        String fecha = fechaActual();

        int seleccion = devo.getSelectedIndex() + 1;
        try {
            String inventario10 = "EPIC MOUNTAIN";
            String venta = LeerExcel.obtenerCelda(rutas.excel+"/inventario.xlsx", inventario10, 0, seleccion);
            String descripion = LeerExcel.obtenerCelda(rutas.excel+"/inventario.xlsx", inventario10, 1, seleccion);
            String condicion = LeerExcel.obtenerCelda(rutas.excel+"/inventario.xlsx", inventario10, 3, seleccion);
            String pack = LeerExcel.obtenerCelda(rutas.excel+"/inventario.xlsx", inventario10, 4, seleccion);
            double tig = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario10, 5, seleccion);
            int unidades = (int) LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario10, 6, seleccion);
            String costoUnidad = Double.toString(LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario10, 7, seleccion));

            String costoNeto = Double.toString((unidades) * Double.parseDouble(costoUnidad));
            String precioBaseUnidad = Double.toString(LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario10, 9, seleccion));
            String precioBaseNeto = Double.toString((unidades) * Double.parseDouble(precioBaseUnidad));

            String[] data = {venta, descripion, fecha, condicion, pack, Double.toString(tig), Integer.toString(unidades), costoUnidad, costoNeto, precioBaseUnidad, precioBaseNeto};

            Escribir escribirVentas = new Escribir();

            //Escribe arreglo de Strings
            escribirVentas.escribirExcelInv(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), data, 10);

            //Escribe unidades como int
            escribirVentas.escribirCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), Integer.valueOf(data[6]), LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 6);

            //Escribe costo*unidad como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), Double.valueOf(data[7]), LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase()), 7);

            //Escribe costo neto como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, Double.valueOf(data[8]), LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 8);

            //Escribe preciobase*unidad como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, Double.valueOf(data[9]), LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 9);

            //Escribe tig como double
            Double tigBien = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario10, 9, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10)) / LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario10, 7, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10));
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, tigBien, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 5);

            //Escribe precio base neto como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, Double.valueOf(data[10]), LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 10);

            //Escribe precio shop*unidad como double
            Double precioShop = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 11, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, precioShop, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 11);

            //Escribe precio shop neto como doble
            Double precioShopN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 12, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, precioShopN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 12);

            //Escribe precio Ml por unidad como doble
            Double precioML = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 13, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, precioML, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 13);

            //Escribe precio Ml neto como doble
            Double precioMLN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 14, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, precioMLN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 14);

            //Escribe comision ML como doble
            Double comisionML = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 15, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, comisionML, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 15);

            //Escribe comison ML neta
            Double comisionMLN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 16, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, comisionMLN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 16);

            //Escribe IVA * unidad
            Double iva = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 17, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, iva, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 17);

            //Escribe IVA neto
            Double ivaN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 18, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, ivaN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 18);

            //Escribe utilidadShop * unidad
            Double utilidadShop = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 19, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, utilidadShop, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 19);

            //Escribe utilidadShop neta
            Double utilidadShopN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", inventario10, 20, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario10, utilidadShopN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10), 20);

            //Escribe formula de costo neto en suma
            String formula = "SUM(I2:I" + (LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/inventario.xlsx", inventario10, formula, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1, 8);

            //Escribe formula de precio base neto en suma
            String formula2 = "SUM(K2:K" + (LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/inventario.xlsx", inventario10, formula2, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1, 10);

            //Escribe formula de precio local neto en suma
            String formula3 = "SUM(M2:M" + (LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/inventario.xlsx", inventario10, formula3, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1, 12);

            //Escribe formula de precio ml neto en suma
            String formula4 = "SUM(O2:O" + (LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/inventario.xlsx", inventario10, formula4, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1, 14);

            //Escribe formula de comision ml neta en suma
            String formula5 = "SUM(Q2:Q" + (LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/inventario.xlsx", inventario10, formula5, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1, 16);

            //Escribe formula de IVA neta en suma
            String formula6 = "SUM(S2:S" + (LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/inventario.xlsx", inventario10, formula6, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1, 18);

            //Escribe formula de utilidad local neta en suma
            String formula7 = "SUM(U2:U" + (LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1) + ")";
            escribirVentas.escribirFormula(rutas.excel+"/inventario.xlsx", inventario10, formula7, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario10) + 1, 20);

        } catch (NullPointerException e) {
            Caption ventanaEx = new Caption("Olvidaste llenar algún campo");
            Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, e);
            ventanaEx.setVisible(true);

        }

    }

    public static void devolverUltimaVenta(String fechaCHH) throws IOException {
        String fecha = fechaActual();

        int seleccion = LeerExcel.contarRenglones(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase());
        try {
            String venta = LeerExcel.obtenerCelda(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 0, seleccion);
            String descripion = LeerExcel.obtenerCelda(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 1, seleccion);
            String condicion = LeerExcel.obtenerCelda(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 3, seleccion);
            String pack = LeerExcel.obtenerCelda(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 4, seleccion);
            Double tig = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 5, seleccion);
            int unidades = (int) LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 6, seleccion);
            double costoUnidad = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 7, seleccion);

            String costoNeto = Double.toString(unidades * costoUnidad);
            String precioBaseUnidad = Double.toString(LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaActualEscribir().toUpperCase(), 9, seleccion));
            String precioBaseNeto = Double.toString(unidades * Double.parseDouble(precioBaseUnidad));

            String[] data = {venta, descripion, fecha, condicion, pack, Double.toString(tig), Integer.toString(unidades), Double.toString(costoUnidad), costoNeto, precioBaseUnidad, precioBaseNeto};

            Escribir escribirVentas = new Escribir();
            String inventario11 = "EPIC MOUNTAIN";

            //Escribe arreglo de Strings
            escribirVentas.escribirExcelInv(rutas.excel+"/inventario.xlsx", inventario11, data, 10);

            //Escribe unidades como int
            escribirVentas.escribirCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario11, Integer.valueOf(data[6]), LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 6);

            //Escribe costo*unidad como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, Double.valueOf(data[7]), LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 7);

            //Escribe costo neto como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, Double.valueOf(data[8]), LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 8);

            //Escribe preciobase*unidad como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, Double.valueOf(data[9]), LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 9);

            //Escribe tig como double
            Double tigBien = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 9, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11)) / LeerExcel.obtenerCeldaNumerica(rutas.excel+"/inventario.xlsx", inventario11, 7, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11));
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, tigBien, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 5);

            //Escribe precio base neto como double
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, Double.valueOf(data[10]), LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 10);

            //Escribe precio shop*unidad como double
            Double precioShop = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 11, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, precioShop, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 11);

            //Escribe precio shop neto como doble
            Double precioShopN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 12, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, precioShopN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 12);

            //Escribe precio Ml por unidad como doble
            Double precioML = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 13, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, precioML, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 13);

            //Escribe precio Ml neto como doble
            Double precioMLN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 14, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, precioMLN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 14);

            //Escribe comision ML como doble
            Double comisionML = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 15, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, comisionML, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 15);

            //Escribe comison ML neta
            Double comisionMLN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 16, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, comisionMLN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 16);

            //Escribe IVA * unidad
            Double iva = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 17, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, iva, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 17);

            //Escribe IVA neto
            Double ivaN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 18, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, ivaN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 18);

            //Escribe utilidadShop * unidad
            Double utilidadShop = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 19, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, utilidadShop, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 19);

            //Escribe utilidadShop neta
            Double utilidadShopN = LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Ventas.xlsx", fechaCHH, 20, seleccion);
            escribirVentas.escribirCeldaDouble(rutas.excel+"/inventario.xlsx", inventario11, utilidadShopN, LeerExcel.contarRenglones(rutas.excel+"/inventario.xlsx", inventario11), 20);

            //Escribe formula de costo neto en suma
        } catch (NullPointerException e) {
            Caption ventanaEx = new Caption("Olvidaste llenar algún campo");
            Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, e);
            ventanaEx.setVisible(true);

        }
    }

    public static void formulas() throws IOException {
        Escribir EscribirCRM = new Escribir();
        String inventario12 = "EPIC MOUNTAIN";

        String formula = "SUM(I2:I" + (LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1) + ")";
        EscribirCRM.escribirFormula(rutas.excel+"/Inventario.xlsx", inventario12, formula,
                LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1, 8);

        String formula2 = "SUM(K2:K" + (LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1) + ")";
        EscribirCRM.escribirFormula(rutas.excel+"/Inventario.xlsx", inventario12, formula2,
                LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1, 10);

        String formula3 = "SUM(M2:M" + (LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1) + ")";
        EscribirCRM.escribirFormula(rutas.excel+"/Inventario.xlsx", inventario12, formula3,
                LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1, 12);

        String formula4 = "SUM(O2:O" + (LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1) + ")";
        EscribirCRM.escribirFormula(rutas.excel+"/Inventario.xlsx", inventario12, formula4,
                LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1, 14);

        String formula5 = "SUM(Q2:Q" + (LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1) + ")";
        EscribirCRM.escribirFormula(rutas.excel+"/Inventario.xlsx", inventario12, formula5,
                LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1, 16);

        String formula6 = "SUM(S2:S" + (LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1) + ")";
        EscribirCRM.escribirFormula(rutas.excel+"/Inventario.xlsx", inventario12, formula6,
                LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1, 18);

        String formula7 = "SUM(U2:U" + (LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1) + ")";
        EscribirCRM.escribirFormula(rutas.excel+"/Inventario.xlsx", inventario12, formula7,
                LeerExcel.contarRenglones(rutas.excel+"/Inventario.xlsx", inventario12) + 1, 20);
    }

    public void corte( JPanel listaIngresos) throws IOException {
        listaIngresos.removeAll();
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

        listaIngresos.add(TOP, 0);

        if (!LeerExcel.tablaVacia(rutas.excel+"/LibrosContables.xlsx", "Ingresos")) {

            for (int i = 1; i <= LeerExcel.contarRenglones(rutas.excel+"/LibrosContables.xlsx", "Ingresos"); i++) {
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.epicColorBajito);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(550, 40));
                panelIngreso.setPreferredSize(new Dimension(550, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                fecha.setText(LeerExcel.obtenerCelda(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 0, i));

                JLabel dev = new JLabel();
                dev.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                dev.setText(LeerExcel.obtenerCelda(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 2, i));

                JLabel montoDevolucion = new JLabel();
                montoDevolucion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                montoDevolucion.setText("$" + LeerExcel.obtenerCeldaNumerica(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 3, i));

                JLabel plataforma = new JLabel();
                plataforma.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
                plataforma.setText("$" + LeerExcel.obtenerCeldaNumerica(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 6, i));

                String IconoTipo = "VentasG";
                String tipo = LeerExcel.obtenerCelda(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 1, i);
                switch (tipo) {
                    case "Venta":
                        IconoTipo = "VentasG";
                        break;
                    case "Inversión":
                        IconoTipo = "inversionG";
                        break;
                    case "Crédito":
                        IconoTipo = "CreditoG";
                        break;
                    case "Deuda a Cobrar":
                        IconoTipo = "DeudasCG";

                        break;
                    case "Nueva deuda":
                        IconoTipo = "DeudasC";

                        break;

                    case "Impuesto a favor":
                        IconoTipo = "impuestoG";
                        break;
                    case "Venta a Cobrar":
                        IconoTipo = "ventasC";

                        break;
                    case "Devolucion":
                        IconoTipo = "devolucionG";
                        break;
                    case "Deuda a Pagar":
                        IconoTipo = "DeudasPG";
                        break;
                    case "Aportacion Inv":
                        IconoTipo = "inventarioG";
                        break;
                    case "Aportacion EyM":
                        IconoTipo = "equipoG";
                        break;
                }

                String colorR = LeerExcel.obtenerCelda(rutas.excel+"/LibrosContables.xlsx", "Ingresos", 5, i);
                switch (colorR) {
                    case "VERDE":
                        panelIngreso.setBackground(Colores.grisBajito);
                        Escribir escribir = new Escribir();
                        escribir.escribirCelda(rutas.excel+"/LibrosContables.xlsx", "Ingresos", "GRIS", i, 5);
                        break;
                    /*case "AMARILLO":
                        panelIngreso.setBackground(Colores.amarillo);
                        break;*/
                    case "GRIS":
                        panelIngreso.setBackground(Colores.grisBajito);
                        break;

                }

                JLabel icono = new JLabel();
                Iconos.scaleImage(IconoTipo, icono, 30);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso, 1);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(dev);
                panelIngreso.add(montoDevolucion);
                panelIngreso.add(plataforma);
                panelIngreso.add(icono);

                indice++;
                listaIngresos.updateUI();
            }
        }
    }
    public static String fechaActualConA() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM YY");
        return formatoFecha.format(fecha);
    }
    
    

}
/*cambios 
equisde 
equisde eequisde

*/
