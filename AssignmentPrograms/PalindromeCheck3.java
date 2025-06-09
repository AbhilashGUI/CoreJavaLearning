package AssignmentPrograms;
import java.util.Scanner;
public class PalindromeCheck3
{

    public static void main(String[] args) {
        //Palindrome check using Functions
        System.out.println("Enter the string/number");
        Scanner sc= new Scanner(System.in);
        String user_input=sc.nextLine();
        //user_input=user_input.toUpperCase();

       boolean result= ispalindrome(user_input);
        if(result)
               {
                   System.out.println("It is a palindrome");
               }
        else {
            System.out.println("It is not a palindrome");
        }


    }

    private static boolean ispalindrome(String userInput) {

        String Original=new String(userInput);
        StringBuffer sbf= new StringBuffer(userInput);
        String reverse=sbf.reverse().toString();
        return Original.equals(reverse);
    }
}
