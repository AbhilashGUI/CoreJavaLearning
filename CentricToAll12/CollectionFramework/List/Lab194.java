package CentricToAll12.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab194 {
    public static void main(String[] args) {

//Restricting the multi-datatypes by using  the diamond operator

      List<String> Listing= new ArrayList<>();
      //Listing.add('V')
      Listing.add("Abhilash");
      Listing.add("Shiva");
      System.out.println(Listing);


       Listing.set(0,"Lord");//set function is used to set/replace an element in the arraylist
       System.out.println(Listing);
       Listing.remove(0);//remove function is used to remove an element in the list.
        System.out.println(Listing);




        //Note: Using three methods, to print the arraylist

          for (int i=0; i<Listing.size();i++)
          {
              System.out.println(Listing.get(i));
          }

        //Note: Below concept is an enhanced for loop


              for (String s: Listing)
              {
                  System.out.println(s);
              }
            //Note: Since we are using the diamond operator enhanced for loop and in which we are defining the datatypes


             Iterator iterator= Listing.iterator();
              while (iterator.hasNext())
              {
                  System.out.println(iterator.next());
              }

        }

        //Iterator Approach:


}


