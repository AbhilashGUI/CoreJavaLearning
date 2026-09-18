package AssignmentPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsinlist {

    public static void main(String[] args)
    {
        List<Integer> numbers=new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(60);
        numbers.add(100);
        numbers.add(60);
        numbers.add(40);

        Set<Integer> uniquenumbers=new HashSet<>();
        Set<Integer> duplicatenumbers=new HashSet<>();

        for (int number: numbers)
        {
            if (!uniquenumbers.add(number))
            {
                duplicatenumbers.add(number);
            }
        }
        System.out.println("List: "+numbers);
        System.out.println("Duplicate numbers: "+duplicatenumbers);
    }
}