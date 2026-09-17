package AssignmentPrograms;

public class SeparateEvenandOdd {

    public static void main(String [] args)
    {
        int[] numbers={10,15,20,25,30,35,40,45,50};

        System.out.println("Even numbers");

        for (int number:numbers)
        {
            if (number % 2==0)
            {
                System.out.println(number);
            }
        }

        System.out.println("Odd numbers");
        for (int number:numbers)
        {
            if (number %2 !=0)
            {
                System.out.println(number);
            }
        }




    }
}
