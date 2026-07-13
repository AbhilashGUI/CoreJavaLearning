package CentricToAll10.OOPS.Exceptions;

public class Lab176
{
    public static void main(String[] args)
    {

        try {

        String string= args[0];
        int x= Integer.parseInt(string);
        int a= 20/x;
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        //Note: Not passing  Int in CLA, resulting as "Index 0 out of bounds for length 0"
        //Note: Passing  String in CLA, resulting as   For input string: "Abhilash"
        //Note: Passing 0 in CLA, resulting as "/ by zero

    try {
        String string2= args[10];
        int x= Integer.parseInt(string2);
        int b= 10/x;
    }catch(Exception e)
    {        //Adding multiple catch block, In case of different from above exceptions
        System.out.println(e.getMessage());
    }

    finally {
        System.out.println("Mandatory to execute");
    }


        //Finally keyword statement will be executed for sure.



    }
}