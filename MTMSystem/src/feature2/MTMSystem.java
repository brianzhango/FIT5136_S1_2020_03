package feature2;

import java.util.ArrayList;

public class MTMSystem {
    private ArrayList<String> listOfMission;
    static ArrayList<String> listOfSpaceShuttle;
    private ArrayList<String> listOfUser;
    private String missionRecord;
    static String[] sStatus = new String[]{"","","","","","","","","","","",""};

    public MTMSystem() {
    }

    public ArrayList<String> getListOfMission() {
        return listOfMission;
    }

    public void setListOfMission(ArrayList<String> listOfMission) {
        this.listOfMission = listOfMission;
    }

    public ArrayList<String> getListOfSpaceShuttle() {
        return listOfSpaceShuttle;
    }

    public void setListOfSpaceShuttle(ArrayList<String> listOfSpaceShuttle) {
        MTMSystem.listOfSpaceShuttle = listOfSpaceShuttle;
    }

    public ArrayList<String> getListOfUser() {
        return listOfUser;
    }

    public void setListOfUser(ArrayList<String> listOfUser) {
        this.listOfUser = listOfUser;
    }

    public String getMissionRecord() {
        return missionRecord;
    }

    public void setMissionRecord(String missionRecord) {
        this.missionRecord = missionRecord;
    }
}
