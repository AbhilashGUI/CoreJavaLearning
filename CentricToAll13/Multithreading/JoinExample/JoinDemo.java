package CentricToAll13.Multithreading.JoinExample;

public class JoinDemo
{
    //join is used to join one thread at the end of the another thread.
    // Since we are starting the thread1 and joining the thread1 with main thread.
    //It is displaying the results in sync form
    public static void main(String[] args) throws Exception {
        Work w1 = new Work();
        MyThread t1 = new MyThread(w1, "Thread A");
        t1.start();
        t1.join();   //If we comment join function,then the code prints in async mode
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " -- " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


class MyThread extends Thread {
    Work work;

    public MyThread(Work hello, String tname) {
        super(tname);
        this.work = hello;
    }

    public void run() {
        work.efforts();
    }
}

class Work {
    void efforts() {
        Thread t1 = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(t1.getName() + " -- " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e)
            {
                e.printStackTrace();

            }
        }
    }
}