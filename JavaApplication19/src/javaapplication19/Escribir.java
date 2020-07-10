/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Alex
 */
public class Escribir {
    public Escribir(){
        
    }
    
    public void escribirExcel(String filepath, String hoja, String[] data) throws FileNotFoundException{
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        
        
    }
    
}
