package CentricToAll10.OOPS.Innerclasses;

public class Anonymousclass3
{
    public static void main(String args[])
    {
        Runnable r= new Runnable() {
            @Override
            public void run()  //Default function
            {
               System.out.println("I am a THREAD!");
            }
        };
       r.run();


    }
}
