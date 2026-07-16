package CentricToAll12.CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class Lab218
{
    public static void main(String[] args)
    {
        //List of Tier4 cities
        Set Tier4_cities=new TreeSet();  //Treeset sort the elements in Alphabetical order. Since it is pre-order, verify the next
        Tier4_cities.add("Banswara");
        Tier4_cities.add("Bhadreswar");
        Tier4_cities.add("Sujangarh");  //It doesn't allow duplicate elements
        Tier4_cities.add("Chilakaluripet");
        Tier4_cities.add("Datia");
        Tier4_cities.add("Gangtok");
        Tier4_cities.add("Kalyani");
        Tier4_cities.add("Kapurthala");
        Tier4_cities.add("Kasganj");
        Tier4_cities.add("Nagda");
        Tier4_cities.add("Sujangarh");


        System.out.println(" The following cities falls under tier4--> "+Tier4_cities);

    }
}
