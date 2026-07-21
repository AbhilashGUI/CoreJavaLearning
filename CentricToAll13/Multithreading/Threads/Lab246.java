package CentricToAll13.Multithreading.Threads;

public class Lab246 {

    public static void main(String[] args)
    {

      Employee e1= new Employee();
      e1.start();

      Employee e2= new Employee();
      e2.start();

      for (int i=0;i<5;i++)
      {
          System.out.println(Thread.currentThread().getName());
          try {
              Thread.sleep(3000);
          } catch (Exception e) {
            e.printStackTrace();
          }
      }

    }
}

class Employee extends Thread
{
   public void run()
   {
       for (int i=0;i<5;i++)
       {
       System.out.println(Thread.currentThread().getName());
           try {
               Thread.sleep(3000);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
   }
}