package AssignmentPrograms;
import java.util.Scanner;
public class Program6
{
    public static void main(String[] args)
    {

        //Swapping of numbers using Arithmetic operators


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int value1=sc.nextInt();
        System.out.println("Enter the value of B");
        int value2=sc.nextInt();


        value1=value1*value2;
        value2=value1/value2;
        value1=value1/value2;

        System.out.println("Value of A--->"+ value1);
        System.out.println("Value of B--->"+ value2);










    }
}
