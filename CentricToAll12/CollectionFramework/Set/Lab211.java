package CentricToAll12.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab211
{
    public static void main(String[] args)
    {
        Set Fruits= new HashSet();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Guava");
        Fruits.add("Orange");
        Fruits.add("Watermelon");
        Fruits.add("apple");//Note:It doesn't follow any order
        Fruits.add("Guava");//Note: It doesn't allow the duplicate elements


        //Verifying some functions
        System.out.println(Fruits);
        System.out.println(Fruits.size());
        System.out.println(Fruits.remove("apple"));
        System.out.println(Fruits);
        System.out.println(Fruits.isEmpty());
        System.out.println(Fruits.contains("apple"));










    }
}
