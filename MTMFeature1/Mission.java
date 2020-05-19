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

    public void Mission()
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

