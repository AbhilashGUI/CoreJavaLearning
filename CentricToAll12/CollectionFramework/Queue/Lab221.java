package CentricToAll12.CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab221
{
    public static void main(String[] args)
    {
        //It follows FIFO Approach : It is  used for insertion and deletion of elements from a queue.
        //It displays the output in natural ordering

        Queue JerseyNumber=new PriorityQueue();
        JerseyNumber.offer(19);
        JerseyNumber.offer(7);    //Captain cool(Retired)
        JerseyNumber.offer(18);   //Run machine
        JerseyNumber.offer(3);     //Baji(Retired)
        JerseyNumber.offer(10);    //Masterblaster(Retired)
        JerseyNumber.offer(5);     //Fiery(Retired)

        //offer() function is used to insert specified element in priority queue.

       System.out.println(JerseyNumber);

       JerseyNumber.add(45);      //Hitman add() function adds at the end in the element
        //JerseyNumber.add(null);  It throws nullpointerexceptionerror.

       System.out.println(JerseyNumber);


       System.out.println(JerseyNumber.peek());  //Displays the number
       System.out.println(JerseyNumber.poll());  //Removes the top element from the list permanently
       System.out.println(JerseyNumber);
       System.out.println(JerseyNumber.element());


    }
}
