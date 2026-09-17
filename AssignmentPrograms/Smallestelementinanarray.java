package AssignmentPrograms;

public class Smallestelementinanarray
{
    public static void main(String[] args)
    {
        int[] array={36,45,84,14,74,63,45,78};

        int smallest=array[0];

        for (int i=0;i<=array.length-1;i++)
        {
            if (array[i]<smallest)
            {
                smallest=array[i];
            }
        }

      System.out.println("The smallest number in an array: "+smallest);


    }
}
