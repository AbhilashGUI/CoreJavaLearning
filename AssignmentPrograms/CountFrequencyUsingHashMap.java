package AssignmentPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyUsingHashMap {

    public static void main(String[] args)
    {

        int[] numbers={10,20,30,40,10,20,30,20,40};

        Map<Integer,Integer> Frequencycount=new HashMap<>();

        for (int number: numbers)
        {
            if (Frequencycount.containsKey(number))
            {
                Frequencycount.put(number, Frequencycount.get(number)+1);
            }
            else
            {
                Frequencycount.put(number,1);
            }
        }

        System.out.println("Frequencycount of the number: ");
        for (Map.Entry<Integer,Integer> entry: Frequencycount.entrySet())
        {
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}