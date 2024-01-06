package AssignmentPrograms;
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        //Swapping of numbers using try catch block. To test the exceptions in the code
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of A");
            int value1 = sc.nextInt();
            System.out.println("Enter the value of B");
            int value2 = sc.nextInt();


            value1 = value1 * value2;
            value2 = value1 / value2;
            value1 = value1 / value2;

            System.out.println("Value of A :" + value1);
            System.out.println("Value of B :" + value2);


        } catch (Exception e) {
            System.out.println("zero is restricted");
        }
    }
}
