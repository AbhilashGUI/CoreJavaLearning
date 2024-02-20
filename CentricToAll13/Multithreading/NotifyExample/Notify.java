package CentricToAll13.Multithreading.NotifyExample;

public class Notify
{
    public static void main(String[] args)
    {
        //Note: We have a stack class with 2 methods.
        //M1=push. In the push method the flag is set to be true,which wait for sometime and do a push method then notify the other thread
        //M2=pop.  In the pop method the flag is set to be false,Still the top element is present, it wait for sometime then notify and return x

        //Note; Incase of removing syn keyword, it  will throw an IllegalMonitorStateException.
        Stack st = new Stack();
        B obj2 = new B(st, "B");
        A obj1 = new A(st, "A");

    }
    }

    class Stack {
        int x;
        boolean flag = false;

        synchronized void push(int x) {
            if (flag) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            this.x = x;
            System.out.println(x + " is pushed..");
            flag = true;
            notify();
        }

        synchronized public int pop() {
            if (!flag) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println(x + " is poped");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            flag = false;
            notify();
            return x;
        }

    }

    class A implements Runnable {
        Stack st = null;

        A(Stack st, String name) {
            this.st = st;
            Thread t1 = new Thread(this, name);
            t1.start();
        }

        public void run() {
            int a = 1;
            for (int i = 0; i < 10; i++) {
                st.push(a++);
            }
        }
    }

    class B implements Runnable {
        Stack st = null;

        B(Stack st, String name) {
            this.st = st;
            Thread t2 = new Thread(this, name);
            t2.start();
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                st.pop();
            }
        }
    }


