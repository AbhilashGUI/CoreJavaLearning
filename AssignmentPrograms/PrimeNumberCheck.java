package AssignmentPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {
    //Create a program that checks if a given number is prime or not.
    // Use loops to divide the number by all numbers lesser than it to check for divisibility.
    //Prime number should be greater than 1.
    // Any number which is divisible by 1 and itself it is known as prime number.


    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean isprime = true;

        if (number <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % 2 == 0) {
                    isprime = false;
                    break;
                }
                if (isprime) {
                    System.out.println(number + ": is a prime number");
                } else {
                    System.out.println(number + ": is not a prime number");
                }
            }
            sc.close();

        }
    }
}