package CentricToAll10.OOPS.Exceptions;

public class Lab179
{

    public static void main(String args[])
    {
       try {
           String Amount_debited = "10000";
           int a = 0;
           int b = 10 / a;
       }catch(Exception e)
       {
           System.out.println("Due to technical glitch, amount was unable to withdraw. Debited amount will be credited in 24 hours");
       }


    }




}
