package CentricToAll12.CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class Lab218
{
    public static void main(String[] args)
    {
        //List of Tier4 cities
        Set Tier4Cities=new TreeSet();  //Treeset sort the elements in order. Since it is pre-order, verify the next
        Tier4Cities.add("Banswara");
        Tier4Cities.add("Bhadreswar");
        Tier4Cities.add("Sujangarh");  //It doesn't allow duplicate elements
        Tier4Cities.add("Chilakaluripet");
        Tier4Cities.add("Datia");
        Tier4Cities.add("Gangtok");
        Tier4Cities.add("Kalyani");
        Tier4Cities.add("Kapurthala");
        Tier4Cities.add("Kasganj");
        Tier4Cities.add("Nagda");
        Tier4Cities.add("Sujangarh");


        System.out.println(Tier4Cities);

    }
}
