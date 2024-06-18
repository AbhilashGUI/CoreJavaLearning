package CentricToAll4;
import java.util.Scanner;
public class Lab042 {
    public static void main(String[] args) {
        //Categorize the academic percentage obtained with the Grade description
        //percentage                     //Grade description
        //70-100                         First class with distinction
        //60-69                          First class
        //50-59                          Second class
        //40-49                          Third class
        //0-34                           Fail


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage obtained in the semester : ");
        float percentage = sc.nextFloat();
        if (percentage >= 70 && percentage <= 100) {
            System.out.println("First class with distinction");
        } else if (percentage >= 60 && percentage <= 69.5) {
            System.out.println("First class");
        } else if (percentage >= 50 && percentage <= 59.5) {
            System.out.println("Second class");
        } else if (percentage >= 40 && percentage <= 49.5) {
            System.out.println("Third class");
        } else if (percentage >= 0 && percentage <= 34.4) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid number/Doesn't exists");
        }
    }
}
