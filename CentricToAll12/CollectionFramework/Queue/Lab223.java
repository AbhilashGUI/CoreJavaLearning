package CentricToAll12.CollectionFramework.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab223
{
    public static void main(String[] args)
    {

        //For Strings it follows as per FIFO
        Queue<String> Nameset=new PriorityQueue<>();
        Nameset.offer("Abhilash");
        Nameset.offer("Apurva");
        Nameset.offer("Suvan");
        Nameset.offer("Suraj");
        Nameset.offer("Nirmal");
        Nameset.offer("Nirmala");
        Nameset.offer("Ayush");
        Nameset.offer("Sana");
        Nameset.offer("Usha");
        Nameset.offer("Aravind");


        //Nameset.offer(123) //Specific datatype
        System.out.println(Nameset);

        System.out.println(Nameset.peek());

        Iterator it= Nameset.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
