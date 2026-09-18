package AssignmentPrograms;

import java.util.HashSet;
import java.util.Set;

public class Duplicatewordsusingset {

    public static void main(String[] args)
    {

        String sentence= "Java is easy and Java is Powerful";

        String[] words= sentence.toLowerCase().split("\\s+");

        Set<String> uniquewords=new HashSet<>();
        Set<String> duplicatewords=new HashSet<>();

        for (String word:words)
        {
            if (!uniquewords.add(word))
            {
                duplicatewords.add(word);
            }
        }

        System.out.println("Duplicate words :"+duplicatewords);
    }
}