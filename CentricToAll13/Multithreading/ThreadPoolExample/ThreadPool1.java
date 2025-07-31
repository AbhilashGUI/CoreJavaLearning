package CentricToAll13.Multithreading.ThreadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {

    public static void main(String[] args)
    {

        ExecutorService es1= Executors.newFixedThreadPool(1);
        ExecutorService es2= Executors.newFixedThreadPool(2);

        for(int i=0;i<=1;i++)
        {
            es1.execute(new Mythread());
        }

        for (int i=2;i<=3;i++)
        {
            es2.execute(new Mythread());
        }

        es1.shutdown();
        es2.shutdown();
    }
}


class Mythread implements Runnable {
    public void run() {
        Thread t1 = Thread.currentThread();
        for (int i = 1; i <= 2; i++) {
            System.out.println(i + " is worked and displayed by" + t1.getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}