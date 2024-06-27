package CentricToAll6;

public class Lab107
{
    public static void main(String[] args)
    {
        int[] array1={45,54,67,72,89};
        System.out.println("Length of array is " + array1.length);
        //System.out.println("Reference address "+ array1);

       //No. of indexes in an array
        System.out.println("Elements of an array are:");
        for (int i = 0; i <= array1.length-1; i++)
        {

            System.out.println(array1[i]);
        }

        System.out.println("Retrieving the Specific index from an array");
        System.out.println(array1[0]);
        }


    }



