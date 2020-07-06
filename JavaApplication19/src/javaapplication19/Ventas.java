/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Ventas {
    private String inventario;
    private ImageIcon icon = new ImageIcon("src\\img\\Ventas.png");
    private double precio;
    private String plataforma;
    private String cliente;
    Ventas(String inventario, double precio, String plataforma, String cliente){
        this.inventario =inventario;
        this.precio = precio;
        this.plataforma = plataforma;
        this.cliente = cliente;
        
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

    public String getCliente() {
        return cliente;
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

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
}
