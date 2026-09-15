package AssignmentPrograms;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        for (int i=1;i<=10;i++)
        {
            System.out.println(number+"*"+i+"="+(number*i));
        }

    }
}