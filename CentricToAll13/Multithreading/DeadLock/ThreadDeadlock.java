package CentricToAll13.Multithreading.DeadLock;

public class ThreadDeadlock {
    public static void main(String[] args) {

        //Thread 1:
        //    Lock resource1
        //    ↓
        //    Wait for resource2
        //
        //Thread 2:
        //    Lock resource2
        //    ↓
        //    Wait for resource1

        //A deadlock occurs when two or more threads hold locks that the other threads need,
        // and each thread waits forever for the other to release its lock.


        final String Resource1="Abhilash";
        final String Resource2="Vicky";

        Thread t1= new Thread()
        {
            public void run()
            {
                synchronized (Resource1)
                {
                    System.out.println("Thread1: Locked resource r1");
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (Resource2)
                {
                    System.out.println("Thread1: Waits for resource r2");
                }
            }
        };

        Thread t2= new Thread()
                {
                 public void run()
                 {
                     synchronized (Resource2)
                     {
                         System.out.println("Thread2: Locked resource r2");
                     }
                     try {
                         Thread.sleep(1000);
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
                     synchronized (Resource1)
                     {
                         System.out.println("Thread2: Waits for resource r1");
                     }
                 }
                };

        t1.start();
        t2.start();


    }
}