package CentricToAll4;
import java.io.PrintStream;
import java.util.Scanner;
public class Lab044 {
    public static void main(String[] args) {

        //✅ Triangle Classifier:
        //
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal)
        //   scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.


        Scanner sc= new Scanner(System.in);
        System.out.println("Measurement of side1");
        int side1=sc.nextInt();
        System.out.println("Measurement of side2");
        int side2=sc.nextInt();
        System.out.println("Measurement of side3");
        int side3=sc.nextInt();


        if(side1==side2 && side2==side3 && side3==side1)
        {
            System.out.println("It is an equilateral triangle");
        }
        else if (side1==side2 || side2==side3 || side3==side1)
        {
            System.out.println("It is an Isosceles triangle");
        }
        else
        {
            System.out.println("It is a scalene triangle");
        }
    }

}