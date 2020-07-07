/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import static javaapplication19.Libros.fechaActual;
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
    static JPanel rellenarVentas =new JPanel();
    static JPanel rellenarInversion =new JPanel();
    static JPanel rellenarImpuesto =new JPanel();
    static JPanel rellenarCredito =new JPanel();
    static JLabel iconoVentas = new JLabel();
    static JLabel iconoCredito = new JLabel();
    static JLabel iconoInversion = new JLabel();
    static JLabel iconoImpuesto = new JLabel();
    static JLabel iconoOkV = new JLabel();
    static JLabel iconoOkC = new JLabel();
    static JLabel iconoOkI = new JLabel();
    static JLabel iconoOkImp = new JLabel();
    
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
        Iconos.scaleImage("ok", iconoOkV, 30);
        
        
        
        rellenarVentas.add(inventario);
        rellenarVentas.add(monto);
        rellenarVentas.add(plataformacb);
        rellenarVentas.add(iconoOkV);
        
        return rellenarVentas;
    }
    public static JPanel rellenarCredito(){
        rellenarCredito.removeAll();
        
        rellenarCredito.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoCredito, 40);
        rellenarCredito.add(iconoCredito);
        Iconos.scaleImage("ok", iconoOkC, 30);
        
        JTextField inversor = new JTextField("Prestamista");
        JTextField monto = new JTextField("$");
        monto.setPreferredSize(new Dimension(60, 30));
        inversor.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarCredito.add(inversor);
        rellenarCredito.add(monto);
        
        rellenarCredito.add(iconoOkC);
        
        return rellenarCredito;
    } 

    public static JPanel rellenarInversion(){
        rellenarInversion.removeAll();
        
        rellenarInversion.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoInversion, 40);
        rellenarInversion.add(iconoInversion);
        Iconos.scaleImage("ok", iconoOkI, 30);
        JTextField inversor = new JTextField("Inversor");
        JTextField monto = new JTextField("$");
        monto.setPreferredSize(new Dimension(60, 30));
        inversor.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarInversion.add(inversor);
        rellenarInversion.add(monto);
        
        rellenarInversion.add(iconoOkI);
        
        return rellenarInversion;
    } 
    
    public static JPanel rellenarImpuesto(){
        rellenarImpuesto.removeAll();
        
        rellenarImpuesto.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoImpuesto, 40);
        rellenarImpuesto.add(iconoImpuesto);
        Iconos.scaleImage("ok", iconoOkImp, 30);
        JTextField inversor = new JTextField("Impuesto");
        JTextField monto = new JTextField("$");
        monto.setPreferredSize(new Dimension(60, 30));
        inversor.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarImpuesto.add(inversor);
        rellenarImpuesto.add(monto);
        
        rellenarImpuesto.add(iconoOkImp);
        
        return rellenarImpuesto;
    }
    
    public void iconoOkVMouseClicked(java.awt.event.MouseEvent evt){
        JPanel panelIngreso = new JPanel();
        panelIngreso.setLayout(new GridLayout(1,4));
        Libros.rellenarIngresos.setLayout(new GridLayout(indice,1));
        
        JLabel fecha = new JLabel();
        fecha.setText(fechaActual());
        
        JLabel inventarioLista = new JLabel();
        inventarioLista.setText(Rellenar.rellenarVentas.getAccessibleContext().getAccessibleText().toString());
        
        JLabel precio = new JLabel();
        //precio.setText();
        
        JLabel icono = new JLabel();
        icono.setIcon(new ImageIcon("..\\src\\img\\Ventas.png"));
        
        rellenarIngresos.add(panelIngreso);
        panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos
        
        panelIngreso.add(fecha);
        panelIngreso.add(inventarioLista);
        panelIngreso.add(precio);
        panelIngreso.add(icono);
        
        indice++;
        rellenarIngresos.updateUI();
    }
     
    
}
