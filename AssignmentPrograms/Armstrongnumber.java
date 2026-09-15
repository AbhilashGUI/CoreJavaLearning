package AssignmentPrograms;

import java.util.Scanner;

public class Armstrongnumber {

    public static void main(String[] args)
    {
        //An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
        // It is also known as pluperfect, or Plus Perfect, or Narcissistic number.
        //Example: 153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153

        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int remainder,sum=0;
        int temp=number;

        while (number>0)
        {
            remainder=number%10;
            sum=sum+(remainder*remainder*remainder*remainder);
            number=number/10;
        }
        if (temp==sum)
        {
            System.out.println("It is an armstrong number");
        }
        else
        {
            System.out.println("It is not an armstrong number");
        }
    }
}