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
        String attributeName1 = "minimumAge";
        String attributeName2 = "maxAge";
        String attributeDetail1 = "";
        String attributeDetail2 = "";
        duplication(attributeName1);
        duplication(attributeName2);
        int priority = maxPriority() + 1;
        System.out.println("Range of age has been selected.");
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        while (i == 0){
            System.out.println("Please input the minimum age: (Must be older than 18:)");
            min = scanner.nextInt();
            if (min < 19){
                System.out.println("The minimum age must be older than 18");
            }
            if (min > 64){
                System.out.println("The max age must be younger than 65");
            }
            if(min >= 19){
                System.out.println("Minimum age "+ min + "has been selected");
                attributeDetail1 = min + "";
                Criteria c = new Criteria(attributeName1, attributeDetail1, priority);
                criterias.add(c);
                i++;
            }
        }
        int b = 0;
        while (b == 0){
            System.out.println("Please input the max age: (Must be younger than 65:)");
            max = scanner.nextInt();
            if (max > 64){
                System.out.println("The max age must be younger than 65");
            }
            if (max < 19){
                System.out.println("The minimum age must be older than 18");
            }
            if (max < min){
                System.out.println("The maximum number cannot be smaller than minimum number ");
            }
            if( min <= max && max <= 64){
                System.out.println("Max age "+ max + "has been selected");
                attributeDetail2 = max + "";
                Criteria d = new Criteria(attributeName2, attributeDetail2, priority);
                criterias.add(d);
                b++;
            }
        }

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
