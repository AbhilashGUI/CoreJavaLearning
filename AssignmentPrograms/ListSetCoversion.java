package AssignmentPrograms;

import java.util.*;

public class ListSetCoversion {

    public static void main(String[] args)
    {

        List<Integer> numbers=new ArrayList<>(Arrays.asList(10,20,30,40,50,10,20));

        System.out.println("Original numbers :"+numbers);

        Set<Integer> numberset=new HashSet<>(numbers);
        System.out.println("Set :"+numberset);

        List<Integer> newlist=new ArrayList<>(numberset);
        System.out.println("After coverting to list: "+newlist);

    }
}
