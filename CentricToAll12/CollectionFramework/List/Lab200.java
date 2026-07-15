package CentricToAll12.CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab200 {
    public static void main(String[] args) {
        //Restricting the other datatypes

        List<String> Selectedlist= new LinkedList<>();
        //Selectedlist.add('V');
        Selectedlist.add("Abhilash");
        Selectedlist.add("Sharma");
        //Selectedlist.add(123);

        Selectedlist.remove("Sharma");
        Selectedlist.add(1,"Vemula");

        Iterator iterator= Selectedlist.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}