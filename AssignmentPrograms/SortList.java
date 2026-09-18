package AssignmentPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {


    public static void main(String[] args)
    {

        List<Integer> numbers=new ArrayList<>(Arrays.asList(10,50,60,20,40,30));

        System.out.println("Original List: "+ numbers);

        Collections.sort(numbers);

        System.out.println("Sorted list: "+numbers);

    }
}