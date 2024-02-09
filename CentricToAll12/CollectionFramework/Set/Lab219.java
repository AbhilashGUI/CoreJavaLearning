package CentricToAll12.CollectionFramework.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab219
{
    public static void main(String[] args)
    {

        Set Tier4Cities=new TreeSet();
        Tier4Cities.add("Kasganj");
        Tier4Cities.add("Nagda");
        Tier4Cities.add("Datia");
        Tier4Cities.add("Gangtok");
        Tier4Cities.add("Banswara");
        Tier4Cities.add("Bhadreswar");
        Tier4Cities.add("Kalyani");
        Tier4Cities.add("Kapurthala");
        Tier4Cities.add("Sujangarh");            //It doesn't allow duplicate elements
        Tier4Cities.add("Chilakaluripet");

        Iterator it=Tier4Cities.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
