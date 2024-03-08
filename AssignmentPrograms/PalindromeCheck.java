package AssignmentPrograms;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args)
    {
           //Develop a program to check if a given string or number is a palindrome (reads the same backward as forward).

        int temp, remainder, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        temp = number;

        while (number>0) {

            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println("Given number is Palindrome");

        } else {
            System.out.println("Given number is not Palindrome");
        }
    }
}






