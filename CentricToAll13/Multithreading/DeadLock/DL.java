package CentricToAll13.Multithreading.DeadLock;

public class DL {

    public static void main(String[] args)
    {


        //Thread A locks Resource 1 and waits for Resource 2.

        //Thread B locks Resource 2 and waits for Resource 1.

        //Neither thread can proceed, and both are stuck — this is a deadlock.


       deadlock dl= new deadlock();
       Thread t1= new Thread(()->dl.m1(),"Thread-A");
       Thread t2= new Thread(()->dl.m2(),"Thread-B");
       t1.start();
       t2.start();




    }

}


class deadlock
{

    private final Object lock1= new Object();
    private final Object lock2= new Object();

     public void m1() {
         synchronized (lock1) {
             System.out.println(Thread.currentThread().getName() + " locked lock1 ");
         }
         try {
             Thread.sleep(1000);
         } catch (Exception e) {
             e.printStackTrace();
         }
         synchronized (lock2) {
             System.out.println(Thread.currentThread().getName() + " locked lock2 ");
         }
     }

    public void m2() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " locked lock2 ");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " locked lock1 ");
        }
    }
}