package CentricToAll12.CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab198
{
    public static void main(String[] args)
    {
        //Invoking  multi objects using the iterator interface

     List listofdata=new LinkedList<>();     //Note:List is the PARENT class
     listofdata.add('V');               //Since we did not specified the diamond operator, it allows the object
     listofdata.add("Abhilash");
     listofdata.add("Sharma");
     listofdata.add(123);
     listofdata.add(true);
     System.out.println(listofdata);


     Iterator iterator= listofdata.iterator();
     while (iterator.hasNext())
     {
         System.out.println(iterator.next());
     }







    }
}
