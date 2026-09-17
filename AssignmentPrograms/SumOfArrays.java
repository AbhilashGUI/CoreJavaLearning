package AssignmentPrograms;

public class SumOfArrays {

    public static void main(String [] args)
    {

        int[] numbers={10,20,30,40,50};

        int sum=0;

        /***for (int i=0;i<numbers.length;i++)
        {
            sum=sum+numbers[i];
        }***/

        for (int number:numbers)
        {
            sum=sum+number;
        }
        System.out.println("Sum of elements = "+sum);

    }
}
