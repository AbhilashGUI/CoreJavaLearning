package CentricToAll13.Multithreading.ThreadPoolExample;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {

    public static void main(String[] args)
    {

        ExecutorService executorService1= Executors.newFixedThreadPool(1);
        ExecutorService executorService2= Executors.newFixedThreadPool(2);
        for (int i=0;i<=1;i++)
        {
            executorService1.execute(new Thread2());
        }
        for (int i=0;i<=1;i++)
        {
            executorService2.execute(new Thread2());
        }

        executorService1.shutdown();
        executorService2.shutdown();

    }

}


class Thread2 implements Runnable

{
    public void run()
    {
        Thread thread=Thread.currentThread();
        for (int i=0;i<2;i++)
        {
            System.out.println(i+" Worked and displayed by "+thread.getName());
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}