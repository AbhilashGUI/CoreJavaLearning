package AssignmentPrograms;

import java.util.*;

public class CommonElementsUsingSet {

    public static void main(String[] args)
    {
        List<Integer> list1=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        List<Integer> list2=new ArrayList<>(Arrays.asList(30,40,50,60,70));

        Set<Integer> set=new HashSet<>(list1);
        Set<Integer> Commonelements=new HashSet<>();

        for (int number: list2)
        {
            if (set.contains(number))
            {
                Commonelements.add(number);
            }
        }
        System.out.println("CommonElements: "+Commonelements);
    }
}