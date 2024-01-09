package AssignmentPrograms;
import java.util.Scanner;
public class Program21
{
    public static void main(String[] args)
    {
        //Temperature Converter: Create a program that converts temperatures from Fahrenheit to Celsius and vice versa
        // using conditional statements to handle the direction of conversion.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature =1 , to covert from Fahrenheit to Celsius");
        System.out.println("Enter temperature =2 , to covert from  Celsius to Fahrenheit");
        int result=sc.nextInt();

        double outputofformula=0.0;
        if(result==1)
        {
            System.out.println("Enter the temperature of Fahrenheit");
            double temperature=sc.nextDouble();
            outputofformula=9/5.0*temperature+32;
            System.out.println("Temperature of Celsius is : " + outputofformula);
        }
        if(result==2)
        {
            System.out.println("Enter the temperature of Celsius");
            double temperature=sc.nextDouble();
            outputofformula=5.0/9*temperature-32;
            System.out.println("Temperature of Fahrenheit is : " + outputofformula);


        }
        sc.close();  //Its a good practice to define scanner close

    }
}
