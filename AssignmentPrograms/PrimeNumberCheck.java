package AssignmentPrograms;
import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {

        //Create a program that checks if a given number is prime or not.
        // Use loops to divide the number by all numbers lesser than it to check for divisibility.
        //Prime number should be greater than 1.
        // Any number which is divisible by 1 and itself it is known as prime number.

        int i=0;
        int flag=0;

        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();

        int j=number/2;
        if(number ==0 || number ==1)
        {
            System.out.println("It is not a prime number "+ number);

        }
        else
        {
         for (i=2;i<=j;j++)
         {
             if( number % i==0)
             {
                 System.out.println("It is not a prime number " + number);
                 flag=1;
                 break;
             }
         }
        }
       if(flag==0)
       {
           System.out.println("It is a prime number "+ number);
       }
    }
}