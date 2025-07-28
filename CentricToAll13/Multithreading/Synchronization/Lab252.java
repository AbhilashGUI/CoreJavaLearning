package CentricToAll13.Multithreading.Synchronization;

public class Lab252 {

public static void main(String[] args)
{
    //Two method in one class sync with m1 and m2.
    //One method is synchronized and other is not
    //Thread G,H
    //Thread G calling m1,s1 and Thread H calling m1 with s2
    //May be inconsistent result due to lock on one method
    //Thread will  run Concurrently


Sync2 s1 = new Sync2();
//Sync s2=new Sync();
G g = new G(s1, "Thread G");
g.start();
H h = new H(s1, "Thread H");
h.start();


}
}


class G extends Thread {
    Sync2 s;

    public G(Sync2 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }

}

class H extends Thread {
   Sync2 s;

    public H(Sync2 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }

}

class Sync3 {
    synchronized void m1() {
        Thread t1 = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(t1.getName() + " -m1 " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

 void m2() {   //Still it is executing step by step, as "synchronized"
        Thread t2 = Thread.currentThread();
        for (int i = 100; i < 105; i++) {
            System.out.println(t2.getName() + " -m2 " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}


