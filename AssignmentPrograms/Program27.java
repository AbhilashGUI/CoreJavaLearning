package AssignmentPrograms;
import java.util.Scanner;
public class Program27
{
    public static void main(String[] args)

    {
        //write a program that calculates simple interest given principal, rate, and time. Use conditionals to validate input values.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        double principal=sc.nextDouble();

        System.out.println("Enter the rate of interest");
        double ROI=sc.nextDouble();

        System.out.println("Enter the time period");
        double time=sc.nextDouble();

        double SI=principal*ROI*time/100;

        System.out.println("Simple interest is : "+ SI);




    }




}
