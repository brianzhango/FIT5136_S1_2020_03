import org.apache.poi.*;
import org.apache.poi.ss.usermodel.*;
import java.io.*;
import java.util.*;
/**
 * Mission
 * 
 * Dongheng Zhan
 * 18/5/2020
 */
public class Mission
{
    private int missionID;
    private String description;
    private String missionName;
    private String countryOfOrigin;
    private String countriesAllowed;
    private String coordinatorName;
    private String CCI;
    private String job;
    private String cargoRequirements;
    private String launchDate;
    private String destinationLocation;
    private int missionDuration;
    private String missionStatus;

    public Mission()
    {
       missionID = 0;
       description = "";
       missionName = "";
       countryOfOrigin = "";
       countriesAllowed = "";
       coordinatorName = "";
       CCI = "";
       launchDate = "0000-00-00";
       destinationLocation = "";
       missionDuration = 0;
       missionStatus = "";
       job = ""; 
      cargoRequirements = "";
    }


    public Mission(int missionID,String missionName,String description,String countryOfOrigin, String countriesAllowed, String coordinatorName, String CCI, String job, String cargoRequirements, String launchDate, String destinationLocation, int missionDuration, String missionStatus) {
        this.missionID = missionID;
        this.description = description;
        this.missionName = missionName;
        this.countryOfOrigin = countryOfOrigin;
        this.countriesAllowed = countriesAllowed;
        this.coordinatorName = coordinatorName;
        this.CCI = CCI;
        this.job = job;
        this.cargoRequirements = cargoRequirements;
        this.launchDate = launchDate;
        this.destinationLocation = destinationLocation;
        this.missionDuration = missionDuration;
        this.missionStatus = missionStatus;
    }

    public void StartMission(String name, int id)
    {
       System.out.print('\u000C');
       String select;
       int i;
       Display display = new Display();
       Read read = new Read();
       String missionName;
       List<Mission> list = new ArrayList<Mission> ();
       list = read.read();
       display.displayMenu("Welcome to Mission to Mars System !");
       select = display.acceptStringInput("  What do you want to do?（please input number!）\n" + 
                                           "  1.Create a mission\n" + 
                                           "  2.Select a mission\n" +
                                           "  0.Exit");
       i = Judge(select,display);
       if (i == 1){
           missionName = inputName(list,display);
           inputDescription(missionName,display);
           inputCountryOfOrigin(display);
           inputCountriesAllowed(display);
           inputCoordinatorName(display);
           inputCountriesAllowed(display);
        }
    }
    
    public int Judge(String select,Display display)
    {
        int flag = 0;
        while(flag == 0){
        if(select.equals("1"))
        {
           flag = 1;
        }
        else if(select.equals("2"))
        {     
           flag = 2;
        }      
        else if(select.equals("0"))
        {     
           System.exit(0);
        }      
        else
        {
           select = display.acceptStringInput("Please input a correct number!");
        }
        }
        return flag;
    }
    
    public void judgeQuit(String n)
    {
        if(n.equals("0")){
              System.exit(0);
         }
    }
    
    public String inputName(List<Mission> list,Display display){
         String name;
         int n = list.get(list.size()-1).getMissionID();
         setMissionID(n+3);
         display.displayMenu("Start creating mission !  Your  mission ID is "+ getMissionID()+
           "\n Any time you want to qiut just press 0");
         name = display.acceptStringInput("1.Please input Mission name.");
         judgeQuit(name);
         setMissionName(name);
         return name;
    }
   
    public void inputDescription(String name,Display display){
        String description;
        description = display.acceptStringInput("2.Please give " + name + " a description.");
        judgeQuit(description);
        setDescription(description);
    }
    
    public void inputCountryOfOrigin(Display display)
    {
        String countryOfOrigin;
        countryOfOrigin = display.acceptStringInput("3.Please input origin country.");
        judgeQuit(countryOfOrigin);
        setCountryOfOrigin(countryOfOrigin); 
    }
    
    public void inputCountriesAllowed(Display display)
    {
        String countriesAllowed;
        countriesAllowed = display.acceptStringInput("4.Please input countries allowed.");
        judgeQuit(countriesAllowed);
        setCountriesAllowed(countriesAllowed); 
    }
    
     public void inputCoordinatorName(Display display)
    {
        String coordinatorName;
        coordinatorName = display.acceptStringInput("5.Please input coordinator name.");
        judgeQuit(coordinatorName);
        setCoordinatorName(coordinatorName); 
    }
    
     public void inputCCI (Display display)
    {
        String CCI;
        CCI = display.acceptStringInput("6.Please input coordinator contect information.");
        judgeQuit(CCI);
        setCCI(CCI); 
    }
    
    public void inputJob ()
    {
        Display display = new Display();
        String jobs = "";
        Job job = new Job();
        List<Job> joblist= new ArrayList();
        String flag1 = "y";
        String flag2 = "y";
        int flag3 =1;
        String job1;
        String description;
        String title;
        String number1;
        int number = 0;
        String employee = "";
        while (flag1.equals("y"))
        {
            job1 = display.acceptStringInput("6.1 Please input job.");
            judgeQuit(job1);
            description = display.acceptStringInput("6.2 Please input "+ job1+ " description.");
            judgeQuit(description);
            flag2 = "y";
            while (flag2.equals("y"))
            {
               title = display.acceptStringInput("6.3 Please input employ titles.");
               judgeQuit(title);
               flag3 = 1;
               while(flag3 == 1){
               try
               {
                  number1 = display.acceptStringInput("6.4 Please input the number of employees required for each job ");
                  number = Integer.parseInt(number1);
                  judgeQuit(number1);
                  flag3 = 0;
               }catch(NumberFormatException e)
               {
                System.out.println("please input a correcet number!");
               }
               }
               job.setEMP(title,number);
               flag2 = display.acceptStringInput("Do you want to input more employ title (y/n)?");
               judgeQuit(flag2);
               while (flag2.equals("y") == false && flag2.equals("n") == false)
               {
                flag2 = display.acceptStringInput("Please input y or n！\n" +
                "Do you want to input more employ title (y/n)?");
               }
            }
            job = new Job(job1,description,job.getEmp());
            joblist.add(job);
            flag1 = display.acceptStringInput("Do you want to input more employ title (y/n)?");
            judgeQuit(flag1);
            while (flag1.equals("y") == false && flag1.equals("n") == false)
            {
              flag1 = display.acceptStringInput("Please input y or n！\n" +
              "Do you want to input more employ title (y/n)?");
            }
        }
        for(Job j : joblist)
        {
            for(int e = 0; e<j.getEmp().size() ; e++)
            {
                employee += "employ title"+j.getEmp().get(e).getTitle() + " number required: " + String.valueOf(j.getEmp().get(e).getNumberForEachJob() ) + "\n";
            }
            jobs += "Job"+j.getJobName() + ":" + j.getJobDescription() + "\n" + employee + "\n";
        }
        setJob(jobs);
    }
    
    public void setMissionID(int missionID) {
        this.missionID = missionID;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setCountriesAllowed(String countriesAllowed) {
        this.countriesAllowed = countriesAllowed;
    }

    public void setCoordinatorName(String coordinatorName) {
        this.coordinatorName = coordinatorName;
    }

    public void setCCI (String CCI) {
        this.CCI = CCI;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public void setMissionDuration(int missionDuration) {
        this.missionDuration = missionDuration;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCargoRequirements(String cargoRequirements) {
        this.cargoRequirements = cargoRequirements;
    }

    public void setMissionStatus(String missionStatus) {
        this.missionStatus = missionStatus;
    }


    public int getMissionID() {
        return missionID;
    }

    public String getMissionName() {
        return missionName;
    }

    public String getDescription() {
        return description;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getCountriesAllowed() {
        return countriesAllowed;
    }

    public String getCoordinatorName() {
        return coordinatorName;
    }

    public String getCCI() {
        return CCI;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public int getMissionDuration() {
        return missionDuration;
    }

    public String getMissionStatus() {
        return missionStatus;
    }

    public String getJob() {
        return job;
    }

    public String getCargoRequirements() {
        return cargoRequirements;
    }
}

