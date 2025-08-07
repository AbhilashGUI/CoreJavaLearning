package CentricToAll12.CollectionFramework.Map;

import java.util.Map;
import java.util.WeakHashMap;

public class Lab229
{
    public static void main(String[] args)
    {
        Map<String,Integer> GoogleProducts4=new WeakHashMap<>(); //In random order
        GoogleProducts4.put("ChromeEnterprise",31);
        GoogleProducts4.put("ChromeBook",32);
        GoogleProducts4.put("GoogleEarth",33);
        GoogleProducts4.put("GoogleAlerts",34);
        GoogleProducts4.put("GoogleFit",35);
        GoogleProducts4.put("GoogleFont ,Cast",36);
        GoogleProducts4.put("GoogleKeep(Notes)",37);
        GoogleProducts4.put("GoogleNews,Podcast",38);
        GoogleProducts4.put("GoogleSites,Slides",39);
        GoogleProducts4.put("GoogleFlights,Travel",40);

        //Enhanced for loop
        for (Map.Entry<String,Integer> item: GoogleProducts4.entrySet())
        {
            System.out.println(item.getKey() + "-->" + item.getValue());
        }






    }
}
