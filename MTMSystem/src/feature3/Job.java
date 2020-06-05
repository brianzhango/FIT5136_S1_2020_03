package feature3;

import java.util.ArrayList;
import java.util.Scanner;

public class Job {
    private String jobName;
    private ArrayList<Criteria> criterias;


    public Job(String name)
    {
        jobName = name;
        criterias = new ArrayList<Criteria>();
    }

    public Job(String name, ArrayList<Criteria> list)
    {
        jobName = name;
        criterias = list;
    }

    public String getJobName()
    {
        return jobName;
    }

    public ArrayList getList()
    {
        return criterias;
    }

    public void setMessageId(String name)
    {
        jobName = name;
    }

    public void addCriteria(String name, String detail, int pri)
    {
        Criteria newCriteria = new Criteria(name, detail, pri);
        criterias.add(newCriteria);
    }

    public void age()
    {
        String attributeName = "age";
        String attributeDetail = "";
        duplication(attributeName);
        int priority = maxPriority() + 1;
        System.out.println("Range of age has been selected.");
        System.out.println("Please input the range you want:(The range should be older than 18 and younger than 55");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("A range of age"+ s + "has been selected");
        attributeDetail = s;
        Criteria c = new Criteria(attributeName, attributeDetail, priority);
        criterias.add(c);
    }

    public void workexperience()
    {
        String attributeName = "work experience";
        String attributeDetail = "";
        duplication(attributeName);
        int priority = maxPriority() + 1;
        System.out.println("Years of work experience has been selected..");
        System.out.println("Please input the years of work experience:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Years of work experience: "+ s + "has been selected");
        attributeDetail = s;
        Criteria c = new Criteria(attributeName, attributeDetail, priority);
        criterias.add(c);
    }

    public void removeCriteria(int a)
    {
        criterias.remove(a);

    }

    public int maxPriority()
    {
        int a = 0;
        int Max = 0;
        while (a < criterias.size())
        {
            if (Max < criterias.get(a).getPriority())
            {
                Max = criterias.get(a).getPriority();
            }
            a++;
        }
        return Max;
    }

    public void duplication(String criterianame)
    {
        int a = 0;
        while (a < criterias.size())
        {
            if (criterias.get(a).getAttributeName() == criterianame)
            {
                criterias.remove(a);
            }
            a++;
        }
    }
}
