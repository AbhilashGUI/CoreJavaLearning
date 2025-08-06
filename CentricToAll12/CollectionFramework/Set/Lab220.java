package CentricToAll12.CollectionFramework.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab220
{
    public static void main(String[] args)
    {

        Set Tiertypes=new TreeSet();
        Tiertypes.add(3);
        Tiertypes.add(4);
        Tiertypes.add(1);
        Tiertypes.add(2);
        Tiertypes.add(4);
        System.out.println("They are divided into:");

        //It sort in the alphabetical order
        Iterator it=Tiertypes.iterator();
        //Tiertypes.add(5);  //It throws a concurrent modificaton exception
        while (it.hasNext())
        {
            System.out.println(it.next());
        }




    }
}
