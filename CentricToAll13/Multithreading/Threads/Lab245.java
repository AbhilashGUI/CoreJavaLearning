package CentricToAll13.Multithreading.Threads;

public class Lab245
{


    public static void main(String[] args)
    {


                    Worker w1=new Worker();
                    w1.start();   //To start the thread

                    Worker w2=new Worker();
                    w2.start();
    }


}


//Let's create a thread by class

class Worker extends Thread {    //Worker is a class extends from the thread, which has 2 functions start and run the threads

    @Override
    public void run() {       //To work the threads
        for (int i = 0; i < 5; i++)
            try {
                System.out.println(Thread.currentThread().getName());
                //currentthread()>returns a Thread object that represents the current thread
                Thread.sleep(2000);
            } catch (Exception e) {
                e.getStackTrace();
            }
    }
}
