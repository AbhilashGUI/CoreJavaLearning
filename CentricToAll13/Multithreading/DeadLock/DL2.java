package CentricToAll13.Multithreading.DeadLock;

public class DL2 {

    public static void main(String[] args)
    {

        deadlock2 dl= new deadlock2();
        Thread t1= new Thread(()->dl.m1(),"Thread 1");
        t1.start();
        Thread t2= new Thread(()->dl.m2(),"Thread 2");
        t2.start();


    }
}


class deadlock2
{
   private final Object resourceA= new Object();
   private final Object resourceB= new Object();

   public void m1() {
       synchronized (resourceA) {
           System.out.println(Thread.currentThread().getName() + " Locked resourceA ");
       }
       try {
           Thread.sleep(1000);
       } catch (Exception e) {
           e.printStackTrace();
       }
       synchronized (resourceB) {
           System.out.println(Thread.currentThread().getName() + " Locked resourceB");
       }
   }
       public void m2()
       {
           synchronized (resourceB)
           {
               System.out.println(Thread.currentThread().getName()+ " Locked resourceB ");
           }
           try {
               Thread.sleep(1000);
           }catch (Exception e)
           {
               e.printStackTrace();
           }
           synchronized (resourceA)
           {
               System.out.println(Thread.currentThread().getName()+" Locked resourceA");
           }
   }
}

