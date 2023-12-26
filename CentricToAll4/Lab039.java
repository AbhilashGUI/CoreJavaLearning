package CentricToAll4;

import java.util.Scanner;

public class Lab039
{
    public static void main(String[] args)

    {
        //Taking two inputs from keyboard and displaying the min number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number A");
        int number=sc.nextInt();
        System.out.println("Enter the number B");
        int number2 =sc.nextInt();

        if(number<number2)
        {
            System.out.println("Minimum number is : "+ number);
        }
        else
        {
            System.out.println("negligible number is : "+ number);
        }



    }







}
