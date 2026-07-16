package CentricToAll12.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab212
{
    public static void  main(String[] args)
    {

        Set Pharmacy= new HashSet();
        Pharmacy.add("Medicines");
        Pharmacy.add("Surgicals");
        Pharmacy.add("FMCG");
        Pharmacy.add("Health drinks");
        Pharmacy.add("Snacks");
        Pharmacy.add("Soft drinks");

        System.out.println(Pharmacy);
        System.out.println(Pharmacy.size());
        System.out.println(Pharmacy.contains("Playing cards"));
        System.out.println(Pharmacy.remove("Snacks"));
        System.out.println(Pharmacy);



    }
}
