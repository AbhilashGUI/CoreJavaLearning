package AssignmentPrograms;
import java.util.Scanner;
public class Temp2Far2
{
    public static void main(String[] args)
    {

        //Temperature Converter: Create a program that converts temperatures from  Celsius to Fahrenheit

        double formula=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature value, which has to convert from celsius to fahrenheit");
        double temperature=sc.nextDouble();
        formula=5/9.0*temperature-32;
        System.out.println("Degree of the Fahrenheit : "+ formula);
        sc.close();  //Its a good practice to define scanner close


    }
}
