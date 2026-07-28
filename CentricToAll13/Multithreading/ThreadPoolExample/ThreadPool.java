package CentricToAll13.Multithreading.ThreadPoolExample;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String [] args)
    {

        Thread1 thread1= new Thread1();
        ExecutorService executorService1= Executors.newFixedThreadPool(1);
        for (int i=1;i<=2;i++)
        {
            executorService1.execute(thread1);
        }
        ExecutorService executorService2= Executors.newFixedThreadPool(2);
        for (int i=1;i<=2;i++)
        {
            executorService2.execute(thread1);
        }

            executorService1.shutdown();
            executorService2.shutdown();


    }



}


class Thread1 extends Thread
{
    public void run()
    {
        Thread thread=Thread.currentThread();
        for (int i=0;i<5;i++)
        {
            System.out.println(i+ " Worked and displayed by "+thread.getName());
        }

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
