package feature3;


import java.io.*;
import java.util.*;
import org.apache.poi.*;
import org.apache.poi.ss.usermodel.*;
import java.io.IOException;
import user.Candidates;

public class Administrator {
    private int administratorId;
    private String administratorName;
    private ArrayList<Job> jobs;
    private ArrayList<String[]> jobnames;

    public Administrator()
    {
        administratorId = 0;
        administratorName = "Justin";
        jobs = new ArrayList<Job>();
    }

    public Administrator(int id, String name, ArrayList<String[]> namelist)
    {
        administratorId = id;
        administratorName = name;
        jobs = new ArrayList<Job>();
        jobnames = new ArrayList<String[]>();
        jobnames = namelist;
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

    public void star() throws IOException{
        jobs = new ArrayList<Job>();
        String languageAll = language();
        int jobNumbers = 0;
        for (;jobNumbers < jobnames.get(0).length;jobNumbers++){
            if (jobnames.get(0)[jobNumbers]!= null ) {
                Job newJob = new Job(jobnames.get(0)[jobNumbers]);
                jobs.add(newJob);
                jobs.get(jobNumbers).addCriteria("NumberRequired", jobnames.get(1)[jobNumbers], 0);
                jobs.get(jobNumbers).addCriteria("language", languageAll, 0);
                jobs.get(jobNumbers).addCriteria("health record", "none", 0);
            }
        }
        int a = 0;
        while (a == 0) {
            a++;
            int userInput = jobSelection();
            addCriteria(userInput - 1);
            Scanner scanner = new Scanner(System.in);
            System.out.println("input 1 to edit another job, input any other number will exit.");
            int s = scanner.nextInt();
            if (s == 1){
                a = 0;
            }
        }
        System.out.println("Add criteria has been down.");
        searchPrinter();
    }

    public void addCriteria(int jobNumber)
    {
        Job jobSelected = jobs.get(jobNumber);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        for (; !exit; )
        {
            menu(jobNumber);
            ArrayList<Criteria> jobCriteria =jobSelected.getList();
            String s = scanner.nextLine();
            switch (s)
            {
                case "1":
                    jobSelected.age();
                    break;

                case "2":
                    jobSelected.workexperience();
                    break;
                case "d1":
                    int a = 0;
                    while (a < jobCriteria.size())
                    {
                        if (jobCriteria.get(a).getAttributeName() == "minimumAge")
                        {
                            jobSelected.removeCriteria(a);
                        }
                        if (jobCriteria.get(a).getAttributeName() == "maxAge")
                        {
                            jobSelected.removeCriteria(a);
                        }
                        a++;
                    }
                    break;
                case "d2":
                    int b = 0;
                    while (b < jobCriteria.size())
                    {
                        if (jobCriteria.get(b).getAttributeName() == "work experience")
                        {
                            jobSelected.removeCriteria(b);
                            break;
                        }
                        b++;
                    }
                    break;
                case "0":
                    exit = true;
                    break;

                default:
                    System.out.println("Please select from the menu");
                    System.out.println(" ");
                    break;
            }
        }

    }


    public int jobSelection()
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int userInput = 0;
        for (; !exit; )
        {
            System.out.println("Please select the job you want to add criterias for:");
            int i = 0;
            while (i < jobs.size()) {
                String jobName = jobs.get(i).getJobName();
                System.out.println(i + 1 + ". " + jobName);
                i++;
            }
            userInput = scanner.nextInt();
            if (userInput>0 | userInput <= jobs.size() )
            {
                exit = true;
            }
            else
            {System.out.println("Please select from the above table");}
        }
        return userInput;
    }

    public void languagemenu()
    {
        System.out.println("Welcome to Mission to Mars system!");
        System.out.println("This is mission " + administratorId);
        System.out.println("Mission Description：" + administratorName );
        System.out.println("Please start creating selection criteria");
        System.out.println("Please select the Languages Requirement for all");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Italian");
        System.out.println("4. Spanish");
    }

    public String language()
    {
        String languageForAll = "";
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
                    languageForAll = "English";
                    System.out.println("English has been selected");
                    break;

                case "2":
                    exit = true;
                    languageForAll = "French";
                    System.out.println("French has been selected");
                    break;

                case "3":
                    exit = true;
                    languageForAll = "Italian";
                    System.out.println("Italian has been selected");
                    break;

                case "4":
                    exit = true;
                    languageForAll = "Spanish";
                    System.out.println("Spanish has been selected");
                    break;

                default:
                    System.out.println("Please select from the menu");
                    System.out.println(" ");
                    break;
            }
        }
        return languageForAll;
    }

    public void menu(int jobNumber)
    {
        Job jobSelected = jobs.get(jobNumber);
        String selectedMin = "";
        String selectedMax = "";
        String selectedExp = "";
        int priorityAge = 0;
        int priorityExp = 0;
        int a = 0;
        ArrayList<Criteria> jobCriteria =jobSelected.getList();
        while (a < jobCriteria.size())
        {
            if (jobCriteria.get(a).getAttributeName() == "minimumAge")
            {
                selectedMin = jobCriteria.get(a).getAttributeDetail();
                priorityAge = jobCriteria.get(a).getPriority();

            }

            if (jobCriteria.get(a).getAttributeName() == "maxAge")
            {
                selectedMax = jobCriteria.get(a).getAttributeDetail();

            }

            if (jobCriteria.get(a).getAttributeName() == "work experience")
            {
                selectedExp = jobCriteria.get(a).getAttributeDetail();
                priorityExp = jobCriteria.get(a).getPriority();
            }
            a++;
        }
        System.out.println("Please add criteria for the job: " + jobSelected.getJobName() + "You can remove the criteria by input d1 or d2");
        System.out.println("1. A range of age (28 - 45) : " + selectedMin +"-"+ selectedMax+" Priority: " + priorityAge);
        System.out.println("2. Years of work experience : " + selectedExp +" Priority: " + priorityExp) ;
        System.out.println("0. Return");
    }



    public ArrayList<Candidates> searchFunction() throws IOException {
        ReadCandidates r = new ReadCandidates();
        List<Candidates> list = new ArrayList<>();
        list = r.read("/Users/brianzhang/MTMSystem/src/Candidate.xlsx");

        ArrayList<Candidates> candidatesList = new ArrayList<Candidates>();
        int jobNumber = jobs.size();
        int candidatesNumber = 0;

        while (candidatesNumber < jobNumber) {
            Job jobSelected = jobs.get(candidatesNumber);
            ArrayList<Criteria> jobCriteria = jobSelected.getList();
            int a = 0;
            String selectedMin ="";
            String selectedMax ="";
            String selectedExp ="";
            String selectedLanguage = "";
            String selectedNumber = "";
            while (a < jobCriteria.size()) {
                if (jobCriteria.get(a).getAttributeName() == "minimumAge") {
                    selectedMin = jobCriteria.get(a).getAttributeDetail();

                }

                if (jobCriteria.get(a).getAttributeName() == "maxAge") {
                    selectedMax = jobCriteria.get(a).getAttributeDetail();
                }

                if (jobCriteria.get(a).getAttributeName() == "work experience") {
                    selectedExp = jobCriteria.get(a).getAttributeDetail();
                }
                if (jobCriteria.get(a).getAttributeName() == "language") {
                    selectedLanguage = jobCriteria.get(a).getAttributeDetail();
                }
                if (jobCriteria.get(a).getAttributeName() == "NumberRequired") {
                    selectedNumber = jobCriteria.get(a).getAttributeDetail();
                }
                a++;
            }
            int i = 0;
            int c = 0;
            while (i < Integer.parseInt(selectedNumber)) {

                while (c < list.size()) {
                    if (list.get(c).getAge() <= Integer.parseInt(selectedMax) &&
                            list.get(c).getAge() >= Integer.parseInt(selectedMin) &&
                            Integer.parseInt(list.get(c).getWorkExperience()) >= Integer.parseInt(selectedExp) &&
                            list.get(c).getLanguagesSpoken().equals(selectedLanguage) &&
                            list.get(c).getHealthRecord().equals("none") &&
                            jobSelected.getJobName().equals(list.get(c).getOccupations())
                    ) {
                        candidatesList.add(list.get(c));
                        c++;
                        i++;
                        break;
                    }
                    c++;
                }
//                while (c == list.size()-1 && i < Integer.parseInt(selectedNumber)){
//                    i = Integer.parseInt(selectedNumber);
//                    System.out.println("Cannot find enough Candidtes for job: " +jobSelected.getJobName());
//                }

            }
            candidatesNumber++;
        }
        return candidatesList;
    }

    public void searchPrinter() throws IOException
    {
        ArrayList<Candidates> candidatesList = searchFunction();
        int i = 0;
        System.out.println("Candidates has been selected:");
        while (i < candidatesList.size()) {
            System.out.println("Candidate ID: " + candidatesList.get(i).getCandidateId()
                    + "  Candidate Name: " + candidatesList.get(i).getName()
                    +"  Date of birth: "+ candidatesList.get(i).getDateOfBirth()
                    +"  Gender "+ candidatesList.get(i).getGender()
                    +"  Work experience: "+ candidatesList.get(i).getWorkExperience()
                    +"  Occupations: "+ candidatesList.get(i).getOccupations()
                    +"  Languages Spoken: "+ candidatesList.get(i).getLanguagesSpoken()
                    +"  Health Record: "+ candidatesList.get(i).getHealthRecord());
            i++;
        }
    }

}
