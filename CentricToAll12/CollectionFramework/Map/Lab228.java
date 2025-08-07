package CentricToAll12.CollectionFramework.Map;

import java.util.Map;
import java.util.TreeMap;

public class Lab228
{
    public static void main(String[] args)
    {

        Map<String,Integer> GoogleProducts3=new TreeMap<>();  //In Alphabetical  sequence
        GoogleProducts3.put("GoogleWallet",21);
        GoogleProducts3.put("GoogleWIFI",22);
        GoogleProducts3.put("GoogleLens",23);
        GoogleProducts3.put("GoogleMessages",24);
        GoogleProducts3.put("GooglePixel",25);
        GoogleProducts3.put("GooglePlayprotect",26);
        GoogleProducts3.put("GoogleSheets",27);
        GoogleProducts3.put("Googleone",28);
        GoogleProducts3.put("GoogleNest",29);
        GoogleProducts3.put("Youtube,Youtubekids,YoutubeMusic,YoutubeTv",30);


        //Enhanced for loop
        for (Map.Entry<String,Integer> item: GoogleProducts3.entrySet())
        {
            System.out.println(item.getKey()+ "-->" + item.getValue());
        }






    }
}
