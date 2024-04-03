package AssignmentPrograms;
import java.util.Scanner;
public class FibonacciSeries

{
    public static void main(String[] args)
    {
        //Fibonacci series: The sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

        int num1=0,num2=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range/count : ");  //Length upto print the series
        int count=sc.nextInt();

        for (int i = 0; i <= count; i++)
        {
            System.out.print(num1+ " ");
            int result=num1+num2;
            num1=num2;
            num2=result;

        }

        }
}
