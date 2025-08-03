package CentricToAll12.CollectionFramework.List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lab204
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



        //Using ListIterator interface
        //Note: It is mandate to use size() function, if using list-iterator to print the elements in reverse direction


        ListIterator lt=onlinetutorials.listIterator(onlinetutorials.size());
        while (lt.hasPrevious())
        {
            System.out.println(lt.previous());
        }

    }
}

