package CentricToAll13.Multithreading.Threads;

public class Lab245
{
    public static void main(String[] args)
    {

        Worker worker= new Worker();
        worker.start();   //To start the thread

        Worker worker2= new Worker();
        worker2.start();

    }
}

class Worker extends Thread {   //Worker is a class extends from the thread, which has 2 functions start and run the threads

    public void run() {  //To work the threads
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}