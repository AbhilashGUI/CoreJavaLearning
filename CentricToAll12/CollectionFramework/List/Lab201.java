package CentricToAll12.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab201
{
    public static void main(String[] args)
    {

    List courseslist=new ArrayList<>();
    courseslist.add("ATBJ");
    courseslist.add("ATBP");
    courseslist.add("MTB");
    courseslist.add("SQL Masterclass");
    courseslist.add("SDET");
    System.out.println(courseslist);

    List numlist=new LinkedList<>();
    numlist.add(100);
    numlist.add(200);
    numlist.add(300);
    numlist.add(400);

    //Ensue to do not assign a wrapper classes in the diamond operator, if you are using addAll function.

    courseslist.addAll(numlist);    //Note: addAll() method is used to add all the specified elements to the collection
    System.out.println(courseslist);

    System.out.println();

        //Note: Iterator interface cannot be manipulated. It prints the elements of list in forward direction
        Iterator iterator=courseslist.iterator();
        while (iterator.hasNext())

        {
            //courseslist.add("Gen AI");   Hence it throws an error as ConcurrentModificationException
            System.out.println(iterator.next());
        }


    }
}
