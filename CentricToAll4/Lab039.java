package CentricToAll4;

import java.util.Scanner;

public class Lab039
{
    public static void main(String[] args)

    {
        //Taking two inputs from keyboard and displaying the min number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1");
        float number1=sc.nextFloat();
        System.out.println("Enter the number 2");
        float number2 =sc.nextFloat();

        if(number1<number2)
        {
            System.out.println("Minimum number is : "+ number1);
        }
        else
        {
            System.out.println("negligible number");
        }



    }







}
