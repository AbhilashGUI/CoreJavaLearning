package CentricToAll4;
import java.util.Scanner;
public class Lab046
{
    public static void main(String[] args)
    {
        //Which month of the year
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Monthname, it will appear the respective monthnumber");
        String Monthname=sc.nextLine();
        //Note: For String we are using sc.nextline stamtment
        switch (Monthname)
        {
            case "January":
                System.out.println("It is the 1st month of the year");
                break;
            case "February":
                System.out.println("It is the 2nd month of the year");
                break;
            case "March":
                System.out.println("It is the 3rd month of the year");
                break;
            case "April":
                System.out.println("It is the 4rth month of the year");
                break;
            case "May":
                System.out.println("It is the 5th month of the year");
                break;
            case "June":
                System.out.println("It is the 6th month of the year");
                break;
            case "July":
                System.out.println("It is the 7th month of the year");
             break;
            case "August":
                System.out.println("It is the 8th month of the year");
                break;
            case "September":
                System.out.println("It is the 9th month of the year");
                break;
            case "October":
                 System.out.println("It is the 10th month of the year");
                break;
            case "November":
                System.out.println("It is the 11th month of the year");
                break;
            case "December":
                System.out.println("It is the 12 month of the year");
                break;
            default:
                System.out.println("Out of context");
                break;  //This one is optional

        }
        System.out.println("End of the program");

    }
}
