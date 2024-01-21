package CentricToAll10.OOPS.Innerclasses;

public class Anonymousclass2
{
    public static void main(String[] args)
    {

        Thread t=new Thread(){   //Can also create a anonymous class, just by @Override and function.
            @Override
            public void run()
            {
                System.out.println("I am a new THREAD!");
            }
        };

        t.run();  //Note. We are calling the function using the reference. "NOT THE OBJECT"


    }
}
