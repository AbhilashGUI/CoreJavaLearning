package AssignmentPrograms;
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        //Taking the user inputs(String) as an array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size/Length of an array");
        String FM = sc.next();
        int Count=6;
        String[] array = new String[Count];


        System.out.println("Enter the Names of FM");
        for (int i = 0; i < Count; i++)
        {
            array[i] = sc.next();
        }

        System.out.println("Below is the Actual result");

        for (int i = 0; i < Count; i++) {
            System.out.println(array[i]);
        }
        sc.close();
        System.out.print("End of the program");
    }
}













