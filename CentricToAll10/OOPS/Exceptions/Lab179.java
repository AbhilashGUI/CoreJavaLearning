package CentricToAll10.OOPS.Exceptions;

public class Lab179 {
    public static void main(String[] args)
    {

        //Note: Handling the arithmetic exception, by using try catch (Customized error)
        try {
            int a = 0;
            int b = 10 / a;
        }catch (Exception e)
        {
            System.out.println("Exit");
            System.exit(0);     //exit function : Does not allows to execute finally statement
        }
        finally {
            {
                System.out.println("Mandate, incase of exit is disabled");
            }
        }


    }
}
