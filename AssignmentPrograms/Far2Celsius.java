package AssignmentPrograms;

import java.util.Scanner;

public class Far2Celsius {

    public static void main(String[] args)
    {
        // Fahrenheit to Celsius conversion
        // Formula: Celsius = (Fahrenheit - 32) * 5 / 9

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the temperature in fahrenheit");
      double fahrenheit=sc.nextDouble();
      double celsius=(fahrenheit-32)*5/9;
      System.out.println("Temperature in fahrenheit: "+celsius);
      }

    }
