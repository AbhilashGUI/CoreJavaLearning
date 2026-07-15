package CentricToAll12.CollectionFramework.List;

import java.util.*;

public class Lab202
{
public static void main(String[] args)
{

    List Courseslist=new ArrayList<>();
    Courseslist.add("ATB_Java");
    Courseslist.add("ATB_Python");
    Courseslist.add("MTB");
    Courseslist.add("SQL Masterclass");
    Courseslist.add("SDET");
    System.out.println(Courseslist);


    List Studentlist= new LinkedList<>();
    Studentlist.add(100);
    Studentlist.add(200);
    Studentlist.add(300);
    Studentlist.add(400);
    System.out.println(Studentlist);

    Studentlist.addAll(Courseslist);
    System.out.println();

    //ListIterator: Is only used in the list not in the  set and queue. It can be manipulated like addition and deletion is allowed.
    //It prints the data elements of list in the reverse/backward direction
    //Note: It is mandate to use size() function, if using list-iterator to print the elements in reverse direction


     ListIterator listIterator= Courseslist.listIterator(Courseslist.size());

      while (listIterator.hasPrevious())
      {
          System.out.println(listIterator.previous());
      }
}
}
