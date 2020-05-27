import java.io.*;
import java.util.*;
import org.apache.poi.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
/**
 * Write in exale
 * 
 * Dongheng Zhan
 * 24/5/2020
 */
public class Write
{
     public void write(List<Mission> list , int n) throws IOException 
     {
        FileInputStream fs=new FileInputStream("Mission.xlsx");
        POIFSFileSystem ps=new POIFSFileSystem(fs);
        HSSFWorkbook wb=new HSSFWorkbook(ps);
        HSSFSheet sheet=wb.getSheetAt(0);
        if( n <sheet.getLastRowNum())
        try{HSSFRow row = sheet.getRow(n);
        sheet.removeRow(row);
        FileOutputStream os = new FileOutputStream("Mission.xlsx");  
        wb.write(os);
        os.close();
        }catch (Exception e) {   
            e.printStackTrace();  
        }  
        FileOutputStream out = new FileOutputStream("Mission.xlsx");
        createCell(list.get(n),sheet,n);
        out.flush();
	wb.write(out);  
	out.close(); 
    }
    
  private void createCell(Mission mission, HSSFSheet sheet,int n) {
        HSSFRow dataRow = sheet.createRow(n);
        dataRow.createCell(0).setCellValue(mission.getMissionID());
        dataRow.createCell(1).setCellValue(mission.getMissionName());
        dataRow.createCell(2).setCellValue(mission.getDescription());
        dataRow.createCell(3).setCellValue(mission.getCountryOfOrigin());
        dataRow.createCell(4).setCellValue(mission.getCountriesAllowed());
        dataRow.createCell(5).setCellValue(mission.getCoordinatorName());
        dataRow.createCell(6).setCellValue(mission.getCCI());
        dataRow.createCell(7).setCellValue(mission.getJob());
        dataRow.createCell(8).setCellValue(mission.getCargoRequirements());
        dataRow.createCell(9).setCellValue(mission.getLaunchDate());
        dataRow.createCell(10).setCellValue(mission.getDestinationLocation());
        dataRow.createCell(11).setCellValue(mission.getMissionDuration());
        dataRow.createCell(12).setCellValue(mission.getMissionStatus());
    }
}
     
