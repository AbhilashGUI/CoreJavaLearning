package AssignmentPrograms;

public class Program2 {
    //Write a program that determines the given year is a leap year
    //A leap year is divisible by 4
    //But not by 100 unless it is divisible by 400.
    //Use an if-else statement to construct the code.


    //Understanding: The year which is divisible by 4&100 and 400. It is a leap year.
    public static void main(String[] args)
    {
        int year=2020;
        if((year%4==0 && year%100 !=0) || year%400==0)
        {
         System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }

    }
}

