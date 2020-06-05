package feature3;

import java.util.Scanner;
import java.util.ArrayList;

public class Administrator {
    private int administratorId;
    private String administratorName;
    private ArrayList<Job> jobs;

    public void Administrator()
    {
        administratorId = 0;
        administratorName = "Justin";
        jobs = new ArrayList<Job>();
    }

    public void Administrator(int id, String name)
    {
        administratorId = id;
        administratorName = name;
        jobs = new ArrayList<Job>();
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

    public void star() {
        jobs = new ArrayList<Job>();
        String languageAll = language();
        //Need to be fix in the future
        Job job1 = new Job("Teacher");
        jobs.add(job1);
        Job job2 = new Job("Doctor");
        jobs.add(job2);
        int i = 0;
        while (i < jobs.size()) {
            jobs.get(i).addCriteria("language",languageAll, 0);
            jobs.get(i).addCriteria("health record","none", 0);
            i++;
        }
        int a = 0;
        while (a == 0) {
            a++;
            int userInput = jobSelection();
            addCriteria(userInput - 1);
            Scanner scanner = new Scanner(System.in);
            System.out.println("pressure 1 if you want to edit an other job, input any other number will exit.");
            int s = scanner.nextInt();
            if (s == 1){
                a = 0;
            }
        }
        System.out.println("Add criteria has been down.");
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
                        if (jobCriteria.get(a).getAttributeName() == "age")
                        {
                            jobSelected.removeCriteria(a);
                            break;
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
        System.out.println("This is mission 4404");
        //System.out.println("Mission Description：");
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
        String selectedAge = "";
        String selectedExp = "";
        int priorityAge = 0;
        int priorityExp = 0;
        int a = 0;
        ArrayList<Criteria> jobCriteria =jobSelected.getList();
        while (a < jobCriteria.size())
        {
            if (jobCriteria.get(a).getAttributeName() == "age")
            {
                selectedAge = jobCriteria.get(a).getAttributeDetail();
                priorityAge = jobCriteria.get(a).getPriority();

            }

            if (jobCriteria.get(a).getAttributeName() == "work experience")
            {
                selectedExp = jobCriteria.get(a).getAttributeDetail();
                priorityExp = jobCriteria.get(a).getPriority();
            }
            a++;
        }
        System.out.println("Please add criteria for the job: " + jobSelected.getJobName() + "You can remove the criteria by input d1 or d2");
        System.out.println("1. A range of age (18 - 55) :" + selectedAge +" Priority: " + priorityAge);
        System.out.println("2. Years of work experience :" + selectedExp +" Priority: " + priorityExp) ;
        System.out.println("0. Return");
    }


}
