package CentricToAll5;

public class Lab091 {

    public static void main(String[] args) {
        //factorial using for loop

        // Factorial of number  is the product of all positive descending integers. Factorial of n is denoted by n!.
        //Example:
        // 1!=1
        // 2!=2*1=2
        // 3!=3*2*1=6
        // 4!=4*3*2*1=24
        // 5!=5*4*3*2*1=120



        int number=5;
        int fact = 1;
        for (int i = 1; i <=number ; i++) {
            fact = fact * i;
        }
            System.out.println("Factorial of " + number + " is "+ fact);

        }


    }

