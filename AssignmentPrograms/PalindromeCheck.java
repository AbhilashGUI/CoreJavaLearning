package AssignmentPrograms;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args)
    {
           //Develop a program to check if a given number is a palindrome (reads the same backward as forward).

          int temp, remainder,sum=0;
          System.out.println("Enter the number");
          Scanner sc= new Scanner(System.in);
          int number=sc.nextInt();
          temp=number;

          while (number>0)
          {
              remainder=number%10;
              sum=sum*10+remainder;
              number=number/10;

          }
          if(temp==sum)
          {
              System.out.println("Given number is a palindrome");
          }
          else
          {
              System.out.println("Given number is not a palindrome");
          }
    }
}






