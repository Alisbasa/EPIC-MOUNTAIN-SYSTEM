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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javaapplication19.Rellenar;
import javax.swing.ImageIcon;

public class rellenarIngresos {
    public List<JPanel> panelesIngresos;
    public int indice=0;
    
    public rellenarIngresos(){
        panelesIngresos = new ArrayList<>();
    }
    
    //Pone ingreso: venta
    void botonVenta(JTextField monto, JComboBox inventario, JLabel iconoOkV, JScrollPane scrollIngresos, JPanel listaIngresos){
        MouseListener botonV = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelIngreso = new JPanel();
            panelIngreso.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            panelIngreso.setLayout(new GridLayout(1,4));
            panelIngreso.setBackground(Color.white);
            panelIngreso.setMaximumSize(new Dimension(600,60));
            panelIngreso.setPreferredSize(new Dimension(600,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            fecha.setText(fechaActual());

            JLabel inventarioLista = new JLabel();
            inventarioLista.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            inventarioLista.setText((String) inventario.getSelectedItem());

            JLabel precio = new JLabel();
            precio.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            precio.setText(monto.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("Ventas", icono, 50);
            listaIngresos.add(panelIngreso);
            panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

            panelIngreso.add(fecha);
            panelIngreso.add(inventarioLista);
            panelIngreso.add(precio);
            panelIngreso.add(icono);

            indice++;
            listaIngresos.updateUI();
        }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkV.addMouseListener(botonV);
    }

    //Para rellenar un ingreso:credito
    void botonCredito(JTextField montoC, JTextField inversor, JLabel iconoOkC,JScrollPane scrollIngresos, JPanel listaIngresos){
        MouseListener botonC = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelIngresoC = new JPanel();
            panelIngresoC.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            panelIngresoC.setLayout(new GridLayout(1,4));
            panelIngresoC.setBackground(Color.white);
            panelIngresoC.setMaximumSize(new Dimension(600,60));
            panelIngresoC.setPreferredSize(new Dimension(600,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            fecha.setText(fechaActual());

            JLabel credito = new JLabel();
            credito.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            credito.setText(inversor.getText());

            JLabel precio = new JLabel();
            precio.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            precio.setText(montoC.getText());

            JLabel icono = new JLabel();
            icono.setIcon(new ImageIcon("..\\src\\img\\Ventas.png"));
            listaIngresos.add(panelIngresoC);
            panelesIngresos.add(panelIngresoC);//Ingresa el panelVenta a la arraylist panelesInresos

            panelIngresoC.add(fecha);
            panelIngresoC.add(credito);
            panelIngresoC.add(precio);
            panelIngresoC.add(icono);

            indice++;
            listaIngresos.updateUI();
        }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkC.addMouseListener(botonC);
    }
    
    //Para rellenar un ingreso:inversion
    public void botonInversion(JTextField montoI, JTextField inversorI, JLabel iconoOkI,JScrollPane scrollIngresos, JPanel listaIngresos){
        MouseListener botonI = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelIngresoI = new JPanel();
            panelIngresoI.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            panelIngresoI.setLayout(new GridLayout(1,4));
            panelIngresoI.setBackground(Color.white);
            panelIngresoI.setMaximumSize(new Dimension(600,60));
            panelIngresoI.setPreferredSize(new Dimension(600,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            fecha.setText(fechaActual());

            JLabel inversionista = new JLabel();
            inversionista.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            inversionista.setText(inversorI.getText());

            JLabel precioI = new JLabel();
            precioI.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            precioI.setText(montoI.getText());

            JLabel icono = new JLabel();
            icono.setIcon(new ImageIcon("src\\img\\Ventas.png"));
            listaIngresos.add(panelIngresoI);
            panelesIngresos.add(panelIngresoI);//Ingresa el panelVenta a la arraylist panelesInresos

            panelIngresoI.add(fecha);
            panelIngresoI.add(inversionista);
            panelIngresoI.add(precioI);
            panelIngresoI.add(icono);

            indice++;
            listaIngresos.updateUI();
        }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkI.addMouseListener(botonI);
    }
    
    //Para rellenar un ingreso:impuesto
    public void botonImpuesto(JTextField montoImp, JTextField impuesto, JLabel iconoOkImp,JScrollPane scrollIngresos, JPanel listaIngresos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelIngresoImp = new JPanel();
            panelIngresoImp.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            panelIngresoImp.setLayout(new GridLayout(1,4));
            panelIngresoImp.setBackground(Color.white);
            panelIngresoImp.setMaximumSize(new Dimension(600,60));
            panelIngresoImp.setPreferredSize(new Dimension(600,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            fecha.setText(fechaActual());

            JLabel imp = new JLabel();
            imp.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            imp.setText(impuesto.getText());

            JLabel montoImpuesto = new JLabel();
            montoImpuesto.setFont(new Font("Franklin Gothic",Font.PLAIN,18));
            montoImpuesto.setText(montoImp.getText());

            JLabel icono = new JLabel();
            icono.setIcon(new ImageIcon("..\\src\\img\\Ventas.png"));
            listaIngresos.add(panelIngresoImp);
            panelesIngresos.add(panelIngresoImp);//Ingresa el panelVenta a la arraylist panelesInresos

            panelIngresoImp.add(fecha);
            panelIngresoImp.add(imp);
            panelIngresoImp.add(montoImpuesto);
            panelIngresoImp.add(icono);

            indice++;
            listaIngresos.updateUI();
        }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkImp.addMouseListener(botonImp);
    }

    public static String fechaActual(){
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM");
        return formatoFecha.format(fecha);
    }

    
}
