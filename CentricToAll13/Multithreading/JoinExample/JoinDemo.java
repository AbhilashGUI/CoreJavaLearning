package CentricToAll13.Multithreading.JoinExample;

public class JoinDemo {
    //join is used to join one thread at the end of the another thread.
    //we are starting the thread1 and joining the thread1 with main thread.
    //It is displaying the results in sync form
    public static void main(String[] args) throws InterruptedException {


      Work work= new Work();
      MyThread thread=new MyThread(work,"Thread-A");
      thread.start();
      thread.join();
      Thread thread1=Thread.currentThread();
      for (int i=0;i<5;i++)
      {
          System.out.println(thread1.getName()+"--"+i);
      }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class MyThread extends Thread
{
    public MyThread( Work work,String name) {
        super(name);
        this.work = work;
    }

    Work work;

    public void run()
    {
        work.efforts();
    }
}

class Work{
    void efforts()
    {
        Thread t1= Thread.currentThread();
        for (int i=0;i<5;i++)
        {
            System.out.println(t1.getName()+ "--"+i);
            }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
