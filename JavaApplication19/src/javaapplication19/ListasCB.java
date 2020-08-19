/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.List;

/**
 *
 * @author Alex
 */
public class ListasCB {
    
    static  String[] ingresos = {"VENTAS",
                                "INVERSIÓN",
                                "CRÉDITO",
                                "IMPUESTOS",
                                "DEUDAS A COB.",
                                "VENTAS A COB.",
                                "DEUDA A PAG. EXIS.",
                                "APORTACIONES",
                                "SERVICIO"};
    
    static  String[] gastos = {"EQUIPO Y MOB.",
                               "INVENTARIO PRINCIPAL",
                               "PACKS DE VENTAS",
                               "COMPRAS EN TRANSITO",
                               "DEUDAS A PAGAR",
                               "MANTENIMIENTO",
                               "IMPUESTOS",
                               "SUMINISTROS",
                               "PUBLICIDAD",
                               "TRANSPORTE",
                               "HONORARIOS",
                               "REDUC. DE INV.",
                               "DEVOLUCIONES",
                               "DESECHOS"}; 

    
    static public String[] getIngresos() {
        return ingresos;
    }

    static public String[] getGastos() {
        return gastos;
    }
    
    
    
}
