package CentricToAll12.CollectionFramework.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab217
{
    public static void main(String[] args)
    {
        //List of Tier3 cities
        Set Tier3Cities=new LinkedHashSet();   //It follows a sequence order as defined
        Tier3Cities.add("Etawah");
        Tier3Cities.add("Roorkee");
        Tier3Cities.add("Rajamundry");
        Tier3Cities.add("Bhatinda");
        Tier3Cities.add("Hajipur");
        Tier3Cities.add("Rohtak");
        Tier3Cities.add("Housar");
        Tier3Cities.add("Gandhinagar");
        Tier3Cities.add("Junagadh");
        Tier3Cities.add("Udaipur");
        Tier3Cities.add("Salem");
        Tier3Cities.add("Jhansi");
        Tier3Cities.add("Madurai");
        Tier3Cities.add("Vijaywada");
        Tier3Cities.add("Meerut");
        Tier3Cities.add("Mathura");
        Tier3Cities.add("Bikaner");      //It doesn't allow duplicate elements
        Tier3Cities.add("Cuttack");
        Tier3Cities.add("Vijayawada");
        Tier3Cities.add("Nashik");


        Iterator it= Tier3Cities.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
