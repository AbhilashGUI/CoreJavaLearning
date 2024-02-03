package CentricToAll12.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab198
{
    public static void main(String[] args)
    {
        //Invoking  multi objects using the iterator interface

     List mylist=new LinkedList<>();     //Note:List is the PARENT class
     mylist.add("Vemula");               //Since we did not specified the diamond operator, it allows the object
     mylist.add("Abhilash");
     mylist.add("Sharma");
     mylist.add(123);
     mylist.add(true);
     System.out.println(mylist);


     Iterator iterator= mylist.iterator();
     while (iterator.hasNext())
     {
         System.out.println(iterator.next());
     }







    }
}
