package AssignmentPrograms;

import java.util.Scanner;

public class CalculateSimpleInterest {

    public static void main(String[] args) {
        System.out.println("Enter the principal amount");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        System.out.println("Enter the rate of interest");
        double roi = sc.nextDouble();

        System.out.println("Enter the time period");
        double timeduration = sc.nextDouble();

        double Simpleinterest = amount * roi * timeduration / 100;

        System.out.println("Simple interest: " + Simpleinterest);

    }

}