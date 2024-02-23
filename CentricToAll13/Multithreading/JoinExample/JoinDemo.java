package CentricToAll13.Multithreading.JoinExample;

public class JoinDemo
{
    //join is used to join one thread at the end of the another thread. Since we are starting the thread1 and joining the thread1 with main thread.
    //It is displaying the results in sync form
    public static void main(String[] args) throws Exception {
        Work h1 = new Work();
        MyThread th1 = new MyThread(h1, "A");
        th1.start();
        th1.join();
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " -- " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
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
        work.show();
    }
}

class Work {
    void show() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " -- " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }
    }
}