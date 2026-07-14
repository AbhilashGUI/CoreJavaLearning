package CentricToAll10.OOPS.Exceptions;

public class Lab179 {
    public static void main(String[] args)
    {

        //Note: Handling the arithmetic exception, by using try catch (Customized error)
        try {
            int a = 0;
            int b = 10 / a;
        }catch (ArithmeticException e)
        {
            System.out.println("Exit the code, since i'm aware about the kind of exception");
            //System.exit(0);     //exit function : Does not allows to execute finally statement
        }
        finally {
            {
                System.out.println("Disabled the exit line, so that finally block gets executed");
            }
        }


    }
}
