package CentricToAll12.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class    Lab195
{
    public static void main(String[] args)
    {
        //Restricting the multi-datatypes
        List<Integer> List= new ArrayList<>();
        //mylist.add("Abhilash");    //add function adds the element  in the arraylist
        //mylist.add("Vemula");
        //mylist.add(true);
        List.add(123);
        List.add(45);


        System.out.println(List);
        List.set(1,456);           //set function is used to set/replace an element in the arraylist
        System.out.println(List);
        List.remove(1);            //remove function is used to remove an element in the list.
        System.out.println(List);

        System.out.println();

        //Note: Using three methods, to print the arraylist

        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }

        System.out.println();
        //Note: Below concept is an enhanced for loop

        for (Integer i : List) {    //Note: Since we are using the diamond operator enhanced for loop and in which we are defining the datatypes
            System.out.println(i);

        }
        System.out.println();

        //Iterator Approach:
        Iterator iterator= List.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}






