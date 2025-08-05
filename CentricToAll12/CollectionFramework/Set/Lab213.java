package CentricToAll12.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab213
{
    public static void main(String[] args)
    {

        //List of Tier1 cities
        Set<String> Tier1cities=new HashSet();
        Tier1cities.add("Bangalore");
        Tier1cities.add("Delhi");
        Tier1cities.add("Chennai");
        Tier1cities.add("Hyderabad");
        Tier1cities.add("Mumbai");
        Tier1cities.add("Pune");
        Tier1cities.add("Kolkata");
        Tier1cities.add("Ahmedabad");
        //Tier1cities.add(8);  Since we are specified strings in the diamond operators it restricts the int


        System.out.println("The following cities falls under Tier1 ==>" + Tier1cities);






    }
}
