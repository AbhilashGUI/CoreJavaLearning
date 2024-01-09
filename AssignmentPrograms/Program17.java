package AssignmentPrograms;
import java.util.Scanner;
public class Program17
{
    public static void main(String[] args)
    {
        //Develop a program to check if a given string or number is a palindrome (reads the same backward as forward).



        String original,reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Check if the given number/string is palindrome or not");
        original=sc.nextLine();
        int length=original.length();
        for (int i = original.length()-1; i>=0 ; i--)
        {
            reverse=reverse+original.charAt(i); ////To return the character at a specific index in a string.
        }
        if(original.equals(reverse))
        {
            System.out.println("Given input is Palindrome");
        }
        else {
            System.out.println("Given input is not Palindrome");
        }
    }
}
