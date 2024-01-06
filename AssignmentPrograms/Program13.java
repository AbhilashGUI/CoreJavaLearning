package AssignmentPrograms;
import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {

        ///Prime number should be greater than 1. Any number which is divisible by 1 and itself it is known as prime number.

        int i = 0;
        int flag = 0;
        int Q = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();


        Q = number / 2;
        if (number == 0 || number == 1) {
            System.out.println("It is not a prime number for sure " + number);
        } else {
            for (i = 2; i <= Q; i++) {
                if (number % i == 0) {
                    System.out.println("It is not a prime number " + number);
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("It is a prime number " + number);
        }
    }
}