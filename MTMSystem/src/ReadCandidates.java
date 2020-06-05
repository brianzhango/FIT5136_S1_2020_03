import java.io.*;
import java.util.*;
import org.apache.poi.*;
import org.apache.poi.ss.usermodel.*;
import user.Candidates;

public class ReadCandidates {
    public List<Candidates> read(String fileName) throws EncryptedDocumentException, IOException {
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

        List<Candidates> list = new ArrayList<>();

        Sheet sheet = workbook.getSheetAt(0);

        int rowNumbers = sheet.getLastRowNum() + 1;
        // System.out.println(rowNumbers);
        Candidates candidate;
        for (int row = 1; row < rowNumbers; row++) {
            Row r = sheet.getRow(row);
            //   System.out.println(r.getPhysicalNumberOfCells());
            if (r.getPhysicalNumberOfCells() >= 14) {
                Cell a = r.getCell(0);
                String candidateId = dataFormatter.formatCellValue(a);
                Cell b = r.getCell(1);
                String name = dataFormatter.formatCellValue(b);
                Cell c = r.getCell(2);
                String dateOfBirth = dataFormatter.formatCellValue(c);
                Cell d = r.getCell(3);
                String address = dataFormatter.formatCellValue(d);
                Cell e = r.getCell(4);
                String identificationNum = dataFormatter.formatCellValue(e);
                Cell f = r.getCell(5);
                String gender = dataFormatter.formatCellValue(f);
                Cell g = r.getCell(6);
                String allergies = dataFormatter.formatCellValue(g);
                Cell h = r.getCell(7);
                String foodPreference = dataFormatter.formatCellValue(h);
                Cell i = r.getCell(8);
                String qualifications = dataFormatter.formatCellValue(i);
                Cell j = r.getCell(9);
                String workExperience = dataFormatter.formatCellValue(j);
                Cell k = r.getCell(10);
                String occupations = dataFormatter.formatCellValue(k);
                Cell l = r.getCell(11);
                String computerSkills = dataFormatter.formatCellValue(l);
                Cell m = r.getCell(12);
                String languagesSpoken = dataFormatter.formatCellValue(m);
                Cell n = r.getCell(13);
                String healthRecord = dataFormatter.formatCellValue(n);
                candidate = new Candidates(candidateId, name, dateOfBirth, address, identificationNum, gender, allergies, foodPreference, qualifications, workExperience, occupations, computerSkills, languagesSpoken, healthRecord);
                list.add(candidate);
            }
        }
        return list;
    }
}

