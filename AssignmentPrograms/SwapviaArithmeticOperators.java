package AssignmentPrograms;

import java.util.Scanner;

public class SwapviaArithmeticOperators {

    public static void main(String[] args)
    {

        System.out.println("Enter the value of A");
        Scanner sc=new Scanner(System.in);
        int value1=sc.nextInt();
        System.out.println("Enter the value of B");
        int value2=sc.nextInt();

        value1=value1+value2;
        value2=value1-value2;
        value1=value1-value2;

        System.out.println("Value of A-->"+value1);
        System.out.println("Value of B-->"+value2);


    }
}