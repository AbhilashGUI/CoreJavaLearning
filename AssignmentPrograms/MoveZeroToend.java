package AssignmentPrograms;

import java.util.Arrays;

public class MoveZeroToend {

    public static void main(String[] args)
    {
      int[] numbers={0,10,0,20,0,30,40,0,50};

      int index=0;

     for (int number:numbers)
     {
         if (number != 0)
         {
             numbers[index]=number;
             index++;
         }
     }

     while (index<numbers.length)
     {
         numbers[index]=0;
         index++;
     }
     System.out.println("Arrays after moving zeros to end: ");
     System.out.println(Arrays.toString(numbers));
     }

    }