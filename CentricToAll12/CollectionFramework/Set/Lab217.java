package CentricToAll12.CollectionFramework.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab217
{
    public static void main(String[] args)
    {
        //List of Tier3 cities
        Set Tier3_cities=new LinkedHashSet();   //It follows a sequence order as defined
        Tier3_cities.add("Etawah");
        Tier3_cities.add("Roorkee");
        Tier3_cities.add("Rajamundry");
        Tier3_cities.add("Bhatinda");
        Tier3_cities.add("Hajipur");
        Tier3_cities.add("Rohtak");
        Tier3_cities.add("Housar");
        Tier3_cities.add("Gandhinagar");
        Tier3_cities.add("Junagadh");
        Tier3_cities.add("Udaipur");
        Tier3_cities.add("Salem");
        Tier3_cities.add("Jhansi");
        Tier3_cities.add("Madurai");
        Tier3_cities.add("Vijaywada");
        Tier3_cities.add("Meerut");
        Tier3_cities.add("Mathura");
        Tier3_cities.add("Bikaner");      //It doesn't allow duplicate elements
        Tier3_cities.add("Cuttack");
        Tier3_cities.add("Vijayawada");
        Tier3_cities.add("Nashik");


        Iterator iterator= Tier3_cities.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
