package CentricToAll13.Multithreading.Threads;

public class Lab248 {
    //Using Runnable interface

    public void main(String[] args) {

        Runnable r1 = new User();
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = new User();
        Thread t2 = new Thread(r2);
        t2.start();

        for (int i = 0; i < 5; i++) {

            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
    class User implements Runnable {

        public void run()
        {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
