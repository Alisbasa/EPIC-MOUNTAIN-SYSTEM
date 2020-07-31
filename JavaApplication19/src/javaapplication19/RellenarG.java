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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javaapplication19.Libros;
import static javaapplication19.Rellenar.addPlaceHolder;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alex
 */
public class RellenarG {
    
    JPanel rellenarDesEquipo =new JPanel();
    JPanel rellenarDesInv =new JPanel();
    JPanel rellenarDesPacks = new JPanel();
    JPanel rellenarDesCompras = new JPanel();
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
    
    JComboBox tipo;
    JComboBox desarrollo;
    JTextField desarrolloTipoCT;
    JTextField desarrolloTipoE;
    JTextField desarrolloTipoI;
    JTextField desarrolloTipoP;
    JComboBox producto;
    JComboBox productoCT;
    JComboBox deudas;
    JTextField impuesto;
    JTextField mantenimiento;
    JTextField equipoyMob;
    JTextField suministros;
    JTextField publicidad;
    JTextField transporte;
    JTextField honorarios;
    JComboBox reducInv;
    JComboBox tipoPack;
    JComboBox provedores;
    JTextField unidadesCT;
    
    JTextField montoDesCT;
    JTextField montoDesE;
    JTextField montoDesI;
    JTextField montoDesP;
    JTextField montoDeuda;
    JTextField montoImpuesto;
    JTextField montoMant;
    JTextField montoSum;
    JTextField montoPublicidad;
    JTextField montoTrans;
    JTextField montoHonor;
    JTextField montoReduc;
    JTextField descripcion;
    
    JLabel iconoOkDesarrolloEq = new JLabel();
    JLabel iconoOkDesarrolloI = new JLabel();
    JLabel iconoOkDesarrolloP = new JLabel();
    JLabel iconoOkDesarrolloCT = new JLabel();
    JLabel iconoOkDeudas = new JLabel();
    JLabel iconoOkImpuesto = new JLabel();
    JLabel iconoOkMantenimiento = new JLabel();
    JLabel iconoOkSuministros = new JLabel();
    JLabel iconoOkPublicidad = new JLabel();
    JLabel iconoOkTransporte = new JLabel();
    JLabel iconoOkHonorarios = new JLabel();
    JLabel iconoOkReducInv = new JLabel();
     
    
    
    
    
    public  JPanel rellenarDesEquipo(){
        rellenarDesEquipo.removeAll();
        rellenarDesEquipo.setBackground(Color.white);
        
        Iconos.scaleImage("Equipo", iconoDesarrollo, 30);
        rellenarDesEquipo.add(iconoDesarrollo);
        
        String[] lista = {"Herramientas", "Equipo de Taller", "Mobiliario", "Equipo de Limpieza"};
        
        tipo = new JComboBox(lista);
        tipo.setUI(PropiedadesCB2.createUI(tipo));
        
        
        desarrolloTipoE = new JTextField();
        addPlaceHolder("Equipo y Mobiliario", desarrolloTipoE);
        desarrolloTipoE.setBackground(Colores.epicColorBajito);
        desarrolloTipoE.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        desarrolloTipoE.setPreferredSize(new Dimension(150, 30));
        
        descripcion = new JTextField();
        addPlaceHolder("Descripcion", descripcion);
        descripcion.setBackground(Colores.epicColorBajito);
        descripcion.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        descripcion.setPreferredSize(new Dimension(150, 30));
        

        montoDesE = new JTextField();
        addPlaceHolder("Monto", montoDesE);
        montoDesE.setBackground(Colores.epicColorBajito);
        montoDesE.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoDesE.setPreferredSize(new Dimension(60, 30));

        Iconos.scaleImage("ok", iconoOkDesarrolloEq, 30);
        
        rellenarDesEquipo.add(tipo);
        rellenarDesEquipo.add(desarrolloTipoE);
        rellenarDesEquipo.add(descripcion);
        rellenarDesEquipo.add(montoDesE);
        rellenarDesEquipo.add(iconoOkDesarrolloEq);
        
        return rellenarDesEquipo;
 
    }
    String tipoI;
    public JPanel rellenarDesInv(){
        rellenarDesInv.removeAll();
        rellenarDesInv.setBackground(Color.white);
        
        Iconos.scaleImage("Inventario", iconoDesarrollo, 30);
        Iconos.scaleImage("Inventario", iconoDesarrollo, 30);
        rellenarDesInv.add(iconoDesarrollo);

        desarrolloTipoI = new JTextField();
        addPlaceHolder("Inventario", desarrolloTipoI);
        desarrolloTipoI.setBackground(Colores.epicColorBajito);
        desarrolloTipoI.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        desarrolloTipoI.setPreferredSize(new Dimension(150, 30));
        tipoI = desarrolloTipoI.getText();
                    
                    
        String[] listaProductos = {"Nuevo", "Existente" , "Aditamento"};
        producto = new JComboBox (listaProductos);
        producto.setUI(PropiedadesCB2.createUI(producto));

        montoDesI = new JTextField();
        addPlaceHolder("Monto", montoDesI);
        montoDesI.setBackground(Colores.epicColorBajito);
        montoDesI.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoDesI.setPreferredSize(new Dimension(60, 30));

        Iconos.scaleImage("ok", iconoOkDesarrolloI, 30);

        rellenarDesInv.add(desarrolloTipoI);
        rellenarDesInv.add(producto);
        rellenarDesInv.add(montoDesI);
        rellenarDesInv.add(iconoOkDesarrolloI);    
        
    
        return rellenarDesInv;
    
    }
    
    public JPanel rellenarDesPacks(){
        rellenarDesPacks.removeAll();
        rellenarDesPacks.setBackground(Color.white);
                    
        Iconos.scaleImage("Packs", iconoDesarrollo, 30);
        rellenarDesPacks.add(iconoDesarrollo);

        desarrolloTipoP = new JTextField();
        addPlaceHolder("Packs", desarrolloTipoP);
        desarrolloTipoP.setBackground(Colores.epicColorBajito);
        desarrolloTipoP.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        desarrolloTipoP.setPreferredSize(new Dimension(150, 30));
        
        String []tipos ={"Nuevo", "Existente"}; 
        tipoPack = new JComboBox(tipos);
        tipoPack.setUI(PropiedadesCB2.createUI(tipoPack));
                    

        montoDesP = new JTextField();
        addPlaceHolder("Monto", montoDesP);
        montoDesP.setBackground(Colores.epicColorBajito);
        montoDesP.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoDesP.setPreferredSize(new Dimension(60, 30));

        Iconos.scaleImage("ok", iconoOkDesarrolloP, 30);

        rellenarDesPacks.add(desarrolloTipoP);
        rellenarDesPacks.add(tipoPack);
        rellenarDesPacks.add(montoDesP);
        rellenarDesPacks.add(iconoOkDesarrolloP);
        
        return rellenarDesPacks;
    }
    
    public JPanel rellenarDesCompras() throws IOException{
        rellenarDesCompras.removeAll();
        rellenarDesCompras.setBackground(Color.white);

        Iconos.scaleImage("Compras", iconoDesarrollo, 30);
        rellenarDesCompras.add(iconoDesarrollo);

        desarrolloTipoCT = new JTextField();
        addPlaceHolder("Compra en Transito", desarrolloTipoCT);
        desarrolloTipoCT.setBackground(Colores.epicColorBajito);
        desarrolloTipoCT.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        desarrolloTipoCT.setPreferredSize(new Dimension(150, 30));
       
                    

        montoDesCT = new JTextField();
        addPlaceHolder("Monto", montoDesCT);
        montoDesCT.setBackground(Colores.epicColorBajito);
        montoDesCT.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoDesCT.setPreferredSize(new Dimension(60, 30));
        
        unidadesCT = new JTextField();
        addPlaceHolder("Unidades", unidadesCT);
        unidadesCT.setBackground(Colores.epicColorBajito);
        unidadesCT.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        unidadesCT.setPreferredSize(new Dimension(60, 30));
                    
        String [] listaComprasCT = {"Equipo y Mob.", "Inventario Princ." , "Packs de Ventas", "Egresos"};
        productoCT = new JComboBox (listaComprasCT);
        productoCT.setUI(PropiedadesCB2.createUI(productoCT));
        productoCT.setPreferredSize(new Dimension(100,30));
        
        provedores = new JComboBox(LeerExcel.rellenaCB2("src//excel/Provedores.xlsx", "MIS PROVEEDORES", 0));
        provedores.addItem("Nuevo");
        provedores.setUI(PropiedadesCB2.createUI(provedores));
        provedores.setPreferredSize(new Dimension(150,30));

        Iconos.scaleImage("ok", iconoOkDesarrolloCT, 30);
                    
        rellenarDesCompras.add(desarrolloTipoCT);
        rellenarDesCompras.add(montoDesCT);
        rellenarDesCompras.add(unidadesCT);
        rellenarDesCompras.add(productoCT);
        rellenarDesCompras.add(provedores);
        rellenarDesCompras.add(iconoOkDesarrolloCT);
        
        return rellenarDesCompras;
    }
    
     
    public  JPanel rellenarDeudasPagar() throws IOException{
        rellenarDeudasPagar.removeAll();
        
        rellenarDeudasPagar.setBackground(Color.white);
        Iconos.scaleImage("DeudasP_1", iconoDeudasPagar, 40);
        rellenarDeudasPagar.add(iconoDeudasPagar);
        Iconos.scaleImage("ok", iconoOkDeudas, 30);
        
        
        deudas = new JComboBox(LeerExcel.rellenaCB2("src//excel/deudasP.xlsx", "deudasPagar", 1));
        deudas.setBackground(Color.white);
        deudas.setUI( PropiedadesCB2.createUI(deudas));        
        
        montoDeuda = new JTextField();
        addPlaceHolder("Monto", montoDeuda);
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
        impuesto = new JTextField();
        addPlaceHolder("Impuesto", impuesto);
        
        montoImpuesto = new JTextField();
        addPlaceHolder("Monto", montoImpuesto);
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
        mantenimiento = new JTextField();
        addPlaceHolder("Mantenimiento", mantenimiento);
        
        montoMant = new JTextField();
        addPlaceHolder("Monto", montoMant);
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
        suministros = new JTextField();
        addPlaceHolder("Suministros", suministros);
        
        montoSum = new JTextField();
        addPlaceHolder("Monto", montoSum);
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
        publicidad = new JTextField();
        addPlaceHolder("Publicidad", publicidad);
        
        montoPublicidad = new JTextField();
        addPlaceHolder("Monto", montoPublicidad);
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
        transporte = new JTextField();
        addPlaceHolder("Transporte", transporte);
        
        montoTrans = new JTextField();
        addPlaceHolder("Monto", montoTrans);
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
        honorarios = new JTextField();
        addPlaceHolder("Honorarios", honorarios);
        
        montoHonor = new JTextField();
        addPlaceHolder("Monto", montoHonor);
        montoHonor.setPreferredSize(new Dimension(60, 30));
        montoHonor.setBackground(Colores.epicColorBajito);
        montoHonor.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        honorarios.setPreferredSize(new Dimension(150, 30));      
        
        rellenarHonorarios.add(honorarios);
        rellenarHonorarios.add(montoHonor);
        rellenarHonorarios.add(iconoOkHonorarios);
        
        return rellenarHonorarios;
    }
    
    public  JPanel rellenarReducInv() throws IOException{
        rellenarReducInv.removeAll();
        
        rellenarReducInv.setBackground(Color.white);
        Iconos.scaleImage("Inventario", iconoReducInv, 40);
        rellenarReducInv.add(iconoReducInv);
        Iconos.scaleImage("ok", iconoOkReducInv, 30);
        
    
        reducInv = new JComboBox(LeerExcel.rellenaCB2("src//excel/Inventario.xlsx", "INVENTARIO", 1));
        reducInv.setBackground(Color.white);
        reducInv.setUI( PropiedadesCB2.createUI(reducInv));
        
        montoReduc = new JTextField();
        addPlaceHolder("Monto", montoRedu);
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
