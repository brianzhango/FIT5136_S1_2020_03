package feature;

import java.util.*;
/**
 * feature.Display message
 *
 * Dongheng Zhan
 * 18/5/2020
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
