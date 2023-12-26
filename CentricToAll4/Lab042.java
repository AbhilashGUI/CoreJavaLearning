package CentricToAll4;
import java.util.Scanner;
public class Lab042 {
    public static void main(String[] args) {
        //Categorize the academic percentage obtained with the Grade description
        //percentage                       //Grade description
        //70-100                             First class with distinction
        //60-69.99                           First class
        //50-59.99                           Second class
        //40-49.99                           Third class
        //0-34.99                            Fail


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage obtained : ");
        float percentage = sc.nextInt();
        if (percentage >= 70 && percentage <= 100) {
            System.out.println("First class with distinction");
        } else if (percentage >= 60 && percentage <= 69.99) {
            System.out.println("First class");
        } else if (percentage >= 50 && percentage <= 59.99) {
            System.out.println("Second class");
        } else if (percentage >= 40 && percentage <= 49.99) {
            System.out.println("Third class");
        } else if (percentage >= 0 && percentage <= 34.99) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid number/Doen't exists");
        }
    }
}
