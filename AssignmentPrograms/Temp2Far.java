package AssignmentPrograms;
import java.util.Scanner;
public class Temp2Far
{
    //Temperature Converter: Create a program that converts temperatures from Fahrenheit to Celsius


    public static void main(String[] args)
    {

        double formula=0.0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the temperature value  which has to be convert from fahrenheit to celsius");
      double temperature=sc.nextDouble();
      formula=9/5.0*temperature+32;
      System.out.println("Degree of the celsius : " + formula);
      sc.close();  //Its a good practice to define scanner close




              //Note: Fahrenheit is a scale of temperature on which water freezes at 32° and boils at 212° under standard conditions

    }



}
