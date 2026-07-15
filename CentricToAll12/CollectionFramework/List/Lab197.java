package CentricToAll12.CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab197
{
    public static void main(String[] args){

        //Invoking both String and Integer objects using iterator interface

        List<String> List1=new LinkedList<>();
        List1.add("Abhilash");
        List1.add("Sharma");
        List1.add("Vemula");
        System.out.println(List1);

        List<Integer> List2=new LinkedList<>();
        List2.add(1);
        List2.add(2);
        List2.add(3);
        System.out.println(List2);

      //Using the iterator approach for both objects
        Iterator iterator1= List1.iterator();
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }

        Iterator iterator2= List2.iterator();
        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }
        }
    }