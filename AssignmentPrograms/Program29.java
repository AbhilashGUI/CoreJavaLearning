package AssignmentPrograms;
import java.util.Scanner;
public class Program29
{

    public static void main(String[] args)
    {
        //An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
        // It is also known as pluperfect, or Plus Perfect, or Narcissistic number.
        //Example: 153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        int sum=0,rem;
        int temp=number;

        while (number>0)
        {
            rem=number%10;
            sum=sum+(rem*rem*rem*rem);   //Since we are declaring 4 digit number
            number=number/10;
        }
        if(temp==sum)
        {
            System.out.println("It is an armstrong number");
        }
        else
        {
            System.out.println("It is not an armstrong number");
        }


    }
}
