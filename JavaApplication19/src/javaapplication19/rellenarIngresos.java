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
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javaapplication19.Rellenar;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class rellenarIngresos {

    public List<JPanel> panelesIngresos;
    public int indice = 0;

    public List<String> deudoresCompras;

    public rellenarIngresos() {
        panelesIngresos = new ArrayList<>();
    }

    //Pone ingreso: venta
    void botonVenta(JTextField monto, JComboBox inventario, JLabel iconoOkV, JScrollPane scrollIngresos, JPanel listaIngresos, JComboBox plataformacb) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.epicColorBajito);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(500, 40));
                panelIngreso.setPreferredSize(new Dimension(500, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel inventarioLista = new JLabel();
                inventarioLista.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                inventarioLista.setText((String) inventario.getSelectedItem());
                int numeroLista = inventario.getSelectedIndex() + 1;
                int numeroPlataforma = 12;
                if (plataformacb.getSelectedIndex() == 0) {
                    numeroPlataforma = 14;
                }

                String precioExcel = "precio";
                try {
                    precioExcel = LeerExcel.obtenerPrecio("src//excel/Inventario.xlsx", "INVENTARIO", numeroPlataforma, numeroLista);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }

                JLabel precio = new JLabel();
                precio.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));

                precio.setText(precioExcel);

                JLabel plataforma = new JLabel();
                plataforma.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                plataforma.setText((String) plataformacb.getSelectedItem());

                JLabel icono = new JLabel();
                Iconos.scaleImage("VentasG", icono, 25);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(inventarioLista);
                panelIngreso.add(precio);
                panelIngreso.add(plataforma);
                panelIngreso.add(icono);
                String[] data = {(String) fechaActual(), "Venta", (String) inventario.getSelectedItem(), precioExcel, plataforma.getText()};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Ingresos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }

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
                Iconos.scaleImage("okh", iconoOkV, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkV, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkV.addMouseListener(botonV);
    }

    //Para rellenar un ingreso:credito
    void botonCredito(JTextField montoC, JTextField inversor, JLabel iconoOkC, JScrollPane scrollIngresos, JPanel listaIngresos) {
        MouseListener botonC = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.epicColorBajito);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(500, 40));
                panelIngreso.setPreferredSize(new Dimension(500, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel credito = new JLabel();
                credito.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                credito.setText(inversor.getText());

                JLabel precio = new JLabel();
                precio.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                precio.setText(montoC.getText());

                JLabel icono = new JLabel();
                Iconos.scaleImage("CreditoG", icono, 25);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(credito);
                panelIngreso.add(precio);
                panelIngreso.add(icono);

                String[] data = {(String) fechaActual(), "Crédito", (String) inversor.getText(), montoC.getText(), "    "};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Ingresos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }

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
                Iconos.scaleImage("okh", iconoOkC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkC.addMouseListener(botonC);
    }

    //Para rellenar un ingreso:inversion
    public void botonInversion(JTextField montoI, JTextField inversorI, JLabel iconoOkI, JScrollPane scrollIngresos, JPanel listaIngresos) {
        MouseListener botonI = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.epicColorBajito);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(500, 40));
                panelIngreso.setPreferredSize(new Dimension(500, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel inversionista = new JLabel();
                inversionista.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                inversionista.setText(inversorI.getText());

                JLabel precioI = new JLabel();
                precioI.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                precioI.setText(montoI.getText());

                JLabel icono = new JLabel();
                Iconos.scaleImage("InversionG", icono, 25);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(inversionista);
                panelIngreso.add(precioI);
                panelIngreso.add(icono);

                String[] data = {(String) fechaActual(), "Inversión", (String) inversorI.getText(), montoI.getText(), "    "};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Ingresos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }

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
                Iconos.scaleImage("okh", iconoOkI, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkI, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkI.addMouseListener(botonI);
    }

    //Para rellenar un ingreso:impuesto
    public void botonImpuesto(JTextField montoImp, JTextField impuesto, JLabel iconoOkImp, JScrollPane scrollIngresos, JPanel listaIngresos) {
        MouseListener botonImp = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.epicColorBajito);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(500, 40));
                panelIngreso.setPreferredSize(new Dimension(500, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel imp = new JLabel();
                imp.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                imp.setText(impuesto.getText());

                JLabel montoImpuesto = new JLabel();
                montoImpuesto.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                montoImpuesto.setText(montoImp.getText());

                JLabel icono = new JLabel();
                Iconos.scaleImage("impuestoG", icono, 30);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(imp);
                panelIngreso.add(montoImpuesto);
                panelIngreso.add(icono);

                String[] data = {(String) fechaActual(), "Impuesto a favor", (String) impuesto.getText(), montoImp.getText(), "    "};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Ingresos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }

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
                Iconos.scaleImage("okh", iconoOkImp, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkImp, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkImp.addMouseListener(botonImp);
    }

    //Para rellenar un ingreso: deuda a Cobrar
    public void botonDeudaC(JTextField montoDeuC, JComboBox deudor, JLabel iconoOkDeudasC, JScrollPane scrollIngresos, JPanel listaIngresos) {
        MouseListener botonDeuC = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.epicColorBajito);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(500, 40));
                panelIngreso.setPreferredSize(new Dimension(500, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel deuda = new JLabel();
                deuda.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                deuda.setText((String) deudor.getSelectedItem());

                JLabel montoDeudaC = new JLabel();
                montoDeudaC.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                montoDeudaC.setText(montoDeuC.getText());

                JLabel icono = new JLabel();
                Iconos.scaleImage("DeudasCG", icono, 30);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(deuda);
                panelIngreso.add(montoDeudaC);
                panelIngreso.add(icono);
                
                String[] data = {(String) fechaActual(), "Deuda a Cobrar",  deuda.getText(), montoDeudaC.getText(), "    "};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Ingresos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }

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
                Iconos.scaleImage("okh", iconoOkDeudasC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDeudasC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };
        iconoOkDeudasC.addMouseListener(botonDeuC);
    }

    void botonVentaC(JTextField montoVC, JComboBox inventario, JLabel iconoOkVentasC, JScrollPane scrollIngresos, JPanel listaIngresos, JComboBox plataformacb) {
        MouseListener botonV = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.amarillo);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(500, 40));
                panelIngreso.setPreferredSize(new Dimension(500, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel inventarioLista = new JLabel();
                inventarioLista.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                inventarioLista.setText((String) inventario.getSelectedItem());
                int numeroLista = inventario.getSelectedIndex() + 1;
                int numeroPlataforma = 12;
                //selecciona mercado libre como plataforma
                if (plataformacb.getSelectedIndex() == 0) {
                    numeroPlataforma = 14;
                }
                

                String precioExcel = "precio";
                try {
                    precioExcel = LeerExcel.obtenerPrecio("src//excel/Inventario.xlsx", "INVENTARIO", numeroPlataforma, numeroLista);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                 JLabel precio = new JLabel();
                precio.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));

                precio.setText(precioExcel);

                JLabel plataforma = new JLabel();
                plataforma.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                plataforma.setText((String) plataformacb.getSelectedItem());

                JLabel icono = new JLabel();
                Iconos.scaleImage("VentasG", icono, 25);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(inventarioLista);
                panelIngreso.add(precio);
                panelIngreso.add(plataforma);
                panelIngreso.add(icono);
                String[] data = {(String) fechaActual(), "Venta a Cobrar", (String) inventario.getSelectedItem(), precioExcel, plataforma.getText()};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Ingresos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }

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
                Iconos.scaleImage("okh", iconoOkVentasC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkVentasC, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkVentasC.addMouseListener(botonV);
    }

    //Para rellenar un ingreso:impuesto
    public void botonDev(JTextField montoDev, JTextField devolucion, JLabel iconoOkDev, JScrollPane scrollIngresos, JPanel listaIngresos) {
        MouseListener botonDev = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                scrollIngresos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.epicColorBajito);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(500, 40));
                panelIngreso.setPreferredSize(new Dimension(500, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                fecha.setText(fechaActual());

                JLabel dev = new JLabel();
                dev.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                dev.setText(devolucion.getText());

                JLabel montoDevolucion = new JLabel();
                montoDevolucion.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                montoDevolucion.setText(montoDev.getText());

                JLabel icono = new JLabel();
                Iconos.scaleImage("impuestoG", icono, 30);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(dev);
                panelIngreso.add(montoDevolucion);
                panelIngreso.add(icono);
                
                String[] data = {(String) fechaActual(), "Devolucion", dev.getText(), montoDevolucion.getText(), "   "};

                Escribir escribirVentas = new Escribir();
                try {
                    escribirVentas.escribirExcel("src\\excel\\LibrosContables.xlsx", "Ingresos", data);
                } catch (IOException ex) {
                    Logger.getLogger(rellenarIngresos.class.getName()).log(Level.SEVERE, null, ex);
                }

                indice++;
                listaIngresos.updateUI();

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
                Iconos.scaleImage("okh", iconoOkDev, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Iconos.scaleImage("ok", iconoOkDev, 30);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        iconoOkDev.addMouseListener(botonDev);
    }

    public static String fechaActual() {
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd  MMMM");
        return formatoFecha.format(fecha);
    }

    public void rellenarLibro(JScrollPane scrollIngresos, JPanel listaIngresos) throws IOException {
        if (!LeerExcel.tablaVacia("src\\excel\\LibrosContables.xlsx", "Ingresos")) {
            for (int i = 1; i <= LeerExcel.contarRenglones("src\\excel\\LibrosContables.xlsx", "Ingresos"); i++) {
                PanelCurvoSinSombra panelIngreso = new PanelCurvoSinSombra();
                panelIngreso.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                panelIngreso.setLayout(new GridLayout(1, 5));
                panelIngreso.setBackground(Colores.epicColorBajito);
                panelIngreso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
                panelIngreso.setMaximumSize(new Dimension(500, 40));
                panelIngreso.setPreferredSize(new Dimension(500, 100));

                JLabel fecha = new JLabel();
                fecha.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                fecha.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Ingresos", 0, i));

                JLabel dev = new JLabel();
                dev.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                dev.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Ingresos", 2, i));

                JLabel montoDevolucion = new JLabel();
                montoDevolucion.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                montoDevolucion.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Ingresos", 3, i));
                
                JLabel plataforma = new JLabel();
                plataforma.setFont(new Font("Franklin Gothic", Font.PLAIN, 14));
                plataforma.setText(LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Ingresos", 4, i));


                String IconoTipo = "VentasG";
                String tipo = LeerExcel.obtenerCelda("src\\excel\\LibrosContables.xlsx", "Ingresos", 1, i);
                switch (tipo) {
                    case "Venta":
                        IconoTipo = "VentasG";
                        break;
                    case "Inversión":
                        IconoTipo = "inversionG";
                        break;
                    case "Crédito":
                        IconoTipo = "CreditoG";
                        break;
                    case "Deuda a Cobrar":
                        IconoTipo = "DeudasCG";
                        break;
                    case "Impuesto a favor":
                        IconoTipo = "impuestoG";
                        break;
                    case "Venta a Cobrar":
                        IconoTipo = "VentasG";
                        panelIngreso.setBackground(Colores.amarillo);
                        
                        break;
                    case "Devolucion":
                        IconoTipo = "devolucionG";
                        break;
                }

                JLabel icono = new JLabel();
                Iconos.scaleImage(IconoTipo, icono, 30);
                icono.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
                listaIngresos.add(panelIngreso);
                panelesIngresos.add(panelIngreso);//Ingresa el panelVenta a la arraylist panelesInresos

                panelIngreso.add(fecha);
                panelIngreso.add(dev);
                panelIngreso.add(montoDevolucion);
                panelIngreso.add(plataforma);
                panelIngreso.add(icono);

                indice++;
                listaIngresos.updateUI();
            }
        }
    }

}
