package AssignmentPrograms;

import java.util.*;

public class SortHashMapbyvalue {

    public static void main(String[] args) {

        Map<String,Integer> marks=new HashMap<>();
        marks.put("Abhilash",35);
        marks.put("Ashwin",70);
        marks.put("Akhil",60);
        marks.put("Akash",80);
        marks.put("Avinash",95);

        System.out.println("Original Hashmap:"+marks);

        List<Map.Entry<String,Integer>> entryList= new ArrayList<>(marks.entrySet());

        entryList.sort(Comparator.comparing(Map.Entry::getValue));

        System.out.println("\nHashmap sorted value:");

        for (Map.Entry<String,Integer> entry: marks.entrySet())
        {
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }

    }
}