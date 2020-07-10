/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import com.sun.javafx.scene.control.skin.ColorPalette;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Alex
 */
public class PropiedadesCB2 extends BasicComboBoxUI {
    public static ComboBoxUI createUI(JComponent com){
        return new PropiedadesCB2();
    }
    public ImageIcon scaleIcon(String icono,int width, int height) {
        ImageIcon icon = new ImageIcon("src\\img\\"+ icono +".png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(width, height,Image.SCALE_SMOOTH);
       
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;
        
    }

    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        btn.setIcon(scaleIcon("Flecha",20,20));
        btn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        btn.setContentAreaFilled(false);
        return btn;
        
    }

    

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        g.setColor(Color.white);
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
    
    

    @Override
    protected ListCellRenderer<Object> createRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
                list.setSelectionBackground(Color.white);
                list.setSelectionForeground(Colores.epicColor);
                
                return this;
            }
            
        };
    }
    
    
    
}
