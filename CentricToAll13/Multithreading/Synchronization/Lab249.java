package CentricToAll13.Multithreading.Synchronization;

public class Lab249 {
    public static void main(String[] args) {
        //Two methods in one class sync with m1 and m2.
        //Not Synchronization
        //Thread a,b
        //Thread a calling m1,s1 and Thread b  calling m2,s2
        //No inconsistent result
        //Thread will run Concurrently


        Sync s1= new Sync();
        Sync s2= new Sync();
        A a= new A(s1,"Thread A");
        a.start();
        B b= new B(s2,"Thread B");
        b.start();

    }
}


class  A extends Thread {
    public A(Sync s, String name) {
        super(name);
        this.s = s;
    }

    Sync s;

    public void run() {
        s.m1();
    }
}
    class  B extends Thread {
        public B(Sync s,String name) {
            super(name);
            this.s = s;
        }

        Sync s;

            public void run()
            {
                s.m2();

        }
    }

        class Sync {
            void m1() {
                Thread t1 = Thread.currentThread();
                for (int i = 0; i < 5; i++) {
                    System.out.println(t1.getName() + " -m1 " + i);
                }
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {

                }
            }

    void m2() {
        Thread t2 = Thread.currentThread();
        for (int i = 100; i < 105; i++) {
            System.out.println(t2.getName() + " -m2 " + i);
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }
        }



