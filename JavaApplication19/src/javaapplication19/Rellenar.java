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
    JPanel rellenarDevoluciones = new JPanel();

    JLabel iconoVentas = new JLabel();
    JLabel iconoCredito = new JLabel();
    JLabel iconoInversion = new JLabel();
    JLabel iconoImpuesto = new JLabel();
    JLabel iconoDeudasC = new JLabel();
    JLabel iconoVentasC = new JLabel();
    JLabel iconoDevoluciones = new JLabel();

    JLabel iconoOkV = new JLabel();
    JLabel iconoOkC = new JLabel();
    JLabel iconoOkI = new JLabel();
    JLabel iconoOkImp = new JLabel();
    JLabel iconoOkDeudasC = new JLabel();
    JLabel iconoOkVentasC = new JLabel();
    JLabel iconoOkDev = new JLabel();

    JTextField monto;
    JTextField montoC;
    JTextField montoI;
    JTextField montoImp;
    JTextField montoDeuC;
    JTextField montoVC;
    JTextField montoDev;

    JComboBox inventario; //Ventas //VentasC
    JComboBox unidades;
    int numeroUnidades;
    JComboBox plataformacb;//Ventas
    JComboBox cliente;//Ventas//VentasC
    JTextField destino;//Ventas

    JTextField inversor;
    JTextField inversorI;
    JTextField impuesto;
    int indexInventario = 1;

    JComboBox devolucion;

    JComboBox deudor; //DeudasC

    public JPanel rellenarVentas() throws IOException {
        rellenarVentas.removeAll();

        rellenarVentas.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoVentas, 40);
        rellenarVentas.add(iconoVentas);

        String[] listaPlataformas = {"Mercado Libre", "Local"};

        inventario = new JComboBox(LeerExcel.rellenaCB2("src//excel/Inventario.xlsx", "Inventario", 0));
        inventario.setBackground(Color.white);
        inventario.setUI(PropiedadesCB2.createUI(inventario));
        inventario.setPreferredSize(new Dimension(200, 30));
        inventario.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        unidades = new JComboBox();
        unidades.setBackground(Color.white);
        unidades.setUI(PropiedadesCB2.createUI(inventario));
        unidades.setPreferredSize(new Dimension(65, 30));
        unidades.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        cliente = new JComboBox(LeerExcel.rellenaCB2("src//excel//CRM.xlsx", "Clientes", 0));
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
                    numeroUnidades =(int) LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", "Inventario", 6, indexInventario + 1);
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
        
        
        
        montoC = new JTextField("");
         montoC.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Monto", montoC);
        montoC.setPreferredSize(new Dimension(60, 30));
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
        inversorI = new JTextField("");
        inversorI.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        inversorI.setBackground(Colores.epicColorBajito);
        inversorI.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        
        addPlaceHolder("Inversionista", inversorI);
        montoI = new JTextField("");
        montoI.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Monto", montoI);
        montoI.setPreferredSize(new Dimension(60, 30));
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
        montoImp = new JTextField("");
        montoImp.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Monto", montoImp);
        montoImp.setPreferredSize(new Dimension(60, 30));
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

        deudor = new JComboBox(LeerExcel.rellenaCB2("src//excel/deudasC.xlsx", "deudasCobrar", 1));
        //deudor = new JComboBox(LeerExcel.obtenerHoja("src//excel/deudasC.xlsx"));
        deudor.addItem("Nuevo");
        deudor.setBackground(Color.white);
        deudor.setUI(PropiedadesCB2.createUI(deudor));
        deudor.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        

        montoDeuC = new JTextField("");
        montoDeuC.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Monto", montoDeuC);
        montoDeuC.setBorder(new LineBorder(Colores.epicColor, 0, true));
        montoDeuC.setBackground(Colores.epicColorBajito);
        montoDeuC.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        
        

        montoDeuC.setPreferredSize(new Dimension(60, 30));
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

        inventario = new JComboBox(LeerExcel.rellenaCB2("src//excel/Inventario.xlsx", "Inventario", 0));
        inventario.setBackground(Color.white);
        inventario.setUI(PropiedadesCB2.createUI(inventario));
        inventario.setPreferredSize(new Dimension(200, 30));
        inventario.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        
        
        unidades = new JComboBox();
        unidades.setBackground(Color.white);
        unidades.setUI(PropiedadesCB2.createUI(inventario));
        unidades.setPreferredSize(new Dimension(65, 30));
        unidades.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        

        cliente = new JComboBox(LeerExcel.rellenaCB2("src//excel//CRM.xlsx", "Clientes", 0));
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
                    numeroUnidades =(int) LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", "Inventario", 6, indexInventario + 1);
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

    public JPanel rellenarDevoluciones() throws IOException {
        rellenarDevoluciones.removeAll();

        rellenarDevoluciones.setBackground(Color.white);
        Iconos.scaleImage("Inventario", iconoDevoluciones, 40);
        

        devolucion = new JComboBox(LeerExcel.rellenaCB2("src\\excel\\Ventas.xlsx", fechaActualEscribir().toUpperCase(), 0));
        devolucion.setBackground(Color.white);
        devolucion.setUI(PropiedadesCB2.createUI(inventario));
        devolucion.setPreferredSize(new Dimension(300,30));
        devolucion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));

        

        
        Iconos.scaleImage("ok", iconoOkDev, 30);
        rellenarDevoluciones.add(iconoDevoluciones);
        rellenarDevoluciones.add(devolucion);
        
        rellenarDevoluciones.add(iconoOkDev);

        return rellenarDevoluciones;
    }
}
