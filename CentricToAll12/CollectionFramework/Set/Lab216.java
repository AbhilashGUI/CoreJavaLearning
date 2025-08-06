package CentricToAll12.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab216
{
    public static void main(String[] args)
    {
        //List of Tier2 cities sort in the defined order and no duplicates allowed

        Set Tier2Cities=new LinkedHashSet();
        Tier2Cities.add("Amritsar");
        Tier2Cities.add("Bhopal");
        Tier2Cities.add("Bhubaneswar");
        Tier2Cities.add("Chandigarh");
        Tier2Cities.add("Faridabad");
        Tier2Cities.add("Ghaziabad");
        Tier2Cities.add("Jamshedpur");
        Tier2Cities.add("Jaipur");
        Tier2Cities.add("Kochi");
        Tier2Cities.add("Lucknow");
        Tier2Cities.add("Nagpur");
        Tier2Cities.add("Patna");
        Tier2Cities.add("Raipur");
        Tier2Cities.add("Surat");
        Tier2Cities.add("Visakhapatnam");
        Tier2Cities.add("Agra");
        Tier2Cities.add("Ajmer");
        Tier2Cities.add("Kanpur");
        Tier2Cities.add("Mysore");
        Tier2Cities.add("Srinagar");
        Tier2Cities.add("Nagpur");

        System.out.println("Tier 2 cities known for-->Developing rapidly, good infrastructure, moderate cost of living, often considered emerging urban");

        Iterator it=Tier2Cities.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
