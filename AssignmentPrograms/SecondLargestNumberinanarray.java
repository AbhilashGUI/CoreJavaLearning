package AssignmentPrograms;

public class SecondLargestNumberinanarray {

    public static void main(String[] args)
    {
        int[] numbers={10,25,5,40,30};

        int largest=numbers[0];
        int secondlargest=numbers[0];

        for (int i=1;i<=numbers.length-1;i++)
        {
            if (numbers[i]>largest)
            {
                secondlargest=largest;
                largest=numbers[i];
            }
            else if (numbers[i]>secondlargest && numbers[i] !=largest)
            {
                secondlargest=numbers[i];
            }
        }
        System.out.println("Largest number :"+largest);
        System.out.println("Second Number");

    }
}

