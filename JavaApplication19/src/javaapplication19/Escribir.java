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
    
    public void evaluar(XSSFWorkbook wb, XSSFCell R){
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
    
    public void setCellStyleVerde(XSSFWorkbook wb, XSSFCell R) {
        DataFormat df = wb.createDataFormat();
        XSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 12);
        font.setFontName("Calibri");
        font.setColor(IndexedColors.BLACK.getIndex());
        font.setBold(true);
        font.setItalic(false);

        XSSFCellStyle style = wb.createCellStyle();
        style.setDataFormat(df.getFormat("$#,#0.00"));
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
//         newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
         XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);
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
        newWorkbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
         evaluar(newWorkbook, newCell);
        XSSFFormulaEvaluator.evaluateAllFormulaCells(newWorkbook);

        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(file);
        newWorkbook.write(outputStream);
        outputStream.close();

    }
    public String Restar (int filaInicial, int filaFinal, char columna){
        String Resta = (Character.toUpperCase(columna)+Integer.toString(filaInicial));
        for(int i = filaInicial+1; i<= filaFinal;i++ ){
            Resta= Resta + "-"+ Character.toUpperCase(columna)+Integer.toString(i);
        }
        System.out.println(Resta);
        return Resta;
    }
    public String Sumar (int filaInicial, int filaFinal, char columna){
        String Resta = (Character.toUpperCase(columna)+Integer.toString(filaInicial));
        for(int i = filaInicial+1; i<= filaFinal;i++ ){
            Resta= Resta + "+"+ Character.toUpperCase(columna)+Integer.toString(i);
        }
        System.out.println(Resta);
        return Resta;
    }
    public Double Mulitplicar(int columnaInicial, int columnaFinal, int fila, String filepath, String hoja) throws IOException, IOException{
        Double columnaUno= LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaInicial, fila);
        Double columnaDos= LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaFinal, fila);
        
        Double multiplicacion = columnaUno * columnaDos;
        
        return multiplicacion; 
    }
    
    public Double SumarColumnasML (int fila, int columnaUno, int columnaDos, int columnaTres, String filepath, String hoja) throws IOException{
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
    
    public Double RestarColumnasML (int fila, int columnaUno, int columnaDos, int columnaTres, int columnaCuatro, String filepath, String hoja) throws IOException{
        Double columnaN = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaUno, fila);
        Double columnaH = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaDos, fila);
        Double columnaP = LeerExcel.obtenerCeldaNumerica(filepath, hoja,columnaTres, fila);
        Double columnaR = LeerExcel.obtenerCeldaNumerica(filepath, hoja,columnaCuatro, fila);
        
        Double Resta = columnaN - columnaH - columnaP - columnaR - 35; 
        System.out.println(Resta);
        return Resta;
    }
    public Double RestarColumnas (int fila, int columnaUno, int columnaDos, int columnaTres, String filepath, String hoja) throws IOException{
        Double columnaL = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaUno, fila);
        Double columnaH = LeerExcel.obtenerCeldaNumerica(filepath, hoja, columnaDos, fila);
        Double columnaR = LeerExcel.obtenerCeldaNumerica(filepath, hoja,columnaTres, fila);
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
        
            for(int i=0; i<2; i++){
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
    public void crearHojaPacks(String filepath, String hoja) throws FileNotFoundException, IOException {
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
                "     ",
                "DESCRIPCION",
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
        
            for(int i=0; i<21; i++){
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
    public static void eliminarHoja(String filepath, int indexHoja) throws FileNotFoundException, IOException{
        File file = new File(filepath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkBook = newWorkBook = new XSSFWorkbook(inputStream);
        newWorkBook.removeSheetAt(indexHoja);
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
}
