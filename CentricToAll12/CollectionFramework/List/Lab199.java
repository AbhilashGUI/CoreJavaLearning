package CentricToAll12.CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab199
{
    public static void main(String[] args)
    {
        //Invoking specific object
        List<Integer> mynumlist=new LinkedList<>();
        mynumlist.add(10);
        mynumlist.add(20);
        mynumlist.add(30);
        System.out.println(mynumlist);

        Iterator iterator=mynumlist.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



    }




}
