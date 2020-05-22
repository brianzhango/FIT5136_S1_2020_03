import java.io.*;
import java.util.*;
import org.apache.poi.*;
import org.apache.poi.ss.usermodel.*;
import user.User;


public class ReadUserExcel {
    public List<User> read(String fileName) throws EncryptedDocumentException, IOException {
        if (fileName == null)
            return null;
        File xlsxFile = new File(fileName);
        if (!xlsxFile.exists())
            return null;

        Workbook workbook = WorkbookFactory.create(xlsxFile);
        DataFormatter dataFormatter = new DataFormatter();

        int numberOfSheets = workbook.getNumberOfSheets();
       // System.out.println(numberOfSheets);
        if (numberOfSheets <= 0)
            return null;

        List<User> list = new ArrayList<>();

        Sheet sheet = workbook.getSheetAt(0);

        int rowNumbers = sheet.getLastRowNum() + 1;
        // System.out.println(rowNumbers);
        User user;
        for (int row = 1; row < rowNumbers; row++) {
            Row r = sheet.getRow(row);
        //   System.out.println(r.getPhysicalNumberOfCells());
            if (r.getPhysicalNumberOfCells() >= 2) {
                Cell x = r.getCell(0);
                String username = dataFormatter.formatCellValue(x);
                Cell y = r.getCell(1);
                String password = dataFormatter.formatCellValue(y);
                user = new User(username, password);
                list.add(user);
            }
        }
        return list;
    }

}
