package CentricToAll4;

import java.util.Scanner;

public class Lab039
{
    public static void main(String[] args)

    {
        //Taking two inputs from keyboard and displaying the min number

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1");
        byte number1=sc.nextByte();
        System.out.println("Enter the number 2 ");
        byte number2=sc.nextByte();

        if(number1<number2)
        {
            System.out.println("It is a minimum number");
        }
        else
        {
            System.out.println("Negligible number");
        }


    }

}
