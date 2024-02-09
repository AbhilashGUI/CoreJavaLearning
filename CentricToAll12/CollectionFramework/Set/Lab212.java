package CentricToAll12.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab212
{
    public static void  main(String[] args)
    {

        Set pharmacy= new HashSet();
        pharmacy.add("FMCG Products");
        pharmacy.add("Health drinks");
        pharmacy.add("Surgical items");
        pharmacy.add("Snack items");
        pharmacy.add("Playing cards");
        System.out.println(pharmacy);

        System.out.println(pharmacy.remove("Snack items"));
        System.out.println(pharmacy.contains("Playing cards"));
        System.out.println(pharmacy.remove("Playing cards"));
        System.out.println(pharmacy.size());



    }
}
