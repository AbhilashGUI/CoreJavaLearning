package CentricToAll10.OOPS.Exceptions;

public class Lab177 {
    public static void main(String[] args) {
        int a=10;
        try {
            a = Integer.parseInt(args[0]);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
        }

        try {
            int b = 10 / a;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }

  //Note: Since we  are not passing any argument in CLA , it is throwing the below exception
        try {
            String str = args[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}


