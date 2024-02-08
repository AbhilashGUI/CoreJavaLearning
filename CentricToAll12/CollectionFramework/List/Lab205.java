package CentricToAll12.CollectionFramework.List;

import java.util.Enumeration;
import java.util.Vector;

public class Lab205
{
    public static void main(String[] args)
    {
        Vector vector=new Vector<>();
        vector.add("Abhilash");
        vector.add(420);
        vector.add(false);


        Enumeration e= vector.elements();
        while (e.hasMoreElements())    //hasMoreElements() method contains more elements
        {
            System.out.println(e.nextElement());         //nextElement() method return next element of the enum
        }
//Note: These functions are used with enum only




    }
}
