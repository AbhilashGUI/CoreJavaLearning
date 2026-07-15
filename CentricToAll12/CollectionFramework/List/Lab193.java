package CentricToAll12.CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab193 {
    public static void main(String[] args) {

        //List setoflements= new List();
        //Cannot create an object for list

        List setofelements = new ArrayList<>();
        setofelements.add('V');
        setofelements.add("Abhilash");
        setofelements.add("Sharma");
        setofelements.add(32);
        setofelements.add(162.5f);

        System.out.println(setofelements);
        setofelements.set(3,30);
        setofelements.remove(2);
        System.out.println(setofelements);
        //add function adds the element  in the arraylist


        //set function is used to set/replace an element in the arraylist

        for (int i=0; i<setofelements.size();i++)
        {
            System.out.println(setofelements.get(i) );

        }

        //Note: Below concept is an enhanced for loop , it accepts all the datatypes

          for (Object o: setofelements)
          {
              System.out.println(o);
          }
    }
}
