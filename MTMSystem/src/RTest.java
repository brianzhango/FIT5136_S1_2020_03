import java.io.IOException;
import java.util.ArrayList;
import user.Candidates;
import java.io.*;
import java.util.*;
import org.apache.poi.*;
import org.apache.poi.ss.usermodel.*;

public class RTest {
    public static void main(String[] args) throws IOException {
        ReadCandidates efile = new ReadCandidates();
        List<Candidates> list = new ArrayList<>();
        list = efile.read("/Users/brianzhang/MTMSystem/src/Candidate.xlsx");
        System.out.println("1");
    }
}