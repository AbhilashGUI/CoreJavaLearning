package CentricToAll12.CollectionFramework.Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Lab230 {
    public static void main(String[] args) {

        Map<String, Integer> GoogleProducts5 = new Hashtable<>();     //Unordered form
        GoogleProducts5.put("Drawings", 41);
        GoogleProducts5.put("Finance", 42);
        GoogleProducts5.put("GoogleCulture & Arts", 43);
        GoogleProducts5.put("GoogleClassroom & Cast", 44);
        GoogleProducts5.put("GoogleGroups", 45);
        GoogleProducts5.put("GoogleInputtools", 46);
        GoogleProducts5.put("Google Translate", 47);
        GoogleProducts5.put("Google Shopping", 48);
        GoogleProducts5.put("GoogleCloudPrint,Store", 49);
        GoogleProducts5.put("GoogleExpeditions & Express", 50);
        //Enhanced for loop
        for (Map.Entry<String,Integer> item : GoogleProducts5.entrySet())
        {
            System.out.println(item.getKey() + "-->" + item.getValue());
        }



        }
    }
