import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import user.User;
import feature.Mission;

public class UserTest{

    public static void main(String[] args) throws IOException {
        ReadUserExcel efile = new ReadUserExcel();
        List<User> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Login lg = new Login();
        Mission mission = new Mission();

        System.out.println("Welcome to feature.Mission to Mars system!");
        System.out.println("Please log in!");
        list = efile.read("/Users/brianzhang/MTMSystem/src/Username.xlsx");
        //System.out.println(list.toString());

        while(true) {
            System.out.println("Please enter your username: ");
            String username = scanner.next();

            System.out.println("Please enter your password: ");
            String password = scanner.next();

            boolean flag = lg.login(username, password,list);

            if (flag) {
                System.out.println("Successful!");
                mission.startMission();
                break;
            }
            else
                System.out.println("Fail! Please enter again.");

        }
    }
}