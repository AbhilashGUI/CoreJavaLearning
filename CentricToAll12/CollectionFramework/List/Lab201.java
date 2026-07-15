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
    courseslist.add("ATB_Java");
    courseslist.add("ATB_Python");
    courseslist.add("MTB");
    courseslist.add("SQL_Masterclass");
    courseslist.add("SDET");
    System.out.println(courseslist);

    List studentslist=new LinkedList<>();
    studentslist.add(70);
    studentslist.add(150);
    studentslist.add(500);
    studentslist.add(400);

    //Ensure to do not assign a wrapper classes in the diamond operator, if you are using addAll function.

    courseslist.addAll(studentslist);    //Note: addAll() method is used to add all the specified elements to the collection
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
