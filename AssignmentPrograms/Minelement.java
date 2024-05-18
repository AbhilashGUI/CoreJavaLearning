package AssignmentPrograms;

public class Minelement
{
    public static void main(String[] args)
    {
        //Minimum element in an array
        int[] array={14,36,64,1,3,54,};
        int min=array[0];

        for (int i = 0; i < array.length; i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }

        }

        System.out.println("The smallest number in an array : "+ min);







    }
}
