package CentricToAll12.CollectionFramework.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab224
{
    public static void main(String[] args)
    {
        //It throws a ClassCastException:An unchecked exception that signals the code has attempted to cast a reference to a type of which it's not a subtype

        Queue CollarTypejobs=new PriorityQueue();
        CollarTypejobs.offer(1);
        CollarTypejobs.offer("Blue Collar : Get paid hourly basis");
        CollarTypejobs.offer(2);
        CollarTypejobs.offer("White Collar: Salaried Professional");
        CollarTypejobs.offer(3);
        CollarTypejobs.offer("Pink Collar: Service industry");

        Iterator it=CollarTypejobs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }




    }
}
