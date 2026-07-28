package CentricToAll13.Multithreading.JoinExample;

public class Joindemo2 {

    public static void main(String[] args) throws InterruptedException {
     Dailywages dailywages= new Dailywages();
     MyThread1 myThread1=new MyThread1("Thread-A",dailywages);
     myThread1.start();
     myThread1.join();
     Thread t2=Thread.currentThread();
     for (int i=0;i<5;i++)
     {
         System.out.println(t2.getName()+"--"+i);
         }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }

    }



class MyThread1 extends Thread
{
    public MyThread1(String threadname, Dailywages dailywages) {
        Threadname = threadname;
        this.dailywages = dailywages;
    }

    Dailywages dailywages;
    String Threadname;

    public void run()
    {
        Thread.currentThread().setName(Threadname);
        dailywages.Labour();
    }
}
class Dailywages
{
    void Labour()
    {
        Thread t1=Thread.currentThread();
        for(int i=0;i<5;i++)
        {
            System.out.println(t1.getName()+ "--"+i);
        }

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

