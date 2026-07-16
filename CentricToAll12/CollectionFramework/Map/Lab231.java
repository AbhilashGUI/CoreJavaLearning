package CentricToAll12.CollectionFramework.Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Lab231
{
    public static void main(String[] args)
    {

        Map<Integer,String> hashtable=new Hashtable<>();  //In descending order
        hashtable.put(1, "Abhilash");
        hashtable.put(2, "Sharma");
        hashtable.put(3, "Vemula");

        Enumeration<Integer> e = ((Hashtable<Integer, String>) hashtable).keys();

        // Iterating through the Hashtable object

        // Checking for next element in Hashtable object with the help of hasMoreElements() method
        while (e.hasMoreElements()) {

            // Getting the key of a particular entry
            int key = e.nextElement();

            // Print and display the Rank and Name
            System.out.println("Rank : " + key
                    + "\t Name : "
                    + hashtable.get(key));
        }


//Existing code
    }
}




