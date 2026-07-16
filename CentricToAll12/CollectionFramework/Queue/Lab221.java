package CentricToAll12.CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab221
{
    public static void main(String[] args)
    {
        //It follows FIFO Approach : It is  used for insertion and deletion of elements from a queue.

        Queue JerseyNumber=new PriorityQueue();
        JerseyNumber.offer(19);   //Wall of indian cricet
        JerseyNumber.offer(7);    //Captain cool
        JerseyNumber.offer(18);   //Run machine
        JerseyNumber.offer(3);     //Baji
        JerseyNumber.offer(10);    //Masterblaster
        JerseyNumber.offer(5);     //Fiery
        JerseyNumber.offer(24);    //Bengal Tiger
        //JerseyNumber.offer("Abhilash");

        //offer() function is used to insert specified element in priority queue.
        //It does not maintain insertion order nor the full sorted order.
       System.out.println(JerseyNumber);

       JerseyNumber.add(45);      //Hitman add() function adds at the end in the element
        //JerseyNumber.add(null);  It throws nullpointerexceptionerror.
        JerseyNumber.add(73);

       System.out.println(JerseyNumber);


       System.out.println(JerseyNumber.peek());//Displays the first number
       System.out.println(JerseyNumber.poll());//Removes the top element from the list permanently
       System.out.println(JerseyNumber.element()); //Displays the first number
       System.out.println(JerseyNumber);


    }
}
