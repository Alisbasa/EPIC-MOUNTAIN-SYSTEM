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
import org.apache.poi.ss.usermodel.CellType;
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
        int renglones =0;
        for(int i =1; i<= rowCount; i++){
            XSSFRow row = newSheet.getRow(i);
            if( row.getCell(0).getCellType() != CellType.BLANK ){
                 renglones++;
            }else{
                break;
            }                    
        }
        //System.out.println(renglones);
        XSSFRow row = newSheet.getRow(0);
        XSSFRow newRow = newSheet.createRow(renglones+1);
         
        System.out.println(row.getLastCellNum());
        
        for(int i=0; i<row.getLastCellNum(); i++){
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(data[i]);       
        }
        
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();        
        
    }
    
    public static void removeRow(String filepath, String hoja, int rowIndex) throws FileNotFoundException, IOException {
       File file = new File(filepath);
       FileInputStream inputStream = new FileInputStream(file);
       XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
       XSSFSheet sheet = newWorkbook.getSheet(hoja);
       int lastRowNum=sheet.getLastRowNum();
       if(rowIndex>=0&&rowIndex<lastRowNum){
           sheet.shiftRows(rowIndex+1,lastRowNum, -1);
       }
       if(rowIndex==lastRowNum){
           XSSFRow removingRow=sheet.getRow(rowIndex);
           if(removingRow!=null){
               sheet.removeRow(removingRow);
           }
       }
}
    
        public void escribirExcelInv(String filepath, String hoja) throws FileNotFoundException, IOException{
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        int rowCount = newSheet.getLastRowNum()-newSheet.getFirstRowNum();
        int renglones =0;
        
        for(int i =0; i<= rowCount; i++){
            XSSFRow row = newSheet.getRow(i);
            if( row.getCell(0).getCellType() != CellType.BLANK ){
                 renglones++;
                 System.out.println(renglones);
            }else{
                break;
            }                    
        }
        
        XSSFRow row = newSheet.getRow(0);
        //XSSFRow newRow = newSheet.createRow(renglones);
        int createNewRowAt = renglones;
        
        newSheet.shiftRows(newSheet.getLastRowNum(), newSheet.getLastRowNum()+1, 1 , true, true);
        XSSFRow newRow = newSheet.createRow(createNewRowAt); 
        newRow = newSheet.getRow(createNewRowAt);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();        
        
    }
}
