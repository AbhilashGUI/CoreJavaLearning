package CentricToAll13.Multithreading.Threads;

public class Lab243 {

    public static void main(String[] args) throws InterruptedException
    {

     Thread t=Thread.currentThread();
     System.out.println(t);
     for(int i=0;i<10;i++)
     {
         System.out.println(i+ " "+t.getName());
         System.out.println(i+" "+t.getPriority());
         Thread.sleep(10000);
     }

//Results contains GroupName(1), Mainthread(main) and priority(5 by default)
    }
}
