
package CentricToAll13.Multithreading.StackExample;


public class StackWaitNotify {
    public static void main(String[] args) {
        //Note: We have a stack class with 2 methods.
        //M1=push. In the push method the flag is set to be true,which wait for sometime and do a push method then notify the other thread
        //M2=pop.  In the pop method the flag is set to be false,Still the top element is present, it wait for sometime then notify and return x
        //Note; Incase of removing synchronized keyword, it  will throw an IllegalMonitorStateException.

        //The producer thread (A) waits whenever the buffer is full, the consumer thread (B) waits whenever the buffer is empty,
        // and wait()/notify() along with synchronized coordinate the two threads so they alternate safely without corrupting the shared data.


        Stack stack= new Stack();
        M object1= new M(stack,"M");
        N Object2= new N(stack,"N");

    }
}




class Stack{
    int i;
    boolean flag=false;

    synchronized void push(int i)
    {
        if(flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);

            }
        }
            this.i=i;
            System.out.println(i+ " is pushed ");
            flag=true;
            notify();
        }

        synchronized public int pop()
        {
            if(!flag)
            {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println(i+ " is poped ");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            flag=false;
            notify();
            return i;
        }

}

class M implements Runnable {
    Stack st = null;
    String name;

    public M(Stack st, String name) {
        this.st = st;
        this.name = name;


        Thread t1 = new Thread(this, name);
        t1.start();

    }

    public void run() {
        int a = 1;
        for (int i = 0; i < 5; i++) {
            st.push(a++);
        }
    }
}
    class N implements Runnable
    {
        Stack st= null;
        String name;
        public N(Stack st, String name) {
            this.st = st;
            this.name = name;

            Thread t2= new Thread(this,name);
            t2.start();
        }

        @Override
        public void run() {
            for (int i=0;i<5;i++)
            {
                st.pop();
            }
        }
    }

