/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;

/**
 *
 * @author Alex
 */
public class Utilidades {
    static public double roundTwoDecimals(double d) {
    DecimalFormat twoDForm = new DecimalFormat("#.##");
    return Double.valueOf(twoDForm.format(d));
}
    //FOLIO ES EL NUMERO DE FILA EN EL EXCELL VENTAS
    static void revertirUnidades(JLabel boton, String filepath, String hoja, int folio) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    boolean finder = false;
                    for (int i = 0; i <= LeerExcel.contarRenglones("src//excel/Inventario.xlsx", "Inventario"); i++) {
                        if (LeerExcel.obtenerCelda(filepath, hoja, 0, folio).equals(LeerExcel.obtenerCelda("src//excel/Inventario.xlsx", "INVENTARIO", 0, i))) {
                            finder = true;
                            int suma = (int) (LeerExcel.obtenerCeldaNumerica(filepath, hoja, 6, LeerExcel.contarRenglones(filepath, hoja))) + (int) LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", "INVENTARIO", 6, i);
                            Escribir escribirVentas = new Escribir();
                            escribirVentas.escribirCeldaNumerica("src//excel/Inventario.xlsx", "Inventario", suma, i, 6);
                            double costoUnidad = LeerExcel.obtenerCeldaNumerica("src\\excel\\inventario.xlsx", "Inventario", 7, i);
                            double precioBaseUnidad = LeerExcel.obtenerCeldaNumerica("src\\excel\\inventario.xlsx", "Inventario", 9, i);
                            Double precioML = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", "Inventario", 13, i);
                            Double iva = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", "Inventario", 17, i);
                            Double comisionML = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", "Inventario", 15, i);
                            Double utilidadShop = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", "Inventario", 19, i);

                            //COSTO NETO
                            escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", (suma * costoUnidad), i, 8);
                            //PRECIO BASE NETO
                            escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", suma * (precioBaseUnidad), i, 10);
                            //PRECIO LOCAL NETO
                            Double precioNeto = escribirVentas.Mulitplicar(6, 11, i, "src\\excel\\Inventario.xlsx", "Inventario");
                            escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", precioNeto, i, 12);
                            //COMISION ML NETO

                            escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", comisionML * suma, i, 16);

                            //IVA NETO
                            escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", suma * iva, i, 18);
                            //PRECIOML NETO

                            escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", suma * precioML, i, 14);

                            //UTILIDAD LOCAL NETA
                            escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", "Inventario", suma * utilidadShop, i, 20);

                        }

                    }
                    if (finder == false) {
                        rellenarIngresos.devolverUltimaVenta();
                        rellenarIngresos.formulas();

                    }

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
}
