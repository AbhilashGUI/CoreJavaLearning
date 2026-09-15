package AssignmentPrograms;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int fact=1;
        for (int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of a number "+ number + " is: "+fact);
    }
}