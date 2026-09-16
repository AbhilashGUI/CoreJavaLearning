package AssignmentPrograms;

import java.util.Scanner;

public class SwappingOfTwoNumbersusingArithmeticOperators {


    public static void main(String [] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of A");
        int value1=sc.nextInt();
        System.out.println("Enter the Value of B");
        int value2=sc.nextInt();

        value1=value1*value2;
        value2=value1/value2;
        value1=value1/value2;

        System.out.println("Enter the value 1: "+value1);
        System.out.println("Enter the value 2: "+value2);
    }
}