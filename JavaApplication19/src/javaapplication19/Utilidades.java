/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
   
    static void revertirUnidades(String filepathVentas, String mes, int folio) {

        try {
            boolean finder = false;
            for (int i = 0; i <= LeerExcel.contarRenglones(rutas.excel + "/INVENTARIOS.xlsx", "EPIC MOUNTAIN"); i++) {
                if (LeerExcel.obtenerCelda(filepathVentas, mes, 0, folio).equals(LeerExcel.obtenerCelda(rutas.excel + "/INVENTARIOS.xlsx", "EPIC MOUNTAIN", 0, i))) {
                    finder = true;
                    System.out.println("HOLA");
                    int suma = (int) (LeerExcel.obtenerCeldaNumerica(filepathVentas, mes, 6, LeerExcel.contarRenglones(filepathVentas, mes))) + (int) LeerExcel.obtenerCeldaNumerica(rutas.excel + "/INVENTARIOS.xlsx", "EPIC MOUNTAIN", 6, i);
                    Escribir escribirVentas = new Escribir();
                    String inventario = "EPIC MOUNTAIN";
                    escribirVentas.escribirCeldaNumerica(rutas.excel + "/INVENTARIOS.xlsx", inventario, suma, i, 6);
                    double costoUnidad = LeerExcel.obtenerCeldaNumerica(rutas.excel+"\\INVENTARIOS.xlsx", inventario, 7, i);
                    double precioBaseUnidad = LeerExcel.obtenerCeldaNumerica(rutas.excel+"\\INVENTARIOS.xlsx", inventario, 9, i);
                    Double precioML = LeerExcel.obtenerCeldaNumerica(rutas.excel + "/INVENTARIOS.xlsx", inventario, 13, i);
                    Double iva = LeerExcel.obtenerCeldaNumerica(rutas.excel + "/INVENTARIOS.xlsx", inventario, 17, i);
                    Double comisionML = LeerExcel.obtenerCeldaNumerica(rutas.excel + "/INVENTARIOS.xlsx", inventario, 15, i);
                    Double utilidadShop = LeerExcel.obtenerCeldaNumerica(rutas.excel + "/INVENTARIOS.xlsx", inventario, 19, i);

                    //COSTO NETO
                    escribirVentas.escribirCeldaDouble(rutas.excel+"\\INVENTARIOS.xlsx", inventario, (suma * costoUnidad), i, 8);
                    //PRECIO BASE NETO
                    escribirVentas.escribirCeldaDouble(rutas.excel+"\\INVENTARIOS.xlsx", inventario, suma * (precioBaseUnidad), i, 10);
                    //PRECIO LOCAL NETO
                    Double precioNeto = escribirVentas.Mulitplicar(6, 11, i, rutas.excel+"\\INVENTARIOS.xlsx", inventario);
                    escribirVentas.escribirCeldaDouble(rutas.excel+"\\INVENTARIOS.xlsx", inventario, precioNeto, i, 12);
                    //COMISION ML NETO

                    escribirVentas.escribirCeldaDouble(rutas.excel+"\\INVENTARIOS.xlsx", inventario, comisionML * suma, i, 16);

                    //IVA NETO
                    escribirVentas.escribirCeldaDouble(rutas.excel+"\\INVENTARIOS.xlsx", inventario, suma * iva, i, 18);
                    //PRECIOML NETO

                    escribirVentas.escribirCeldaDouble(rutas.excel+"\\INVENTARIOS.xlsx", inventario, suma * precioML, i, 14);

                    //UTILIDAD LOCAL NETA
                    escribirVentas.escribirCeldaDouble(rutas.excel+"\\INVENTARIOS.xlsx", inventario, suma * utilidadShop, i, 20);

                }

            }
            if (finder == false) {
                rellenarIngresos.devolverUltimaVenta(rellenarIngresos.fechaActualEscribir().toUpperCase());
                rellenarIngresos.formulas();

            }

            //Escribir.removeRow(rutas.excel + "/LIBROS DE CONTROL.xlsx", "Gastos", LeerExcel.contarRenglones(rutas.excel + "/LIBROS DE CONTROL.xlsx", "Gastos"));
        } catch (IOException ex) {
            Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static String fechaActualDia() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd");
        return formatoFecha.format(fecha);
    }
    
    public static int getScHeight() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    
    int scHeight = gd.getDisplayMode().getHeight();
    return scHeight;

    }
    public static int getLongitudDeBarra() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    
    int scHeight = gd.getDisplayMode().getHeight();
    if (scHeight<=768)
        return 420;
    else
        return 550;

    }
}
