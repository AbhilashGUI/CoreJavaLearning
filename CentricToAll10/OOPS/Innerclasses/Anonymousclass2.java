package CentricToAll10.OOPS.Innerclasses;

public class Anonymousclass2 {

   public static void main(String [] args)
   {
       Thread thread= new Thread()
       {
           public void run()
           {
               System.out.println("I a new thread");
           }
       };
       thread.run();

   }
}