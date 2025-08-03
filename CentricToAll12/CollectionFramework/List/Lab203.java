package CentricToAll12.CollectionFramework.List;

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

        List coursefee=new LinkedList<>();
        coursefee.add(10000);
        coursefee.add(9000);
        coursefee.add(8000);
        coursefee.add(7000);
        coursefee.add(6000);
        System.out.println(coursefee);


        onlinetutorials.addAll(coursefee);
        System.out.println(onlinetutorials);

        //Using iterator interface

        Iterator iterator=onlinetutorials.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }




    }
}
