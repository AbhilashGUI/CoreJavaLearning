package CentricToAll11.CustomizedExceptions.CEE;

public class CustomException extends Exception
{
CustomException(String msg)
{
    super(msg);
    System.out.println("This is the Custom Exception");
}
}
