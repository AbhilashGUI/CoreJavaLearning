package CentricToAll13.Multithreading.Synchronization;

public class    Lab251 {
    public static void main(String[] args) {

            //Two method in one class sync with m1 and m2.
            //They are Synchronized
            //Thread E,F
            //Thread E calling m1,s1 and Thread F calling m1 with s2
            //Inconsistent result
            //Thread will  run Concurrently

            Sync2 s1 = new Sync2();
            //Sync s2=new Sync();
            E e = new E(s1, "Thread E");
            e.start();
            F f = new F(s1, "Thread F");
            f.start();


        }
    }


    class E extends Thread {
        Sync2 s;

        public E(Sync2 s, String tname) {
            super(tname);
            this.s = s;
        }

        public void run() {
            s.m1();
        }

    }

    class F extends Thread {
        Sync2 s;

        public F(Sync2 s, String tname) {
            super(tname);
            this.s = s;
        }

        public void run() {
            s.m2();
        }

    }

    class Sync2 {
        synchronized void m1() {       //Since, we are using the synchronized keyword for the defined methods. Flow is seen as one by one
            Thread t1 = Thread.currentThread();
            for (int i = 0; i < 5; i++) {
                System.out.println(t1.getName() + " -m1 " + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        }

        synchronized void m2() {   //Sync: Executes the threads one by one with the specified limitation
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


