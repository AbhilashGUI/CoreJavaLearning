package CentricToAll13.Multithreading.Synchronization;

public class Lab253
{
    public static void main(String[] args)
    {

        //Two method in one class sync with m1 and m2.
        //One method is synchronized and other is static synchronized
        //Thread I,J
        //Thread I calling m1,s1 and Thread J calling m1 with s2
        //May be inconsistent result due to lock on one method
        //Thread will  run Concurrently

    Sync4 s1 = new Sync4();
    //Sync s2=new Sync();
    I i = new I(s1, "Thread I");
     i.start();
    J j = new J(s1, "Thread J");
     j.start();


}
}


class I extends Thread {
    Sync4 s;

    public I(Sync4 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }

}

class J extends Thread {
    Sync4 s;

    public J(Sync4 s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }

}

class Sync4 {
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



//Since, we are using the synchronized keyword for the one method and static keyword for other method.
// Flow is not seen random order
