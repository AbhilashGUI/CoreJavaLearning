package CentricToAll13.Multithreading.Synchronization;

public class Lab254
{
    public static void main(String[] args)
    {

        //Two method in one class sync with m1 and m2.
        //One method is synchronized and other is static synchronized
        //Thread K,L
        //Thread K calling m1,s1 and Thread L calling m1 with s2
        //May be inconsistent result due to lock on one method
        //Thread will  run Concurrently




        Sync5 s1 = new Sync5();
        //Sync s2=new Sync();
        K k = new K(s1, "K");
        k.start();
        L l = new L(s1, "L");
        l.start();


    }
}


class K extends Thread {
    Sync5 s;

    public K(Sync5 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }

}

class L extends Thread {
    Sync5 s;

    public L(Sync5 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }

}

class Sync5 {
   static synchronized void m1() {
        Thread t1 = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(t1.getName() + " -m1 " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    static synchronized void m2() {   //Still it is executing step by step
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






//Since, we are using the static synchronized keyword for the both methods. Flow is seen as one by one


