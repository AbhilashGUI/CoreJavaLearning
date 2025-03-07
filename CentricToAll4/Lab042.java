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
        System.out.print("Enter the marks obtained in the first semester: ");
        int marks = sc.nextInt();

        if (marks >= 70 && marks <= 100) {
            System.out.println("Distinction");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("First class");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Second class");
        } else if (marks >= 40 && marks <= 49) {
            System.out.println("Third class");
        } else {
            System.out.println("Fail");
        }
    }
}
