package CentricToAll10.OOPS.Polymorphism.Methodoverriding;

public class Runnerclass1
{

    public static void main(String[] args)
    {
       //Parent class to parent object
        Humans humans=new Humans();
        humans.existence();

      //Parent class to child object
        Humans humans1=new Male();
        humans1.existence();

        Humans humans2=new Female();
        humans2.existence();






    }


}
