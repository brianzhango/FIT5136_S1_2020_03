import java.util.*;

public class Login {

    public static void login(){
        Scanner scanner = new Scanner(System.in);
        String username1 = "123";
        String password1 = "123";

        System.out.println("Please enter your username: ");
        String username = scanner.next();

        System.out.println("Please enter your password: ");
        String password = scanner.next();

        if(username.equals(username1) && password.equals(password1))
            System.out.println("You are logged in!");
        else
            System.out.println("Error!");

    }
}