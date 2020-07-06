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

 
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
 
/**
 * A custom combo box with its own renderer and editor.
 * @author wwww.codejava.net
 *
 */
public class CountryComboBox extends JComboBox {
    private DefaultComboBoxModel model;
     
    public CountryComboBox() {
        model = new DefaultComboBoxModel();
        setModel(model);
        setRenderer(new CountryItemRenderer());
        setEditor(new CountryItemEditor());
        
    }
     
    /**
     * Add an array items to this combo box.
     * Each item is an array of two String elements:
     * - first element is country name.
     * - second element is path of an image file for country flag.
     * @param items
     */
    public void addItems(String[][] items) {
        for (String[] anItem : items) {
            model.addElement(anItem);
        }
    }
}