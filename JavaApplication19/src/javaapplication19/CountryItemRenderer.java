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
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
 
/**
 * Customer renderer for JComboBox
 * @author www.codejava.net
 *
 */
public class CountryItemRenderer extends JPanel implements ListCellRenderer {
    private JLabel labelItem = new JLabel();
     
    public CountryItemRenderer() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.insets = new Insets(1, 1, 1, 1);
         labelItem.setFont(new Font("Franklin Gothic Heavy",Font.PLAIN,25));
         
        labelItem.setOpaque(true);
        labelItem.setHorizontalAlignment(JLabel.LEFT);
         
        add(labelItem, constraints);
        setBackground(Color.white);
        setForeground(Colores.gris);
    }
     
    @Override
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        String[] countryItem = (String[]) value;
 
        // set country name
        labelItem.setText(countryItem[0]);
         
        // set country flag
        labelItem.setIcon(new ImageIcon(countryItem[1]));
        
         
        if (isSelected) {
            labelItem.setBackground(Colores.epicColor);
            labelItem.setForeground(Color.white);
        } else {
            labelItem.setForeground(Colores.gris);
            labelItem.setBackground(Color.white);
        }
         
        return this;
    }
 
}