package CentricToAll12.CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab200
{
    public static void main(String[] args)
    {

        List<String> mylist=new LinkedList<>();
        mylist.add("Abhilash");
        mylist.add("Sharma");
        mylist.add("Vemula");
        //mylist.add(123);
        //mylist.add(true)
        //System.out.println(mylist);


        mylist.remove("Sharma");
        System.out.println(mylist);
        mylist.set(0,"Vicky");
        System.out.println(mylist);
        System.out.println(mylist.indexOf("Vemula"));


        Iterator iterator= mylist.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
