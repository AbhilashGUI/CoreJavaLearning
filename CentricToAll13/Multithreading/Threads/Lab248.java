package CentricToAll13.Multithreading.Threads;

public class Lab248 {
    //Using Runnable interface

    public static void main(String[] args) {

        Runnable e1 = new Employee3();
        Thread t1 = new Thread(e1);
        t1.start();

        Runnable e2 = new Employee3();
        Thread t2 = new Thread(e2);
        t2.start();

        for (int i = 0; i < 5; i++) {
            {
                System.out.println(i + "--" + Thread.currentThread().getName());

            }

        }
    }
}

//Creating a thread by class and also passing the piece of code to be executed by main method, using runnable interface instead of extending thread

        class Employee3 implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        }

