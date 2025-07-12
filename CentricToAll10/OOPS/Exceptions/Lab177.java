package CentricToAll10.OOPS.Exceptions;

public class Lab177 {
    public static void main(String[] args) {
        String  str="Abhilash";  //This should be passed in CLA
        try {
             int a= Integer.parseInt(args[0]);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
        }

        try {
            String str2=args[0];  //This should be passed in CLA
            int b = Integer.parseInt(str2);
            int c=b/0;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }

  //Note: Since we  are not passing any argument in CLA , it is throwing the below exception
        try {
            String str1 = args[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}


