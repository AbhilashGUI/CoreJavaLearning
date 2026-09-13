package CentricToAll4;

import java.util.Scanner;

public class Lab039 {

    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1");
        int number1=sc.nextInt();
        System.out.println("Enter the number 2");
        int number2=sc.nextInt();
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