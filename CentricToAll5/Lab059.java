package CentricToAll5;
import java.util.Scanner;
public class Lab059
{
    public static void main(String[] args)
    {
        //Using the PDT and NON-PDT with scanner class
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();

        System.out.println("Enter your age");
        int age=sc.nextInt();

        System.out.println("Enter your occupation");
        String occupation=sc.next();

        System.out.println("Enter your salary");
        double salary=sc.nextDouble();

        System.out.println("Applicant details" +'\n'+ name+ '\n' + age +'\n'+ occupation +'\n'+ salary );

        sc.close();









    }
}
