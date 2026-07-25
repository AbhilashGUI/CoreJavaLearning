package CentricToAll13.Multithreading.Synchronization;

public class Lab250 {

    public static void main(String[] args) {
        //Two method in one class sync with m1 and m2.
        //Not Synchronization
        //Thread C,D
        //Thread C calling m1,s1 and Thread D calling m1, s2
        //May be inconsistent result due to they are working on a same object
        //Thread will run Concurrently

        Sync1 s1= new Sync1();
        //Sync1 s2= new Sync1();
        C c= new C(s1,"Thread C");
        c.start();
        D d= new D(s1,"Thread D");
        d.start();


    }
}


class C extends Thread {
    public C(Sync1 s, String name) {
        super(name);
        this.s = s;
    }

    Sync1 s;

    public void run() {
        s.m1();
    }
}
class  D extends Thread {

    public D(Sync1 s, String name) {
        super(name);
        this.s = s;
    }

    Sync1 s;

    public void run() {
        s.m2();
    }
}
    class Sync1 {
        void m1() {
            Thread t1 = Thread.currentThread();
            for (int i = 0; i < 5; i++) {
                System.out.println(t1.getName() + " -m1-" + i);
            }
            try {
                Thread.sleep(3000);
            } catch (Exception e) {

            }
        }

 void m2()
 {
     Thread t2= Thread.currentThread();
     for(int i=100;i<105;i++)
     {
         System.out.println(t2.getName()+ " -m2 "+i);
     }
     try {
         Thread.sleep(3000);
     } catch (Exception e) {

     }
 }
 }
