package CentricToAll13.Multithreading.Threads;

public class Lab244
{
    public static void main(String[] args)
    {
        Thread t=Thread.currentThread();
        for (int i = 0; i < 10; i++)
        {
         System.out.println(t.getName() +  i  + "-" +t.getThreadGroup()+ "-"+t.getPriority());
        }

        //getName(): The getName() method of java Class class is used to get the name of the entity
        // and that entity can be class, interface, array, enum, method, etc. of the class object.

       //getThreadGroup: Is used to return the thread's thread group to which this thread belongs.

        //getPriority(): The getPriority() instance method returns the integer that represents its priority




//Results contains  Mainthread(main), GroupName and priority(5 by default)
        //ThreadGroup contains a set of therads
    }
}
