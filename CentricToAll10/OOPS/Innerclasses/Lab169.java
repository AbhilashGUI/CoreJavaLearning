package CentricToAll10.OOPS.Innerclasses;

public class Lab169 {

    public static void main(String[] args)
    {
        Abhilash abhilash= new Abhilash();
        Abhilash.Passionate passionate= new Abhilash.Passionate();
        abhilash.Striving();
        passionate.learning();
    }

    }



class Abhilash
{
    int age=30;
    void Striving()
    {
        System.out.println("Looking for a career transition into Automation");
    }

  static class Passionate
  {
      void learning()
      {
          //System.out.println(age);
          System.out.println("Upgrading skills");
      }
  }
}