package CentricToAll12.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab194 {
    public static void main(String[] args) {

//Restricting the multi-datatypes by using  the diamond operator
        List<String> mylist = new ArrayList<>();
        mylist.add("Abhilash");    //add function adds the element  in the arraylist
        mylist.add("Vemula");
        //mylist.add(true);
        //mylist.add(123);

        //System.out.println(mylist);
        mylist.set(1, "Sharma");            //set function is used to set/replace an element in the arraylist
        //System.out.println(mylist);
        mylist.remove(1);            //remove function is used to remove an element in the list.
        System.out.println(mylist);

        System.out.println();

        //Note: Using three methods, to print the arraylist

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
         System.out.println();

        //Note: Below concept is an enhanced for loop

        for (String S : mylist) {    //Note: Since we are using the diamond operator enhanced for loop and in which we are defining the datatypes
            System.out.println(S);

        }
        System.out.println();

        //Iterator Approach:
        Iterator iterator= mylist.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}


