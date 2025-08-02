package CentricToAll11.CustomizedExceptions;

public class Lab187 {
  public static void main(String[] args) throws  Exception{
    name("abhilash");


  }

  //Note:It is mandate to pass a "throws exception" in the function and also in the main method

  static void name(String person) throws Exception{
    if (person.equals("Abhilash"))
    //Note: Since the condition is false, get to see the customized exception

    {
      throw new ArithmeticException();
    }
    System.out.println("Throwing a Customized Exception");

  }
}



