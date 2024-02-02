package CentricToAll12.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab197
{
    public static void main(String[] args){

        List<String> mylist=new LinkedList<>();
        mylist.add("Abhilash");
        mylist.add("Sharma");
        mylist.add("Vemula");
        System.out.println(mylist);

        List<Integer> mylist1=new LinkedList<>();
        mylist1.add(1);
        mylist1.add(2);
        mylist1.add(3);
        System.out.println(mylist1);

      //Using the iterator approach 
        Iterator iterator= mylist1.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
