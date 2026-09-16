package AssignmentPrograms;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int value1=sc.nextInt();
        System.out.println("Enter the value of B");
        int value2=sc.nextInt();


        int temp=value1;
        value1=value2;
        value2=temp;

        System.out.println("Enter the value of A: "+value1);
        System.out.println("Enter the value of B: "+value2);
    }
}