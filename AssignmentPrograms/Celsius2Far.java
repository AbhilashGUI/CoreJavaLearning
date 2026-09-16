package AssignmentPrograms;

import java.util.Scanner;

public class Celsius2Far {

    public static void main(String[] args)
    {
        //  Celsius to Fahrenheit conversion
        // Formula: Fahrenheit = (celsius * 9.0/5.0)+32;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        double celsius=sc.nextDouble();
        double fahrenheit=(celsius*9/5)+32;
        System.out.println("Temperature in celsius:" +fahrenheit);

    }
}