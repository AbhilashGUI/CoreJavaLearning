package CentricToAll10.OOPS.Exceptions;

public class Lab183 {
    public static void main(String args[]) {

        //Trying to fetch the lenght of a null. It throws a default error message. Since we are using getMessage() function.
        try {

            String Name = null;
            Name.length();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

