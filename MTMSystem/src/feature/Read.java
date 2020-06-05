package feature;

import feature.Mission;
import org.apache.poi.*;
import org.apache.poi.ss.usermodel.*;
import java.io.*;
import java.util.*;
/**
 * feature.Read exale
 *
 * Dongheng Zhan
 * 24/5/2020
 */
public class Read
{
    private  String fileName = "/Users/brianzhang/MTMSystem/src/feature/Mission2.xlsx";
    public void a (){
        System.out.print('\u000C');}
    public List<Mission> read() throws EncryptedDocumentException, IOException
    {
        Mission mission;
        List<Mission> list = new ArrayList<Mission> ();
        if (fileName == null)
            return null;
        File xlsxFile = new File(fileName);
        if (!xlsxFile.exists())
            return null;
        Workbook workbook = WorkbookFactory.create(xlsxFile);
        DataFormatter dataFormatter = new DataFormatter();
        int numberOfSheets = workbook.getNumberOfSheets();
        if (numberOfSheets <= 0)
            return null;
        Sheet sheet = workbook.getSheetAt(0);
        int rowNumbers = sheet.getLastRowNum() + 1;
        for (int row = 1; row < rowNumbers; row++) {
            Row r = sheet.getRow(row);
            mission = new Mission((int)Double.parseDouble(String.valueOf(r.getCell(0))),String.valueOf(r.getCell(1)),String.valueOf(r.getCell(2)),String.valueOf(r.getCell(3)),String.valueOf(r.getCell(4)),String.valueOf(r.getCell(5)),String.valueOf(r.getCell(6)),String.valueOf(r.getCell(7)),String.valueOf(r.getCell(8)),String.valueOf(r.getCell(9)),String.valueOf(r.getCell(10)),(int)Double.parseDouble(String.valueOf(r.getCell(11))),String.valueOf(r.getCell(12)));
            list.add(mission);
        }
        return list;
    }
}
