package AssignmentPrograms;
import java.util.Scanner;
public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();

        int i=0,rem=0;
        int sum=0;

        while (number>0)
        {
            rem=number%10;
            sum=sum+rem;
            number=number/10;
            i++;
        }
        System.out.println("Sum of number/digits: "+sum );





    }

}