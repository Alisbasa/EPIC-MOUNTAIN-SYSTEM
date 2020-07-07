/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Ventas {
    private String inventario;
    private ImageIcon icon = new ImageIcon("src\\img\\Ventas.png");
    private double precio;
    private String plataforma;
    
    Ventas(String inventario, double precio, String plataforma){
        this.inventario =inventario;
        this.precio = precio;
        this.plataforma = plataforma;
                
    }

    

    public String getInventario() {
        return inventario;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public double getPrecio() {
        return precio;
    }

    public String getPlataforma() {
        return plataforma;
    }


    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
}
