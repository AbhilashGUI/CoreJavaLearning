package AssignmentPrograms;
import java.util.Scanner;
public class Program4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the FirstName");
        String Fn=sc.next();
        System.out.println("Enter the LastName/SurName");
        String Ln=sc.next();

   String temp=Fn;
   Fn=Ln;
   Ln=temp;

   System.out.println("Applicant FirstName :"+ Fn);
   System.out.println("Applicant LastName/Surname :" + Ln);





    }

}
