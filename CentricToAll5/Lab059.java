package CentricToAll5;
import java.util.Scanner;
public class Lab059
{
   public static void main(String[] args)
   {

       Scanner sc= new Scanner(System.in);

       System.out.println("Enter your name");
       String name=sc.next();

       System.out.println("Enter you age");
       int age=sc.nextInt();

       System.out.println("Enter your occupation");
       String occupation=sc.next();

       System.out.println("Enter your salary");
       double salary=sc.nextDouble();

       System.out.println("Marital status");
       boolean notmarried=sc.nextBoolean();

       System.out.println("Applicant details"+ '\n'+name+ '\n'+age+'\n'+occupation+'\n'+salary+'\n'+notmarried);

       sc.close();

    }
}
