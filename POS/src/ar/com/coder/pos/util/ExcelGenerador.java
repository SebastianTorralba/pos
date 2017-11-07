/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.coder.pos.util;

import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Sebastian
 */
public abstract class ExcelGenerador {

    List<?> datos;

    public List<?> getDatos() {
        return datos;
    }

    public void setDatos(List<?> datos) {
        this.datos = datos;
    }
    HSSFWorkbook libro;
    HSSFSheet hoja;

    protected HSSFWorkbook getLibro() {
        return libro;
    }

    protected void setLibro(HSSFWorkbook libro) {
        this.libro = libro;
    }

    protected HSSFSheet getHoja() {
        return hoja;
    }

    protected void setHoja(HSSFSheet hoja) {
        this.hoja = hoja;
    }

    public ExcelGenerador() {
    }

    public ExcelGenerador(List<?> datos) {
        this.datos = datos;
    }

    public abstract Integer renderizarDatos();

    public void generarArchivo() {
        HSSFRow fila;
        HSSFCell celda;
        libro = new HSSFWorkbook();
        hoja = libro.createSheet();
        renderizarDatos();
        try {
            FileOutputStream elFichero = new FileOutputStream("Jdaluslite.xls");
            libro.write(elFichero);
            elFichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
