package CentricToAll13.Multithreading.DeadLock;

public class ThreadDeadlock {
    public static void main(String[] args) {
        final String resource1 = "Abhilash";
        final String resource2 = "Vicky";

        //T1 tries to lock resource1 and resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread1: Locked resource r1");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    synchronized (resource2) {
                        System.out.println("Thread2: Locked resource r2");
                    }
                }
            }
        };

        Thread t2=new Thread()
        {
            public void run()
            {
                synchronized (resource2){
                    System.out.println("Thread2:Locked resource r2");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e) {
                    }
                        synchronized (resource2){
                            System.out.println("Thread2:Locked resource r1");
                        }
                    }
            }

        };
       t1.start();
       t2.start();


        }
    }


















