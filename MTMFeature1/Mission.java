import java.util.*;
/**
 * Mission
 * 
 * Dongheng Zhan
 * 18/5/2020
 */
public class Mission
{
    int missionID;
    String missionName;
    String countryOfOrigin;
    String countriesAllowed;
    String coordinatorName;
    String CCI;
    String launchDate;
    String destinationLocation;
    int missionDuration;
    String missionStatus;

    public Mission()
    {
       missionID = 0;
       missionName = "";
       countryOfOrigin = "";
       countriesAllowed = "";
       coordinatorName = "";
       CCI = "";
       launchDate = "0000-00-00";
       destinationLocation = "";
       missionDuration = 0;
       missionStatus = "";
    }

    public Mission(int missionID, String missionName, String countryOfOrigin, String countriesAllowed, String coordinatorName, String CCI, String launchDate, String destinationLocation, int missionDuration, String missionStatus) {
        this.missionID = missionID;
        this.missionName = missionName;
        this.countryOfOrigin = countryOfOrigin;
        this.countriesAllowed = countriesAllowed;
        this.coordinatorName = coordinatorName;
        this.CCI = CCI;
        this.launchDate = launchDate;
        this.destinationLocation = destinationLocation;
        this.missionDuration = missionDuration;
        this.missionStatus = missionStatus;
    }

    public void StartMission(String name, int id)
    {
       System.out.print('\u000C');
       String select;
       Display display = new Display();
       display.displayMenu("Welcome to Mission to Mars System !（please input number!）");
       select = display.acceptStringInput("  What do you want to do?\n" + 
                                           "  1.Create a mission\n" + 
                                           "  2.Select a mission\n" +
                                           "  0.Exit");
       Judge(select);
       if(select.equals("1"))
       {
           
       }
       if(select.equals("2"))
       {
           
       }
    }
    
    public String Judge(String select)
    {
        int flag = 0;
        Display display = new Display();
        while(flag == 0){
        if(select.equals("1"))
        {
            System.out.println("Start creating mission !  Your  mission ID is xxxx");
            flag = 1;
        }
        else if(select.equals("2"))
        {     
            System.out.println("");
            flag = 1;
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
        return select;
    }
    
    public void creatMission()
    {
      Display display = new Display();
      
      
    }
    public void setMissionID(int missionID) {
        this.missionID = missionID;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
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

    public void setMissionStatus(String missionStatus) {
        this.missionStatus = missionStatus;
    }

    public int getMissionID() {
        return missionID;
    }

    public String getMissionName() {
        return missionName;
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
}

