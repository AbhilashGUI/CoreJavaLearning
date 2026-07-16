package CentricToAll12.CollectionFramework.Map;


import java.util.HashMap;
import java.util.Map;

public class Lab226 {
    public static void main(String[] args) {


         Map<String,Integer> Googleproducts1=new HashMap<>();//Un-ordered form
        //Note Key should be string and value should be Integer
        //put() is used to associate the specified value with the specified key in the map
        //Note: Key should be unique and value can be duplicate as well

        Googleproducts1.put("Androidos",1);
        Googleproducts1.put("AndroidTv",2);
        Googleproducts1.put("GoogleCalender",3);
        Googleproducts1.put("GoogleSearchengine",4);
        Googleproducts1.put("Googlecontacts",5);
        Googleproducts1.put("Googledoc",6);
        Googleproducts1.put("Googledrive",7);
        Googleproducts1.put("Googlebrowser",8);
        Googleproducts1.put("Googlecast",9);
        Googleproducts1.put("Googleforms",10);
        System.out.println(Googleproducts1);
        System.out.println(Googleproducts1.isEmpty());
        System.out.println(Googleproducts1.containsKey("Googlecast"));//Returns the boolean value, if the key defined
        System.out.println(Googleproducts1.containsValue(4));//Returns the boolean value, if the value defined
        System.out.println(Googleproducts1.get("Googledrive"));//Returns the value
        System.out.println(Googleproducts1.keySet());//Returns set of keys in the list
        System.out.println(Googleproducts1.values());//Returns set of values in the list

        //Note: There is no iterator in MAP interface. However using the enhanced forloop, whose syntax is unique.

        for(Map.Entry<String,Integer> item: Googleproducts1.entrySet())
        {
            System.out.println(item.getKey() + "-->"+item.getValue());
        }

    }
}









