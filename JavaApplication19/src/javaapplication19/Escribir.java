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
import org.apache.poi.ss.usermodel.CellStyle;
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

    public Escribir() {

    }

    public void escribirExcel(String filepath, String hoja, String[] data) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        newSheet.setDefaultRowHeight((short) 500.0);

        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
        int renglones = 0;
        for (int i = 1; i <= rowCount; i++) {
            XSSFRow row = newSheet.getRow(i);
            if (row.getCell(0).getCellType() != CellType.BLANK) {
                renglones++;
            } else {
                break;
            }
        }
        
        XSSFRow row = newSheet.getRow(0);
        XSSFRow newRow = newSheet.createRow(renglones + 1);
        

        for (int i = 0; i < row.getLastCellNum(); i++) {
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(data[i]);
        }

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }
    
    public void escribirExcelClientes(String filepath, String hoja, String[] data) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        newSheet.setDefaultRowHeight((short) 500.0);

        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
        int renglones = 0;
        for (int i = 1; i <= rowCount; i++) {
            XSSFRow row = newSheet.getRow(i);
            if (row.getCell(0).getCellType() != CellType.BLANK) {
                renglones++;
            } else {
                break;
            }
        }
        //System.out.println(renglones);
        XSSFRow row = newSheet.getRow(0);
        XSSFRow newRow = newSheet.createRow(renglones + 1);
       
        
        for (int i = 0; i < row.getLastCellNum(); i++) {
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

        int lastRowNum = sheet.getLastRowNum();
        if (rowIndex >= 0 && rowIndex < lastRowNum) {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);
            System.out.println("hola " + rowIndex +" " + lastRowNum);
            
        }
        if (rowIndex == lastRowNum) {
            XSSFRow removingRow = sheet.getRow(rowIndex);
            if (removingRow != null) {
               sheet.removeRow(removingRow);
                
            }
        }
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();
    }

    public void escribirExcelInv(String filepath, String hoja, String[] data, int col) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
        int renglones = 0;
        CellStyle estilo= newSheet.getColumnStyle(9);
        

        for (int i = 1; i <= rowCount; i++) {
            
            XSSFRow row = newSheet.getRow(i);
            
            
            if (row.getCell(0).getCellType() != CellType.BLANK) {
                renglones++;
               
            } else {
                break;
            }
        }

        XSSFRow row = newSheet.getRow(0);

        newSheet.shiftRows(renglones + 1, renglones + 2, 1, true, true);
        XSSFRow newRow = newSheet.createRow(renglones + 1);
        

        for (int i = 0; i < col; i++) {
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(data[i]);
            newCell.setCellStyle(estilo);
           
        }

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();
    }
    public void escribirExcel2(String filepath, String hoja, int col,int renglones) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();

        
        XSSFRow row = newSheet.getRow(0);
        XSSFRow newRow = newSheet.createRow(renglones+1);
        XSSFCell newCell = newRow.getCell(col);
        newCell.setCellFormula(hoja);
        

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }
    public void escribirCelda(String filepath, String hoja, String data, int fila,int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        
       
        XSSFRow row = newSheet.getRow(fila);
        

        
            XSSFCell newCell = row.createCell(columna);
            newCell.setCellValue(data);
        

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }
    public void escribirCeldaNumerica(String filepath, String hoja, int data, int fila,int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        
       
        XSSFRow row = newSheet.getRow(fila);
        

        
            XSSFCell newCell = row.createCell(columna);
            newCell.setCellValue(data);
        

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }
    public void borrarCelda(String filepath, String hoja,  int fila,int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        
        //System.out.println(renglones);
        XSSFRow row = newSheet.getRow(fila);
        

        
            XSSFCell newCell = row.createCell(columna);
            newCell.setBlank();
        

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }
    
    public void escribirFormula(String filepath, String hoja,String formula, int fila,int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        
        
        XSSFRow row = newSheet.getRow(fila);
        

        
            XSSFCell newCell = row.createCell(columna);
            newCell.setCellFormula(formula);
            newWorkbook.setForceFormulaRecalculation(true);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }
}
