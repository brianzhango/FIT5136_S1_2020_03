package login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import login.Login;
import login.ReadUserExcel;
import user.User;
import feature.Mission;

public class Menu
{
    public void displayMenu() throws IOException {
        ReadUserExcel efile = new ReadUserExcel();
        List<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Login lg = new Login();
        Mission mission = new Mission();

        list = efile.read("/Users/brianzhang/MTMSystem/src/Username.xlsx");
        //System.out.println(list.toString());
        System.out.println("Welcome to Mission to Mars System!");
        System.out.println("What do you want to do?");
        System.out.println("1. Log in");
        System.out.println("0. Exit");
        String input = sc.nextLine();
        if (input.equals("1")) {

            while (true) {
                System.out.println("Please enter your username: ");
                String username = scanner.next();

                System.out.println("Please enter your password: ");
                String password = scanner.next();

                boolean flag = lg.login(username, password, list);

                if (flag) {
                    System.out.println("Successful!");
                    mission.startMission();
                    break;
                } else
                    System.out.println("Fail! Please enter again.");

            }
        }
        else {
            System.exit(0);
        }
    }

}
