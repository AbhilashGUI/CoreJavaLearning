package CentricToAll13.Multithreading.NonGenerics;

public class Lab237
{
    //Maximum of three numbers(Double) using the function

  public static void main(String[] args)
  {

      double Maxnum= MaximumNumber(42.12,12.37,39.23);
      System.out.println(Maxnum);


  }

    //Non-Generic, here we are specifying the datatype


    public static double MaximumNumber(double a, double b, double c)
  {
      double max=a;
      if (b>max)
      {
          max=b;
      }
      if (c>max)
      {
          max=c;
      }
      return max;



  }




}
