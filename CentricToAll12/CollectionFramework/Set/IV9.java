package CentricToAll12.CollectionFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class IV9
{
    public static void main(String [] args){

        Set TypesofOS=new HashSet();   //Unordered
        TypesofOS.add("IOS");
        TypesofOS.add("Android");
        TypesofOS.add("Windows");
        TypesofOS.add("MacOs");
        TypesofOS.add("ChromeOs");
        TypesofOS.add("Unix");
        TypesofOS.add("Linux");
        TypesofOS.add("Ubuntu");
        TypesofOS.add("Fedora");
        TypesofOS.add("BlackberryOs");
        TypesofOS.add(null);   //Allowed
        System.out.println(TypesofOS);


       Set TypesofOS2= new LinkedHashSet(); //Insertion order
       TypesofOS2.add("IOS");
       TypesofOS2.add("Android");
       TypesofOS2.add("Windows");
       TypesofOS2.add("MacOS");
       TypesofOS2.add("ChromeOS");
       TypesofOS2.add("Unix");
       TypesofOS2.add("Linux");
       TypesofOS2.add("Ubuntu");
       TypesofOS2.add("Fedora");
       TypesofOS2.add("BlackberryOS");
        TypesofOS2.add(null); //Allowed
       System.out.println(TypesofOS2);


       Set TypesofOS3=new TreeSet<>(); //Alphabetical order (sorting)
       TypesofOS3.add("IOS");
       TypesofOS3.add("Android");
       TypesofOS3.add("Windows");
       TypesofOS3.add("MacOs");
       TypesofOS3.add("ChromeOs");
       TypesofOS3.add("Unix");
        TypesofOS3.add("Linux");
        TypesofOS3.add("Ubuntu");
        TypesofOS3.add("Fedora");
        TypesofOS3.add("BlackberryOs");
        //TypesofOS3.add(null); It doesn't allow the null
        System.out.println(TypesofOS3);





    }
}
