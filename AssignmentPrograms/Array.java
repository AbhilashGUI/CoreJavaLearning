package AssignmentPrograms;
import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        //Taking the user inputs(Integers) as an array

        Scanner sc=new Scanner(System.in);
        System.out.println("The the Size/Length of an array");
        int number=sc.nextInt();
        int[] array= new int[number];

          System.out.println("Enter the elements");
        for (int i = 0; i < number; i++)
        {
           array[i]=sc.nextInt();
        }

        System.out.println("Output of the program");

        for (int i = 0; i < number; i++) {
            System.out.println(array[i]);
        }
        sc.close();

        System.out.print("End of the program");

    }

}


