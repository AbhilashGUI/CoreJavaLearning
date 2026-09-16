package AssignmentPrograms;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int i=0,rem=0;
        int sum=0;

        while (number>0)
        {
            rem=number%10;
            sum=sum+rem;
            number=number/10;
            i++;
        }

       System.out.println("Sum of the digits: "+sum);


    }
}