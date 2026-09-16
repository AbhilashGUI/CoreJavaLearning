package AssignmentPrograms;

import java.util.Scanner;

public class Scorecalculation {

    public static void main(String [] args)
    {

        System.out.print("Enter the marks obtained: ");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();

        if(marks>70 && marks<100)
        {
            System.out.println("Your grade is A(Distinction): " +marks);
        }
        else if (marks>60  && marks<70)
        {
            System.out.println("Your grade is B(Second class): " +marks);
        }
        else if (marks>35 && marks<60)
        {
         System.out.println("Your grade is C(Third class): "+marks);
        }
        else
        {
            System.out.println("You Failed: "+marks);
        }
        sc.close();
    }
}