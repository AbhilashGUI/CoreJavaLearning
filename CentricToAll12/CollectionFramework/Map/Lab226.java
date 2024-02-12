package CentricToAll12.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab226 {
    public static void main(String[] args) {


        Map<String, Integer> Googleproducts = new HashMap<>();   //Un-ordered form
        //Note Key should be string and value should be Integer
        Googleproducts.put("AndroidOS", 1);  //put() is used to associate the specified value with the specified key in the map
        Googleproducts.put("AndroidTV", 2);
        Googleproducts.put("GoogleCalendar", 3);
        Googleproducts.put("GoogleSearchengine", 4);
        Googleproducts.put("GoogleContacts", 5);
        Googleproducts.put("GoogleDocs", 6);
        Googleproducts.put("GoogleDrive", 7);
        Googleproducts.put("ChromeBrowser", 8);
        Googleproducts.put("Chromecast", 9);
        Googleproducts.put("GoogleForms", 10);
        System.out.println(Googleproducts);
        System.out.println(Googleproducts.isEmpty());
        System.out.println(Googleproducts.size());
        System.out.println(Googleproducts.containsKey("lens"));  //Returns the boolean value, if the key defined
        System.out.println(Googleproducts.containsValue(7));     //Returns the boolean value, if the value defined
        System.out.println(Googleproducts.get("GoogleBrowser"));  //To fetch the defined key and Returns the boolean value.
        System.out.println(Googleproducts.keySet());  //Returns set of keys in the list
        System.out.println(Googleproducts.values());  //Returns set of values in the list

        //Note: There is no iterator in MAP interface. However using the forloop, whose syntax is unique.

        for (Map.Entry<String, Integer> item : Googleproducts.entrySet()) {
            System.out.println(item.getKey() + "-->" + item.getValue());
        }

    }
}









