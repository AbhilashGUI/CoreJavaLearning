package CentricToAll11.CustomizedExceptions;

public class Lab187 {
  public static void main(String[] args) throws  Exception{
    main("Abhilash");


  }


  //Note:It is mandate to pass a "throws exception" in the function and also in the main method

  static void main(String a) throws Exception{
    if (a.equalsIgnoreCase("a"))
    //Note: Since the condition is false, get to see the customized exception

    {
      throw new ArithmeticException();
    }
    System.out.println("Throwing a Customized Exception");

  }
}



