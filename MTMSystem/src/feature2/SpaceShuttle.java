package feature2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import feature.Mission;

public class SpaceShuttle {
    private int spaceId;
    private String spaceName;
    private String manufactureDate;
    private String fuelCapacity;
    private int passengerCapacity;
    private String speed;
    private String origin;
    private String[] status = new String[]{"","","","","","","","","","","",""};

    private String selectedShuttle11 = "";



    public SpaceShuttle() {
      }
    public void selectShuttle() throws IOException {
        boolean flag = true;
        while (flag){
            displayMenu();
            String userOption = stringInput("");
            flag = optionManager(userOption);

        }
    }
    public void displayMenu(){
        MTMSystem.listOfSpaceShuttle = new ArrayList<>();
        MTMSystem.listOfSpaceShuttle.add("1. magna. Sed");
        MTMSystem.listOfSpaceShuttle.add("2. dapibus gravida.");
        MTMSystem.listOfSpaceShuttle.add("3. tristique neque");
        MTMSystem.listOfSpaceShuttle.add("4. magna a");
        MTMSystem.listOfSpaceShuttle.add("5. accumsan convallis,");
        MTMSystem.listOfSpaceShuttle.add("6. non, egestas");
        MTMSystem.listOfSpaceShuttle.add("7. eros. Nam");
        MTMSystem.listOfSpaceShuttle.add("8. dui augue");
        MTMSystem.listOfSpaceShuttle.add("9. tellus faucibus");
        MTMSystem.listOfSpaceShuttle.add("10. gravida sagittis.");
        MTMSystem.listOfSpaceShuttle.add("11. nunc interdum");
        MTMSystem.listOfSpaceShuttle.add("12. lacus, varius");
        System.out.println("Welcome to Mission to Mars system!");
        System.out.println("Please start selecting a space shuttle.");
        System.out.println(" ");
        System.out.println("Please select from following shuttles:");
        System.out.println(MTMSystem.listOfSpaceShuttle.get(0) + MTMSystem.sStatus[0]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(1) + MTMSystem.sStatus[1]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(2) + MTMSystem.sStatus[2]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(3) + MTMSystem.sStatus[3]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(4) + MTMSystem.sStatus[4]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(5) +  MTMSystem.sStatus[5]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(6) + MTMSystem.sStatus[6]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(7) + MTMSystem.sStatus[7]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(8) + MTMSystem.sStatus[8]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(9) + MTMSystem.sStatus[9]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(10) + MTMSystem.sStatus[10]);
        System.out.println(MTMSystem.listOfSpaceShuttle.get(11) + MTMSystem.sStatus[11]);

    }


    public boolean optionManager(String option) throws IOException {
        switch (option){
            case "1":{
                if (MTMSystem.sStatus[0].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("1. magna. Sed has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: magna. Sed");
                    System.out.println("Manufacture Year: 10/04/2018");
                    System.out.println("Fuel capacity (in litres): 977899900");
                    System.out.println("Passenger capacity: 249");
                    System.out.println("Cargo capacity (in kgs): 502");
                    System.out.println("Travel speed (kms/hr): 31837");
                    System.out.println("Origin: Russian Federation");
                    System.out.println(" ");
                    selectedShuttle11 = "magna. Sed";
                    int i = 1;
                    confirmPage(i);
                    return false;
                }
            }
            case "2":{
                if (MTMSystem.sStatus[1].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("2. dapibus gravida. has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: dapibus gravida.");
                    System.out.println("Manufacture Year: 04/17/2014");
                    System.out.println("Fuel capacity (in litres): 922124065");
                    System.out.println("Passenger capacity: 249");
                    System.out.println("Cargo capacity (in kgs): 1203");
                    System.out.println("Travel speed (kms/hr): 34676");
                    System.out.println("Origin: United Kingdom");
                    System.out.println(" ");
                    selectedShuttle11 = "dapibus gravida.";
                    int i = 2;
                    confirmPage(i);
                    return false;
                }
            }
            case "3":{
                if (MTMSystem.sStatus[2].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("3. tristique neque has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: tristique neque");
                    System.out.println("Manufacture Year: 09/16/2012");
                    System.out.println("Fuel capacity (in litres): 604094652");
                    System.out.println("Passenger capacity: 277");
                    System.out.println("Cargo capacity (in kgs): 1697");
                    System.out.println("Travel speed (kms/hr): 30552");
                    System.out.println("Origin: Russian Federation");
                    System.out.println(" ");
                    selectedShuttle11 = "tristique neque";
                    int i = 3;
                    confirmPage(i);
                    return false;
                }
            }
            case "4":{
                if (MTMSystem.sStatus[3].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("4. magna a has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: magna a");
                    System.out.println("Manufacture Year: 01/24/2010");
                    System.out.println("Fuel capacity (in litres): 3365269");
                    System.out.println("Passenger capacity: 260");
                    System.out.println("Cargo capacity (in kgs): 779");
                    System.out.println("Travel speed (kms/hr): 30930");
                    System.out.println("Origin: India");
                    System.out.println(" ");
                    selectedShuttle11 = "magna a";
                    int i = 4;
                    confirmPage(i);
                    return false;
                }
            }
            case "5":{
                if (MTMSystem.sStatus[4].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("5. accumsan convallis, has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: accumsan convallis,");
                    System.out.println("Manufacture Year: 06/16/2011");
                    System.out.println("Fuel capacity (in litres): 578248695");
                    System.out.println("Passenger capacity: 248");
                    System.out.println("Cargo capacity (in kgs): 1054");
                    System.out.println("Travel speed (kms/hr): 34503");
                    System.out.println("Origin: Australia");
                    System.out.println(" ");
                    selectedShuttle11 = "accumsan convallis,";
                    int i = 5;
                    confirmPage(i);
                    return false;
                }
            }
            case "6":{
                if (MTMSystem.sStatus[5].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("6. non, egestas has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: non, egestas");
                    System.out.println("Manufacture Year: 08/18/2012");
                    System.out.println("Fuel capacity (in litres): 663650125");
                    System.out.println("Passenger capacity: 238");
                    System.out.println("Cargo capacity (in kgs): 1764");
                    System.out.println("Travel speed (kms/hr): 31200");
                    System.out.println("Origin: United Kingdom");
                    System.out.println(" ");
                    selectedShuttle11 = "non, egestas";
                    int i = 6;
                    confirmPage(i);
                    return false;
                }
            }
            case "7":{
                if (MTMSystem.sStatus[6].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("7. eros. Nam has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: eros. Nam");
                    System.out.println("Manufacture Year: 05/24/2013");
                    System.out.println("Fuel capacity (in litres): 44923495");
                    System.out.println("Passenger capacity: 232");
                    System.out.println("Cargo capacity (in kgs): 1634");
                    System.out.println("Travel speed (kms/hr): 29415");
                    System.out.println("Origin: United Kingdom");
                    System.out.println(" ");
                    selectedShuttle11 = "eros. Nam";
                    int i = 7;
                    confirmPage(i);
                    return false;
                }
            }
            case "8":{
                if (MTMSystem.sStatus[7].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("8. dui augue has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: dui augue");
                    System.out.println("Manufacture Year: 06/27/2019");
                    System.out.println("Fuel capacity (in litres): 904495444");
                    System.out.println("Passenger capacity: 214");
                    System.out.println("Cargo capacity (in kgs): 673");
                    System.out.println("Travel speed (kms/hr): 31972");
                    System.out.println("Origin: United States");
                    System.out.println(" ");
                    selectedShuttle11 = "dui augue";
                    int i = 8;
                    confirmPage(i);
                    return false;
                }
            }
            case "9":{
                if (MTMSystem.sStatus[8].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("9. tellus faucibus has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: tellus faucibus");
                    System.out.println("Manufacture Year: 08/19/2014");
                    System.out.println("Fuel capacity (in litres): 30897766");
                    System.out.println("Passenger capacity: 233");
                    System.out.println("Cargo capacity (in kgs): 919");
                    System.out.println("Travel speed (kms/hr): 30305");
                    System.out.println("Origin: Canada");
                    System.out.println(" ");
                    selectedShuttle11 = "tellus faucibus";
                    int i = 9;
                    confirmPage(i);
                    return false;
                }
            }
            case "10":{
                if (MTMSystem.sStatus[9].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("10. gravida sagittis. has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: gravida sagittis.");
                    System.out.println("Manufacture Year: 03/14/2016");
                    System.out.println("Fuel capacity (in litres): 938197299");
                    System.out.println("Passenger capacity: 235");
                    System.out.println("Cargo capacity (in kgs): 1776");
                    System.out.println("Travel speed (kms/hr): 30568");
                    System.out.println("Origin: United Kingdom");
                    System.out.println(" ");
                    selectedShuttle11 = "gravida sagittis.";
                    int i = 10;
                    confirmPage(i);
                    return false;
                }
            }
            case "11":{
                if (MTMSystem.sStatus[10].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("11. nunc interdum has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: nunc interdum");
                    System.out.println("Manufacture Year: 01/31/2010");
                    System.out.println("Fuel capacity (in litres): 767708030");
                    System.out.println("Passenger capacity: 206");
                    System.out.println("Cargo capacity (in kgs): 587");
                    System.out.println("Travel speed (kms/hr): 31486");
                    System.out.println("Origin: United States");
                    System.out.println(" ");
                    selectedShuttle11 = "nunc interdum";
                    int i = 11;
                    confirmPage(i);
                    return false;
                }
            }
            case "12":{
                if (MTMSystem.sStatus[11].equals(" (Occupied)")){
                    System.out.println("Sorry, this shuttle has been occupied by another mission.");
                    System.out.println("Please select another shuttle \n" + "----------------------------------------");
                    return true;
                }
                else {
                    System.out.println("12. lacus, varius has been selected.");
                    System.out.println(" ");
                    System.out.println("Name: lacus, varius");
                    System.out.println("Manufacture Year: 02/09/2013");
                    System.out.println("Fuel capacity (in litres): 491004413");
                    System.out.println("Passenger capacity: 263");
                    System.out.println("Cargo capacity (in kgs): 1295");
                    System.out.println("Travel speed (kms/hr): 31686");
                    System.out.println("Origin: Austria");
                    System.out.println(" ");
                    selectedShuttle11 = "lacus, varius";
                    int i = 12;
                    confirmPage(i);
                    return false;
                }
            }
            case "0":{
//                Mission mission = new Mission();
//                mission.startMission();
            }
            default:{
                return true;
            }
        }

    }
    public void confirmPage(int i) throws IOException {
        String option1 = stringInput("Are you sure? \n" + "1. Confirm your choice \n" + "0. Cancel and go back to previous menu");
        if (option1.equals("1")){
            String selectedShuttle = selectedShuttle11;
            //MTMSystem.listOfSpaceShuttle.get(MTMSystem.listOfSpaceShuttle.indexOf(selectedShuttle)).replace("");
            System.out.println("Your choice is " + selectedShuttle11 + ".");
            System.out.println("Confirmed.");
            System.out.println(" ");
            System.out.println("--------------------------------------");
            MTMSystem.sStatus[i-1] = " (Occupied)";
//            Mission mission = new Mission();
//            mission.startMission();

        }
        else if (option1.equals("0")){
//            Mission mission = new Mission();
//            mission.startMission();

        }
    }

    public int numberInput(String displayMassage){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int number = 0;
        while (flag){
            try {
                flag = false;
                System.out.println(displayMassage);
                number = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                flag = true;
                System.out.println("Please insert a valid number.");
            }
        }
        return number;
    }
    public String stringInput(String displayMessage){
        Scanner scanner = new Scanner(System.in);
        System.out.println(displayMessage);
        String stringInput = scanner.nextLine();
        return stringInput;
    }

    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(String fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }




}
