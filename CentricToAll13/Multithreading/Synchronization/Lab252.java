package CentricToAll13.Multithreading.Synchronization;

public class Lab252 {

    public static void main(String[] args) {
        //Two method in one class sync with m1 and m2.
        //One method is synchronized and other is non
        //Thread G,H
        //Thread G calling m1,s1 and Thread H calling m1 with s2
        //May be inconsistent result due to lock on one method
        //Thread will  run Concurrently

        Sync3 s1= new Sync3();
        Sync3 s2= new Sync3();
        G g = new G(s1,"Thread G");
        g.start();
        H h= new H(s1,"Thread H");
        h.start();


    }
}


class G extends Thread
{
    public G( Sync3 s,String name) {
        super(name);
        this.s = s;
    }

    Sync3 s;

    public void run()
    {
        s.m1();
    }
}

class H extends Thread
{
    public H( Sync3 s, String name) {
        super(name);
        this.s = s;
    }

    Sync3 s;

    public void run()
    {
        s.m2();
    }
}

class Sync3
{
    synchronized void m1()
    {
        Thread t1=Thread.currentThread();
        for(int i=0;i<5;i++)
        {
            System.out.println(t1.getName()+ " -m1-"+i);
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }

void m2()
{
    Thread t2= Thread.currentThread();
    for (int i=100;i<105;i++)
    {
        System.out.println(t2.getName()+ " -m2--"+i);
    }
    try {
        Thread.sleep(3000);
    } catch (Exception e) {

    }
}
}