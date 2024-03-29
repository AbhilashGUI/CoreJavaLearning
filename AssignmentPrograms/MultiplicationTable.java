package AssignmentPrograms;
import java.util.Scanner;
class MultiplicationTable
{
    public static void main(String[] main)
    {
        //Write a program that prints the multiplication table of a given number up to a certain range

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the multiples of the number :  ");
        int number=sc.nextInt();
        for (int i = 1; i <=10 ; i++)
        {
         System.out.println(number+ "x" + i + "="+(number*i)) ;
        }

    }
}
