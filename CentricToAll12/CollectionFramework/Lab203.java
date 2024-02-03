package CentricToAll12.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab203
{
    public static void main(String[] args)
    {
        List onlinetutorials=new LinkedList<>();
        onlinetutorials.add("Scaler");
        onlinetutorials.add("Coursera");
        onlinetutorials.add("The Testing Academy");
        onlinetutorials.add("Talentsprint");
        onlinetutorials.add("LinkedIn Learning");
        System.out.println(onlinetutorials);

        List fee=new LinkedList<>();
        fee.add(10000);
        fee.add(9000);
        fee.add(8000);
        fee.add(7000);
        fee.add(6000);
        System.out.println(fee);


        onlinetutorials.addAll(fee);
        System.out.println(onlinetutorials);


        System.out.println();

        //Using iterator interface

        Iterator iterator=onlinetutorials.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }




    }
}
