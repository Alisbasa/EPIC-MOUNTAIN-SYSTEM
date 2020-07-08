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

public class rellenarGastos {
    public List<JPanel> panelesGastos;
    public int indice=0;
    
    public rellenarGastos(){
        panelesGastos = new ArrayList<>();
    }
    
    //Pone Gasto: venta
    void botonDesarrollo(JTextField monto, JComboBox desarrollo, JLabel iconoOkDes, JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonV = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelGasto = new JPanel();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Color.white);
            panelGasto.setMaximumSize(new Dimension(600,40));
            panelGasto.setPreferredSize(new Dimension(600,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel desarrolloLista = new JLabel();
            desarrolloLista.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            desarrolloLista.setText((String) desarrollo.getSelectedItem());

            JLabel precio = new JLabel();
            precio.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precio.setText(monto.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("Ventas", icono, 30);
            listaGastos.add(panelGasto);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGasto.add(fecha);
            panelGasto.add(desarrolloLista);
            panelGasto.add(precio);
            panelGasto.add(icono);

            indice++;
            listaGastos.updateUI();
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

    //Para rellenar un Gasto:deudas
    void botonDeudas(JTextField montoD, JTextField deudas, JLabel iconoOkD,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonC = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelGastoC = new JPanel();
            panelGastoC.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGastoC.setLayout(new GridLayout(1,4));
            panelGastoC.setBackground(Color.white);
            panelGastoC.setMaximumSize(new Dimension(600,40));
            panelGastoC.setPreferredSize(new Dimension(600,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel deudas = new JLabel();
            deudas.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            deudas.setText(deudas.getText());

            JLabel precio = new JLabel();
            precio.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precio.setText(montoD.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("Deudas", icono, 30);
            listaGastos.add(panelGastoC);
            panelesGastos.add(panelGastoC);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGastoC.add(fecha);
            panelGastoC.add(deudas);
            panelGastoC.add(precio);
            panelGastoC.add(icono);

            indice++;
            listaGastos.updateUI();
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
        
        iconoOkD.addMouseListener(botonC);
    }
    
    //Para rellenar un Gasto:inversion
    public void botonMantenimiento(JTextField montoMant, JTextField mantenimiento, JLabel iconoOkM,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonI = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelGastoM = new JPanel();
            panelGastoM.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGastoM.setLayout(new GridLayout(1,4));
            panelGastoM.setBackground(Color.white);
            panelGastoM.setMaximumSize(new Dimension(600,40));
            panelGastoM.setPreferredSize(new Dimension(600,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel descripcion = new JLabel();
            descripcion.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            descripcion.setText(inversorM.getText());

            JLabel precioI = new JLabel();
            precioI.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precioI.setText(montoM.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("Mantenimiento", icono, 30);
            listaGastos.add(panelGastoM);
            panelesGastos.add(panelGastoM);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGastoM.add(fecha);
            panelGastoM.add(descripcion);
            panelGastoM.add(precioI);
            panelGastoM.add(icono);

            indice++;
            listaGastos.updateUI();
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
        
        iconoOkM.addMouseListener(botonI);
    }
    
    //Para rellenar un Gasto:impuesto
    public void botonImpuestoG(JTextField montoImp, JTextField impuesto, JLabel iconoOkImp,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelGastoMmp = new JPanel();
            panelGastoMmp.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGastoMmp.setLayout(new GridLayout(1,4));
            panelGastoMmp.setBackground(Color.white);
            panelGastoMmp.setMaximumSize(new Dimension(600,40));
            panelGastoMmp.setPreferredSize(new Dimension(600,40));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel imp = new JLabel();
            imp.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            imp.setText(impuesto.getText());

            JLabel montoImpuesto = new JLabel();
            montoImpuesto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            montoImpuesto.setText(montoImp.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("Impuesto", icono, 30);
            listaGastos.add(panelGastoMmp);
            panelesGastos.add(panelGastoMmp);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGastoMmp.add(fecha);
            panelGastoMmp.add(imp);
            panelGastoMmp.add(montoImpuesto);
            panelGastoMmp.add(icono);

            indice++;
            listaGastos.updateUI();
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
    
    public void botonSuministros(JTextField monto, JTextField suministro, JLabel iconoOkSum,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelGasto = new JPanel();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Color.white);
            panelGasto.setMaximumSize(new Dimension(600,40));
            panelGasto.setPreferredSize(new Dimension(600,40));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel sum = new JLabel();
            sum.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            sum.setText(suministro.getText());

            JLabel monto = new JLabel();
            monto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            monto.setText(monto.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("Impuesto", icono, 30);
            listaGastos.add(panelGasto);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGasto.add(fecha);
            panelGasto.add(sum);
            panelGasto.add(monto);
            panelGasto.add(icono);

            indice++;
            listaGastos.updateUI();
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
        
        iconoOkSum.addMouseListener(botonImp);
    }

    public static String fechaActual(){
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM");
        return formatoFecha.format(fecha);
    }
    
    public void botonPublicidad(JTextField monto, JTextField publicidad, JLabel iconoOkPub,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonPub = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelGasto = new JPanel();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Color.white);
            panelGasto.setMaximumSize(new Dimension(600,40));
            panelGasto.setPreferredSize(new Dimension(600,40));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel pub = new JLabel();
            pub.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            pub.setText(publicidad.getText());

            JLabel monto = new JLabel();
            monto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            monto.setText(monto.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("Impuesto", icono, 30);
            listaGastos.add(panelGasto);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGasto.add(fecha);
            panelGasto.add(pub);
            panelGasto.add(monto);
            panelGasto.add(icono);

            indice++;
            listaGastos.updateUI();
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
        
        iconoOkPub.addMouseListener(botonPub);
    }
    
    public void botonTransporte(JTextField monto, JTextField transporte, JLabel iconoOkTrans,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelGasto = new JPanel();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Color.white);
            panelGasto.setMaximumSize(new Dimension(600,40));
            panelGasto.setPreferredSize(new Dimension(600,40));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel trans = new JLabel();
            trans.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            trans.setText(transporte.getText());

            JLabel monto = new JLabel();
            monto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            monto.setText(monto.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("Impuesto", icono, 30);
            listaGastos.add(panelGasto);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGasto.add(fecha);
            panelGasto.add(trans);
            panelGasto.add(monto);
            panelGasto.add(icono);

            indice++;
            listaGastos.updateUI();
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
        
        iconoOkTrans.addMouseListener(botonImp);
    }

    public void botonHonorarios(JTextField monto, JTextField honorario, JLabel iconoOkHon,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel panelGasto = new JPanel();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Color.white);
            panelGasto.setMaximumSize(new Dimension(600,40));
            panelGasto.setPreferredSize(new Dimension(600,40));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel hon = new JLabel();
            hon.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            hon.setText(honorario.getText());

            JLabel monto = new JLabel();
            monto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            monto.setText(monto.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("Impuesto", icono, 30);
            listaGastos.add(panelGasto);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGasto.add(fecha);
            panelGasto.add(hon);
            panelGasto.add(monto);
            panelGasto.add(icono);

            indice++;
            listaGastos.updateUI();
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
        
        iconoOkHon.addMouseListener(botonImp);
    }

   
    
}
