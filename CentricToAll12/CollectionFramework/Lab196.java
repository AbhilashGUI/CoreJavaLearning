package CentricToAll12.CollectionFramework;

import java.util.Vector;

public class Lab196
{
    public static void main(String[] args)
    {
        Vector v= new Vector<>();     //Note: Vector is a threadsafe(Executing one program at a time) . It is similar like arraylist
        v.add("Abhilash");
        v.add("Sharma");
        v.add("Vemula");

        System.out.println(v);
    }
}
