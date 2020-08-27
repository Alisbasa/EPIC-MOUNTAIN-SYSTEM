/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class EPIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Libros iniciar= new Libros();
            iniciar.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(EPIC.class.getName()).log(Level.SEVERE, null, ex);
            new SetRutas().setVisible(true);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(EPIC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
