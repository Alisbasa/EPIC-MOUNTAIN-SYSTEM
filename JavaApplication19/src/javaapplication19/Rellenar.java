/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alex
 */
public class Rellenar {
     static JPanel rellenarVentas =new JPanel();
     static JPanel rellenarInversion =new JPanel();
     static JPanel rellenarImpuesto =new JPanel();
     static JPanel rellenarCredito =new JPanel();
    static JLabel iconoVentas = new JLabel();
    static JLabel iconoCredito = new JLabel();
    static JLabel iconoInversion = new JLabel();
    static JLabel iconoImpuesto = new JLabel();
    static JLabel iconoOk = new JLabel();
    
    
     
     public static JPanel rellenarVentas(){
        rellenarVentas.removeAll();
        
        rellenarVentas.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoVentas, 40);
        rellenarVentas.add(iconoVentas);
        String[] listaInventario={"inventario","Bici chingona","Bici Chingona 2","Bici Chingona 3"};
        String[] listaPlataformas={"ML","fACEBOOK","Amazon","Shopiffy"};
        JComboBox inventario = new JComboBox(listaInventario);
        JComboBox plataformacb = new JComboBox(listaPlataformas);
        JTextField monto = new JTextField("$");
        monto.setPreferredSize(new Dimension(60, 30));
        Iconos.scaleImage("ok", iconoOk, 30);
        
        
        rellenarVentas.add(inventario);
        rellenarVentas.add(monto);
        rellenarVentas.add(plataformacb);
        rellenarVentas.add(iconoOk);
        
        return rellenarVentas;
    }
    public static JPanel rellenarCredito(){
        rellenarCredito.removeAll();
        
        rellenarCredito.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoCredito, 40);
        rellenarCredito.add(iconoCredito);
        Iconos.scaleImage("ok", iconoOk, 30);
        
        JTextField inversor = new JTextField("Prestamista");
        JTextField monto = new JTextField("$");
        monto.setPreferredSize(new Dimension(60, 30));
        inversor.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarCredito.add(inversor);
        rellenarCredito.add(monto);
        
        rellenarCredito.add(iconoOk);
        
        return rellenarCredito;
    } 

    public static JPanel rellenarInversion(){
        rellenarInversion.removeAll();
        
        rellenarInversion.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoInversion, 40);
        rellenarInversion.add(iconoInversion);
        Iconos.scaleImage("ok", iconoOk, 30);
        JTextField inversor = new JTextField("Inversor");
        JTextField monto = new JTextField("$");
        monto.setPreferredSize(new Dimension(60, 30));
        inversor.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarInversion.add(inversor);
        rellenarInversion.add(monto);
        
        rellenarInversion.add(iconoOk);
        
        return rellenarInversion;
    } 
    
    public static JPanel rellenarImpuesto(){
        rellenarImpuesto.removeAll();
        
        rellenarImpuesto.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoImpuesto, 40);
        rellenarImpuesto.add(iconoImpuesto);
        Iconos.scaleImage("ok", iconoOk, 30);
        JTextField inversor = new JTextField("Impuesto");
        JTextField monto = new JTextField("$");
        monto.setPreferredSize(new Dimension(60, 30));
        inversor.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarImpuesto.add(inversor);
        rellenarImpuesto.add(monto);
        
        rellenarImpuesto.add(iconoOk);
        
        return rellenarImpuesto;
    } 
     
    
}
