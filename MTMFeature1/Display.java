import java.util.*;
/**
 * 在这里给出对类 Display 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Display
{
    public void Display()
    {
    }
    public void displayMenu(String menu)
    {
        System.out.println(menu);
    }
    
    public String acceptStringInput(String displayMessage)
    {
        System.out.println(displayMessage);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
