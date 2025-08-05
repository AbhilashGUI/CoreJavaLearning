package CentricToAll12.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab211
{
    public static void main(String[] args)
    {
        Set fruits= new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Guava");
        System.out.println(fruits);  //Note:It doesn't follow any order
        fruits.add("Banana");
        System.out.println(fruits);  //Note: It doesn't allow the duplicate elements


        //Verifying some functions
        System.out.println(fruits.remove("Orange"));
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());//It returns boolean result
        System.out.println(fruits.contains("Orange"));//It returns boolean result







    }
}
