/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class rellenarGastos {
    public List<JPanel> panelesGastos;
    public int indice=0;
    
    public rellenarGastos(){
        panelesGastos = new ArrayList<>();
    }
    void botonBorrar(JLabel boton, JPanel padre, JPanel hijo, int panelIndex, String img, String filepath, String hoja){
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                padre.remove(hijo);
                panelesGastos.remove(hijo);
                padre.updateUI();
                try {
                    Escribir.removeRow(filepath, hoja , LeerExcel.contarRenglones(filepath, hoja));
                    //Escribir.removeRow("src//excel/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones("src//excel/LibrosContables.xlsx", "Gastos"));
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
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
                Iconos.scaleImage("cancelG", boton, 20);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage(img, boton, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        boton.addMouseListener(botonV);
    }
    void botonBorrarInd(JLabel boton, String filepath, String hoja){
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Escribir.removeRow(filepath, hoja , LeerExcel.contarRenglones(filepath, hoja));
                    //Escribir.removeRow("src//excel/LibrosContables.xlsx", "Gastos", LeerExcel.contarRenglones("src//excel/LibrosContables.xlsx", "Gastos"));
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
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
                //Iconos.scaleImage("cancelG", boton, 20);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //Iconos.scaleImage(img, boton, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        boton.addMouseListener(botonV);
    }
    
    
    
    //Pone Gasto: Desarollo: Equipo y Mob
    void botonDesEquipo(JComboBox tipo, JTextField desarrolloTipoE, JTextField descripcion, JTextField montoDes, JLabel iconoOkDesarrolloEq, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre){
        MouseListener botonV = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,5));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel desarrolloLista = new JLabel();
            desarrolloLista.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            desarrolloLista.setText(desarrolloTipoE.getText());

            JLabel precio = new JLabel();
            precio.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precio.setText (montoDes.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("equipoG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"equipoG", "src//excel/LibrosContables.xlsx", "Gastos");

            panelGasto.add(fecha);
            panelGasto.add(desarrolloLista);
            panelGasto.add(precio);
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            String[] data = {(String) fechaActual(), "Equipo y Mob", desarrolloTipoE.getText(), montoDes.getText(), tipo.getSelectedItem().toString() ,"VERDE"};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            if(tipo.getSelectedItem().toString().equals("Herramientas")){
                String [] equipo = {(String) fechaActual(), desarrolloTipoE.getText(), descripcion.getText() ,montoDes.getText()};
            Escribir EscribirExcel = new Escribir();
                try {
                    EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", "Herramientas",equipo,4);
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", "Herramientas", Double.valueOf(montoDes.getText()), LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Herramientas"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Herramientas")+ 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Equipo.xlsx", "Herramientas", formula, LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Herramientas")+1, 3);
                } catch (IOException ex) {
                    Logger.getLogger(inventarioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }
            else if(tipo.getSelectedItem().toString().equals("Equipo de Taller")){
                String [] equipo = {(String) fechaActual(), desarrolloTipoE.getText(), descripcion.getText() ,montoDes.getText()};
            Escribir EscribirExcel = new Escribir();
                try {
                    EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", "Equipo de Taller",equipo,4);
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", "Equipo de Taller", Double.valueOf(montoDes.getText()), LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Taller"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Taller")+ 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Equipo.xlsx", "Equipo de Taller", formula, (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Taller")+1), 3);
                } catch (IOException ex) {
                    Logger.getLogger(inventarioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
            
            else if(tipo.getSelectedItem().toString().equals("Mobiliario")){
                String [] equipo = {(String) fechaActual(), desarrolloTipoE.getText(), descripcion.getText() ,montoDes.getText()};
            Escribir EscribirExcel = new Escribir();
                try {
                    EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", "Mobiliario",equipo,4);
                     EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", "Mobiliario", Double.valueOf(montoDes.getText()), LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Mobiliario"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Mobiliario")+ 1) + ")";
                    EscribirExcel.escribirFormula("src\\excel\\Equipo.xlsx", "Mobiliario", formula, (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Mobiliario")+1), 3);
                } catch (IOException ex) {
                    Logger.getLogger(inventarioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
            
            else if(tipo.getSelectedItem().toString().equals("Equipo de Limpieza")){
                String [] equipo = {(String) fechaActual(), desarrolloTipoE.getText(), descripcion.getText() ,montoDes.getText()};
            Escribir EscribirExcel = new Escribir();
                try {
                    EscribirExcel.escribirExcelInv("src\\excel\\Equipo.xlsx", "Equipo de Limpieza",equipo,4);
                    EscribirExcel.escribirCeldaDouble("src\\excel\\Equipo.xlsx", "Equipo de Limpieza", Double.valueOf(montoDes.getText()), LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Limpieza"), 3);
                    String formula = "SUM(D2:D" + (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Limpieza")+ 1) +")";
                    EscribirExcel.escribirFormula("src\\excel\\Equipo.xlsx", "Equipo de Limpieza", formula, (LeerExcel.contarRenglones("src\\excel\\Equipo.xlsx", "Equipo de Limpieza")+ 1), 3);
                } catch (IOException ex) {
                    Logger.getLogger(inventarioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }    
            }
            

            
            
            String tipoEquipo;
            try {
                tipoEquipo = LeerExcel.obtenerCelda("src//excel/LibrosContables.xlsx", "Gastos", 4,
                             LeerExcel.contarRenglones("src//excel/LibrosContables.xlsx", "Gastos"));
                
                System.out.println(tipoEquipo);
                switch(tipoEquipo){
                    case "Herramientas":
                        botonBorrarInd(icono, "src\\excel\\Equipo.xlsx", "HERRAMIENTAS");
                    break;
                    
                    case "Equipo de Taller":
                        botonBorrarInd(icono, "src\\excel\\Equipo.xlsx", "Equipo de Taller");
                    break;
                    
                    case "Mobiliario":
                        botonBorrarInd(icono, "src\\excel\\Equipo.xlsx", "Mobiliario");
                    break;
                    
                    case "Equipo de Limpieza":
                        botonBorrarInd(icono, "src\\excel\\Equipo.xlsx", "Equipo de Limpieza");
                    break;
                    
                }
            
            } catch (IOException ex) {
                Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
                Iconos.scaleImage("okh", iconoOkDesarrolloEq, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDesarrolloEq, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkDesarrolloEq.addMouseListener(botonV);
    }
    String tipoI2;
    //Pone Gasto: Desarollo: Inventario
    void botonDesInv(JTextField desarrolloTipoI, JComboBox producto, JTextField montoDesI, JLabel iconoOkDesarrolloI, JScrollPane scrollGastos, JPanel listaGastos,  JPanel panelPadre){
        MouseListener botonV = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,5));
            panelGasto.setBackground(Colores.epicColorBajito);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));;
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel desarrolloListaI = new JLabel();
            desarrolloListaI.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            desarrolloListaI.setText(desarrolloTipoI.getText());
            tipoI2 = desarrolloTipoI.getText();
            
            JLabel productoAg  = new JLabel();
            producto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            productoAg.setText((String) producto.getSelectedItem());

            JLabel precioI = new JLabel();
            precioI.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precioI.setText("$ " + montoDesI.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("inventarioG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"inventarioG", "src//excel/LibrosContables.xlsx", "Gastos");;
            
            botonBorrarInd(icono,"src\\excel\\Inventario.xlsx","Inventario");

            panelGasto.add(fecha);
            panelGasto.add(desarrolloListaI);
            panelGasto.add(productoAg);
            panelGasto.add(precioI);
            panelGasto.add(icono);
            
            String[] data = {(String) fechaActual(), "Inventario", desarrolloTipoI.getText(),montoDesI.getText(),(String) producto.getSelectedItem(),"VERDE"};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(producto.getSelectedItem().toString().equals("Nuevo")){
                    inventarioPrincipal inv =new inventarioPrincipal(desarrolloListaI,precioI);
                    inv.setVisible(true);
                }
                
                if(producto.getSelectedItem().toString().equals("Existente")){
                    InventarioExistente inv;
                try {
                    inv = new InventarioExistente();
                    inv.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            
            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
                Iconos.scaleImage("okh", iconoOkDesarrolloI, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDesarrolloI, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkDesarrolloI.addMouseListener(botonV);
    }
    
    //Pone Gasto: Desarollo: Packs
    void botonDesP(JTextField desarrolloTipoP, JComboBox tipoPack, JTextField montoDesP, JLabel iconoOkDesarrolloP, JScrollPane scrollGastos, JPanel listaGastos,  JPanel panelPadre){
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
            panelGasto.setPreferredSize(new Dimension(500,100));
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel desarrolloLista = new JLabel();
            desarrolloLista.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            desarrolloLista.setText(desarrolloTipoP.getText());
            JLabel costo = new JLabel();
            costo.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            
            
            if(tipoPack.getSelectedItem().toString().equals("Rellenar Pack")){
                    packsDeVentas inv;
                try {
                    inv = new packsDeVentas(desarrolloLista,montoDesP,desarrolloTipoP);
                    inv.setVisible(true);
                    costo.setText("$ " + montoDesP.getText());
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                costo.setText("$ " + montoDesP.getText());
            }
         

            
            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("packsG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"packsG", "src//excel/LibrosContables.xlsx", "Gastos");
            botonBorrarInd(icono,"src\\excel\\Packs.xlsx", "PacksVentas");
            
            panelGasto.add(fecha);
            panelGasto.add(desarrolloLista);
            panelGasto.add(costo);
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            
            String[] data = {(String) fechaActual(), "Pack de Ventas", desarrolloTipoP.getText(),montoDesP.getText(), "    ","VERDE"};
            Escribir escribirVentas = new Escribir();
            try {
                escribirVentas.escribirExcel("src//excel/LibrosContables.xlsx", "Gastos", data);
            } catch (IOException ex) {
                Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(tipoPack.getSelectedItem().toString().equals("Nuevo")){
                try {
                    escribirVentas.crearHojaPacks("src\\excel\\Packs.xlsx", desarrolloTipoP.getText());
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
                Iconos.scaleImage("okh", iconoOkDesarrolloP, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDesarrolloP, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkDesarrolloP.addMouseListener(botonV);
    }
    
    //Pone Gasto: Desarollo: Compras en Transito
    void botonDesCT(JTextField desarrolloTipoCT, JComboBox productoCT,JTextField montoDesCT, JLabel iconoOkDesarrolloCT, JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre, JComboBox provedores, JTextField unidadesCT){
        MouseListener botonV = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            
            scrollGastos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
            panelGasto.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            panelGasto.setLayout(new GridLayout(1,4));
            panelGasto.setBackground(Colores.amarillo);
            panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20 , 5, 10));
            panelGasto.setMaximumSize(new Dimension(500,40));
            panelGasto.setPreferredSize(new Dimension(500,100));
            
            JLabel fecha = new JLabel();
            fecha.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            fecha.setText(fechaActual());

            JLabel desarrolloLista = new JLabel();
            desarrolloLista.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            desarrolloLista.setText(desarrolloTipoCT.getText());
            
            JLabel productoAg  = new JLabel();
            productoAg.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            productoAg.setText((String) productoCT.getSelectedItem());
            

            JLabel precio = new JLabel();
            precio.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precio.setText("$ " + montoDesCT.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("comprasTG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"comprasTG", "src//excel/LibrosContables.xlsx", "Gastos");
            botonBorrarInd(icono,"src\\excel\\comprasT.xlsx", "COMPRAS");
            
            panelGasto.add(fecha);
            panelGasto.add(desarrolloLista);
            panelGasto.add(precio);
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            String[] data = {(String) fechaActual(), "Compra en Transito", desarrolloTipoCT.getText() , montoDesCT.getText(),(String) productoCT.getSelectedItem(),"VERDE"};
            String[] compraT = {productoCT.getSelectedItem().toString(), desarrolloTipoCT.getText(), provedores.getSelectedItem().toString(), 
                               (String) fechaActual(), unidadesCT.getText(), montoDesCT.getText(), Double.toString(Integer.valueOf(unidadesCT.getText())*Double.valueOf(montoDesCT.getText()))};
                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                    escribirVentas.escribirExcelInv("src\\excel\\comprasT.xlsx", "COMPRAS", compraT, 7);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            if(provedores.getSelectedItem().toString()=="Nuevo"){
                    Provedores prov =new Provedores();
                    prov.setVisible(true);
                }
                
                
            
            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
                Iconos.scaleImage("okh", iconoOkDesarrolloCT, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDesarrolloCT, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        iconoOkDesarrolloCT.addMouseListener(botonV);
    }
    
    //Para rellenar un Gasto:deudas
    void botonDeudas(JComboBox deudas, JTextField montoDeuda, JLabel iconoOkDeudas,JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre){
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
            precio.setText( montoDeuda.getText());
            JLabel precioP = new JLabel();
            precioP.setFont(new Font("Franklin Gothic",Font.PLAIN,14));
            precioP.setText("$ " + montoDeuda.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("DeudasPG_1", icono, 25);
            listaGastos.add(panelGastoC, 0);
            panelesGastos.add(panelGastoC);//Ingresa el panelVenta a la arraylist panelesInresos
            
            botonBorrar(icono, listaGastos, panelGastoC, panelesGastos.indexOf(panelGastoC),"DeudasPG", "src//excel/LibrosContables.xlsx", "Gastos");

            panelGastoC.add(fecha);
            panelGastoC.add(deudasPagar);
            panelGastoC.add(precioP);
            panelGastoC.add(new JLabel(""));
            panelGastoC.add(icono);
            
            String [] data = {(String) fechaActual(), "Deudas a Pagar", (String) deudasPagar.getText(), precio.getText(), "", ""};
            String [] deuda = {fechaActual(), precio.getText()};
            
            Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                    escribirVentas.escribirExcelInv("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString(), deuda, 2);
                    escribirVentas.escribirCeldaDouble("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString(), Double.valueOf(precio.getText())*(-1),(LeerExcel.contarRenglones("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString())), 1);
                    String formula = escribirVentas.Sumar(2, (LeerExcel.contarRenglones("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString())+ 1),'b');
                    escribirVentas.escribirFormula("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString(), formula, (LeerExcel.contarRenglones("src\\excel\\DeudasP.xlsx", deudas.getSelectedItem().toString())+1), 1);
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }


            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
    void botonImpuestoG(JTextField impuesto, JTextField montoImpuesto, JLabel iconoOkImpuesto,JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre){
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
            montoImpues.setText("$ " + montoImpuesto.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("impuestoG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"impuestoG", "src//excel/LibrosContables.xlsx", "Gastos");

            panelGasto.add(fecha);
            panelGasto.add(imp);
            panelGasto.add(montoImpues);
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            String [] data = {(String) fechaActual(), "Impuesto", (String) imp.getText(), montoImpues.getText(),""};
            
            Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
    void botonMantenimiento(JTextField mantenimiento, JTextField montoMant, JLabel iconoOkMantenimiento,JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre){
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
            precioMant.setText("$ " + montoMant.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("mantenimientoG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"mantenimientoG", "src//excel/LibrosContables.xlsx", "Gastos");

            panelGasto.add(fecha);
            panelGasto.add(descripcion);
            panelGasto.add(precioMant);
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            String [] data = {(String) fechaActual(), "Mantenimiento", (String) descripcion.getText(), precioMant.getText(),""};
            
            Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
    void botonSuministros(JTextField suministro, JTextField montoSum, JLabel iconoOkSuministros,JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre){
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
            monto.setText("$ " + montoSum.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("suministrosG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"mantenimientoG", "src//excel/LibrosContables.xlsx", "Gastos");

            panelGasto.add(fecha);
            panelGasto.add(sum);
            panelGasto.add(monto);
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            String [] data = {(String) fechaActual(), "Suministros", (String) sum.getText(), monto.getText(),""};
            
            Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }
            

            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
    public void botonPublicidad(JTextField publicidad, JTextField montoPublicidad, JLabel iconoOkPublicidad,JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre){
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
            monto.setText("$ " + montoPublicidad.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("publicidadG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"publicidadG", "src//excel/LibrosContables.xlsx", "Gastos");

            panelGasto.add(fecha);
            panelGasto.add(pub);
            panelGasto.add(monto);
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            String [] data = {(String) fechaActual(), "Mantenimiento", (String) pub.getText(), monto.getText(),""};
            
            Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
    public void botonTransporte(JTextField transporte, JTextField montoTrans, JLabel iconoOkTransporte,JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre){
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
            monto.setText("$ " + montoTrans.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("transporteG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"transporteG", "src//excel/LibrosContables.xlsx", "Gastos");

            panelGasto.add(fecha);
            panelGasto.add(trans);
            panelGasto.add(monto);
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            String [] data = {(String) fechaActual(), "Transporte", (String) trans.getText(), monto.getText(),""};
            
            Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
    public void botonHonorarios(JTextField honorarios, JTextField montoHonor, JLabel iconoOkHonorarios,JScrollPane scrollGastos, JPanel listaGastos,JPanel panelPadre){
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
            monto.setText("$ " + montoHonor.getText());

            JLabel icono = new JLabel();
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            Iconos.scaleImage("honorariosG", icono, 25);
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"honorariosG", "src//excel/LibrosContables.xlsx", "Gastos");

            panelGasto.add(fecha);
            panelGasto.add(hon);
            panelGasto.add(monto);
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            String [] data = {(String) fechaActual(), "Honorarios", (String) hon.getText(), monto.getText(),""};
            
            Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
    public void botonReducInv(JComboBox reducInv, JTextField montoReduc, JLabel iconoOkReducInv,JScrollPane scrollGastos, JPanel listaGastos, JPanel panelPadre){
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
            

            JLabel icono = new JLabel();
            Iconos.scaleImage("inventarioG", icono, 25);
            icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            listaGastos.add(panelGasto,0);
            panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos
            
            botonBorrar(icono, listaGastos, panelGasto, panelesGastos.indexOf(panelGasto),"inventarioG", "src//excel/LibrosContables.xlsx", "Gastos");

            panelGasto.add(fecha);
            panelGasto.add(reduc);
            panelGasto.add(new JLabel("RELLENAR DE INV"));
            panelGasto.add(new JLabel(""));
            panelGasto.add(icono);
            
            String [] data = {(String) fechaActual(), "Reduccion de Inventario", (String) reduc.getText(), montoR.getText(),""};
            
            Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Gastos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarGastos.class.getName()).log(Level.SEVERE, null, ex);
                }

            indice++;
            panelPadre.removeAll();
                panelPadre.updateUI();
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
    
    public void rellenarLibro(JScrollPane scrollGastos, JPanel listaGastos) throws IOException {
        if (!LeerExcel.tablaVacia("src\\excel\\LibrosContables.xlsx", "Gastos")) {
            
            for (int i = 1; i <= LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Gastos"); i++) {
                PanelCurvoSinSombra panelGasto = new PanelCurvoSinSombra();
                panelGasto.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                panelGasto.setLayout(new GridLayout(1, 5));
                panelGasto.setBackground(Colores.epicColorBajito);
                panelGasto.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelGasto.setMaximumSize(new Dimension(500, 40));
                panelGasto.setPreferredSize(new Dimension(500, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                fecha.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 0, i));

                JLabel dev = new JLabel();
                dev.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                dev.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 2, i));

                JLabel monto = new JLabel();
                monto.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                monto.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 3, i));

                String IconoTipo="VentasG";
                    String tipo = LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Gastos", 1, i);
                    switch(tipo){
                        case "Equipo y Mob":
                            IconoTipo="equipoG";
                            break;
                        case "Inventario":
                            IconoTipo="inventarioG";
                            break;
                        case "Pack de Ventas":
                            IconoTipo="packsG";
                            break;
                        case "Compra en Transito":
                            IconoTipo="comprasTG";
                            panelGasto.setBackground(Colores.amarillo);
                            break;      
                        case "Deudas a Pagar":
                            IconoTipo="DeudasPG_1";
                            break;
                        case "Impuesto":
                            IconoTipo="impuestoG";
                            break;
                        case "Mantenimiento":
                            IconoTipo="mantenimientoG";
                            break;                            
                        case "Transporte":
                            IconoTipo="transporteG";
                            break;
                        case "Honorarios":
                            IconoTipo="honorariosG";
                            break;
                        case "Reduccion de Inventario":
                            IconoTipo="inventarioG";
                            break;
                    }

                JLabel icono = new JLabel();
                Iconos.scaleImage(IconoTipo, icono, 30);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaGastos.add(panelGasto,0);
                panelesGastos.add(panelGasto);//Ingresa el panelVenta a la arraylist panelesInresos

                panelGasto.add(fecha);
                panelGasto.add(dev);
                panelGasto.add(monto);
                panelGasto.add(new JLabel(""));
                panelGasto.add(icono);

                indice++;
                listaGastos.updateUI();
            }
        }
    }
    
    
}
