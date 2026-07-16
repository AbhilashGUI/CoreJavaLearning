package CentricToAll12.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab213
{
    public static void main(String[] args)
    {

        //List of Tier1 cities
        Set<String> Tier1_cities=new HashSet();
        Tier1_cities.add("Bangalore");
        Tier1_cities.add("Delhi");
        Tier1_cities.add("Chennai");
        Tier1_cities.add("Hyderabad");
        Tier1_cities.add("Mumbai");
        Tier1_cities.add("Pune");
        Tier1_cities.add("Kolkata");
        Tier1_cities.add("Ahmedabad");
        //Tier1_cities.add(8);  Since we are specified strings in the diamond operators it restricts the integer


        System.out.println("The following cities falls under Tier1 ==>" + Tier1_cities);






    }
}
