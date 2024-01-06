package AssignmentPrograms;
import java.util.Scanner;
public class Program8
{
    public static void main(String[] args)
    {
        //Swapping of three numbers using Arithmetic operators.
        //Note: Logic remains sames
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int value1=sc.nextInt();
        System.out.println("Enter the value of B");
        int value2=sc.nextInt();
        System.out.println("Enter the value of C");
        int value3=sc.nextInt();

        value1=value1+value2+value3;
        value2=value1-value2-value3;
        value3=value1-value2-value3;
        value1=value1-value2-value3;

        System.out.println("Value of A : "+value1);
        System.out.println("Value of B : "+value2);
        System.out.println("Value of C : "+value3);




    }
}
