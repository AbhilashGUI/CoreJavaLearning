package CentricToAll12.CollectionFramework.Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Lab231
{
    public static void main(String[] args)
    {

        Map<Integer,String> HT=new Hashtable<>();  //In descending order
        HT.put(1, "Abhilash");
        HT.put(2, "Sharma");
        HT.put(3, "Vemula");

        Enumeration<Integer> e = ((Hashtable<Integer, String>) HT).keys();

        // Iterating through the Hashtable object

        // Checking for next element in Hashtable object with the help of hasMoreElements() method
        while (e.hasMoreElements()) {

            // Getting the key of a particular entry
            int key = e.nextElement();

            // Print and display the Rank and Name
            System.out.println("Rank : " + key
                    + "\t Name : "
                    + HT.get(key));
        }



    }
}




