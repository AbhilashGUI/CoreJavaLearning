package CentricToAll10.OOPS.Exceptions;

public class Lab176
{
    public static void main(String[] args)
    {
      try {
          String str= args[0];
          int a= Integer.parseInt(str);
          int b= 10/a;

      } catch (ArrayIndexOutOfBoundsException| NumberFormatException | ArithmeticException e)
      {
          System.out.println(e.getMessage());
          //e.printStackTrace();
      }

      //Note: Not passing  Int in CLA, resulting as "Index 0 out of bounds for length 0"
      //Note: Passing  String in CLA, resulting as   For input string: "Abhilash"
      //Note: Passing 0 in CLA, resulting as "/ by zero
      try{

          String str=args[5];                     //re-try of same by adding try block
          int b= Integer.parseInt(str);
          int c=b/10;
      }

        catch (Exception e)
        {                 //Adding multiple catch block, In case of different from above exceptions
          System.out.println(e.getMessage());
        }

      finally
      {
         System.out.println("Mandatory executed");      //Finally keyword statement will be executed for sure.
      }
    }







}
