package CentricToAll10.OOPS.Innerclasses;

public class Anonymousclass3
{
    public static void main(String args[])
    {
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("This concept of runnable is used in the Threads");

            }
        };
        runnable.run();
    }
}
