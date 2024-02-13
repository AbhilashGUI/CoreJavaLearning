package CentricToAll13.Multithreading.Generics;

public class Lab237
{
    //Maximum of three numbers(Double) using the function

  public static void main(String[] args)
  {

      double Maxnum= MaximumofNumbers(42.12,12.37,39.23);
      System.out.println(Maxnum);


  }

  public static double MaximumofNumbers(double a, double b, double c)
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
