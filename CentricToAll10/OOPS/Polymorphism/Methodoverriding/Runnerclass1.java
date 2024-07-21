package CentricToAll10.OOPS.Polymorphism.Methodoverriding;

public class Runnerclass1
{

    public static void main(String[] args)
    {
       //Parent class to parent object
        Humans h=new Humans();
        h.existence();
      //Parent class to child object
        Humans h1=new Male();
        h1.existence();

        Humans h2=new Female();
        h2.existence();






    }


}
