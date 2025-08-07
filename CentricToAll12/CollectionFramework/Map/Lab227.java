package CentricToAll12.CollectionFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab227
{
    public static void main(String[] args)
    {

        Map<String,Integer> GoogleProducts2=new LinkedHashMap<>(); //As per Insertion order
        GoogleProducts2.put("Gboard",11);
        GoogleProducts2.put("Gmail",12);
        GoogleProducts2.put("GoogleAssistant",13);
        GoogleProducts2.put("GoogleChat",14);
        GoogleProducts2.put("GoogleMaps",15);
        GoogleProducts2.put("GooglePlay,PlayGames,PlayMovies and Tv,playbooks",16);
        GoogleProducts2.put("GoogleMeet",17);
        GoogleProducts2.put("Googlepay",18);
        GoogleProducts2.put("GooglePhotos",19);
        GoogleProducts2.put("GoogleTv",20);


         //Enhanced for loop
        for (Map.Entry<String, Integer> item :GoogleProducts2.entrySet()) {
            System.out.println(item.getKey() + "-->" + item.getValue());
        }



    }
}
