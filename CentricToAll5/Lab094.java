package CentricToAll5;
import java.util.Scanner;
public class Lab094
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int number= sc.nextInt();


        int fact=1;
        int i=1;
        while (i<=number)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of " + number + " is "+ fact);
    }
}
