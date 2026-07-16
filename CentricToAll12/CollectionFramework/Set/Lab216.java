package CentricToAll12.CollectionFramework.Set;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab216
{
    public static void main(String[] args)
    {
        //List of Tier2 cities sort in the defined order/insertion order and no duplicates allowed

        Set Tier2_cities=new LinkedHashSet();
        Tier2_cities.add("Amritsar");
        Tier2_cities.add("Bhopal");
        Tier2_cities.add("Bhubaneswar");
        Tier2_cities.add("Chandigarh");
        Tier2_cities.add("Faridabad");
        Tier2_cities.add("Ghaziabad");
        Tier2_cities.add("Jamshedpur");
        Tier2_cities.add("Jaipur");
        Tier2_cities.add("Kochi");
        Tier2_cities.add("Lucknow");
        Tier2_cities.add("Nagpur");
        Tier2_cities.add("Patna");
        Tier2_cities.add("Raipur");
        Tier2_cities.add("Surat");
        Tier2_cities.add("Visakhapatnam");
        Tier2_cities.add("Agra");
        Tier2_cities.add("Ajmer");
        Tier2_cities.add("Kanpur");
        Tier2_cities.add("Mysore");
        Tier2_cities.add("Srinagar");
        Tier2_cities.add("Nagpur");

        System.out.println("Tier 2 cities known for-->Developing rapidly, good infrastructure, moderate cost of living, often considered emerging urban");



        Iterator iterator= Tier2_cities.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
