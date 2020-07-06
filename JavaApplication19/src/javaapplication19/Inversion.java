/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public class Inversion {
    private String inversor;
    private ImageIcon icon = new ImageIcon("src\\img\\Cuentas.png");
    private double monto;
    Inversion(String inversor, double monto){
        this.inversor =inversor;
        this.monto = monto;
                
    }

    public String getInversor() {
        return inversor;
    }

    public double getMonto() {
        return monto;
    }

    public void setInversor(String inversor) {
        this.inversor = inversor;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
}
