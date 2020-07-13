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
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;

public class rellenarGastos {
    public List<JPanel> panelesGastos;
    public int indice=0;
    
    public rellenarGastos(){
        panelesGastos = new ArrayList<>();
    }
    
    //Pone Gasto: Desarollo
    void botonDesarrollo(JComboBox desarrollo,JTextField montoDes, JLabel iconoOkDesarrollo, JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonV = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel desarrolloLista = new JLabel();
            desarrolloLista.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            desarrolloLista.setText((String) desarrollo.getSelectedItem());

            JLabel precio = new JLabel();
            precio.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precio.setText(montoDes.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("desarrolloG", icono, 25);
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
                Iconos.scaleImage("okh", iconoOkDesarrollo, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDesarrollo, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkDesarrollo.addMouseListener(botonV);
    }

    //Para rellenar un Gasto:deudas
    void botonDeudas(JComboBox deudas, JTextField montoDeuda, JLabel iconoOkDeudas,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonC = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGastoC = new PanelCurvoSinSombra();
            panelGastoC.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGastoC.setLayout(new GridLayout(1,4));
            panelGastoC.setBackground(Colores.epicColorBajito);
            panelGastoC.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGastoC.setMaximumSize(new Dimension(500,40));
            panelGastoC.setPreferredSize(new Dimension(500,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel deudasPagar = new JLabel();
            deudasPagar.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            deudasPagar.setText((String) deudas.getSelectedItem());

            JLabel precio = new JLabel();
            precio.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precio.setText(montoDeuda.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("DeudasPG_1", icono, 25);
            listaGastos.add(panelGastoC);
            panelesGastos.add(panelGastoC);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGastoC.add(fecha);
            panelGastoC.add(deudasPagar);
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
                Iconos.scaleImage("okh", iconoOkDeudas, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDeudas, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkDeudas.addMouseListener(botonC);
    }
    
    //Para rellenar un Gasto:impuesto
    void botonImpuestoG(JTextField impuesto, JTextField montoImpuesto, JLabel iconoOkImpuesto,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel imp = new JLabel();
            imp.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            imp.setText(impuesto.getText());

            JLabel montoImpues = new JLabel();
            montoImpues.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            montoImpues.setText(montoImpuesto.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("impuestoG", icono, 25);
            listaGastos.add(panelGasto);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGasto.add(fecha);
            panelGasto.add(imp);
            panelGasto.add(montoImpues);
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
                Iconos.scaleImage("okh", iconoOkImpuesto, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkImpuesto, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkImpuesto.addMouseListener(botonImp);
    }
    
    //Para rellenar un Gasto:mantenimiento
    void botonMantenimiento(JTextField mantenimiento, JTextField montoMant, JLabel iconoOkMantenimiento,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonI = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel descripcion = new JLabel();
            descripcion.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            descripcion.setText(mantenimiento.getText());

            JLabel precioMant = new JLabel();
            precioMant.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precioMant.setText(montoMant.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("mantenimientoG", icono, 25);
            listaGastos.add(panelGasto);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGasto.add(fecha);
            panelGasto.add(descripcion);
            panelGasto.add(precioMant);
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
                Iconos.scaleImage("okh", iconoOkMantenimiento, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkMantenimiento, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkMantenimiento.addMouseListener(botonI);
    }
    
    //Para rellenar un Gasto:suministros
    void botonSuministros(JTextField suministro, JTextField montoSum, JLabel iconoOkSuministros,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel sum = new JLabel();
            sum.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            sum.setText(suministro.getText());

            JLabel monto = new JLabel();
            monto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            monto.setText(montoSum.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("suministrosG", icono, 25);
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
                Iconos.scaleImage("okh", iconoOkSuministros, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkSuministros, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkSuministros.addMouseListener(botonImp);
    }
    
    //Para rellenar un Gasto:publicidad
    public void botonPublicidad(JTextField publicidad, JTextField montoPublicidad, JLabel iconoOkPublicidad,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonPub = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
           scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel pub = new JLabel();
            pub.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            pub.setText(publicidad.getText());

            JLabel monto = new JLabel();
            monto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            monto.setText(montoPublicidad.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("publicidadG", icono, 25);
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
                Iconos.scaleImage("okh", iconoOkPublicidad, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkPublicidad, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkPublicidad.addMouseListener(botonPub);
    }
    
    //Para rellenar un Gasto:transporte
    public void botonTransporte(JTextField transporte, JTextField montoTrans, JLabel iconoOkTransporte,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel trans = new JLabel();
            trans.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            trans.setText(transporte.getText());

            JLabel monto = new JLabel();
            monto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            monto.setText(montoTrans.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("transporteG", icono, 25);
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
                Iconos.scaleImage("okh", iconoOkTransporte, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkTransporte, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkTransporte.addMouseListener(botonImp);
    }

    //Para rellenar un Gasto:Honorarios
    public void botonHonorarios(JTextField honorarios, JTextField montoHonor, JLabel iconoOkHonorarios,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel hon = new JLabel();
            hon.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            hon.setText(honorarios.getText());

            JLabel monto = new JLabel();
            monto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            monto.setText(montoHonor.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("honorariosG", icono, 25);
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
                Iconos.scaleImage("okh", iconoOkHonorarios, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkHonorarios, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkHonorarios.addMouseListener(botonImp);
    }
    
    //Para rellenar un Gasto:reducInv
    public void botonReducInv(JComboBox reducInv, JTextField montoReduc, JLabel iconoOkReducInv,JScrollPane scrollGastos, JPanel listaGastos){
        MouseListener botonImp = new MouseListener() {
            
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel reduc = new JLabel();
            reduc.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            reduc.setText((String) reducInv.getSelectedItem());

            JLabel montoR = new JLabel();
            montoR.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            montoR.setText(montoReduc.getText());

            JLabel icono = new JLabel();
            Iconos.scaleImage("inventarioG", icono, 25);
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            listaGastos.add(panelGasto);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

            panelGasto.add(fecha);
            panelGasto.add(reduc);
            panelGasto.add(montoR);
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
                Iconos.scaleImage("okh", iconoOkReducInv, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkReducInv, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkReducInv.addMouseListener(botonImp);
    }
    
     
    public static String fechaActual(){
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM");
        return formatoFecha.format(fecha);
    }
   
    
}
