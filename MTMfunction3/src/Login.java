import java.util.*;
import user.User;

public class Login {

    public static boolean login(String username, String password, List<User> list){
       boolean flag = false;

       for (User s : list) {
           if ((s.getUsername().equals(username)) && (s.getPassword().equals(password)))
           {
             flag = true;
             break;
           }
       }
       return flag;
    }
}