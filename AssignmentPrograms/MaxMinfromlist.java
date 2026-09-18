package AssignmentPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinfromlist {

    public static void main(String[] args)
    {

        List<Integer> numbers=new ArrayList<>(Arrays.asList(50,80,75,45,25,15,10));

        int Maximum= Collections.max(numbers);
        int Minimum= Collections.min(numbers);

        System.out.println("List: "+numbers);
        System.out.println("Maximum number: "+Maximum);
        System.out.println("Minimum number: "+Minimum);
    }
}
