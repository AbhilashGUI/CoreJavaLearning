package CentricToAll5;
import java.util.Scanner;
public class Lab059
{
    public static void main(String[] args)
    {
        //Using the PDT and NON-PDT
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String name=sc.next();

        System.out.println("Enter your Age");
        int age=sc.nextInt();

        System.out.println("Enter your Salary");
        double salary=sc.nextInt();

        System.out.println("My details are " + name + "/" + age + "/" + salary);
        /*System.out.println("My Name is "+ name);
        System.out.println("My Age is "+ age);
        System.out.println("My Salary is "+ salary);*/

        sc.close();  //It is a good practice to close the scanner class. If you don't close, JVM does that.








    }
}
