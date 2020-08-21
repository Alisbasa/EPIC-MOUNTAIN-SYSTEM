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
            for (int i = 0; i <= LeerExcel.contarRenglones("src//excel/Inventario.xlsx", "EPIC MOUNTAIN"); i++) {
                if (LeerExcel.obtenerCelda(filepathVentas, mes, 0, folio).equals(LeerExcel.obtenerCelda("src//excel/Inventario.xlsx", "EPIC MOUNTAIN", 0, i))) {
                    finder = true;
                    System.out.println("HOLA");
                    int suma = (int) (LeerExcel.obtenerCeldaNumerica(filepathVentas, mes, 6, LeerExcel.contarRenglones(filepathVentas, mes))) + (int) LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", "INVENTARIO", 6, i);
                    Escribir escribirVentas = new Escribir();
                    String inventario = "EPIC MOUNTAIN";
                    escribirVentas.escribirCeldaNumerica("src//excel/Inventario.xlsx", inventario, suma, i, 6);
                    double costoUnidad = LeerExcel.obtenerCeldaNumerica("src\\excel\\inventario.xlsx", inventario, 7, i);
                    double precioBaseUnidad = LeerExcel.obtenerCeldaNumerica("src\\excel\\inventario.xlsx", inventario, 9, i);
                    Double precioML = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", inventario, 13, i);
                    Double iva = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", inventario, 17, i);
                    Double comisionML = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", inventario, 15, i);
                    Double utilidadShop = LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", inventario, 19, i);

                    //COSTO NETO
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, (suma * costoUnidad), i, 8);
                    //PRECIO BASE NETO
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, suma * (precioBaseUnidad), i, 10);
                    //PRECIO LOCAL NETO
                    Double precioNeto = escribirVentas.Mulitplicar(6, 11, i, "src\\excel\\Inventario.xlsx", inventario);
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, precioNeto, i, 12);
                    //COMISION ML NETO

                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, comisionML * suma, i, 16);

                    //IVA NETO
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, suma * iva, i, 18);
                    //PRECIOML NETO

                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, suma * precioML, i, 14);

                    //UTILIDAD LOCAL NETA
                    escribirVentas.escribirCeldaDouble("src\\excel\\Inventario.xlsx", inventario, suma * utilidadShop, i, 20);

                }

            }
            if (finder == false) {
                rellenarIngresos.devolverUltimaVenta(rellenarIngresos.fechaActualEscribir().toUpperCase());
                rellenarIngresos.formulas();

            }

            //Escribir.removeRow("src//excel/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones("src//excel/LibrosContables.xlsx", "Gastos"));
        } catch (IOException ex) {
            Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static String fechaActualDia() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd");
        return formatoFecha.format(fecha);
    }
}
