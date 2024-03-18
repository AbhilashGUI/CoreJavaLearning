package AssignmentPrograms;
import java.util.Scanner;
public class Scorecalculation
{
    public static void main(String[] args)
    {

    // Develop a program that calculates grades based on score input.
    // Use conditional statements to assign letter grades (A, B, C, D, F) based on score ranges.

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the marks obtained : ");
    int marks=sc.nextInt();

    if( marks>75 & marks<100)
    {
        System.out.println("Your grade is A(Distinction) : "+ marks);
    }
    else if (marks>60 & marks<75)
    {
        System.out.println("Your grade is B(Firstclass) : "+ marks);
    }
    else if (marks>50 & marks<60)
    {
        System.out.println("Your grade is C(Secondclass): "+ marks);
    }
    else if (marks>40 & marks<50)
    {
        System.out.println("Your grade is D(Thirdclass) : "+ marks);
    }
    else if (marks>0 & marks<35)
    {
        System.out.println("Your grade is F(Fail) : "+ marks);
    }
    else
    {
        System.out.println("Out of context");
    }
    sc.close();
    }

}
