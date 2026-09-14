package AssignmentPrograms;

import java.util.Scanner;

public class PalindromeCheck2 {

    public static void main(String[] args)
    {
        String Original,Reverse="";
        System.out.println("Enter the Number/String");
        Scanner sc=new Scanner(System.in);
        Original=sc.nextLine();
        int length=Original.length();

        for (int i=Original.length()-1;i>=0;i--)
        {
            Reverse=Reverse+Original.charAt(i); //Return the character at a specified index in a string
        }
        if (Original.equals(Reverse)) //Checks whether two strings contain the same value
        {
            System.out.println("Given input is a palindrome");
        }
        else
        {
            System.out.println("Given input is not a palindrome");
        }
    }
}