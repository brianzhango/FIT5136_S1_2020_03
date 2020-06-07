package feature;

import feature2.SpaceShuttle;
import feature3.Administrator;
import org.apache.poi.*;

import java.io.*;
import java.util.*;
import java.text.*;

import login.Menu;
/**
 * feature.Mission
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

    public void startMission() throws EncryptedDocumentException, IOException
    {
        System.out.print('\u000C');
        String select;
        int i= 0;
        int changeNumber = 0;
        Display display = new Display();
        Read read = new Read();
        List<Mission> list = new ArrayList<Mission> ();
        List<Job> joblist= new ArrayList();
        list = read.read();
        int length = list.size();
        display.displayMenu("Welcome to Mission to Mars System !");
        select = display.acceptStringInput("  What do you want to do?（please input number!）\n" +
                "  1.Create a mission\n" +
                "  2.Select a mission\n" +
                "  0.Log out");
        i = Judge(select,display);
        if (i == 1){
            handleCreat(list,display,length,joblist,changeNumber);
        }

        if (i ==2){
            Write write = new Write();
            int n = 1;
            int selection = 0;
            int[] k = new int[2];
            n = handleSelect(list, display, n, joblist, changeNumber);
            boolean exit = false;
            for(;!exit;)
            {
                k = Userselect(list, display, n, joblist, changeNumber);
                selection = k[1];
                n = k[0];
                switch (selection) {
                    case 1:
                        n -= 1;
                        handleChange(list, display, n, joblist, changeNumber);
                        n +=1;
                        break;

                    case 2:
                        SpaceShuttle shuttle = new SpaceShuttle();
                        shuttle.selectShuttle();
                        break;

                    case 3:
                        n -= 1;
                        setMission(list, n);
                        Administrator ad = new Administrator(list.get(n).getMissionID(), list.get(n).getDescription(), getJobNameList(n));
                        ad.star();
                        n +=1;
                        break;
                }
            }
        }

    }


    public void handleCreat(List<Mission> list,Display display, int length,List<Job> joblist,int changeNumber) throws EncryptedDocumentException, IOException
    {
        inputID(list,display);
        inputName(display,list,length,1,joblist,changeNumber);
        inputDescription(missionName,display,list,length,1,joblist,changeNumber);
        inputCountryOfOrigin(display,list,length,1,joblist,changeNumber);
        inputCountriesAllowed(display,list,length,1,joblist,changeNumber);
        inputCoordinatorName(display,list,length,1,joblist,changeNumber);
        inputCCI(display,list,length,1,joblist,changeNumber);
        inputJob (list,joblist,length,1,changeNumber);
        inputCargoRequirements(display,list,length,1,joblist,changeNumber);
        inputLaunchDate(display,list,length,1,joblist,changeNumber);
        inputDestinationLocation(display,list,length,1,joblist,changeNumber);
        inputMissionDuration(display,list,length,1,joblist,changeNumber);
        setMissionStatus("planning phase");
        display.displayMenu("12. Status of the mission \n " +
                missionStatus + "\n" +
                "Mission "+ missionName + "is create, please check it");
        Mission mission;
        mission = new Mission(missionID,missionName,description,countryOfOrigin,countriesAllowed,coordinatorName,CCI, job,cargoRequirements,launchDate,destinationLocation, missionDuration,missionStatus);
        list.add(mission);
        changeNumber = check(display, list ,length,1,joblist,changeNumber);
        change(display, changeNumber,list, joblist,length,1,changeNumber);
    }

    public void handleChange(List<Mission> list,Display display,int n,List<Job> joblist,int changeNumber) throws EncryptedDocumentException, IOException
    {
        setMissionID(list.get(n).getMissionID());
        setMissionName(list.get(n).getMissionName());
        setDescription(list.get(n).getDescription());
        setCountryOfOrigin(list.get(n).getCountryOfOrigin());
        setCountriesAllowed(list.get(n).getCountriesAllowed());
        setCoordinatorName(list.get(n).getCoordinatorName());
        setCCI(list.get(n).getCCI());
        setJob(list.get(n).getJob());
        setCargoRequirements(list.get(n).getCargoRequirements());
        setLaunchDate(list.get(n).getLaunchDate());
        setDestinationLocation(list.get(n).getDestinationLocation());
        setMissionDuration(list.get(n).getMissionDuration());
        setMissionStatus(list.get(n).getMissionStatus());
        changeNumber = check(display, list, n,2,joblist,changeNumber);
        change(display, changeNumber,list, joblist,n,2,changeNumber);
    }

    public void setMission(List<Mission> list,int n){
        setMissionID(list.get(n).getMissionID());
        setMissionName(list.get(n).getMissionName());
        setDescription(list.get(n).getDescription());
        setCountryOfOrigin(list.get(n).getCountryOfOrigin());
        setCountriesAllowed(list.get(n).getCountriesAllowed());
        setCoordinatorName(list.get(n).getCoordinatorName());
        setCCI(list.get(n).getCCI());
        setJob(list.get(n).getJob());
        setCargoRequirements(list.get(n).getCargoRequirements());
        setLaunchDate(list.get(n).getLaunchDate());
        setDestinationLocation(list.get(n).getDestinationLocation());
        setMissionDuration(list.get(n).getMissionDuration());
        setMissionStatus(list.get(n).getMissionStatus());
    }

    public int handleSelect(List<Mission> list,Display display,int n,List<Job> joblist,int changeNumber)throws EncryptedDocumentException, IOException
    {
        int z = 1;
        Write write = new Write();
        display.displayMenu("Which mission do you want to choose?(input the number before ID)");
        for(Mission m : list )
        {
            display.displayMenu(z+".ID:" + m.getMissionID());
            z+=1;
        }
        n = modify(list,display);
        return n;
    }

    public int Judge(String select, Display display) throws IOException {
        int flag = 0;
        Menu menu = new Menu();
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
                //System.exit(0);   // log out
                //flag = 0;
                menu.displayMenu();
            }
            else
            {
                select = display.acceptStringInput("Please input a correct number!");
            }
        }
        return flag;
    }

    public void judgeQuit(String n) throws IOException {
        if(n.equals("0")){
            startMission();
        }
    }
    public int judgeMission(List<Mission> list,Display display,int n,List<Job> joblist,int changeNumber,String select)throws EncryptedDocumentException, IOException
    {
        if (select.equals("0"))
        {
            n = handleSelect(list, display, n, joblist, changeNumber);
        }
        return n;
    }
    public void judgeCS(List<Mission> list,Display display,int n,List<Job> joblist,int changeNumber,String select)throws EncryptedDocumentException, IOException
    {
        int[] z = new int[2];
        int s = 0;
        boolean exit = false;
        for(;!exit;)
        {
            n++;
            z = Userselect(list, display, n, joblist, changeNumber);
            n = z[0];
            s = z[1];
            switch (s) {
                case 1:
                    n -= 1;
                    handleChange(list, display, n, joblist, changeNumber);
                    break;

                case 2:
                    n -= 1;
                    SpaceShuttle shuttle = new SpaceShuttle();
                    shuttle.selectShuttle();
                    break;

                case 3:
                    n -= 1;
                    setMission(list, n);
                    Administrator ad = new Administrator(list.get(n).getMissionID(), list.get(n).getDescription(), getJobNameList(n));
                    ad.star();
                    //n +=1;
                    break;
            }
        }

    }

    public void judgeMC(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber,String select) throws IOException {
        if (select.equals("0"))
        {
            check(display,list,location,p,joblist,changeNumber);
        }
    }

    public void inputID(List<Mission> list, Display display)
    {
        int n = list.get(list.size()-1).getMissionID();
        setMissionID(n+3);
        display.displayMenu("Start creating mission !  Your  mission ID is "+ getMissionID()+
                "\n Any time you want to quit just press 0");
    }

    public void inputName(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String name;
        name = display.acceptStringInput("1.Please input Mission name.");
        if(p==1)
        {
            judgeQuit(name);
        }
        if(p==2)
        {
            judgeMC(display, list, location, p, joblist, changeNumber, name);
        }
        setMissionName(name);
    }

    public void inputDescription(String name, Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String description;
        description = display.acceptStringInput("2.Please give " + name + " a description.");
        if(p==1)
        {
            judgeQuit(description);
        }
        if(p==2)
        {
            judgeMC(display, list, location, p, joblist, changeNumber, description);
        }
        setDescription(description);
    }

    public void inputCountryOfOrigin(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String countryOfOrigin;
        countryOfOrigin = display.acceptStringInput("3.Please input origin country.");
        if(p==1)
        {
            judgeQuit(countryOfOrigin);
        }
        if(p==2)
        {
            judgeMC(display, list, location, p, joblist, changeNumber, countryOfOrigin);
        }
        setCountryOfOrigin(countryOfOrigin);
    }

    public void inputCountriesAllowed(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String countriesAllowed;
        countriesAllowed = display.acceptStringInput("4.Please input countries allowed.");
        if(p==1)
        {
            judgeQuit(countriesAllowed);
        }
        if(p==2)
        {
            judgeMC(display, list, location, p, joblist, changeNumber, countriesAllowed);
        }
        setCountriesAllowed(countriesAllowed);
    }

    public void inputCoordinatorName(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String coordinatorName;
        coordinatorName = display.acceptStringInput("5.Please input coordinator name.");
        if(p==1)
        {
            judgeQuit(coordinatorName);
        }
        if(p==2)
        {
            judgeMC(display, list, location, p, joblist, changeNumber, coordinatorName);
        }
        setCoordinatorName(coordinatorName);
    }

    public void inputCCI (Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String CCI;
        CCI = display.acceptStringInput("6.Please input coordinator contect information.");
        if(p==1)
        {
            judgeQuit(CCI);
        }
        if(p==2)
        {
            judgeMC(display, list, location, p, joblist, changeNumber, CCI);
        }
        setCCI(CCI);
    }

    public void inputJob (List<Mission> list,List<Job> joblist,int location, int p,int changeNumber) throws IOException {
        Display display = new Display();
        String jobs = "";
        Job job = new Job();
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
            job1 = display.acceptStringInput("7.1 Please input job.");
            if(p==1)
            {
                judgeQuit(job1);
            }
            if(p==2)
            {
                judgeMC(display, list, location, p, joblist, changeNumber, job1);
            }
            description = display.acceptStringInput("7.2 Please input "+ job1+ " description.");
            if(p==1)
            {
                judgeQuit(description);
            }
            if(p==2)
            {
                judgeMC(display, list, location, p, joblist, changeNumber, description);
            }
            flag2 = "y";
            while (flag2.equals("y"))
            {
                title = display.acceptStringInput("7.3 Please input employ titles.");
                judgeQuit(title);
                flag3 = 1;
                while(flag3 == 1){
                    try
                    {
                        number1 = display.acceptStringInput("7.4 Please input the number of employees required for each job ");
                        number = Integer.parseInt(number1);
                        if(p==1)
                        {
                            judgeQuit(number1);
                        }
                        if(p==2)
                        {
                            judgeMC(display, list, location, p, joblist, changeNumber, number1);
                        }
                        flag3 = 0;
                    }catch(NumberFormatException e)
                    {
                        System.out.println("please input a correct number!");
                    }
                }
                job.setEMP(title,number);
                flag2 = display.acceptStringInput("Do you want to input more employ title (y/n)?");
                if(p==1)
                {
                    judgeQuit(flag2);
                }
                if(p==2)
                {
                    judgeMC(display, list, location, p, joblist, changeNumber,flag2);
                }
                while (flag2.equals("y") == false && flag2.equals("n") == false)
                {
                    flag2 = display.acceptStringInput("Please input y or n！\n" +
                            "Do you want to input more employ title (y/n)?");
                }
            }
            job = new Job(job1,description,job.getEmp());
            joblist.add(job);
            flag1 = display.acceptStringInput("Do you want to input more jobs?(y/n)?");
            if(p==1)
            {
                judgeQuit(flag1);
            }
            if(p==2)
            {
                judgeMC(display, list, location, p, joblist, changeNumber,flag1);
            }
            while (flag1.equals("y") == false && flag1.equals("n") == false)
            {
                flag1 = display.acceptStringInput("Please input y or n！\n" +
                        "Do you want to input more jobs?(y/n)?");
            }
        }
        for(Job j : joblist)
        {
            for(int e = 0; e<j.getEmp().size() ; e++)
            {
                employee += "employ title :"+j.getEmp().get(e).getTitle() + "\nnumber required: " + String.valueOf(j.getEmp().get(e).getNumberForEachJob() ) + "\n";
            }
            jobs += "JOB:" + j.getJobName() + "\nJOB Description" + j.getJobDescription() + "\n" + employee + "\n";
        }
        setJob(jobs);
    }

    public void inputCargoRequirements(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String R = "x";
        while (R.equals("a") == false && R.equals("b") == false &&
                R.equals("c") == false && R.equals("ab") == false &&
                R.equals("ac") == false && R.equals("bc") == false &&
                R.equals("abc") == false)
        {
            R = display.acceptStringInput("8.Cargo requirements \n"+ "a. For the journey \n" +
                    "b. For the mission \n" + "c. For other missions \n" +
                    "Multiple choice,just input letter in order" );
            if(p==1)
            {
                judgeQuit(R);
            }
            if(p==2)
            {
                judgeMC(display, list, location, p, joblist, changeNumber,R);
            }
        }
        if(R.equals("a"))
        {
            R = "For job";
        }
        else if(R.equals("b"))
        {
            R = "For this Mission";
        }
        else if(R.equals("c"))
        {
            R = "For other Mission";
        }
        else if(R.equals("ab"))
        {
            R = "For job and this Mission";
        }
        else if(R.equals("ac"))
        {
            R = "For job and other Mission";
        }
        else if(R.equals("bc"))
        {
            R = "For this and other Missions";
        }
        else if(R.equals("abc"))
        {
            R = "For job ,this Mission and other Missions";
        }
        setCargoRequirements(R);
    }

    public void inputLaunchDate(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String launchDate;
        launchDate = display.acceptStringInput("9. Please input Launch date as given format dd-mm-yyyy");
        if(p==1)
        {
            judgeQuit(launchDate);
        }
        if(p==2)
        {
            judgeMC(display, list, location, p, joblist, changeNumber,launchDate);
        }
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        boolean flag = false;
        while(flag == false) {
            try {
                formatter.setLenient(false);
                Date date = formatter.parse(launchDate);
                setLaunchDate(launchDate);
                flag = true;
            } catch (Exception e) {
                display.displayMenu("Please follow the requirement");
                launchDate = display.acceptStringInput("9. Please input Launch date as given format dd-mm-yyyy");
            }
        }
    }

    public void inputDestinationLocation(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String destinationLocation;
        destinationLocation = display.acceptStringInput("10. Please input the location of the destination ");
        if(p==1)
        {
            judgeQuit(destinationLocation);
        }
        if(p==2)
        {
            judgeMC(display, list, location, p, joblist, changeNumber,destinationLocation);
        }
        setDestinationLocation(destinationLocation);
    }

    public void inputMissionDuration(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber)
    {
        String M;
        int m = 0;
        while (m == 0)
        {
            try{
                M = display.acceptStringInput("11. Please input the duration of the mission (month)(number only)");
                if(p==1)
                {
                    judgeQuit(M);
                }
                if(p==2)
                {
                    judgeMC(display, list, location, p, joblist, changeNumber,M);
                }
                m = Integer.parseInt(M);
                setMissionDuration(m);
            }catch (NumberFormatException e)
            {
                System.out.println("please input a correct number!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void inputMissionStatus(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws IOException {
        String S = "";
        S = display.acceptStringInput("Please select Mission State \n" +
                "a.Planning phase \n" +
                "b.Departed Earth \n" +
                "c.Landed on Mars\n" +
                "d.Mission in progress\n" +
                "e. Returned to Earth\n" +
                "f. Mission completed");
        judgeMC(display, list, location, p, joblist, changeNumber,S);
        while(S.equals("a") == false && S.equals("b") == false &&
                S.equals("c") == false && S.equals("d") == false &&
                S.equals("e") == false && S.equals("f") == false)
        {
            display.displayMenu("Please input correct letter");
            S = display.acceptStringInput("Please select Mission State \n" +
                    "a.Planning phase \n" +
                    "b.Departed Earth \n" +
                    "c.Landed on Mars\n" +
                    "d.Mission in progress\n" +
                    "e. Returned to Earth\n" +
                    "f. Mission completed");
        }
        if(S.equals("a"))
            setMissionStatus("Planning phase");
        if(S.equals("b"))
            setMissionStatus("Departed Earth");
        if(S.equals("c"))
            setMissionStatus("Landed on Marsh");
        if(S.equals("d"))
            setMissionStatus("Mission in progress");
        if(S.equals("e"))
            setMissionStatus("Returned to Earth");
        if(S.equals("f"))
            setMissionStatus("Mission completed");
    }

    public int check(Display display,List<Mission> list,int location, int p,List<Job> joblist,int changeNumber) throws EncryptedDocumentException, IOException
    {
        String n = " ";
        int n1 = 0;
        display.displayMenu(" 1.Mission Name: " + list.get(location).getMissionName() +
                "\n 2.Mission Description: " + list.get(location).getDescription()+
                "\n 3.Country of Origin: " + list.get(location).getCountryOfOrigin() +
                "\n 4.Countries Allowed: " + list.get(location).getCountriesAllowed() +
                "\n 5.Coordinator Name: " + list.get(location).getCoordinatorName() +
                "\n 6.Coordinator Contact Information: " + list.get(location).getCCI() +
                "\n 7.Jobs: " + list.get(location).getJob() +
                "\n 8.Cargo Requirements: " + list.get(location).getCargoRequirements() +
                "\n 9.Launch Date: " + list.get(location).getLaunchDate() +
                "\n 10.Destination Location: " + list.get(location).getDestinationLocation() +
                "\n 11.Mission Duration: " + list.get(location).getMissionDuration() +
                "\n 12.Mission Status: " + list.get(location).getMissionStatus() );
        if (p == 1) {
            while (n1 < 1 || n1 > 12) {
                try {
                    n = display.acceptStringInput("Input the number of information you want to change ,or 0 to exit.");
                    if (n.equals("0")) {
                        Write write = new Write();
                        Mission mission;
                        mission = new Mission(missionID, missionName, description, countryOfOrigin, countriesAllowed, coordinatorName, CCI, job, cargoRequirements, launchDate, destinationLocation, missionDuration, missionStatus);
                        list.set(location, mission);
                        write.write(list, location, location + 1);
                        judgeQuit(n);
                    }
                    n1 = Integer.parseInt(n);
                } catch (NumberFormatException e) {
                    System.out.println("please input a correct number!");
                }
            }
        }
        if (p == 2)
        {
            while (n1 < 1 || n1 > 12) {
                try {
                    n = display.acceptStringInput("Input the number of information you want to change ,or 0 to exit.");
                    if (n.equals("0")) {
                        Write write = new Write();
                        Mission mission;
                        mission = new Mission(missionID, missionName, description, countryOfOrigin, countriesAllowed, coordinatorName, CCI, job, cargoRequirements, launchDate, destinationLocation, missionDuration, missionStatus);
                        list.set(location, mission);
                        write.write(list, location, location + 1);
                        judgeCS(list,display,location,joblist, changeNumber,n);
                    }
                    n1 = Integer.parseInt(n);
                } catch (NumberFormatException e) {
                    System.out.println("please input a correct number!");
                }
            }
        }
        return n1;
    }

    public void change(Display display, int i , List<Mission> list,List<Job> joblist,int place,int p,int changeNumber) throws EncryptedDocumentException, IOException
    {
        while(1<=i && i<=12)
        {
            if(i == 1){
                inputName(display,list,place,p,joblist,changeNumber);
                list.get(place).setMissionName(missionName);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 2){
                inputDescription(missionName,display,list,place,p,joblist,changeNumber);
                list.get(place).setDescription(description);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 3){
                inputCountryOfOrigin(display,list,place,p,joblist,changeNumber);
                list.get(place).setCountryOfOrigin(countryOfOrigin);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 4){
                inputCountriesAllowed(display,list,place,p,joblist,changeNumber);
                list.get(place).setCountriesAllowed(countriesAllowed);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 5){
                inputCoordinatorName(display,list,place,p,joblist,changeNumber);
                list.get(place).setCoordinatorName(coordinatorName);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 6){
                inputCCI(display,list,place,p,joblist,changeNumber);
                list.get(place).setCCI(CCI);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 7){
                joblist = new ArrayList();
                inputJob (list,joblist,place,p,changeNumber);
                list.get(place).setJob(job);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 8){
                inputCargoRequirements(display,list,place,p,joblist,changeNumber);
                list.get(place).setCargoRequirements(cargoRequirements);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 9){
                inputLaunchDate(display,list,place,p,joblist,changeNumber);
                list.get(place).setLaunchDate(launchDate);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 10){
                inputDestinationLocation(display,list,place,p,joblist,changeNumber);
                list.get(place).setDestinationLocation(destinationLocation);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 11){
                inputMissionDuration(display,list,place,p,joblist,changeNumber);
                list.get(place).setMissionDuration(missionDuration);
                i = check(display,list,place,p,joblist,changeNumber);
            }
            if(i == 12){
                inputMissionStatus(display,list,place,p,joblist,changeNumber);
                list.get(place).setMissionStatus(missionStatus);
                i = check(display,list,place,p,joblist,changeNumber);
            }
        }

    }

    public int modify(List<Mission> list, Display display) throws IOException {
        int modifyNumber = 0;
        while(0 >= modifyNumber || modifyNumber > list.size())
        {
            String select = display.acceptStringInput("input the number before ID(0 to Exit)");
            judgeQuit(select);
            try{
                modifyNumber = Integer.parseInt(select);
            }catch(NumberFormatException e){
                System.out.println("please input a correct number!");
            }

        }
        return modifyNumber;
    }

    public int[] Userselect(List<Mission> list,Display display,int n,List<Job> joblist,int changeNumber) throws IOException {
        int selection = 0;
        int[] number = new int[2];
        while(0 >= selection || selection > 6)
        {
            String select = display.acceptStringInput("What do you want to do? \n"
                    + "1. Change the mission information\n"
                    + "2. Select a space shuttle\n"
                    + "3. Create selection criteria\n"
                    + "4. Register as candidate\n"
                    + "0. Exit\n"
                    + "Please input number.");
            n = judgeMission(list,display,n,joblist,changeNumber,select);
            try{
                selection = Integer.parseInt(select);
            }catch(NumberFormatException e){
                System.out.println("please input a correct number!");
            }
            number[0] = n;
            number[1] = selection;
        }
        return number;
    }

    public ArrayList<String[]> getJobList(int n)
    {
        String jobList;
        Read READ = new Read();
        List<Mission> M = new ArrayList<Mission>();
        jobList = M.get(n).getJob();
        String[] A = jobList.split("\n");
        String[] B = new String[100];
        String[] C = new String[100];
        ArrayList<String[]> JobList = new ArrayList<String[]>();
        for(int i = 0; i<A.length;i++)
        {
            int k = 0;
            int y = 0;
            if(A[i].contains("JOB:"))
            {
                A[i] = A[i].replace("JOB:","");
                B[k] = A[i];
                k++;
            }
            if(A[i].contains("JOB Description:"))
            {
                A[i] = A[i].replace("JOB:","");
                C[y] = A[i];
                y++;
            }
        }
        JobList.add(B);
        JobList.add(C);
        return JobList;
    }

    public ArrayList<String[]> getJobNameList(int n)
    {
        String jobList;
        // Read READ = new Read();
        // List<Mission> M = new ArrayList<Mission>();
        jobList = getJob();
        String[] A = jobList.split("\n");
        String[] B = new String[100];
        String[] C = new String[100];
        ArrayList<String[]> JobNameList = new ArrayList<String[]>();
        int k = 0;
        int y = 0;
        for(int i = 0; i<A.length;i++)
        {

            if(A[i].contains("employ title :"))
            {
                B[k] = A[i].replace("employ title :","");
                k++;
            }
            if(A[i].contains("number required: "))
            {
                C[y] = A[i].replace("number required: ","");;
                y++;
            }
        }
        JobNameList.add(B);
        JobNameList.add(C);
        return JobNameList;
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