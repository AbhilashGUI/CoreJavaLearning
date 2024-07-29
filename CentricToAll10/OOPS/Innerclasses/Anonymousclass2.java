package CentricToAll10.OOPS.Innerclasses;

public class Anonymousclass2 {
    public static void main(String[] args) {

        //Anonymous class is widely used with threading concept

        Thread t= new Thread()
        {
           @Override
            public void run()
           {
               System.out.println("I am a new thread");
           }

        };
        t.run();

    }
}