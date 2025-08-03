package CentricToAll12.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab207
{
    public static void main(String[] args)
    {
        List <Integer> mymarks=new ArrayList<>();
        mymarks.add(76);
        mymarks.add(87);
        mymarks.add(98);
        mymarks.add(47);
        mymarks.add(64);
        Collections.sort(mymarks);
        //Is used to sort the data in the specified manner.It contains some functions to perform other operations
        System.out.println(mymarks);
        Collections.shuffle(mymarks);
        System.out.println(mymarks);



    }
}
