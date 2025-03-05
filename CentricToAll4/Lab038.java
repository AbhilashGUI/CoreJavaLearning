package CentricToAll4;

import java.util.Scanner;

public class Lab038
{
    public static void main(String[] args)
    {
        //Taking two inputs from keyboard and displaying the max number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1 ");
        int number1=sc.nextInt();
        System.out.println("Enter the number 2 ");
        int number2=sc.nextInt();

        if(number1>number2)
        {
            System.out.println("Maximum number-->"+number1);
        }
        else
        {
            System.out.println("Negligible number");
        }
        }

    }

























