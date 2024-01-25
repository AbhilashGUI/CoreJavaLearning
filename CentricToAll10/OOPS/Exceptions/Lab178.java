package CentricToAll10.OOPS.Exceptions;

public class Lab178
{
    public static void main(String[] args)
    {

        //Note: Handling the arithmetic exception, by using try catch (Customized error)
      try {
          int a = 0;
          int b = 10 / a;
      }catch (Exception e)
      {
          System.out.println("Exit");
          //System.exit(0);     //exit function : Does not allows to execute finally statement.
      }

      //Since we are disabling the exit() function, it prints the finally block
      finally {
          {
              System.out.println("Mandate, incase of exit is disabled");
          }
      }


    }





}
