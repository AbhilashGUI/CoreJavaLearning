package CentricToAll10.OOPS.Exceptions;

public class Lab173 {

    public static void main(String[] args) {

        try {
            //Exception:Is an event, that occurs during program execution, that disrupts the normal flow of program. It can be handled using the try & catch block. In-case of control is given to JVM it terminates the program.
            //Exceptions are handled for a better user experience
            //Error: Is something which cannot be handled.

            String name = null;
            name.trim();

            //Note: It throws, the null-pointer exception at line 14, in case of not handling exception mechanism

        } catch (Exception e) {
            System.out.println("Now, it can be handled.");
        }

    }
};




