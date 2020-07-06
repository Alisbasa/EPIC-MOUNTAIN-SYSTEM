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
import java.awt.FlowLayout;
import java.awt.Font;
 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicComboBoxEditor;
 
public class MyComboBoxEditor extends BasicComboBoxEditor {
    private JLabel label = new JLabel();
    private JPanel panel = new JPanel();
    private Object selectedItem;
     
    public MyComboBoxEditor() {
         
        label.setOpaque(true);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(Color.BLACK);
         
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 2));
        panel.add(label);
        panel.setBackground(Color.GREEN);
    }
     
    public Component getEditorComponent() {
        return this.panel;
    }
     
    public Object getItem() {
        return "[" + this.selectedItem.toString() + "]";
    }
     
    public void setItem(Object item) {
        this.selectedItem = item;
        label.setText(item.toString());
    }
     
}
