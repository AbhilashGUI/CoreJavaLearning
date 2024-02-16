package CentricToAll13.Multithreading.Synchronization;

public class Lab250 {

    public static void main(String[] args) {
        //Two method in one class sync with m1 and m2.
        //Not Synchronization
        //Thread C,D
        //Thread C calling m1,s1 and Thread D calling m1 with s2
        //May  inconsistent result due to they are working on a same object
        //Thread will run Concurrently


        Sync s1 = new Sync();
        //Sync s2=new Sync();
        C c = new C(s1, "C");
        c.start();
        D d = new D(s1, "D");
        d.start();

    }
}



    class C extends Thread {
       Sync s;
        public C(Sync s, String tname)
        {
            super(tname);
            this.s = s;
        }

        public void  run()
        {
            s.m1();
        }

    }

    class D extends Thread {
       Sync s;
        public D(Sync s, String tname)
        {
            super(tname);
            this.s = s;
        }

        public void  run()
        {
            s.m2();
        }

    }

    class Sync {
        void m1() {
            Thread t1 = Thread.currentThread();
            for (int i = 0; i < 5; i++) {
                System.out.println(t1.getName() + " -m1 " + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        }
        void m2 () {
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



