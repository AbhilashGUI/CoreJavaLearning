package CentricToAll12.CollectionFramework.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab223
{
    public static void main(String[] args)
    {

        //For strings it follows as per FIFO
        Queue<String> Nameset=new PriorityQueue<String>();
        Nameset.offer("Abhilash");
        Nameset.offer("Akash");
        Nameset.offer("Advait");
        Nameset.offer("Aravind");
        Nameset.offer("Avinash");
        //Nameset.offer(123)
        System.out.println(Nameset);

        System.out.println(Nameset.peek());

        Iterator it= Nameset.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
