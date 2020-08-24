/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Alex
 */
public class Iconos {
    Iconos(){}
    public static ImageIcon scaleIcon(String icono,int width, int height) {
        ImageIcon icon = new ImageIcon(rutas.img+"\\"+ icono +".png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(width, height,Image.SCALE_SMOOTH);
       
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;
        
    }
    public static void scaleImage(String icono,JLabel label, int height){
        ImageIcon icon = new ImageIcon(rutas.img+"\\"+ icono +".png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(height, height,Image.SCALE_SMOOTH);
       
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
    
    public static void scaleGif(String icono,JLabel label, int height){
        ImageIcon icon = new ImageIcon(rutas.img+"\\"+ icono +".gif");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(height, height,Image.SCALE_SMOOTH);
       
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
    
    public static void scaleImage(String icono,JLabel label, int height, int width){
        ImageIcon icon = new ImageIcon(rutas.img+"\\"+ icono +".png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(height, width,Image.SCALE_SMOOTH);
       
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
    
}
