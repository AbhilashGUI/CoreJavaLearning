package AssignmentPrograms;

import java.util.Scanner;

public class PalindromeCheck3 {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String Userinput = sc.nextLine();
        Userinput=Userinput.toUpperCase();


        boolean result = ispalindrome(Userinput);
        if (result) {
            System.out.println("Given input is a palindrome");
        } else {
            System.out.println("Given input is not a palindrome");
        }
    }

  private static boolean ispalindrome(String Userinput)
  {
      String Original=Userinput;
      StringBuffer sbf=new StringBuffer(Original);
      String reverse=sbf.reverse().toString();
      return Original.equals(reverse);
  }
}
