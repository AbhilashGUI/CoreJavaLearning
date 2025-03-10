package CentricToAll4;
import java.util.Scanner;
public class    Lab045 {
    public static void main(String[] args)
    {
        //Break loop or switch statement is used to break the current flow of the code at the specified condition
        //It executes one statement from multiple conditions
        //Each case statement can have a break statement, which is optional.
        // If the break statement is not found, it executes the next case/cases as well

        //Which day is today
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the daynumber, it will appear the calender day");

        int daynumber=sc.nextInt();

        switch(daynumber) {
            case 1:
                System.out.println("Sunday");

                break;

            case 2:
                System.out.println("Monday");

                break;

            case 3:
                System.out.println("Tuesday");

                break;

            case 4:
                System.out.println("Wednesday");
                break;


            case 5:
                System.out.println("Thursday");
                break;


            case 6:
                System.out.println("Friday");
                break;


            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Restricted");

        }

    }
}
