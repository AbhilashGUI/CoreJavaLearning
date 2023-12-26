package CentricToAll4;
import java.util.Scanner;
public class Lab044
{
    public static void main(String[] args)
    {

        //✅ Triangle Classifier:
        //
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal)
        //   scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Side1");
        int Side1=sc.nextInt();
        System.out.println("Enter the value of Side2");
        int Side2=sc.nextInt();
        System.out.println("Enter the value of Side3");
        int Side3=sc.nextInt();

        if((Side1==Side2) && (Side2==Side3) && (Side1==Side3))
        {
            System.out.println("It is an equilateral triangle");
        }
        else if((Side1==Side2) || (Side2==Side3) || (Side1==Side3))
        {
            System.out.println("It is an Isosceles triangle");
        }
        else
        {
            System.out.println("It is a Scalene triangle");
        }

    }
}
