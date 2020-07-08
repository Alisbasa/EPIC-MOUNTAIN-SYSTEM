/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javaapplication19.Libros;

/**
 *
 * @author Alex
 */
public class Rellenar {
    JPanel rellenarVentas =new JPanel();
    JPanel rellenarInversion =new JPanel();
    JPanel rellenarImpuesto =new JPanel();
    JPanel rellenarCredito =new JPanel();
    JLabel iconoVentas = new JLabel();
    JLabel iconoCredito = new JLabel();
    JLabel iconoInversion = new JLabel();
    JLabel iconoImpuesto = new JLabel();
    JLabel iconoOkV = new JLabel();
    JLabel iconoOkC = new JLabel();
    JLabel iconoOkI = new JLabel();
    JLabel iconoOkImp = new JLabel();
    String monto2;
    JTextField monto;
    JComboBox inventario;
    JComboBox plataformacb;
    JTextField inversor;
    JTextField montoC;
    JTextField montoI;
    JTextField inversorI;
    JTextField impuesto;
    JTextField montoImp;
    
    
    
    private Ventas venta;
    
    
    
    
     public  JPanel rellenarVentas(){
        rellenarVentas.removeAll();
        
        rellenarVentas.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoVentas, 40);
        rellenarVentas.add(iconoVentas);
        String[] listaInventario={"inventario","Bici chingona","Bici Chingona 2","Bici Chingona 3"};
        String[] listaPlataformas={"ML","fACEBOOK","Amazon","Shopiffy"};
       
        inventario = new JComboBox(listaInventario);
       
        plataformacb = new JComboBox(listaPlataformas);
        
        monto = new JTextField("$");
      
//      
        monto.setPreferredSize(new Dimension(60, 30));
        Iconos.scaleImage("ok", iconoOkV, 30);
       
        rellenarVentas.add(inventario);
        rellenarVentas.add(monto);
        rellenarVentas.add(plataformacb);
        rellenarVentas.add(iconoOkV);
        monto2 = monto.getText();
        
        return rellenarVentas;
    }
     
     
    public  JPanel rellenarCredito(){
        rellenarCredito.removeAll();
        
        rellenarCredito.setBackground(Color.white);
        Iconos.scaleImage("Credito", iconoCredito, 40);
        rellenarCredito.add(iconoCredito);
        Iconos.scaleImage("ok", iconoOkC, 30);
        
        inversor = new JTextField("Prestamista");
        montoC = new JTextField("$");
        montoC.setPreferredSize(new Dimension(60, 30));
        inversor.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarCredito.add(inversor);
        rellenarCredito.add(montoC);
        
        rellenarCredito.add(iconoOkC);
        
        return rellenarCredito;
    } 

    public  JPanel rellenarInversion(){
        rellenarInversion.removeAll();
        
        rellenarInversion.setBackground(Color.white);
        Iconos.scaleImage("Inversion", iconoInversion, 40);
        rellenarInversion.add(iconoInversion);
        Iconos.scaleImage("ok", iconoOkI, 30);
        inversorI = new JTextField("Inversor");
        montoI = new JTextField("$");
        montoI.setPreferredSize(new Dimension(60, 30));
        inversorI.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarInversion.add(inversorI);
        rellenarInversion.add(montoI);
        
        rellenarInversion.add(iconoOkI);
        
        return rellenarInversion;
    } 
    
    public  JPanel rellenarImpuesto(){
        rellenarImpuesto.removeAll();
        
        rellenarImpuesto.setBackground(Color.white);
        Iconos.scaleImage("Impuesto", iconoImpuesto, 40);
        rellenarImpuesto.add(iconoImpuesto);
        Iconos.scaleImage("ok", iconoOkImp, 30);
        impuesto = new JTextField("Impuesto");
        montoImp = new JTextField("$");
        montoImp.setPreferredSize(new Dimension(60, 30));
        impuesto.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarImpuesto.add(impuesto);
        rellenarImpuesto.add(montoImp);
        
        rellenarImpuesto.add(iconoOkImp);
        
        return rellenarImpuesto;
    }
     
    
}
