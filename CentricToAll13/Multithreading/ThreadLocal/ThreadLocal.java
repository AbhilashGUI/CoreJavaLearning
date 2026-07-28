package CentricToAll13.Multithreading.ThreadLocal;

public class ThreadLocal
{
    public static void main(String[] args) throws InterruptedException {
        Unsafecounter usc= new Unsafecounter();
        Thread[] task= new Thread[100];

        for (int i=0;i<100;i++)
        {
            Thread t1= new Thread(() ->
            {
                for (int j=0;j<100;j++)
                    usc.increment();

                });

                  task[i]=t1;
                  t1.start();

            }

              for (int i=0;i<100;i++)
              {
                  task[i].join();
        }
       System.out.println(usc.count);

    }



}

class Unsafecounter
{
    int count=0;

    void increment()
    {
        count=count+1;
    }
}