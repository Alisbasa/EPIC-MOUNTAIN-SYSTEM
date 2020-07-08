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
public class RellenarG {
    
    JPanel rellenarDesarrollo =new JPanel();
    JPanel rellenarDeudasPagar =new JPanel();
    JPanel rellenarImpuestoG =new JPanel();
    JPanel rellenarMantenimiento =new JPanel();
    JPanel rellenarSuministros =new JPanel();
    JPanel rellenarPubliidad =new JPanel();
    JPanel rellenarTransporte =new JPanel();
    JPanel rellenarHonorarios =new JPanel();
    JPanel rellenarReducInv =new JPanel();
    
    JLabel iconoDesarrollo = new JLabel();
    JLabel iconoDeudasPagar = new JLabel();
    JLabel iconoImpuesto = new JLabel();
    JLabel iconoMantenimiento = new JLabel();
    JLabel iconoSuministros = new JLabel();
    JLabel iconoPublicidad = new JLabel();
    JLabel iconoTransporte = new JLabel();
    JLabel iconoHonorarios = new JLabel();
    JLabel iconoReducInv = new JLabel();
    
    JComboBox desarrollo;
    JTextField deudas;
    JTextField impuesto;
    JTextField mantenimiento;
    JTextField suministros;
    JTextField publicidad;
    JTextField transporte;
    JTextField honorarios;
    JComboBox reducInv;
    
    JTextField montoDes;
    JTextField montoDeuda;
    JTextField montoImpuesto;
    JTextField montoMant;
    JTextField montoSum;
    JTextField montoPublicidad;
    JTextField montoTrans;
    JTextField montoHonor;
    JTextField montoReduc;
    
    JLabel iconoOkDesarrollo = new JLabel();
    JLabel iconoOkDeudas = new JLabel();
    JLabel iconoOkImpuesto = new JLabel();
    JLabel iconoOkMantenimiento = new JLabel();
    JLabel iconoOkSuministros = new JLabel();
    JLabel iconoOkPublicidad = new JLabel();
    JLabel iconoOkTransporte = new JLabel();
    JLabel iconoOkHonorarios = new JLabel();
    JLabel iconoOkReducInv = new JLabel();
     
    
    
    
    
     public  JPanel rellenarDesarrollo(){
        rellenarDesarrollo.removeAll();
        
        rellenarDesarrollo.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoDesarrollo, 40);
        rellenarDesarrollo.add(iconoDesarrollo);
        String[] listaDesarrollo={"Mobiliario, Equisde"};
       
        desarrollo = new JComboBox(listaDesarrollo);
       
        montoDes = new JTextField("$");
      
//      
        montoDes.setPreferredSize(new Dimension(60, 30));
        Iconos.scaleImage("ok", iconoOkDesarrollo, 30);
       
        rellenarDesarrollo.add(desarrollo);
        rellenarDesarrollo.add(montoDes);
        rellenarDesarrollo.add(iconoOkDesarrollo);
        
        return rellenarDesarrollo;
    }
     
    public  JPanel rellenarDeudasPagar(){
        rellenarDeudasPagar.removeAll();
        
        rellenarDeudasPagar.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoDeudasPagar, 40);
        rellenarDeudasPagar.add(iconoDesarrollo);
        Iconos.scaleImage("ok", iconoOkDeudas, 30);
        
        deudas = new JTextField("Deudor");
        montoDeuda = new JTextField("$");
        montoDeuda.setPreferredSize(new Dimension(60, 30));
        deudas.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarDeudasPagar.add(deudas);
        rellenarDeudasPagar.add(montoDeuda);
        
        rellenarDeudasPagar.add(iconoOkDeudas);
        
        return rellenarDeudasPagar;
    } 

    public  JPanel rellenarImpuestoG(){
        rellenarImpuestoG.removeAll();
        
        rellenarImpuestoG.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoImpuesto, 40);
        rellenarImpuestoG.add(iconoImpuesto);
        Iconos.scaleImage("ok", iconoOkImpuesto, 30);
        impuesto = new JTextField("Impuesto");
        montoImpuesto = new JTextField("$");
        montoImpuesto.setPreferredSize(new Dimension(60, 30));
        impuesto.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarImpuestoG.add(impuesto);
        rellenarImpuestoG.add(montoImpuesto);
        rellenarImpuestoG.add(iconoOkImpuesto);
        
        return rellenarImpuestoG;
    } 
    
    public  JPanel rellenarMantenimiento(){
        rellenarMantenimiento.removeAll();
        
        rellenarMantenimiento.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoMantenimiento, 40);
        rellenarMantenimiento.add(iconoMantenimiento);
        Iconos.scaleImage("ok", iconoOkMantenimiento, 30);
        mantenimiento = new JTextField("Mantenimiento");
        montoMant = new JTextField("$");
        montoMant.setPreferredSize(new Dimension(60, 30));
        mantenimiento.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarMantenimiento.add(impuesto);
        rellenarMantenimiento.add(montoMant);
        rellenarMantenimiento.add(iconoOkMantenimiento);
        
        return rellenarMantenimiento;
    }
    
    public  JPanel rellenarSuministros(){
        rellenarSuministros.removeAll();
        
        rellenarSuministros.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoSuministros, 40);
        rellenarSuministros.add(iconoSuministros);
        Iconos.scaleImage("ok", iconoOkSuministros, 30);
        suministros = new JTextField("Suministros");
        montoSum = new JTextField("$");
        montoSum.setPreferredSize(new Dimension(60, 30));
        suministros.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarSuministros.add(suministros);
        rellenarSuministros.add(montoSum);
        rellenarSuministros.add(iconoOkSuministros);
        
        return rellenarSuministros;
    }
    
    public  JPanel rellenarPubliidad(){
        rellenarPubliidad.removeAll();
        
        rellenarPubliidad.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoPublicidad, 40);
        rellenarPubliidad.add(iconoPublicidad);
        Iconos.scaleImage("ok", iconoOkPublicidad, 30);
        publicidad = new JTextField("Publicidad");
        montoPublicidad = new JTextField("$");
        montoPublicidad.setPreferredSize(new Dimension(60, 30));
        publicidad.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarPubliidad.add(publicidad);
        rellenarPubliidad.add(montoPublicidad);
        rellenarPubliidad.add(iconoOkPublicidad);
        
        return rellenarPubliidad;
    }
    
    public  JPanel rellenarTransporte(){
        rellenarTransporte.removeAll();
        
        rellenarTransporte.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoTransporte, 40);
        rellenarTransporte.add(iconoTransporte);
        Iconos.scaleImage("ok", iconoOkTransporte, 30);
        transporte = new JTextField("Publicidad");
        montoTrans = new JTextField("$");
        montoTrans.setPreferredSize(new Dimension(60, 30));
        transporte.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarTransporte.add(transporte);
        rellenarTransporte.add(montoTrans);
        rellenarTransporte.add(iconoOkTransporte);
        
        return rellenarTransporte;
    }
        
    public  JPanel rellenarHonorarios(){
        rellenarHonorarios.removeAll();
        
        rellenarHonorarios.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoHonorarios, 40);
        rellenarHonorarios.add(iconoHonorarios);
        Iconos.scaleImage("ok", iconoOkHonorarios, 30);
        honorarios = new JTextField("Publicidad");
        montoHonor = new JTextField("$");
        montoHonor.setPreferredSize(new Dimension(60, 30));
        honorarios.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarHonorarios.add(honorarios);
        rellenarHonorarios.add(montoHonor);
        rellenarHonorarios.add(iconoOkHonorarios);
        
        return rellenarHonorarios;
    }
    
    public  JPanel rellenarReducInv(){
        rellenarReducInv.removeAll();
        
        rellenarReducInv.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoReducInv, 40);
        rellenarReducInv.add(iconoReducInv);
        Iconos.scaleImage("ok", iconoReducInv, 30);
        String[] listaInventario={"inventario","Bici chingona","Bici Chingona 2","Bici Chingona 3"};
        reducInv = new JComboBox(listaInventario);
        montoReduc = new JTextField("$");
        montoReduc.setPreferredSize(new Dimension(60, 30));
        reducInv.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarReducInv.add(reducInv);
        rellenarReducInv.add(montoReduc);
        rellenarReducInv.add(iconoOkReducInv);
        
        return rellenarReducInv;
    }
    
    
     
}
