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
import javax.swing.JComboBox;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
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

    public void evaluar(XSSFWorkbook wb, XSSFCell R) {
        FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
        evaluator.evaluate(R);

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

    public void setCellStyleGris(XSSFWorkbook wb, XSSFCell R) {
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
        XSSFColor color = new XSSFColor(Colores.grisFuertesito);
        style.setFillForegroundColor(color);//color de fondo
        //style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());//color de fondo
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setFont(font);
        R.setCellStyle(style);

    }
    
    public void setCellStyleGrisPrecio(XSSFWorkbook wb, XSSFCell R) {
        DataFormat df = wb.createDataFormat();

        XSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 12);
        font.setFontName("Calibri");
        font.setColor(IndexedColors.BLACK.getIndex());
        font.setBold(true);
        font.setItalic(false);

        XSSFCellStyle style = wb.createCellStyle();
        style.setDataFormat(df.getFormat("$#,#0.00"));
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        XSSFColor color = new XSSFColor(Colores.grisFuertesito);
        style.setFillForegroundColor(color);//color de fondo
        //style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());//color de fondo
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setFont(font);
        R.setCellStyle(style);

    }

    public void setCellStyleDesc(XSSFWorkbook wb, XSSFCell R) {
        XSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 1);
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

    public void setCellStylePrecio(XSSFWorkbook wb, XSSFCell R) {

        DataFormat df = wb.createDataFormat();

        XSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 12);
        font.setFontName("Calibri");
        font.setColor(IndexedColors.BLACK.getIndex());
        font.setBold(true);
        font.setItalic(false);

        XSSFCellStyle style = wb.createCellStyle();
        style.setDataFormat(df.getFormat("$#,#0.00"));
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
    public void setCellStylePrecioVerde(XSSFWorkbook wb, XSSFCell R) {

        DataFormat df = wb.createDataFormat();

        XSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 12);
        font.setFontName("Calibri");
        font.setColor(IndexedColors.BLACK.getIndex());
        font.setBold(true);
        font.setItalic(false);

        XSSFCellStyle style = wb.createCellStyle();
        style.setDataFormat(df.getFormat("$#,#0.00"));
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        XSSFColor color = new XSSFColor(Colores.verdeExcel);
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
        
        XSSFColor color = new XSSFColor(Colores.verdeExcel);
        style.setFillForegroundColor(color);//color de fondo
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
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
        newSheet.getWorkbook().getCreationHelper().createFormulaEvaluator().evaluateAll();
        XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);
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

    public static void removeRow2(XSSFSheet sheet, int rowIndex) throws FileNotFoundException, IOException {

        int lastRowNum = sheet.getLastRowNum();
        if (rowIndex >= 0 && rowIndex < lastRowNum) {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);

        }
        if (rowIndex == lastRowNum) {
            XSSFRow removingRow = sheet.getRow(rowIndex);
            if (removingRow != null) {
                sheet.removeRow(removingRow);

            }
        }

    }

    public static void removeRow(String filepath, String hoja, int rowIndex) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = newWorkbook.getSheet(hoja);

        int lastRowNum = sheet.getLastRowNum();
        if (rowIndex >= 0 && rowIndex < lastRowNum) {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);

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

        newSheet.shiftRows(renglones + 1, renglones + 2, 1, true, true);
        XSSFRow newRow = newSheet.createRow(renglones + 1);
        newRow.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));
        XSSFRow row = newSheet.getRow(0);

        if (row.getCell(1).getStringCellValue().equals("DESCRIPCIÓN")) {
            newSheet.setColumnWidth(0, 15000);
            newSheet.setColumnWidth(1, 15000);
            for (int i = 0; i < col; i++) {
                if (i >= 2) {
                    newSheet.setColumnWidth(i, 5000);
                }
                XSSFCell newCell = newRow.createCell(i);
                newCell.setCellValue(data[i]);
                setCellStyle(newWorkbook, newCell);
                //evaluar(newWorkbook, newCell);

            }
            XSSFCell desc = newRow.getCell(1);
            setCellStyleDesc(newWorkbook, desc);

        } else if (row.getCell(1).getStringCellValue().equals("Tipo")) {
            newSheet.setColumnWidth(0, 5000);
            newSheet.setColumnWidth(1, 7000);
            newSheet.setColumnWidth(2, 15000);
            for (int i = 0; i < col; i++) {
                if (i > 2) {
                    newSheet.setColumnWidth(i, 5000);
                }
                XSSFCell newCell = newRow.createCell(i);
                newCell.setCellValue(data[i]);
                setCellStyle(newWorkbook, newCell);
                //evaluar(newWorkbook, newCell);

            }

        } else {

            for (int i = 0; i < col; i++) {

                XSSFCell newCell = newRow.createCell(i);
                newCell.setCellValue(data[i]);
                setCellStyle(newWorkbook, newCell);
                //evaluar(newWorkbook, newCell);

            }
        }
        //newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
        //XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();
    }

    public void escribirExcelPacks(String filepath, String hoja, String[] data, int col) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
        int renglones = 0;

        for (int i = 1; i <= rowCount; i++) {

            XSSFRow row = newSheet.getRow(i);
            row.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

            if (row.getCell(1).getCellType() != CellType.BLANK) {
                renglones++;

            } else {
                break;
            }
        }

        newSheet.shiftRows(renglones + 1, renglones + 2, 1, true, true);
        XSSFRow newRow = newSheet.createRow(renglones + 1);
        newRow.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));
        XSSFRow row = newSheet.getRow(0);

        newSheet.setColumnWidth(0, 15000);
        newSheet.setColumnWidth(1, 15000);
        for (int i = 0; i < col; i++) {
            if (i >= 2) {
                newSheet.setColumnWidth(i, 5000);
            }
            XSSFCell newCell = newRow.createCell(i);
            newCell.setCellValue(data[i]);
            setCellStyle(newWorkbook, newCell);
            //evaluar(newWorkbook, newCell);

        }
        XSSFCell desc = newRow.getCell(1);
        setCellStyleDesc(newWorkbook, desc);

        //newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
        //XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();
    }

    public void escribirExcelInv2(String filepath, String hoja, String[] data, int col) throws FileNotFoundException, IOException {
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
            //evaluar(newWorkbook, newCell);

        }
        //newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
        //XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);
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

        XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);
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
        evaluar(newWorkbook, newCell);
        //newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
        //XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }

    public void escribirCeldaDouble(String filepath, String hoja, double data, int fila, int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);

        XSSFRow row = newSheet.getRow(fila);

        XSSFCell newCell = row.createCell(columna);
        newCell.setCellValue(data);
        setCellStylePrecio(newWorkbook, newCell);
        evaluar(newWorkbook, newCell);
//      newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
//        XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);
        XSSFRow NEWrow = newSheet.getRow(0);
        if (NEWrow.getCell(1).getStringCellValue().equals("DESCRIPCIÓN") && columna == 5) {
            System.out.println("javaapplication19.Escribir.escribirCeldaDouble()");
            newCell.setCellValue(data);
            setCellStyle(newWorkbook, newCell);
            evaluar(newWorkbook, newCell);
//          newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
            XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);

        }
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }
    
    public void escribirCeldaDoubleVerde(String filepath, String hoja, double data, int fila, int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);

        XSSFRow row = newSheet.getRow(fila);

        XSSFCell newCell = row.createCell(columna);
        newCell.setCellValue(data);
        setCellStylePrecioVerde(newWorkbook, newCell);
        evaluar(newWorkbook, newCell);
//      newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
//        XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);
        XSSFRow NEWrow = newSheet.getRow(0);
        if (NEWrow.getCell(1).getStringCellValue().equals("DESCRIPCIÓN") && columna == 5) {
            System.out.println("javaapplication19.Escribir.escribirCeldaDouble()");
            newCell.setCellValue(data);
            setCellStyleVerde(newWorkbook, newCell);
            evaluar(newWorkbook, newCell);
//          newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
            XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);

        }
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
        setCellStylePrecioVerde(newWorkbook, newCell);
        newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
        evaluar(newWorkbook, newCell);
        XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }
    
    public void escribirFormulaPacks(String filepath, String hoja, String formula, int fila, int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);

        XSSFRow row = newSheet.getRow(fila);

        XSSFCell newCell = row.createCell(columna);
        newCell.setCellFormula(formula);
        setCellStyleGrisPrecio(newWorkbook, newCell);
        newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
        evaluar(newWorkbook, newCell);
        XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }

    public String Restar(int filaInicial, int filaFinal, char columna) {
        String Resta = (Character.toUpperCase(columna) + Integer.toString(filaInicial));
        for (int i = filaInicial + 1; i <= filaFinal; i++) {
            Resta = Resta + "-" + Character.toUpperCase(columna) + Integer.toString(i);
        }
        System.out.println(Resta);
        return Resta;
    }

    public String Sumar(int filaInicial, int filaFinal, char columna) {
        String Resta = (Character.toUpperCase(columna) + Integer.toString(filaInicial));
        for (int i = filaInicial + 1; i <= filaFinal; i++) {
            Resta = Resta + "+" + Character.toUpperCase(columna) + Integer.toString(i);
        }
        System.out.println(Resta);
        return Resta;
    }

    public Double Mulitplicar(int columnaInicial, int columnaFinal, int fila, String filepath, String hoja) throws IOException, IOException {
        Double columnaUno = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaInicial, fila);
        Double columnaDos = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaFinal, fila);

        Double multiplicacion = columnaUno * columnaDos;

        return multiplicacion;
    }

    public Double SumarColumnasML(int fila, int columnaUno, int columnaDos, int columnaTres, String filepath, String hoja) throws IOException {
        Double columnaJ;
        Double columnaR;
        Double columnaP;
        columnaJ = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaUno, fila);
        columnaR = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaDos, fila);
        columnaP = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaTres, fila);

        Double Suma = columnaJ + columnaR + columnaP + 35.00;
        System.out.println(Suma);
        return Suma;
    }

    public Double RestarColumnasML(int fila, int columnaUno, int columnaDos, int columnaTres, int columnaCuatro, String filepath, String hoja) throws IOException {
        Double columnaN = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaUno, fila);
        Double columnaH = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaDos, fila);
        Double columnaP = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaTres, fila);
        Double columnaR = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaCuatro, fila);

        Double Resta = columnaN - columnaH - columnaP - columnaR - 35;
        System.out.println(Resta);
        return Resta;
    }

    public Double RestarColumnas(int fila, int columnaUno, int columnaDos, int columnaTres, String filepath, String hoja) throws IOException {
        Double columnaL = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaUno, fila);
        Double columnaH = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaDos, fila);
        Double columnaR = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaTres, fila);
        Double Resta = columnaL - columnaH - columnaR;
        System.out.println(Resta);
        return Resta;
    }

    public void crearHoja(String filepath, String hoja, String header, String header2) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        XSSFWorkbook newWorkBook;
        try ( FileInputStream inputStream = new FileInputStream(file)) {
            newWorkBook = new XSSFWorkbook(inputStream);
            XSSFRow row;
            XSSFRow row2;
            XSSFSheet newSheet = newWorkBook.createSheet(hoja);
            row = newSheet.createRow(0);
            row2 = newSheet.createRow(1);

            String[] headers = new String[]{
                header,
                header2
            };

            newSheet.setColumnWidth(0, 10000);
            newSheet.setColumnWidth(1, 7000);

            for (int i = 0; i < 2; i++) {
                XSSFCell newCell = row.createCell(i);
                XSSFCell newCell2 = row2.createCell(i);
                setCellStyleVerde(newWorkBook, newCell);
                setCellStyleVerde(newWorkBook, newCell2);

                newCell.setCellValue(headers[i]);
                XSSFFont font = newWorkBook.createFont();
                font.setFontHeightInPoints((short) 12);
                font.setFontName("Calibri");
                font.setColor(IndexedColors.BLACK.getIndex());
                font.setBold(true);
                font.setItalic(false);

                XSSFCellStyle style = newWorkBook.createCellStyle();
                XSSFColor color = new XSSFColor(Colores.epicColor);
                style.setFillForegroundColor(color);//color de fondo
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                style.setAlignment(HorizontalAlignment.CENTER);
                style.setVerticalAlignment(VerticalAlignment.CENTER);
                style.setFont(font);
                newCell.setCellStyle(style);

            }
        }

        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkBook.write(outputStream);
        outputStream.close();
    }
    
    public void crearHojaCorte(String filepath, String hoja) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        XSSFWorkbook newWorkBook;
        try ( FileInputStream inputStream = new FileInputStream(file)) {
            newWorkBook = new XSSFWorkbook(inputStream);
            XSSFRow row2;
            XSSFSheet newSheet = newWorkBook.createSheet(hoja);
            
            

            String[] headers = new String[]{
                "    ",
                "CUENTA",
                "CANTIDAD"
            };

            newSheet.setColumnWidth(0, 10000);
            newSheet.setColumnWidth(1, 7000);
            

            for (int i = 0; i < 21; i++) {
                row2 = newSheet.createRow(i);
                
                XSSFCell newCell2 = row2.createCell(0);
                XSSFCell newCell3 = row2.createCell(1);
                XSSFCell newCell4 = row2.createCell(2);
                
                XSSFFont font = newWorkBook.createFont();
                font.setFontHeightInPoints((short) 12);
                font.setFontName("Calibri");
                font.setColor(IndexedColors.BLACK.getIndex());
                font.setBold(true);
                font.setItalic(false);

                XSSFCellStyle style = newWorkBook.createCellStyle();
                XSSFColor color = new XSSFColor(Colores.epicColor);
                style.setFillForegroundColor(color);//color de fondo
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                style.setAlignment(HorizontalAlignment.CENTER);
                style.setVerticalAlignment(VerticalAlignment.CENTER);
                style.setFont(font);
  
                XSSFFont font2 = newWorkBook.createFont();
                font2.setFontHeightInPoints((short) 12);
                font2.setFontName("Calibri");
                font2.setColor(IndexedColors.BLACK.getIndex());
                font2.setBold(true);
                font2.setItalic(false);

                XSSFCellStyle style2 = newWorkBook.createCellStyle();
                XSSFColor color2 = new XSSFColor(Colores.grisBajito);
                style2.setFillForegroundColor(color2);//color de fondo
                style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                style2.setAlignment(HorizontalAlignment.CENTER);
                style2.setVerticalAlignment(VerticalAlignment.CENTER);
                style2.setFont(font2);
                
                XSSFFont font3 = newWorkBook.createFont();
                font3.setFontHeightInPoints((short) 12);
                font3.setFontName("Calibri");
                font3.setColor(IndexedColors.BLACK.getIndex());
                font3.setBold(true);
                font3.setItalic(false);

                XSSFCellStyle style3 = newWorkBook.createCellStyle();
                XSSFColor color3 = new XSSFColor(Colores.grisFuertesito);
                style3.setFillForegroundColor(color3);//color de fondo
                style3.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                style3.setAlignment(HorizontalAlignment.CENTER);
                style3.setVerticalAlignment(VerticalAlignment.CENTER);
                style3.setFont(font3);
                
                if(i ==0){
                    newCell2.setCellValue("   ");
                    newCell3.setCellValue("CUENTA");
                    newCell4.setCellValue("CANTIDAD");
                    
                    newCell2.setCellStyle(style);
                    newCell3.setCellStyle(style);
                    newCell4.setCellStyle(style);
                }
                
                if(i>0 || i<4){
                    newCell2.setCellStyle(style2);
                    newCell3.setCellStyle(style2);
                    newCell4.setCellStyle(style2);
                }
                if( i==5 || i< 10 ){
                    newCell2.setCellStyle(style3);
                    newCell3.setCellStyle(style3);
                    newCell4.setCellStyle(style3);
                }
                if( i==10 || i< 12 ){
                    newCell2.setCellStyle(style);
                    newCell3.setCellStyle(style);
                    newCell4.setCellStyle(style);
                }
                
                if( i==12 || i< 15 ){
                    newCell2.setCellStyle(style2);
                    newCell3.setCellStyle(style2);
                    newCell4.setCellStyle(style2);
                }
                if( i==15 || i< 19 ){
                    newCell2.setCellStyle(style3);
                    newCell3.setCellStyle(style3);
                    newCell4.setCellStyle(style3);
                }
                if( i==19 || i< 21 ){
                    newCell2.setCellStyle(style);
                    newCell3.setCellStyle(style);
                    newCell4.setCellStyle(style);
                }
                
            }
            
                
                


        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkBook.write(outputStream);
        outputStream.close();
        }
    }
    
    public void crearHojaFormatoInventario(String filepath, String hoja) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        XSSFWorkbook newWorkBook;
        try ( FileInputStream inputStream = new FileInputStream(file)) {
            newWorkBook = new XSSFWorkbook(inputStream);
            XSSFRow row;
            XSSFRow row2;
            XSSFSheet newSheet = newWorkBook.createSheet(hoja);
            row = newSheet.createRow(0);
            row2 = newSheet.createRow(1);
            row.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));
            row2.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

            String[] headers = new String[]{
                "     ",
                "DESCRIPCIÓN",
                "FECHA DE REGISTRO",
                "CONDICION",
                "PACK",
                "T.I.G",
                "UNIDADES",
                "COSTO X UNIDAD",
                "COSTO NETO",
                "PRECIO BASE X UNIDAD",
                "PRECIO BASE NETO",
                "PRECIO SHOP X UNIDAD",
                "PRECIO SHOP NETO",
                "PRECIO ML X UNIDAD",
                "PRECIO ML NETO",
                "COMISION ML X UNIDAD",
                "COMISION ML NETA",
                "IVA X UNIDAD",
                "IVA NETA",
                "UTILIDAD X UNIDAD",
                "UTILIDAD NETA",
                "MEDIO DE VENTA",
                "DESTINO",
                "FOLIO"
            };

            newSheet.setColumnWidth(0, 15000);
            newSheet.setColumnWidth(1, 15000);

            for (int i = 0; i < 24; i++) {
                if (i >= 2) {
                    newSheet.setColumnWidth(i, 5000);
                }
                XSSFCell newCell = row.createCell(i);
                XSSFCell newCell2 = row2.createCell(i);
                setCellStyleVerde(newWorkBook, newCell);
                setCellStyleVerde(newWorkBook, newCell2);

                newCell.setCellValue(headers[i]);
                XSSFFont font = newWorkBook.createFont();
                font.setFontHeightInPoints((short) 12);
                font.setFontName("Calibri");
                font.setColor(IndexedColors.BLACK.getIndex());
                font.setBold(true);
                font.setItalic(false);

                XSSFCellStyle style = newWorkBook.createCellStyle();
                XSSFColor color = new XSSFColor(Colores.verdeExcel);
                style.setFillForegroundColor(color);//color de fondo
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                style.setAlignment(HorizontalAlignment.CENTER);
                style.setVerticalAlignment(VerticalAlignment.CENTER);
                style.setFont(font);
                newCell.setCellStyle(style);

            }
        }

        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkBook.write(outputStream);
        outputStream.close();
    }

    public void crearHojaPack(String filepath, String hoja) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        XSSFWorkbook newWorkBook;
        try ( FileInputStream inputStream = new FileInputStream(file)) {
            newWorkBook = new XSSFWorkbook(inputStream);
            XSSFRow row;
            XSSFRow row2;
            XSSFRow row3;
            XSSFSheet newSheet = newWorkBook.createSheet(hoja);
            row = newSheet.createRow(0);
            row2 = newSheet.createRow(1);
            row3 = newSheet.createRow(2);

            row.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));
            row2.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));
            row3.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

            String[] headers = new String[]{
                "     ",
                "DESCRIPCIÓN",
                "FECHA DE REGISTRO",
                "CONDICION",
                "PACK",
                "T.I.G",
                "UNIDADES",
                "COSTO X UNIDAD",
                "COSTO NETO",
                "PRECIO BASE X UNIDAD",
                "PRECIO BASE NETO",
                "PRECIO SHOP X UNIDAD",
                "PRECIO SHOP NETO",
                "PRECIO ML X UNIDAD",
                "PRECIO ML NETO",
                "COMISION ML X UNIDAD",
                "COMISION ML NETA",
                "IVA X UNIDAD",
                "IVA NETA",
                "UTILIDAD X UNIDAD",
                "UTILIDAD NETA"
                
            };

            newSheet.setColumnWidth(0, 15000);
            newSheet.setColumnWidth(1, 15000);

            for (int i = 0; i < 21; i++) {
                if (i >= 2) {
                    newSheet.setColumnWidth(i, 5000);
                }
                XSSFCell encabezados = row.createCell(i);
                XSSFCell suma = row2.createCell(i);
                XSSFCell pack = row3.createCell(i);

                if (i == 0) {
                    suma.setCellValue("SUMA DE ITEMS");
                    pack.setCellValue("VALOR DEL PACK");
                }
                setCellStyleVerde(newWorkBook, encabezados);
                setCellStyleGris(newWorkBook, suma);
                setCellStyleVerde(newWorkBook, pack);

                encabezados.setCellValue(headers[i]);
                XSSFFont font = newWorkBook.createFont();
                font.setFontHeightInPoints((short) 12);
                font.setFontName("Calibri");
                font.setColor(IndexedColors.BLACK.getIndex());
                font.setBold(true);
                font.setItalic(false);

                XSSFCellStyle style = newWorkBook.createCellStyle();
                XSSFColor color = new XSSFColor(Colores.verdeExcel);
                style.setFillForegroundColor(color);//color de fondo
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                style.setAlignment(HorizontalAlignment.CENTER);
                style.setVerticalAlignment(VerticalAlignment.CENTER);
                style.setFont(font);
                encabezados.setCellStyle(style);

            }
        }

        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkBook.write(outputStream);
        outputStream.close();
    }

    public void crearHojaEquipo(String filepath, String hoja) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        XSSFWorkbook newWorkBook;
        try ( FileInputStream inputStream = new FileInputStream(file)) {
            newWorkBook = new XSSFWorkbook(inputStream);
            XSSFRow row;
            XSSFRow row2;
            XSSFRow row3;
            XSSFSheet newSheet = newWorkBook.createSheet(hoja);
            row = newSheet.createRow(0);
            row2 = newSheet.createRow(1);
            row3 = newSheet.createRow(2);

            row.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));
            row2.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));
            row3.setHeightInPoints((2 * newSheet.getDefaultRowHeightInPoints()));

            String[] headers = new String[]{
                "     ",
                "PRODUCTO",
                "FECHA DE REGISTRO",
                "DESCRIPCION",
                "COSTO X UNIDAD"
            };

            newSheet.setColumnWidth(0, 15000);
            newSheet.setColumnWidth(1, 15000);

            for (int i = 0; i < 5; i++) {
                if (i >= 2) {
                    newSheet.setColumnWidth(i, 5000);
                }
                XSSFCell encabezados = row.createCell(i);
                XSSFCell pack = row3.createCell(i);

                setCellStyleVerde(newWorkBook, encabezados);
                setCellStyleVerde(newWorkBook, pack);

                encabezados.setCellValue(headers[i]);
                XSSFFont font = newWorkBook.createFont();
                font.setFontHeightInPoints((short) 12);
                font.setFontName("Calibri");
                font.setColor(IndexedColors.BLACK.getIndex());
                font.setBold(true);
                font.setItalic(false);

                XSSFCellStyle style = newWorkBook.createCellStyle();
                XSSFColor color = new XSSFColor(Colores.verdeExcel);
                style.setFillForegroundColor(color);//color de fondo
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                style.setAlignment(HorizontalAlignment.CENTER);
                style.setVerticalAlignment(VerticalAlignment.CENTER);
                style.setFont(font);
                encabezados.setCellStyle(style);

            }
        }

        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkBook.write(outputStream);
        outputStream.close();
    }

    public static void crearDocumento(String nombre, String año) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        try ( FileOutputStream fos
                = new FileOutputStream(new File("src\\" + año + "\\" + nombre + ".xlsx"))) {
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void eliminarHoja(String filepath, int indexHoja) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkBook = newWorkBook = new XSSFWorkbook(inputStream);
        newWorkBook.removeSheetAt(indexHoja);
    }

    public static void eliminarHoja2(String filepath, int indexHoja) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkBook = newWorkBook = new XSSFWorkbook(inputStream);
        newWorkBook.removeSheetAt(indexHoja);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkBook.write(outputStream);
        outputStream.close();
    }

    public void escribirFormulaF(String filepath, String hoja, String formula, int fila, int columna) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);

        XSSFRow row = newSheet.getRow(fila);

        XSSFCell newCell = row.createCell(columna);
        newCell.setCellFormula(formula);
        setCellStyle(newWorkbook, newCell);
        newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
        evaluar(newWorkbook, newCell);
        XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }

    static void saldarDeuda(String filepath, String hoja, int index) throws FileNotFoundException, IOException {
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hoja);
        newWorkbook.removeSheetAt(index);
        removeRow2(newSheet, index);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();
    }
}
