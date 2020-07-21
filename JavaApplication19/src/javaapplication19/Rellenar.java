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

    JTextField devolucion;

    JComboBox deudor; //DeudasC

    public JPanel rellenarVentas() throws IOException {
        rellenarVentas.removeAll();

        rellenarVentas.setBackground(Color.white);
        Iconos.scaleImage("Ventas", iconoVentas, 40);
        rellenarVentas.add(iconoVentas);

        String[] listaPlataformas = {"Mercado Libre", "Amazon", "Shopiffy"};

        inventario = new JComboBox(LeerExcel.rellenaCB2("src//excel/Inventario.xlsx", "INVENTARIO", 0));
        inventario.setBackground(Color.white);
        inventario.setUI(PropiedadesCB2.createUI(inventario));
        inventario.setPreferredSize(new Dimension(200, 30));
        
        unidades = new JComboBox();
        unidades.setBackground(Color.white);
        unidades.setUI(PropiedadesCB2.createUI(inventario));
        unidades.setPreferredSize(new Dimension(55, 30));

        cliente = new JComboBox(LeerExcel.rellenaCB2("src//excel//CRM.xlsx", "CLIENTES", 0));
        cliente.addItem("Nuevo Cliente");
        cliente.setBackground(Color.white);
        cliente.setUI(PropiedadesCB2.createUI(cliente));

        plataformacb = new JComboBox(listaPlataformas);
        plataformacb.setBackground(Color.white);
        plataformacb.setUI(PropiedadesCB2.createUI(plataformacb));

        destino = new JTextField("Destino");
        destino.setBorder(new LineBorder(Colores.epicColor, 0, true));
        destino.setBackground(Colores.epicColorBajito);
        destino.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        Iconos.scaleImage("ok", iconoOkV, 30);

        rellenarVentas.add(inventario);
        

        inventario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexInventario = inventario.getSelectedIndex();
                try {
                    numeroUnidades =(int)LeerExcel.obtenerCeldaNumerica("src//excel/Inventario.xlsx", "INVENTARIO", 6, indexInventario + 1);
                } catch (IOException ex) {
                    Logger.getLogger(Rellenar.class.getName()).log(Level.SEVERE, null, ex);
                }
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

    public JPanel rellenarCredito() {
        rellenarCredito.removeAll();

        rellenarCredito.setBackground(Color.white);
        Iconos.scaleImage("Credito", iconoCredito, 40);
        rellenarCredito.add(iconoCredito);
        Iconos.scaleImage("ok", iconoOkC, 30);

        inversor = new JTextField("Prestamista");
        montoC = new JTextField("$");
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
        inversorI = new JTextField("Inversor");
        montoI = new JTextField("$");
        montoI.setPreferredSize(new Dimension(60, 30));
        inversorI.setPreferredSize(new Dimension(150, 30));
        montoI.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoI.setBackground(Colores.epicColorBajito);
        montoI.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

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
        impuesto = new JTextField("Impuesto");
        montoImp = new JTextField("$");
        montoImp.setPreferredSize(new Dimension(60, 30));
        impuesto.setPreferredSize(new Dimension(150, 30));
        montoImp.setBackground(Colores.epicColorBajito);
        montoImp.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        rellenarImpuesto.add(impuesto);
        rellenarImpuesto.add(montoImp);

        rellenarImpuesto.add(iconoOkImp);

        return rellenarImpuesto;
    }

    public JPanel rellenarDeudasC() {
        rellenarDeudasC.removeAll();

        rellenarDeudasC.setBackground(Color.white);
        Iconos.scaleImage("DeudasC", iconoDeudasC, 40);
        rellenarDeudasC.add(iconoDeudasC);
        String[] listaDeudores = {"Panchito", "Mario", "Navarro"};

        deudor = new JComboBox(listaDeudores);
        deudor.setBackground(Color.white);
        deudor.setUI(PropiedadesCB2.createUI(deudor));

        montoDeuC = new JTextField("$");
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
        rellenarVentasC.removeAll();

        rellenarVentasC.setBackground(Color.white);
        Iconos.scaleImage("VentasC", iconoVentasC, 40);
        rellenarVentasC.add(iconoVentasC);
        String[] listaInventario = {"inventario", "Bici chingona", "Bici Chingona 2", "Bici Chingona 3"};
        String[] listaPlataformas = {"Mercado Libre", "Facebook", "Amazon", "Shopiffy"};
        String[] listaCRM = {"Alejandro", "Alvaro"};

        inventario = new JComboBox(LeerExcel.rellenaCB2("src//excel/Inventario.xlsx", "INVENTARIO", 0));
        inventario.setBackground(Color.white);
        inventario.setUI(PropiedadesCB2.createUI(inventario));

        cliente = new JComboBox(LeerExcel.rellenaCB2("src//excel/CRM.xlsx", "CLIENTES", 0));
        cliente.addItem("Nuevo Cliente");
        cliente.setBackground(Color.white);
        cliente.setUI(PropiedadesCB2.createUI(cliente));

        plataformacb = new JComboBox(listaPlataformas);
        plataformacb.setBackground(Color.white);
        plataformacb.setUI(PropiedadesCB2.createUI(plataformacb));

        montoVC = new JTextField("$");
        montoVC.setBorder(new LineBorder(Colores.epicColor, 0, true));
        montoVC.setBackground(Colores.epicColorBajito);
        montoVC.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
//      
        montoVC.setPreferredSize(new Dimension(60, 30));
        Iconos.scaleImage("ok", iconoOkVentasC, 30);

        rellenarVentasC.add(inventario);
        rellenarVentasC.add(montoVC);
        rellenarVentasC.add(cliente);
        rellenarVentasC.add(plataformacb);
        rellenarVentasC.add(iconoOkVentasC);

        return rellenarVentasC;
    }

    public JPanel rellenarDevoluciones() {
        rellenarDevoluciones.removeAll();

        rellenarDevoluciones.setBackground(Color.white);
        Iconos.scaleImage("Devolucion", iconoDevoluciones, 40);
        rellenarDevoluciones.add(iconoDevoluciones);

        devolucion = new JTextField("Devolucion");
        devolucion.setBorder(new LineBorder(Colores.epicColor, 0, true));
        devolucion.setBackground(Colores.epicColorBajito);
        devolucion.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        devolucion.setPreferredSize(new Dimension(150, 30));

        montoDev = new JTextField("$");
        montoDev.setBorder(new LineBorder(Colores.epicColor, 0, true));
        montoDev.setBackground(Colores.epicColorBajito);
        montoDev.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoDev.setPreferredSize(new Dimension(60, 30));

        montoDev.setPreferredSize(new Dimension(60, 30));
        Iconos.scaleImage("ok", iconoOkDev, 30);

        rellenarDevoluciones.add(devolucion);
        rellenarDevoluciones.add(montoDev);
        rellenarDevoluciones.add(iconoOkDev);

        return rellenarDevoluciones;
    }
}
