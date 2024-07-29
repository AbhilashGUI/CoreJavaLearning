package CentricToAll10.OOPS.Innerclasses;

public class Anonymousclass3
{
    public static void main(String args[])
    {
        Runnable R= new Runnable() {
            @Override
            public void run()  //Default function
            {
               System.out.println("I am a THREAD!");
            }
        };
       R.run();


    }
}
