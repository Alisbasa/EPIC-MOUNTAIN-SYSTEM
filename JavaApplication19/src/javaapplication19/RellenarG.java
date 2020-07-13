/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;

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
    JTextField desarrolloTipo;
    JComboBox producto;
    JComboBox deudas;
    JTextField impuesto;
    JTextField mantenimiento;
    JTextField equipoyMob;
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
        Iconos.scaleImage("desarrollo", iconoDesarrollo, 30);
        rellenarDesarrollo.add(iconoDesarrollo);
        String[] listaDesarrollo={"Equipo y Mob.", "Inventario Principal", "Packs de Ventas", "Compras en Transito"};
        
       
        desarrollo = new JComboBox(listaDesarrollo);
        desarrollo.setBackground(Color.white);
        desarrollo.setUI( PropiedadesCB2.createUI(desarrollo));
        
        desarrollo.addActionListener (new ActionListener () {
    
            public void actionPerformed(ActionEvent e) {
                if (desarrollo.getSelectedItem().toString().equals("Equipo y Mob.")){
                    rellenarDesarrollo.removeAll();
                    rellenarDesarrollo.revalidate();
                    rellenarDesarrollo.repaint();
                     
                    Iconos.scaleImage("Equipo", iconoDesarrollo, 30);
                    rellenarDesarrollo.add(iconoDesarrollo);

                    desarrolloTipo = new JTextField("");
                    desarrolloTipo.setBackground(Colores.epicColorBajito);
                    desarrolloTipo.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                    desarrolloTipo.setPreferredSize(new Dimension(150, 30));

                    montoDes = new JTextField("$");
                    montoDes.setBackground(Colores.epicColorBajito);
                    montoDes.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                    montoDes.setPreferredSize(new Dimension(60, 30));

                    Iconos.scaleImage("ok", iconoOkDesarrollo, 30);

                    rellenarDesarrollo.add(desarrolloTipo);
                    rellenarDesarrollo.add(montoDes);
                    rellenarDesarrollo.add(iconoOkDesarrollo);
                }
                
                else if(desarrollo.getSelectedItem().toString().equals("Inventario Principal")){
                    rellenarDesarrollo.removeAll();
                    rellenarDesarrollo.revalidate();
                    rellenarDesarrollo.repaint();
                    
                    Iconos.scaleImage("Inventario", iconoDesarrollo, 30);
                    rellenarDesarrollo.add(iconoDesarrollo);

                    desarrolloTipo = new JTextField("Inventario");
                    desarrolloTipo.setBackground(Colores.epicColorBajito);
                    desarrolloTipo.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                    desarrolloTipo.setPreferredSize(new Dimension(150, 30));
                    
                    String [] listaProductos = {"Nuevo", "Existente" , "Aditamento"};
                    
                    producto = new JComboBox (listaProductos);
                    producto.setUI(PropiedadesCB2.createUI(producto));

                    montoDes = new JTextField("$");
                    montoDes.setBackground(Colores.epicColorBajito);
                    montoDes.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                    montoDes.setPreferredSize(new Dimension(60, 30));

                    Iconos.scaleImage("ok", iconoOkDesarrollo, 30);

                    rellenarDesarrollo.add(desarrolloTipo);
                    rellenarDesarrollo.add(producto);
                    rellenarDesarrollo.add(montoDes);
                    rellenarDesarrollo.add(iconoOkDesarrollo);
                
                }
                else if(desarrollo.getSelectedItem().toString().equals("Packs de Ventas")){
                    rellenarDesarrollo.removeAll();
                    rellenarDesarrollo.revalidate();
                    rellenarDesarrollo.repaint();
                    
                    Iconos.scaleImage("Packs", iconoDesarrollo, 30);
                    rellenarDesarrollo.add(iconoDesarrollo);

                    desarrolloTipo = new JTextField("Packs");
                    desarrolloTipo.setBackground(Colores.epicColorBajito);
                    desarrolloTipo.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                    desarrolloTipo.setPreferredSize(new Dimension(150, 30));
                    

                    montoDes = new JTextField("$");
                    montoDes.setBackground(Colores.epicColorBajito);
                    montoDes.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                    montoDes.setPreferredSize(new Dimension(60, 30));

                    Iconos.scaleImage("ok", iconoOkDesarrollo, 30);

                    rellenarDesarrollo.add(desarrolloTipo);
                    rellenarDesarrollo.add(montoDes);
                    rellenarDesarrollo.add(iconoOkDesarrollo);
                
                }
                else if(desarrollo.getSelectedItem().toString().equals("Compras en Transito")){
                    rellenarDesarrollo.removeAll();
                    rellenarDesarrollo.revalidate();
                    rellenarDesarrollo.repaint();
                    
                    Iconos.scaleImage("Compras", iconoDesarrollo, 30);
                    rellenarDesarrollo.add(iconoDesarrollo);

                    desarrolloTipo = new JTextField("Compra en Transito");
                    desarrolloTipo.setBackground(Colores.epicColorBajito);
                    desarrolloTipo.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                    desarrolloTipo.setPreferredSize(new Dimension(150, 30));
                    

                    montoDes = new JTextField("$");
                    montoDes.setBackground(Colores.epicColorBajito);
                    montoDes.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                    montoDes.setPreferredSize(new Dimension(60, 30));
                    
                    String [] listaComprasT = {"Publicidad", "Mantenimiento" , "Suministros"};
                    producto = new JComboBox (listaComprasT);
                    producto.setUI(PropiedadesCB2.createUI(producto));

                    Iconos.scaleImage("ok", iconoOkDesarrollo, 30);
                    
                    rellenarDesarrollo.add(desarrolloTipo);
                    rellenarDesarrollo.add(montoDes);
                    rellenarDesarrollo.add(producto);
                    rellenarDesarrollo.add(iconoOkDesarrollo);
                
                }
        
            }
        });

        rellenarDesarrollo.add(desarrollo);
        
        return rellenarDesarrollo;
    }
     
    public  JPanel rellenarDeudasPagar(){
        rellenarDeudasPagar.removeAll();
        
        rellenarDeudasPagar.setBackground(Color.white);
        Iconos.scaleImage("DeudasP_1", iconoDeudasPagar, 40);
        rellenarDeudasPagar.add(iconoDeudasPagar);
        Iconos.scaleImage("ok", iconoOkDeudas, 30);
        
        String[] listaDeudores={"Alex", "Ivan"};
        deudas = new JComboBox(listaDeudores);
        deudas.setBackground(Color.white);
        deudas.setUI( PropiedadesCB2.createUI(deudas));
//        deudas.setBorder(new LineBorder(Colores.gris, 1));
        
        montoDeuda = new JTextField("$");
        montoDeuda.setPreferredSize(new Dimension(60, 30));
        montoDeuda.setBackground(Colores.epicColorBajito);
        montoDeuda.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        deudas.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarDeudasPagar.add(deudas);
        rellenarDeudasPagar.add(montoDeuda);
        rellenarDeudasPagar.add(iconoOkDeudas);
        
        return rellenarDeudasPagar;
    } 

    public  JPanel rellenarImpuestoG(){
        rellenarImpuestoG.removeAll();
        
        rellenarImpuestoG.setBackground(Color.white);
        Iconos.scaleImage("Impuesto", iconoImpuesto, 25);
        rellenarImpuestoG.add(iconoImpuesto);
        Iconos.scaleImage("ok", iconoOkImpuesto, 30);
        impuesto = new JTextField("Impuesto");
        
        montoImpuesto = new JTextField("$");
        montoImpuesto.setPreferredSize(new Dimension(60, 30));
        montoImpuesto.setBackground(Colores.epicColorBajito);
        montoImpuesto.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        impuesto.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarImpuestoG.add(impuesto);
        rellenarImpuestoG.add(montoImpuesto);
        rellenarImpuestoG.add(iconoOkImpuesto);
        
        return rellenarImpuestoG;
    } 
    
    public  JPanel rellenarMantenimiento(){
        rellenarMantenimiento.removeAll();
        
        rellenarMantenimiento.setBackground(Color.white);
        Iconos.scaleImage("Mantenimiento", iconoMantenimiento, 25);
        rellenarMantenimiento.add(iconoMantenimiento);
        Iconos.scaleImage("ok", iconoOkMantenimiento, 30);
        mantenimiento = new JTextField("Mantenimiento");
        
        montoMant = new JTextField("$");
        montoMant.setPreferredSize(new Dimension(60, 30));
        montoMant.setBackground(Colores.epicColorBajito);
        montoMant.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        mantenimiento.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarMantenimiento.add(mantenimiento);
        rellenarMantenimiento.add(montoMant);
        rellenarMantenimiento.add(iconoOkMantenimiento);
        
        return rellenarMantenimiento;
    }
    
    public  JPanel rellenarSuministros(){
        rellenarSuministros.removeAll();
        
        rellenarSuministros.setBackground(Color.white);
        Iconos.scaleImage("Suministros", iconoSuministros, 40);
        rellenarSuministros.add(iconoSuministros);
        Iconos.scaleImage("ok", iconoOkSuministros, 30);
        suministros = new JTextField("Suministros");
        
        montoSum = new JTextField("$");
        montoSum.setPreferredSize(new Dimension(60, 30));
        montoSum.setBackground(Colores.epicColorBajito);
        montoSum.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        suministros.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarSuministros.add(suministros);
        rellenarSuministros.add(montoSum);
        rellenarSuministros.add(iconoOkSuministros);
        
        return rellenarSuministros;
    }
    
    public  JPanel rellenarPubliidad(){
        rellenarPubliidad.removeAll();
        
        rellenarPubliidad.setBackground(Color.white);
        Iconos.scaleImage("publicidad", iconoPublicidad, 40);
        rellenarPubliidad.add(iconoPublicidad);
        Iconos.scaleImage("ok", iconoOkPublicidad, 30);
        publicidad = new JTextField("Publicidad");
        
        montoPublicidad = new JTextField("$");
        montoPublicidad.setPreferredSize(new Dimension(60, 30));
        montoPublicidad.setBackground(Colores.epicColorBajito);
        montoPublicidad.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        publicidad.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarPubliidad.add(publicidad);
        rellenarPubliidad.add(montoPublicidad);
        rellenarPubliidad.add(iconoOkPublicidad);
        
        return rellenarPubliidad;
    }
    
    public  JPanel rellenarTransporte(){
        rellenarTransporte.removeAll();
        
        rellenarTransporte.setBackground(Color.white);
        Iconos.scaleImage("transporte", iconoTransporte, 40);
        rellenarTransporte.add(iconoTransporte);
        Iconos.scaleImage("ok", iconoOkTransporte, 30);
        transporte = new JTextField("Transporte");
        
        montoTrans = new JTextField("$");
        montoTrans.setPreferredSize(new Dimension(60, 30));
        montoTrans.setBackground(Colores.epicColorBajito);
        montoTrans.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        transporte.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarTransporte.add(transporte);
        rellenarTransporte.add(montoTrans);
        rellenarTransporte.add(iconoOkTransporte);
        
        return rellenarTransporte;
    }
        
    public  JPanel rellenarHonorarios(){
        rellenarHonorarios.removeAll();
        
        rellenarHonorarios.setBackground(Color.white);
        Iconos.scaleImage("honorarios", iconoHonorarios, 40);
        rellenarHonorarios.add(iconoHonorarios);
        Iconos.scaleImage("ok", iconoOkHonorarios, 30);
        honorarios = new JTextField("Honorarios");
        
        montoHonor = new JTextField("$");
        montoHonor.setPreferredSize(new Dimension(60, 30));
        montoHonor.setBackground(Colores.epicColorBajito);
        montoHonor.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        honorarios.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarHonorarios.add(honorarios);
        rellenarHonorarios.add(montoHonor);
        rellenarHonorarios.add(iconoOkHonorarios);
        
        return rellenarHonorarios;
    }
    
    
    
    public  JPanel rellenarReducInv(){
        rellenarReducInv.removeAll();
        
        rellenarReducInv.setBackground(Color.white);
        Iconos.scaleImage("Inventario", iconoReducInv, 40);
        rellenarReducInv.add(iconoReducInv);
        Iconos.scaleImage("ok", iconoOkReducInv, 30);
        
        String[] listaInventario={"inventario","Bici chingona","Bici Chingona 2","Bici Chingona 3"};
        reducInv = new JComboBox(listaInventario);
        reducInv.setBackground(Color.white);
        reducInv.setUI( PropiedadesCB2.createUI(reducInv));
//        reducInv.setBorder(new LineBorder(Colores.gris, 1));
        
        montoReduc = new JTextField("$");
        montoReduc.setPreferredSize(new Dimension(60, 30));
        montoReduc.setBackground(Colores.epicColorBajito);
        montoReduc.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        reducInv.setPreferredSize(new Dimension(150, 30));      
        
        
        
        rellenarReducInv.add(reducInv);
        rellenarReducInv.add(montoReduc);
        rellenarReducInv.add(iconoOkReducInv);
        
        return rellenarReducInv;
    }
    
    
     
}
