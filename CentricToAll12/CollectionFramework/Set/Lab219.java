package CentricToAll12.CollectionFramework.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab219
{
    public static void main(String[] args)
    {

        Set Tier4_cities=new TreeSet();
        Tier4_cities.add("Kasganj");
        Tier4_cities.add("Nagda");
        Tier4_cities.add("Datia");
        Tier4_cities.add("Gangtok");
        Tier4_cities.add("Banswara");
        Tier4_cities.add("Bhadreswar");
        Tier4_cities.add("Kalyani");
        Tier4_cities.add("Kapurthala");
        Tier4_cities.add("Sujangarh");
        Tier4_cities.add("Chilakaluripet");
        //It doesn't allow duplicate elements
        Tier4_cities.add("Chilakaluripet");
       //It sort in the alphabetical order


        Iterator iterator=Tier4_cities.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
