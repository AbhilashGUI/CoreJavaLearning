package AssignmentPrograms;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args)
    {
        int num1=0,num2=1;
        System.out.println("Enter the range/count:");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();

        for (int i=0;i<=count;i++)
        {
            int result=num1+num2;
            num1=num2;
            num2=result;
            System.out.println(num1);
        }
        sc.close();

    }
}