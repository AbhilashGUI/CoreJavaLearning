package CentricToAll12.CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab193 {
    public static void main(String[] args) {

        //List mylist= new list()    ///Cannot create an object for list

        List mylist = new ArrayList();
        mylist.add("Abhilash");    //add function adds the element  in the arraylist
        mylist.add("Vemula");
        mylist.add(true);
        mylist.add(123);

        //System.out.println(mylist);
        mylist.set(1, "Sharma");            //set function is used to set/replace an element in the arraylist
        //System.out.println(mylist);
        mylist.remove(1);            //remove function is used to remove an element in the list.
        System.out.println(mylist);


        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }


        //Note: Below concept is an enhanced for loop

        for (Object O : mylist) {
            System.out.println(O);

        }
    }
}
