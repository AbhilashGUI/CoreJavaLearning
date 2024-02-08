package CentricToAll12.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab202
{
public static void main(String[] args)
{

    List Courseslist=new ArrayList<>();
    Courseslist.add("ATBJ");
    Courseslist.add("ATBP");
    Courseslist.add("MTB");
    Courseslist.add("SQL Masterclass");
    Courseslist.add("SDET");
    System.out.println(Courseslist);


    List numlist= new ArrayList<>();
    numlist.add(100);
    numlist.add(200);
    numlist.add(300);
    numlist.add(400);
    System.out.println(numlist);


    System.out.println();

    //ListIterator: Is only used in the list not in the  set and queue. It can be manipulated like addition and deletion is allowed.
    //It prints the data elements of list in the reverse/backward direction
    //Note: It is mandate to use size() function, if using list-iterator to print the elements in reverse direction

    ListIterator lt=Courseslist.listIterator(Courseslist.size());
    while (lt.hasPrevious())
    {
        System.out.println(lt.previous());
    }



}
}
