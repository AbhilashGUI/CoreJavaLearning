package CentricToAll13.Multithreading.JoinExample;

public class Joindemo2 {

    public static void main(String[] args) throws InterruptedException {

        Dailywages dw= new Dailywages();
        Mythread1 t1= new Mythread1("Labour",dw);
        t1.start();
        t1.join();
        Thread t2= Thread.currentThread();
        for(int i=0;i<=5;i++)
        {
            System.out.println(t2.getName()+i);
        }
        try
        {
            Thread.sleep(1500);
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}


class Mythread1 extends Thread
{
    Dailywages dw;
    String threadname;

    public Mythread1(String threadname, Dailywages dw) {
        super(threadname);
        this.dw = dw;
    }

   public void run()
   {
       Thread.currentThread().setName(threadname);
       dw.labour();
   }

}

class Dailywages{

    void labour()
    {
        Thread t1= Thread.currentThread();
        for(int i=0;i<=5;i++)
        {
            System.out.println(t1.getName()+i);
        }
        try
        {
            Thread.sleep(1500);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}