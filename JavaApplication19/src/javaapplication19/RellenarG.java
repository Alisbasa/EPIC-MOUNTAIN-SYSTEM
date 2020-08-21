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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javaapplication19.Libros;
import static javaapplication19.Libros.listaGastos;
import static javaapplication19.Rellenar.addPlaceHolder;
import static javaapplication19.rellenarIngresos.fechaActualEscribir;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alex
 */
public class RellenarG {

    JPanel rellenarDesEquipo = new JPanel();
    JPanel rellenarDesInv = new JPanel();
    JPanel rellenarDesPacks = new JPanel();
    JPanel rellenarDesCompras = new JPanel();
    JPanel rellenarDeudasPagar = new JPanel();
    JPanel rellenarImpuestoG = new JPanel();
    JPanel rellenarMantenimiento = new JPanel();
    JPanel rellenarSuministros = new JPanel();
    JPanel rellenarPubliidad = new JPanel();
    JPanel rellenarTransporte = new JPanel();
    JPanel rellenarHonorarios = new JPanel();
    JPanel rellenarReducInv = new JPanel();
    static JPanel rellenarDevoluciones = new JPanel();
    JPanel rellenarDesecho = new JPanel();

    JLabel iconoDesarrollo = new JLabel();
    JLabel iconoDeudasPagar = new JLabel();
    JLabel iconoImpuesto = new JLabel();
    JLabel iconoMantenimiento = new JLabel();
    JLabel iconoSuministros = new JLabel();
    JLabel iconoPublicidad = new JLabel();
    JLabel iconoTransporte = new JLabel();
    JLabel iconoHonorarios = new JLabel();
    JLabel iconoReducInv = new JLabel();
    static JLabel iconoDevoluciones = new JLabel();

    JComboBox tipo;
    JComboBox desarrollo;
    JTextField desarrolloTipoCT;
    JTextField desarrolloTipoE;
    JTextField desarrolloTipoI;
    JTextField desarrolloTipoP;
    JTextField pieza;
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
    static JComboBox devolucion;
    JComboBox inventario;
    JTextField paqueteria;
    static JComboBox ventas;
   static String venta;
    static String cliente;
    int folioDev = 7;
    JTextField intento;

    JComboBox tipoDes;
    JComboBox equipoMob;

    JTextField montoDesCT;
    JTextField montoDesE;
    JTextField montoDesI;
    JTextField montoDesP;
    JTextField precioDesP;
    JTextField montoDeuda;
    JTextField montoImpuesto;
    JTextField montoMant;
    JTextField montoSum;
    JTextField montoPublicidad;
    JTextField montoTrans;
    JTextField montoHonor;
    JTextField montoReduc;
    JTextField descripcion;
    JTextField montoDev;

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
    static JLabel iconoOkDev = new JLabel();
    JLabel iconoOkDesecho = new JLabel();

    public JPanel rellenarDesEquipo() {

        rellenarDesEquipo.removeAll();
        rellenarDesEquipo.setBackground(Color.white);

        Iconos.scaleImage("Equipo", iconoDesarrollo, 30);
        rellenarDesEquipo.add(iconoDesarrollo);

        String[] lista = {"Herramientas", "Equipo de Taller", "Mobiliario", "Equipo de Limpieza"};

        tipo = new JComboBox(lista);
        tipo.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        tipo.setUI(PropiedadesCB2.createUI(tipo));

        desarrolloTipoE = new JTextField();
        desarrolloTipoE.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Equipo y Mobiliario", desarrolloTipoE);
        desarrolloTipoE.setBackground(Colores.epicColorBajito);
        desarrolloTipoE.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        desarrolloTipoE.setPreferredSize(new Dimension(150, 30));

        descripcion = new JTextField();
        descripcion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("Descripcion", descripcion);
        descripcion.setBackground(Colores.epicColorBajito);
        descripcion.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        descripcion.setPreferredSize(new Dimension(150, 30));

        montoDesE = new JTextField();
        montoDesE.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
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

    public JPanel rellenarDesInv() {

        rellenarDesInv.removeAll();
        rellenarDesInv.setBackground(Color.white);

        Iconos.scaleImage("Inventario", iconoDesarrollo, 30);
        Iconos.scaleImage("Inventario", iconoDesarrollo, 30);
        rellenarDesInv.add(iconoDesarrollo);

        desarrolloTipoI = new JTextField();
        desarrolloTipoI.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("PRODUCTO", desarrolloTipoI);
        desarrolloTipoI.setBackground(Colores.epicColorBajito);
        desarrolloTipoI.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        desarrolloTipoI.setPreferredSize(new Dimension(150, 30));
        tipoI = desarrolloTipoI.getText();

        String[] listaProductos = {"Nuevo", "Existente", "Aditamento"};
        producto = new JComboBox(listaProductos);
        producto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        producto.setUI(PropiedadesCB2.createUI(producto));
        
        producto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(producto.getSelectedItem().toString().equals("Existente")){
                    rellenarDesInv.removeAll();
                    rellenarDesInv.revalidate();
                    rellenarDesInv.repaint();
                    
                    rellenarDesInv.add(iconoDesarrollo);
                    rellenarDesInv.add(producto);
                    rellenarDesInv.add(iconoOkDesarrolloI);
                }
            }
        });

        montoDesI = new JTextField();
        montoDesI.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("MONTO", montoDesI);
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

    public JPanel rellenarDesPacks() {

        rellenarDesPacks.removeAll();
        rellenarDesPacks.setBackground(Color.white);

        Iconos.scaleImage("Packs", iconoDesarrollo, 30);
        rellenarDesPacks.add(iconoDesarrollo);

        desarrolloTipoP = new JTextField();
        addPlaceHolder("PACK", desarrolloTipoP);
        desarrolloTipoP.setBackground(Colores.epicColorBajito);
        desarrolloTipoP.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        desarrolloTipoP.setPreferredSize(new Dimension(150, 30));

        String[] tipos = {"Nuevo", "Rellenar Pack"};
        
        tipoPack = new JComboBox(tipos);
        tipoPack.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        tipoPack.setUI(PropiedadesCB2.createUI(tipoPack));

        montoDesP = new JTextField();
        montoDesP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("COSTO", montoDesP);
        montoDesP.setBackground(Colores.epicColorBajito);
        montoDesP.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        montoDesP.setPreferredSize(new Dimension(60, 30));

        precioDesP = new JTextField();
        precioDesP.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("PRECIO", precioDesP);
        precioDesP.setBackground(Colores.epicColorBajito);
        precioDesP.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        precioDesP.setPreferredSize(new Dimension(60, 30));

        Iconos.scaleImage("ok", iconoOkDesarrolloP, 30);
        rellenarDesPacks.add(tipoPack);

        tipoPack.addActionListener((ActionEvent event) -> {
            if (tipoPack.getSelectedItem().toString().equals("Nuevo")) {
                rellenarDesPacks.removeAll();
                rellenarDesPacks.revalidate();
                rellenarDesPacks.repaint();
                rellenarDesPacks.add(iconoDesarrollo);
                rellenarDesPacks.add(tipoPack);
                rellenarDesPacks.add(desarrolloTipoP);
                rellenarDesPacks.add(montoDesP);
                rellenarDesPacks.add(precioDesP);
                rellenarDesPacks.add(iconoOkDesarrolloP);

            } else if (tipoPack.getSelectedItem().toString().equals("Rellenar Pack")) {
                desarrolloTipoP.removeAll();
                desarrolloTipoP.updateUI();
                addPlaceHolder("ITEM", desarrolloTipoP);
                rellenarDesPacks.removeAll();
                rellenarDesPacks.revalidate();
                rellenarDesPacks.repaint();
                rellenarDesPacks.add(iconoDesarrollo);
                rellenarDesPacks.add(tipoPack);
                rellenarDesPacks.add(desarrolloTipoP);
                rellenarDesPacks.add(precioDesP);
                rellenarDesPacks.add(iconoOkDesarrolloP);
            }
        });

        return rellenarDesPacks;
    }

    public JPanel rellenarDesCompras() throws IOException {

        rellenarDesCompras.removeAll();
        rellenarDesCompras.setBackground(Color.white);

        Iconos.scaleImage("Compras", iconoDesarrollo, 30);
        rellenarDesCompras.add(iconoDesarrollo);

        String[] listaComprasCT = {"HERRAMIENTAS", "EQUIPO DE TALLER", "MOBILIARIO", "EQUIPO DE LIMPIEZA", "INVENTARIO PRINCIPAL", "PACK DE VENTAS", "EGRESO"};
        productoCT = new JComboBox(listaComprasCT);
        productoCT.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        productoCT.setUI(PropiedadesCB2.createUI(productoCT));
        productoCT.setPreferredSize(new Dimension(250, 30));

        paqueteria = new JTextField();
        paqueteria.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("PAQUETERIA", paqueteria);
        paqueteria.setBackground(Colores.epicColorBajito);
        paqueteria.setPreferredSize(new Dimension(100, 30));

        Iconos.scaleImage("ok", iconoOkDesarrolloCT, 30);

        rellenarDesCompras.add(productoCT);
        rellenarDesCompras.add(paqueteria);
        rellenarDesCompras.add(iconoOkDesarrolloCT);

        return rellenarDesCompras;
    }

    public JPanel rellenarDeudasPagar() throws IOException {

        rellenarDeudasPagar.removeAll();

        rellenarDeudasPagar.setBackground(Color.white);
        Iconos.scaleImage("DeudasP_1", iconoDeudasPagar, 40);
        rellenarDeudasPagar.add(iconoDeudasPagar);
        Iconos.scaleImage("ok", iconoOkDeudas, 30);

        deudas = new JComboBox(LeerExcel.rellenaCB2("src//excel/deudasP.xlsx", "deudasPagar", 1));
        deudas.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        deudas.setBackground(Color.white);
        deudas.setUI(PropiedadesCB2.createUI(deudas));

        montoDeuda = new JTextField();
        montoDeuda.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("COSTO", montoDeuda);
        montoDeuda.setPreferredSize(new Dimension(60, 30));
        montoDeuda.setBackground(Colores.epicColorBajito);
        montoDeuda.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        deudas.setPreferredSize(new Dimension(150, 30));

        rellenarDeudasPagar.add(deudas);
        rellenarDeudasPagar.add(montoDeuda);
        rellenarDeudasPagar.add(iconoOkDeudas);

        return rellenarDeudasPagar;
    }

    public JPanel rellenarImpuestoG() {

        rellenarImpuestoG.removeAll();

        rellenarImpuestoG.setBackground(Color.white);
        Iconos.scaleImage("Impuesto", iconoImpuesto, 25);
        rellenarImpuestoG.add(iconoImpuesto);
        Iconos.scaleImage("ok", iconoOkImpuesto, 30);
        impuesto = new JTextField();
        impuesto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        impuesto.setBackground(Colores.epicColorBajito);
        impuesto.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        addPlaceHolder("IMPUESTO", impuesto);

        montoImpuesto = new JTextField();
        montoImpuesto.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("COSTO", montoImpuesto);
        montoImpuesto.setPreferredSize(new Dimension(60, 30));
        montoImpuesto.setBackground(Colores.epicColorBajito);
        montoImpuesto.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        impuesto.setPreferredSize(new Dimension(150, 30));

        rellenarImpuestoG.add(impuesto);
        rellenarImpuestoG.add(montoImpuesto);
        rellenarImpuestoG.add(iconoOkImpuesto);

        return rellenarImpuestoG;
    }

    public JPanel rellenarMantenimiento() {
        rellenarMantenimiento.removeAll();

        rellenarMantenimiento.setBackground(Color.white);
        Iconos.scaleImage("Mantenimiento", iconoMantenimiento, 25);
        rellenarMantenimiento.add(iconoMantenimiento);
        Iconos.scaleImage("ok", iconoOkMantenimiento, 30);
        mantenimiento = new JTextField();
        mantenimiento.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("MANTENIMIENTO", mantenimiento);
        mantenimiento.setBackground(Colores.epicColorBajito);
        mantenimiento.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        montoMant = new JTextField();
        montoMant.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("COSTO", montoMant);
        montoMant.setPreferredSize(new Dimension(60, 30));
        montoMant.setBackground(Colores.epicColorBajito);
        montoMant.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        mantenimiento.setPreferredSize(new Dimension(150, 30));

        rellenarMantenimiento.add(mantenimiento);
        rellenarMantenimiento.add(montoMant);
        rellenarMantenimiento.add(iconoOkMantenimiento);

        return rellenarMantenimiento;
    }

    public JPanel rellenarSuministros() {
        rellenarSuministros.removeAll();

        rellenarSuministros.setBackground(Color.white);
        Iconos.scaleImage("Suministros", iconoSuministros, 40);
        rellenarSuministros.add(iconoSuministros);
        Iconos.scaleImage("ok", iconoOkSuministros, 30);
        suministros = new JTextField();
        suministros.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        suministros.setBackground(Colores.epicColorBajito);
        suministros.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        addPlaceHolder("SUMINISTROS", suministros);

        montoSum = new JTextField();
        montoSum.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("COSTO", montoSum);
        montoSum.setPreferredSize(new Dimension(60, 30));
        montoSum.setBackground(Colores.epicColorBajito);
        montoSum.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        suministros.setPreferredSize(new Dimension(150, 30));

        rellenarSuministros.add(suministros);
        rellenarSuministros.add(montoSum);
        rellenarSuministros.add(iconoOkSuministros);

        return rellenarSuministros;
    }

    public JPanel rellenarPubliidad() {
        rellenarPubliidad.removeAll();

        rellenarPubliidad.setBackground(Color.white);
        Iconos.scaleImage("publicidad", iconoPublicidad, 40);
        rellenarPubliidad.add(iconoPublicidad);
        Iconos.scaleImage("ok", iconoOkPublicidad, 30);
        publicidad = new JTextField();
        publicidad.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        publicidad.setBackground(Colores.epicColorBajito);
        publicidad.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        addPlaceHolder("PUBLICIDAD", publicidad);

        montoPublicidad = new JTextField();
        montoPublicidad.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("COSTO", montoPublicidad);
        montoPublicidad.setPreferredSize(new Dimension(60, 30));
        montoPublicidad.setBackground(Colores.epicColorBajito);
        montoPublicidad.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        publicidad.setPreferredSize(new Dimension(150, 30));

        rellenarPubliidad.add(publicidad);
        rellenarPubliidad.add(montoPublicidad);
        rellenarPubliidad.add(iconoOkPublicidad);

        return rellenarPubliidad;
    }

    public JPanel rellenarTransporte() {
        rellenarTransporte.removeAll();

        rellenarTransporte.setBackground(Color.white);
        Iconos.scaleImage("transporte", iconoTransporte, 40);
        rellenarTransporte.add(iconoTransporte);
        Iconos.scaleImage("ok", iconoOkTransporte, 30);
        transporte = new JTextField();
        transporte.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        transporte.setBackground(Colores.epicColorBajito);
        transporte.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        addPlaceHolder("Transporte", transporte);

        montoTrans = new JTextField();
        montoTrans.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("COSTO", montoTrans);
        montoTrans.setPreferredSize(new Dimension(60, 30));
        montoTrans.setBackground(Colores.epicColorBajito);
        montoTrans.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        transporte.setPreferredSize(new Dimension(150, 30));

        rellenarTransporte.add(transporte);
        rellenarTransporte.add(montoTrans);
        rellenarTransporte.add(iconoOkTransporte);

        return rellenarTransporte;
    }

    public JPanel rellenarHonorarios() {

        rellenarHonorarios.removeAll();

        rellenarHonorarios.setBackground(Color.white);
        Iconos.scaleImage("honorarios", iconoHonorarios, 40);
        rellenarHonorarios.add(iconoHonorarios);
        Iconos.scaleImage("ok", iconoOkHonorarios, 30);
        honorarios = new JTextField();
        honorarios.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        honorarios.setBackground(Colores.epicColorBajito);
        honorarios.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        addPlaceHolder("HONORARIOS", honorarios);

        montoHonor = new JTextField();
        montoHonor.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        addPlaceHolder("MONTO", montoHonor);
        montoHonor.setPreferredSize(new Dimension(60, 30));
        montoHonor.setBackground(Colores.epicColorBajito);
        montoHonor.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

        honorarios.setPreferredSize(new Dimension(150, 30));

        rellenarHonorarios.add(honorarios);
        rellenarHonorarios.add(montoHonor);
        rellenarHonorarios.add(iconoOkHonorarios);

        return rellenarHonorarios;
    }

    public JPanel rellenarReducInv() throws IOException {

        rellenarReducInv.removeAll();

        rellenarReducInv.setBackground(Color.white);
        Iconos.scaleImage("Inventario", iconoReducInv, 40);
        rellenarReducInv.add(iconoReducInv);
        Iconos.scaleImage("ok", iconoOkReducInv, 30);

        reducInv = new JComboBox(LeerExcel.rellenaCB2("src//excel/Inventario.xlsx", "EPIC MOUNTAIN", 0));
        reducInv.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        reducInv.setBackground(Color.white);
        reducInv.setUI(PropiedadesCB2.createUI(reducInv));

        reducInv.setPreferredSize(new Dimension(250, 30));

        rellenarReducInv.add(reducInv);

        rellenarReducInv.add(iconoOkReducInv);

        return rellenarReducInv;
    }

    void getVenta(JComboBox venta2) {
        venta2.getSelectedItem();
        venta = venta2.getSelectedItem().toString();
    }

   static public JPanel rellenarDevoluciones(JPanel panelAbuelo) throws IOException {
        try {
            rellenarDevoluciones.removeAll();

            rellenarDevoluciones.setBackground(Color.white);
            Iconos.scaleImage("Inventario", iconoDevoluciones, 40);

            Iconos.scaleImage("ok", iconoOkDev, 30);

            devolucion = new JComboBox(LeerExcel.obtenerHoja("src//excel/historialCompras.xlsx"));
            devolucion.setBackground(Color.white);
            devolucion.setUI(PropiedadesCB2.createUI(devolucion));
            devolucion.setPreferredSize(new Dimension(200, 30));
            devolucion.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));

            

            rellenarDevoluciones.add(iconoDevoluciones);
            rellenarDevoluciones.add(devolucion);

            devolucion.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    panelAbuelo.removeAll();
            panelAbuelo.revalidate();
            panelAbuelo.repaint();
             
             
                
            
            try {
                panelAbuelo.add(RellenarG.rellenarDevoluciones2(devolucion.getSelectedItem().toString(),panelAbuelo));
            } catch (IOException ex) {
                Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            });

        } catch (IOException ex) {
            Caption ventanaEx = new Caption("Recuerda cerrar Excel");
            ventanaEx.setVisible(true);
        }

        return rellenarDevoluciones;
    }
   
   
   static public JPanel rellenarDevoluciones2(String cliente,JPanel panelAbuelo) throws IOException {
        try {
            rellenarDevoluciones.removeAll();

            rellenarDevoluciones.setBackground(Color.white);
            Iconos.scaleImage("Inventario", iconoDevoluciones, 40);

            Iconos.scaleImage("ok", iconoOkDev, 30);

            rellenarGastos rellenarDevo = new rellenarGastos();

            ventas = new JComboBox(LeerExcel.rellenaCB2("src//excel/historialCompras.xlsx", cliente, 0));
            ventas.setBackground(Color.white);
            ventas.setUI(PropiedadesCB2.createUI(ventas));
            ventas.setPreferredSize(new Dimension(300, 30));
            ventas.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
            venta=ventas.getSelectedItem().toString();
            rellenarDevoluciones.add(iconoDevoluciones);
            rellenarDevoluciones.add(ventas);
            
            rellenarDevo.botonDev(devolucion, ventas,venta, iconoOkDev,listaGastos,rellenarDevoluciones, panelAbuelo);
            rellenarDevoluciones.add(iconoOkDev);

        } catch (IOException ex) {
            Caption ventanaEx = new Caption("Recuerda cerrar Excel");
            ventanaEx.setVisible(true);
        }

        return rellenarDevoluciones;
    }
   
  

    public JPanel rellenarDesecho() {
        rellenarDesecho.removeAll();
        rellenarDesecho.setBackground(Color.white);
        Iconos.scaleImage("Equipo", iconoDesarrollo, 40);

        String[] lista = {"Equipo y Mob.", "Inventario"};

        tipoDes = new JComboBox(lista);
        tipoDes.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 14));
        tipoDes.setUI(PropiedadesCB2.createUI(tipoDes));
        tipoDes.setPreferredSize(new Dimension(150, 30));
        Iconos.scaleImage("ok", iconoOkDesecho, 30);

        rellenarDesecho.add(iconoDesarrollo);
        rellenarDesecho.add(tipoDes);

        tipoDes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (tipoDes.getSelectedItem().toString().equals("Equipo y Mob.")) {

                    rellenarDesecho.removeAll();
                    rellenarDesecho.revalidate();
                    rellenarDesecho.repaint();

                    rellenarDesecho.add(tipoDes);
                    rellenarDesecho.add(iconoOkDesecho);

                } else if (tipoDes.getSelectedItem().toString().equals("Inventario")) {

                    rellenarDesecho.removeAll();
                    rellenarDesecho.revalidate();
                    rellenarDesecho.repaint();

                    rellenarDesecho.add(tipoDes);
                    rellenarDesecho.add(iconoOkDesecho);

                }

            }
        });

        return rellenarDesecho;
    }

    public static String numeroMes() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM");
        return formatoFecha.format(fecha);
    }

}
