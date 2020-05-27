import java.util.Scanner;
import java.util.ArrayList;

public class Administrator {
    private int administratorId;
    private String administratorName;
    private ArrayList<Criteria> list;

    public void Administrator()
    {
        administratorId = 0;
        administratorName = "Justin";
    }

    public void Administrator(int id, String name)
    {
        administratorId = id;
        administratorName = name;
    }

    public int getAdminstratorId()
    {
        return administratorId;
    }

    public String getAdministratorName()
    {
        return administratorName;
    }

    public void setAdminstratorId(int id)
    {
        administratorId = id;
    }

    public void setAdministratorName(String name)
    {
        administratorName = name;
    }

    public void languagemenu()
    {
        System.out.println("Welcome to Mission to Mars system!");
        System.out.println("This is mission 4404");
        //System.out.println("Mission Description：");
        System.out.println("Please start creating selection criteria");
        System.out.println("Please select the Languages Requirement for all");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Italian");
        System.out.println("4. Spanish");
        System.out.println("Others");
    }

    public void language()
    {
    String attributeName = "language";
    String attributeDetail = "";
    int priority = 0;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        for(;!exit;)
        {
            languagemenu();
            String s = scanner.nextLine();
            switch (s)
            {
                case "1":
                    exit = true;
                    attributeDetail = "English";
                    System.out.println("English has been selected");
                    break;

                case "2":
                    exit = true;
                    attributeDetail = "French";
                    System.out.println("French has been selected");
                    break;

                case "3":
                    exit = true;
                    attributeDetail = "Spanish";
                    System.out.println("Spanish has been selected");
                    break;

                default:
                    System.out.println("Please select from the menu");
                    System.out.println(" ");
                    break;
            }
        }
        Criteria c = new Criteria(attributeName, attributeDetail, priority);
        list.add(c);
    }

    public void jobmenu()
    {
        System.out.println("Please select the job you want to creat selection criterial:");
        System.out.println("Please select the job you want to creat selection criterial:");
        System.out.println("1. Engineer");
        System.out.println("2. Teacher");
    }

    public void job()
    {
        String attributeName = "job";
        String attributeDetail = "";
        int priority = 0;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        for(;!exit;)
        {
            jobmenu();
            String s = scanner.nextLine();
            switch (s)
            {
                case "1":
                    exit = true;
                    attributeDetail = "Engineer";
                    System.out.println("Engineer has been selected");
                    break;

                case "2":
                    exit = true;
                    attributeDetail = "Teacher";
                    System.out.println("Teacher has been selected");
                    break;

                default:
                    System.out.println("Please select from the menu");
                    System.out.println(" ");
                    break;
            }
        }
        Criteria c = new Criteria(attributeName, attributeDetail, priority);
        list.add(c);
    }


    public void menu()
    {
        System.out.println("Please select the job you want to creat selection criterial:");
        System.out.println("1. A range of age (18 - 55)");
        //System.out.println("Mission Description：");
        System.out.println("2. Qualifications");
        System.out.println("3. Years of work experience");
        System.out.println("4. Computer skills");
        System.out.println("5. Languages spoken");
        System.out.println("0. Finish selecttion");
    }

    public void age()
    {
        String attributeName = "age";
        String attributeDetail = "";
        int priority = 0;
        System.out.println("Range of age has been selected.");
        System.out.println("Please input the range you want:(The range should be older than 18 and younger than 55");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("A range of age"+ s + "has been selected");
        attributeDetail = s;
        Criteria c = new Criteria(attributeName, attributeDetail, priority);
        list.add(c);
    }

    public void Qualificationsmenu()
    {
        System.out.println("Range of age has been selected.");
        System.out.println("Please input the range you want:(The range should be older than 18 and younger than 55");
        System.out.println("1. BDS");
        System.out.println("2. MBBS");
        System.out.println("3. MS");
        System.out.println("4. ME");
        System.out.println("5. BE");
    }

    public void Qualification()
    {
        String attributeName = "Qualification";
        String attributeDetail = "";
        int priority = 0;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        for(;!exit;)
        {
            Qualificationsmenu();
            String s = scanner.nextLine();
            switch (s)
            {
                case "1":
                    exit = true;
                    attributeDetail = "BDS";
                    System.out.println("BDS has been selected");
                    break;

                case "2":
                    exit = true;
                    attributeDetail = "MBBS";
                    System.out.println("MBBS has been selected");
                    break;

                case "3":
                    exit = true;
                    attributeDetail = "MS";
                    System.out.println("MS has been selected");
                    break;

                case "4":
                    exit = true;
                    attributeDetail = "ME";
                    System.out.println("ME has been selected");
                    break;

                case "5":
                    exit = true;
                    attributeDetail = "BE";
                    System.out.println("BE has been selected");
                    break;

                default:
                    System.out.println("Please select from the menu");
                    System.out.println(" ");
                    break;
            }
        }
        Criteria c = new Criteria(attributeName, attributeDetail, priority);
        list.add(c);
    }
}
