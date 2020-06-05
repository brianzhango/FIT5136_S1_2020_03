import java.util.Scanner;

public class SelectSpaceShuttle {

    String[] status = new String[]{"","","","","","","","","","","",""};

    String selectedShuttle = "";
    String selectedShuttle11 = "";


    public void selectShuttle(){
        boolean flag = true;
        while (flag){
            displayMenu();
            String userOption = stringInput("");
            flag = optionManager(userOption);

        }
    }

    public void displayMenu(){
        System.out.println("Welcome to Mission to Mars system!");
        System.out.println("Please start selecting a space shuttle.");
        System.out.println(" ");
        System.out.println("Please select from following shuttles:");
        System.out.println("1. magna. Sed" + status[0]);
        System.out.println("2. dapibus gravida." + status[1]);
        System.out.println("3. tristique neque" + status[2]);
        System.out.println("4. magna a" + status[3]);
        System.out.println("5. accumsan convallis," + status[4]);
        System.out.println("6. non, egestas" +  status[5]);
        System.out.println("7. eros. Nam" + status[6]);
        System.out.println("8. dui augue" + status[7]);
        System.out.println("9. tellus faucibus" + status[8]);
        System.out.println("10. gravida sagittis." + status[9]);
        System.out.println("11. nunc interdum" + status[10]);
        System.out.println("12. lacus, varius" + status[11]);

    }


    public boolean optionManager(String option){
        switch (option){
            case "1":{
                if (status[0].equals(" (Occupied)")){
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
                return true;
                }
            }
            case "2":{
                if (status[1].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "3":{
                if (status[2].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "4":{
                if (status[3].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "5":{
                if (status[4].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "6":{
                if (status[5].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "7":{
                if (status[6].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "8":{
                if (status[7].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "9":{
                if (status[8].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "10":{
                if (status[9].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "11":{
                if (status[10].equals(" (Occupied)")){
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
                    return true;
                }
            }
            case "12":{
                if (status[11].equals(" (Occupied)")){
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
                    return true;
                }
            }
            default:{
                return false;
            }
        }

    }
    public void confirmPage(int i){
        String option1 = stringInput("Are you sure? \n" + "1. Confirm your choice \n" + "0. Cancel and go back to previous menu");
        if (option1.equals("1")){
            selectedShuttle = selectedShuttle11;
            System.out.println("Your choice is " + selectedShuttle11 + ".");
            System.out.println("Confirmed.");
            System.out.println(" ");
            System.out.println("--------------------------------------");
            status[i-1] = " (Occupied)";

        }
        else if (option1.equals("0")){

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
}
