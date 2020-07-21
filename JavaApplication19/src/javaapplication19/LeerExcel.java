/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class LeerExcel {
    
    public LeerExcel(){
        
    }
    
    static public boolean tablaVacia(String filepath, String hoja) throws FileNotFoundException, IOException{
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook =new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
        
        return rowCount<1;
        
 
    }
    
    static public int contarRenglones(String filepath, String hoja) throws FileNotFoundException, IOException{
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook =new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
        
        int renglones =0;
        for(int i =1; i<= rowCount; i++){
            XSSFRow row = newSheet.getRow(i);
            if( row.getCell(0).getCellType() != CellType.BLANK ){
                 renglones++;
            }else{
                break;
            }                    
        }
        return renglones;
        
    }
    static public String[] rellenaCB2(String filepath, String hoja,int columna) throws IOException{
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook =new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
        
        int renglones =0;
        for(int i =1; i<= rowCount; i++){
            XSSFRow row = newSheet.getRow(i);
            if( row.getCell(columna).getCellType() != CellType.BLANK ){
                 renglones++;
            }else{
                break;
            }                    
        }
        String[] lista = new String[renglones];
        for(int i =1; i<= renglones; i++){
            XSSFRow row = newSheet.getRow(i);
            if( row.getCell(columna).getCellType() != CellType.BLANK ){
                 
                 lista[i-1]=row.getCell(columna).getStringCellValue();
            }else{
                break;
            }
        }
        return lista;    
    }
    static public String obtenerPrecio (String filepath, String hoja,int columna, int rowNumber) throws FileNotFoundException, IOException{ 
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook =new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        XSSFRow row = newSheet.getRow(rowNumber);
        XSSFCell cell = row.getCell(columna);
        String monto =  Double.toString(cell.getNumericCellValue());
        
        return "$"+monto ;
    }
    
    static public String obtenerCelda (String filepath, String hoja,int columna, int rowNumber) throws FileNotFoundException, IOException{ 
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook =new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        XSSFRow row = newSheet.getRow(rowNumber);
        XSSFCell cell = row.getCell(columna);
        
        
        return cell.getStringCellValue() ;
    }
    static public double obtenerCeldaNumerica (String filepath, String hoja,int columna, int rowNumber) throws FileNotFoundException, IOException{ 
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook =new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        XSSFRow row = newSheet.getRow(rowNumber);
        XSSFCell cell = row.getCell(columna);
        
        
        return cell.getNumericCellValue();
    }
        
}
