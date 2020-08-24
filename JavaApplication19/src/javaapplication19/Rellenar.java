/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import static javaapplication19.rellenarIngresos.fechaActualEscribir;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alex
 */
public class Rellenar {

    JPanel rellenarVentas = new JPanel();
    JPanel rellenarInversion = new JPanel();
    JPanel rellenarImpuesto = new JPanel();
    JPanel rellenarCredito = new JPanel();
    JPanel rellenarDeudasC = new JPanel();
    JPanel rellenarVentasC = new JPanel();
    JPanel rellenarDeuPE = new JPanel();
    JPanel rellenarAport = new JPanel();
    JPanel rellenarServicio = new JPanel();

    JLabel iconoVentas = new JLabel();
    JLabel iconoCredito = new JLabel();
    JLabel iconoInversion = new JLabel();
    JLabel iconoImpuesto = new JLabel();
    JLabel iconoDeudasC = new JLabel();
    JLabel iconoVentasC = new JLabel();
    JLabel iconoDeuPE = new JLabel();
    JLabel iconoAport = new JLabel();
    JLabel iconoSer = new JLabel();

JLabel iconoOkV = new JLabel();
    JLabel iconoOkC = new JLabel();
    JLabel iconoOkI = new JLabel();
    JLabel iconoOkImp = new JLabel();
    JLabel iconoOkDeudasC = new JLabel();
    JLabel iconoOkVentasC = new JLabel();
    JLabel iconoOkDeuPE = new JLabel();
    JLabel iconoOkAport = new JLabel();
    JLabel iconoOkSer = new JLabel();

    JTextField monto;
    JTextField montoC;
    JTextField montoI;
    JTextField montoImp;
    JTextField montoDeuC;
    JTextField montoVC;
    JTextField montoDeuPE;
    JTextField montoAport;
    JTextField descripcion;
    JTextField producto;

    JComboBox inventario; //Ventas //VentasC
    JComboBox unidades;
    int numeroUnidades;
    JComboBox plataformacb;//Ventas
    JComboBox cliente;//Ventas//VentasC
    JTextField destino;//Ventas
    JComboBox deudasPE;
    JComboBox tipoAport;
    JComboBox tipoEquipo;
    JComboBox tipoServicio;

    JTextField inversor;
    JTextField inversorI;
    JTextField impuesto;
    int indexInventario = 1;


    JComboBox deudor; //DeudasC

    public JPanel rellenarVentas() throws IOException {
        rellenarVentas.removeAll();

        rellenarVentas.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoVentas, 40);
        rellenarVentas.add(iconoVentas);

        String[] listaPlataformas = {"Mercado Libre", "Local"};

        inventario = new JComboBox(LeerExcel.rellenaCB2(rutas.excel+"/Inventario.xlsx", "EPIC MOUNTAIN", 0));
        inventario.addItem("SERVICIO");
        inventario.setBackground(Color.white);
        inventario.setUI(PropiedadesCB2.createUI(inventario));
        inventario.setPreferredSize(new Dimension(200, 30));
        inventario.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        unidades = new JComboBox();
        unidades.setBackground(Color.white);
        unidades.setUI(PropiedadesCB2.createUI(inventario));
        unidades.setPreferredSize(new Dimension(65, 30));
        unidades.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        
        cliente = new JComboBox(LeerExcel.rellenaCB2(rutas.excel+"//CRM.xlsx", "CLIENTES", 0));
        cliente.addItem("Nuevo Cliente");
        cliente.setBackground(Color.white);
        cliente.setUI(PropiedadesCB2.createUI(cliente));
        cliente.setPreferredSize(new Dimension(130, 30));
        cliente.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        

        plataformacb = new JComboBox(listaPlataformas);
        plataformacb.setBackground(Color.white);
        plataformacb.setUI(PropiedadesCB2.createUI(plataformacb));
        plataformacb.setPreferredSize(new Dimension(130, 30));
        plataformacb.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        

        Iconos.scaleImage("ok", iconoOkV, 30);

        rellenarVentas.add(inventario);
        

        inventario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                indexInventario = inventario.getSelectedIndex();
                try {
                    numeroUnidades =(int) LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", "EPIC MOUNTAIN", 6, indexInventario + 1);
                } catch (IOException ex) {
                    Logger.getLogger(Rellenar.class.getName()).log(Level.SEVERE, null, ex);
                }
                unidades.removeAllItems();
                for (int i = 1; i <= numeroUnidades; i++) {
                    unidades.addItem(i);
                }
            }
        });

        
        rellenarVentas.add(unidades);

        rellenarVentas.add(plataformacb);
        rellenarVentas.add(cliente);
        rellenarVentas.add(iconoOkV);

        return rellenarVentas;
    }

    public static void  addPlaceHolder(String texto,JTextField textField){
        TextPrompt placeholder = new TextPrompt(texto, textField);
        placeholder.changeAlpha(0.75f);
        placeholder.changeStyle(Font.ITALIC);
        
    }
    public JPanel rellenarCredito() {
        rellenarCredito.removeAll();

        rellenarCredito.setBackground(Color.white);
        Iconos.scaleImage("Credito", iconoCredito, 40);
        rellenarCredito.add(iconoCredito);
        Iconos.scaleImage("ok", iconoOkC, 30);

        inversor = new JTextField();
        inversor.setBackground(Colores.epicColorBajito);
        inversor.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        inversor.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Inversionista", inversor);
        
        
        
        montoC = new JTextField();
        montoC.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        montoC.setPreferredSize(new Dimension(80, 30));
        addPlaceHolder("Ingreso", montoC);
 
        
        inversor.setPreferredSize(new Dimension(150, 30));
        montoC.setBackground(Colores.epicColorBajito);
        montoC.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
       
        

        rellenarCredito.add(inversor);
        rellenarCredito.add(montoC);

        rellenarCredito.add(iconoOkC);

        return rellenarCredito;
    }

    public JPanel rellenarInversion() {
        rellenarInversion.removeAll();

        rellenarInversion.setBackground(Color.white);
        Iconos.scaleImage("Inversion", iconoInversion, 40);
        rellenarInversion.add(iconoInversion);
        Iconos.scaleImage("ok", iconoOkI, 30);
        inversorI = new JTextField();
        inversorI.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        inversorI.setBackground(Colores.epicColorBajito);
        inversorI.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Inversionista", inversorI);
        
        montoI = new JTextField();
        montoI.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Ingreso", montoI);
        montoI.setPreferredSize(new Dimension(80, 30));
        inversorI.setPreferredSize(new Dimension(150, 30));
        montoI.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoI.setBackground(Colores.epicColorBajito);
        
        

        rellenarInversion.add(inversorI);
        rellenarInversion.add(montoI);

        rellenarInversion.add(iconoOkI);

        return rellenarInversion;
    }

    public JPanel rellenarImpuesto() {
        rellenarImpuesto.removeAll();

        rellenarImpuesto.setBackground(Color.white);
        Iconos.scaleImage("Impuesto", iconoImpuesto, 40);
        rellenarImpuesto.add(iconoImpuesto);
        Iconos.scaleImage("ok", iconoOkImp, 30);
        impuesto = new JTextField();
        impuesto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        impuesto.setBackground(Colores.epicColorBajito);
        impuesto.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        addPlaceHolder("Impuesto", impuesto);
        
        montoImp = new JTextField();
        montoImp.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Ingreso", montoImp);
        montoImp.setPreferredSize(new Dimension(80, 30));
        impuesto.setPreferredSize(new Dimension(150, 30));
        montoImp.setBackground(Colores.epicColorBajito);
        montoImp.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        

        
        rellenarImpuesto.add(impuesto);
        rellenarImpuesto.add(montoImp);

        rellenarImpuesto.add(iconoOkImp);

        return rellenarImpuesto;
    }

    public JPanel rellenarDeudasC() throws IOException {
        rellenarDeudasC.removeAll();

        rellenarDeudasC.setBackground(Color.white);
        Iconos.scaleImage("DeudasC", iconoDeudasC, 40);
        rellenarDeudasC.add(iconoDeudasC);


        deudor = new JComboBox(LeerExcel.obtenerHoja(rutas.excel+"/deudasC.xlsx"));
        deudor.removeItemAt(0);
        deudor.addItem("Nuevo");
        deudor.setBackground(Color.white);
        deudor.setUI(PropiedadesCB2.createUI(deudor));
        deudor.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        

        montoDeuC = new JTextField();
        montoDeuC.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Ingreso", montoDeuC);
        montoDeuC.setBorder(new LineBorder(Colores.epicColor, 0, true));
        montoDeuC.setBackground(Colores.epicColorBajito);
        montoDeuC.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        

        montoDeuC.setPreferredSize(new Dimension(80, 30));
        deudor.setPreferredSize(new Dimension(150, 30));
        Iconos.scaleImage("ok", iconoOkDeudasC, 30);

        rellenarDeudasC.add(deudor);
        rellenarDeudasC.add(montoDeuC);
        rellenarDeudasC.add(iconoOkDeudasC);

        return rellenarDeudasC;
    }

    public JPanel rellenarVentasC() throws IOException {
        rellenarVentas.removeAll();

        rellenarVentas.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoVentas, 40);
        rellenarVentas.add(iconoVentas);

        String[] listaPlataformas = {"Mercado Libre", "Local"};

        inventario = new JComboBox(LeerExcel.rellenaCB2(rutas.excel+"/Inventario.xlsx", "EPIC MOUNTAIN", 0));
        
        inventario.addItem("SERVICIO");
        inventario.setBackground(Color.white);
        inventario.setUI(PropiedadesCB2.createUI(inventario));
        inventario.setPreferredSize(new Dimension(200, 30));
        inventario.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        
        unidades = new JComboBox();
        unidades.setBackground(Color.white);
        unidades.setUI(PropiedadesCB2.createUI(inventario));
        unidades.setPreferredSize(new Dimension(65, 30));
        unidades.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        

        cliente = new JComboBox(LeerExcel.rellenaCB2(rutas.excel+"//CRM.xlsx", "CLIENTES", 0));
        cliente.addItem("Nuevo Cliente");
        cliente.setBackground(Color.white);
        cliente.setUI(PropiedadesCB2.createUI(cliente));
        cliente.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        cliente.setPreferredSize(new Dimension(130, 30));

        plataformacb = new JComboBox(listaPlataformas);
        plataformacb.setBackground(Color.white);
        plataformacb.setUI(PropiedadesCB2.createUI(plataformacb));
        plataformacb.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        plataformacb.setPreferredSize(new Dimension(130, 30));
        

       

        Iconos.scaleImage("ok", iconoOkVentasC, 30);

        rellenarVentas.add(inventario);
        

        inventario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexInventario = inventario.getSelectedIndex();
                try {
                    numeroUnidades =(int) LeerExcel.obtenerCeldaNumerica(rutas.excel+"/Inventario.xlsx", "EPIC MOUNTAIN", 6, indexInventario + 1);
                } catch (IOException ex) {
                    Logger.getLogger(Rellenar.class.getName()).log(Level.SEVERE, null, ex);
                }
                unidades.removeAllItems();
                for (int i = 1; i <= numeroUnidades; i++) {
                    unidades.addItem(i);
                }
            }
        });

        
        rellenarVentas.add(unidades);

        rellenarVentas.add(plataformacb);
        rellenarVentas.add(cliente);
        rellenarVentas.add(iconoOkVentasC);

        return rellenarVentas;
    }
    
    public JPanel rellenarDeuPE() throws IOException, IOException{
        rellenarDeuPE.removeAll();
        rellenarDeuPE.setBackground(Color.white);
        
        Iconos.scaleImage("DeudasP", iconoDeuPE, 50);
        Iconos.scaleImage("ok", iconoOkDeuPE, 30);
        
        
        
        
        
        deudasPE = new JComboBox(LeerExcel.rellenaCB2("src\\excel\\DeudasP.xlsx", "deudasPagar", 1));
        deudasPE.removeItemAt(0);
        deudasPE.setBackground(Color.white);
        deudasPE.setUI(PropiedadesCB2.createUI(deudasPE));
        deudasPE.setPreferredSize(new Dimension(150, 30));
        deudasPE.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        montoDeuPE = new JTextField();
        montoDeuPE.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Ingreso", montoDeuPE);
        montoDeuPE.setBorder(new LineBorder(Colores.epicColor, 0, true));
        montoDeuPE.setBackground(Colores.epicColorBajito);
        montoDeuPE.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoDeuPE.setPreferredSize(new Dimension(80,30));
        
        rellenarDeuPE.add(iconoDeuPE);
        rellenarDeuPE.add(deudasPE);
        rellenarDeuPE.add(montoDeuPE);
        rellenarDeuPE.add(iconoOkDeuPE);
        
        return rellenarDeuPE;
    }
    
    public JPanel rellenarAport() throws IOException, IOException{
        rellenarAport.removeAll();
        rellenarAport.setBackground(Color.white);
        
        Iconos.scaleImage("DeudasP", iconoAport, 50);
        Iconos.scaleImage("ok", iconoOkAport, 30);
        
        String [] arr = {"Inventario Principal", "Equipo y Mob."};
        tipoAport = new JComboBox(arr);
        tipoAport.setBackground(Color.white);
        tipoAport.setUI(PropiedadesCB2.createUI(deudasPE));
        tipoAport.setPreferredSize(new Dimension(150, 30));
        tipoAport.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        producto = new JTextField();
        producto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("PRODUCTO", producto);
        producto.setBackground(Colores.epicColorBajito);
        producto.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        producto.setPreferredSize(new Dimension(150, 30));
        
        
        montoAport = new JTextField();
        montoAport.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("MONTO", montoAport);
        montoAport.setBorder(new LineBorder(Colores.epicColor, 0, true));
        montoAport.setBackground(Colores.epicColorBajito);
        montoAport.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoAport.setPreferredSize(new Dimension(80,30));
        
        String [] tipoE = {"Herramientas", "Equipo de Taller", "Mobiliario", "Equipo de Limpieza"};
        tipoEquipo = new JComboBox(tipoE);
        tipoEquipo.setBackground(Color.white);
        tipoEquipo.setUI(PropiedadesCB2.createUI(tipoEquipo));
        tipoEquipo.setPreferredSize(new Dimension(150, 30));
        tipoEquipo.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        
        descripcion = new JTextField();
        descripcion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Descripcion", descripcion);
        descripcion.setBackground(Colores.epicColorBajito);
        descripcion.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        descripcion.setPreferredSize(new Dimension(120, 30));
        
        rellenarAport.add(iconoAport);
        rellenarAport.add(tipoAport);
        
        tipoAport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tipoAport.getSelectedItem().toString().equals("Inventario Principal")){
                    rellenarAport.removeAll();
                    rellenarAport.revalidate();
                    rellenarAport.repaint();
                    rellenarAport.add(iconoAport);
                    rellenarAport.add(tipoAport);
                    rellenarAport.add(producto);
                    rellenarAport.add(montoAport);
                    
                    Iconos.scaleImage("ok", iconoOkAport, 30);
                    rellenarAport.add(iconoOkAport);
                }
                else if(tipoAport.getSelectedItem().toString().equals("Equipo y Mob.")){
                    rellenarAport.removeAll();
                    rellenarAport.revalidate();
                    rellenarAport.repaint();
                    rellenarAport.add(iconoAport);
                    rellenarAport.add(tipoEquipo);
                    rellenarAport.add(producto);
                    rellenarAport.add(descripcion);
                    rellenarAport.add(montoAport);
                    rellenarAport.add(iconoOkAport);
                    
                }
            }
        });
       
        
        return rellenarAport;
    }

    public JPanel rellenarServicio() throws IOException {
        rellenarServicio.removeAll();

        rellenarServicio.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoSer, 40);
        rellenarServicio.add(iconoInversion);
        Iconos.scaleImage("ok", iconoOkSer, 30);
        
        cliente = new JComboBox(LeerExcel.rellenaCB2(rutas.excel+"//CRM.xlsx", "CLIENTES", 0));
        cliente.addItem("Nuevo Cliente");
        cliente.setBackground(Color.white);
        cliente.setUI(PropiedadesCB2.createUI(cliente));
        cliente.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        cliente.setPreferredSize(new Dimension(130, 30));
        
        String [] arr = {"Venta", "Venta a Cobrar"};
        tipoServicio = new JComboBox(arr);
        tipoServicio.setUI(PropiedadesCB2.createUI(tipoServicio));
        tipoServicio.setPreferredSize(new Dimension(150, 30));
        tipoServicio.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        rellenarServicio.add(iconoSer);
        rellenarServicio.add(tipoServicio);
        rellenarServicio.add(cliente);
        rellenarServicio.add(iconoOkSer);

        return rellenarServicio;
    }

}
