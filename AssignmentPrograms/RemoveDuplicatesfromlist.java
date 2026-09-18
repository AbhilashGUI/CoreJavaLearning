package AssignmentPrograms;


import java.util.*;

public class RemoveDuplicatesfromlist{

    public static void main(String[] args)
    {
        List<Integer> numbers= new ArrayList<>(Arrays.asList(10,20,30,40,50,20,40,10));

        System.out.println("Original numbers: "+numbers);


        Set<Integer> uniquenumbers=new LinkedHashSet<>(numbers);

        List<Integer>  result= new ArrayList<>(uniquenumbers);

        System.out.println("List after removing the duplicates: "+result);


    }
}