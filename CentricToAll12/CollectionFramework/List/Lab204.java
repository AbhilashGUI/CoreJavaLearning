package CentricToAll12.CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lab204
{
    public static void main(String[] args)
    {
        List offlinetutorials=new LinkedList<>();
        offlinetutorials.add("NareshIT");
        offlinetutorials.add("Talkgross");
        offlinetutorials.add("Veda");
        System.out.println(offlinetutorials);

        List coursefee=new LinkedList<>();
        coursefee.add(10000);
        coursefee.add(9000);
        coursefee.add(8000);
        System.out.println(coursefee);



        //Using ListIterator interface
        //Note: It is mandate to use size() function, if using list-iterator to print the elements in reverse direction

        Iterator iterator= coursefee.iterator();
        while (iterator.hasNext())

        {
            System.out.println(iterator.next());
        }


        ListIterator lt= offlinetutorials.listIterator(offlinetutorials.size());
        while (lt.hasPrevious())
        {
            System.out.println(lt.previous());
        }

    }
}

