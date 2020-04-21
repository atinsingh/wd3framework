package io.pragra.learning.framework.data;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelDataProvider {
    private String fileName = "masterdata.xlsx";
    private List<Object[]> data = new ArrayList<>();
    private Workbook workbook;

    public ExcelDataProvider(){
        Path path = Paths.get("src/test/resources", fileName);
        try (InputStream inputStream = new FileInputStream(path.toFile())) {
            workbook = new XSSFWorkbook(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Object[]> getDataFromSheet(String sheetName){
        Sheet sheet = workbook.getSheet(sheetName);
        Iterator<Row> rowIterator = sheet.rowIterator();
        rowIterator.next(); //skipping one row
        while (rowIterator.hasNext()){
            List<Object> cellData = new ArrayList<>();
            Row row = rowIterator.next();
            //
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                if(cell.getCellType() == CellType.STRING){
                    cellData.add(cell.getStringCellValue());
                }
                if(cell.getCellType() == CellType.NUMERIC){
                    cellData.add(cell.getNumericCellValue());
                }
                if(cell.getCellType() == CellType.BOOLEAN){
                    cellData.add(cell.getBooleanCellValue());
                }
            }
            data.add(cellData.toArray());
        }
        return data;
    }

    @DataProvider
    public Iterator<Object[]> excelProvider(){
        return getDataFromSheet("Contact").iterator();
    }

    @DataProvider
    public Iterator<Object[]> loginProvider(){
        return getDataFromSheet("Login").iterator();
    }

}
