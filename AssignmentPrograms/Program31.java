package AssignmentPrograms;
import java.util.Scanner;
public class Program31
{

    public static void main(String[] args) {
        //Palindrome check using Functions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user-input, will help to check the palindrome");
        String user_input = sc.next();
        user_input=user_input.toLowerCase();  //It converts the uppercase char to lower case of string

        boolean result = ispalindrome(user_input);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }

          static boolean ispalindrome(String  user_input)
          {

              String original=new String(user_input);
              StringBuffer sbf=new StringBuffer(user_input);
              String reverse=sbf.reverse().toString();
              return original.equals(reverse);





    }
}
