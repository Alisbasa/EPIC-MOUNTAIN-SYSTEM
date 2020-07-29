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
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
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

    public void setCellStyle(XSSFWorkbook wb, XSSFCell R) {
        XSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 12);
        font.setFontName("Calibri");
        font.setColor(IndexedColors.BLACK.getIndex());
        font.setBold(true);
        font.setItalic(false);

        XSSFCellStyle style = wb.createCellStyle();
        
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        XSSFColor color = new XSSFColor(Colores.grisBajito);
        style.setFillForegroundColor(color);//color de fondo
        //style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());//color de fondo
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setFont(font);
        R.setCellStyle(style);

    }
    public void setCellStyleVerde(XSSFWorkbook wb, XSSFCell R) {
        XSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 12);
        font.setFontName("Calibri");
        font.setColor(IndexedColors.BLACK.getIndex());
        font.setBold(true);
        font.setItalic(false);

        XSSFCellStyle style = wb.createCellStyle();
        XSSFColor color = new XSSFColor(Colores.epicColor);
        style.setFillForegroundColor(color);//color de fondo
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setFont(font);
        R.setCellStyle(style);

    }

    public void escribirExcel(String filepath, String hoja, String[] data) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);

        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
        int renglones = 0;
        for (int i = 1; i <= rowCount; i++) {
            XSSFRow row = newSheet.getRow(i);
            row.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

            if (row.getCell(0).getCellType() != CellType.BLANK) {
                renglones++;
            } else {
                break;
            }
        }

        XSSFRow row = newSheet.getRow(0);
        XSSFRow newRow = newSheet.createRow(renglones + 1);
        newRow.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

        for (int i = 0; i < row.getLastCellNum(); i++) {
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(data[i]);
            setCellStyle(newWorkbook, newCell);
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

        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
        int renglones = 0;
        for (int i = 1; i <= rowCount; i++) {
            XSSFRow row = newSheet.getRow(i);
            row.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

            if (row.getCell(0).getCellType() != CellType.BLANK) {
                renglones++;
            } else {
                break;
            }
        }
        //System.out.println(renglones);
        XSSFRow row = newSheet.getRow(0);
        XSSFRow newRow = newSheet.createRow(renglones + 1);
        newRow.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

        for (int i = 0; i < row.getLastCellNum(); i++) {
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(data[i]);
            setCellStyle(newWorkbook, newCell);
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
            System.out.println("hola " + rowIndex + " " + lastRowNum);

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

        for (int i = 1; i <= rowCount; i++) {

            XSSFRow row = newSheet.getRow(i);
            row.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

            if (row.getCell(0).getCellType() != CellType.BLANK) {
                renglones++;

            } else {
                break;
            }
        }

        XSSFRow row = newSheet.getRow(0);

        newSheet.shiftRows(renglones + 1, renglones + 2, 1, true, true);
        XSSFRow newRow = newSheet.createRow(renglones + 1);
        newRow.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

        for (int i = 0; i < col; i++) {
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(data[i]);
            setCellStyle(newWorkbook, newCell);

        }

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();
    }

    public void escribirExcel2(String filepath, String hoja, int col, int renglones) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();

        XSSFRow row = newSheet.getRow(0);
        XSSFRow newRow = newSheet.createRow(renglones + 1);
        XSSFCell newCell = newRow.getCell(col);
        newCell.setCellFormula(hoja);
        setCellStyle(newWorkbook, newCell);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }

    public void escribirCelda(String filepath, String hoja, String data, int fila, int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);

        XSSFRow row = newSheet.getRow(fila);

        XSSFCell newCell = row.createCell(columna);
        newCell.setCellValue(data);
        setCellStyle(newWorkbook, newCell);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }

    public void escribirCeldaNumerica(String filepath, String hoja, int data, int fila, int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);

        XSSFRow row = newSheet.getRow(fila);

        XSSFCell newCell = row.createCell(columna);
        newCell.setCellValue(data);
        setCellStyle(newWorkbook, newCell);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }

    public void borrarCelda(String filepath, String hoja, int fila, int columna) throws FileNotFoundException, IOException {
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

    public void escribirFormula(String filepath, String hoja, String formula, int fila, int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);

        XSSFRow row = newSheet.getRow(fila);

        XSSFCell newCell = row.createCell(columna);
        newCell.setCellFormula(formula);
        setCellStyleVerde(newWorkbook, newCell);
        newWorkbook.setForceFormulaRecalculation(true);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }

    public static void crearHoja(String filepath, String hoja) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        XSSFWorkbook newWorkBook;
        try ( FileInputStream inputStream = new FileInputStream(file)) {
            newWorkBook = new XSSFWorkbook(inputStream);
            newWorkBook.createSheet(hoja);
        }
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkBook.write(outputStream);
        outputStream.close();
    }
}
