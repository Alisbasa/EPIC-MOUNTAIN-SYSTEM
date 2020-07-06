/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author Alex
 */
 
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
 
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicComboBoxEditor;
 

public class CountryItemEditor extends BasicComboBoxEditor {
    private JPanel panel = new JPanel();
    private JLabel labelItem = new JLabel();
    private String selectedValue ;
     
    public CountryItemEditor() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.insets = new Insets(5, 5, 5, 5);
        
        labelItem.setFont(new Font("Franklin Gothic Heavy",Font.PLAIN,32));
         
        labelItem.setOpaque(false);
        labelItem.setHorizontalAlignment(JLabel.LEFT);
        labelItem.setForeground(Colores.gris);
         
        panel.add(labelItem, constraints);
        panel.setBackground(Color.white);  
        
        
    }

    
     
    public Component getEditorComponent() {
        return this.panel;
    }
     
    @Override
    public Object getItem() {
        return this.selectedValue;
    }
     
    @Override
    public void setItem(Object item) {
        if (item == null) {
            
            return;
        }
        String[] countryItem = (String[]) item;
        
        selectedValue = countryItem[0];
        labelItem.setText(selectedValue);
        labelItem.setIcon(new ImageIcon(countryItem[1]));      
    }  
}