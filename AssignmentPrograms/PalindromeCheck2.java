package AssignmentPrograms;
import java.util.Scanner;
public class PalindromeCheck2 {
    public static void main(String[] args) {
        //Develop a program to check if a given string or number is a palindrome (Returns the same value when reverse).



        String Original,reverse="";
        System.out.println("Enter the String/Number");
        Scanner sc= new Scanner(System.in);
        Original = sc.nextLine();
        int length=Original.length();
        for(int i=Original.length()-1;i>=0;i--)
        {
            reverse=reverse+Original.charAt(i);  //Return the character at a specified index in a string
        }
        if(Original.equals(reverse))
        {
            System.out.println("Given input is palindrome");
        }
        else
        {
            System.out.println("Given input is not palindrome");
        }
    }
}

