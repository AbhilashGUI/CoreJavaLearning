package CentricToAll12.CollectionFramework.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab222
{
    public static void main(String[] args)
    {
        //It allows only the integer values, since we defined the integer in the diamond operator

        Queue<Integer> numset=new PriorityQueue<>();
        numset.offer(74);
        numset.offer(14);
        numset.offer(47);
        numset.offer(7);
        numset.offer(49);
        //numset.offer("Abhilash")
        System.out.println(numset);

        Iterator it=numset.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
