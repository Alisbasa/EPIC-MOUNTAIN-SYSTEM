/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Alex
 */
public class Escribir {
    public Escribir(){
        
    }
    
    public void escribirExcel(String filepath, String hoja, String[] data) throws FileNotFoundException, IOException{
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        int rowCount = newSheet.getLastRowNum()-newSheet.getFirstRowNum();
        XSSFRow row = newSheet.getRow(0);
        XSSFRow newRow = newSheet.createRow(rowCount+1);
        for(int i=0; i< row.getLastCellNum(); i++){
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(data[i]);
        }    
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();
        
        
        
        
    }
    
}
