package AssignmentPrograms;
import java.util.Scanner;
public class FactorialCalculator
{
    public static void main(String[] args)
    {
        //Factorial calculator
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();

        int fact=1;
        for (int i = 1; i <=number ; i++)
        {
         fact=fact*i;
        }
        System.out.println("Factorial of " +number+ " is :" +fact );
        sc.close();
    }

}
