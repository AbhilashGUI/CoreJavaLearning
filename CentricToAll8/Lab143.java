package CentricToAll8;
import java.util.Scanner;
public class Lab143 {
    public static void main(String[] args) {
        //Palindrome check using functions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String/number, I will check for palindrome");
        String user_input = sc.next();

        boolean result = ispalindrome(user_input);
        if (result) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
          static boolean ispalindrome(String user_input)
          {
              String original=user_input;
              StringBuilder sb= new StringBuilder(user_input);
              String reverse=sb.reverse().toString();
              //return original.equals(reverse);
              return original.equalsIgnoreCase(reverse);


        }

    }

