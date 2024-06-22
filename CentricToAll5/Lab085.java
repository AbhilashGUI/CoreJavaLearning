package CentricToAll5;

public class Lab085
{
    public static void main(String[] args)
    {
        //Since we are using the continue statement to execute odd condition. It prints all the even numbers
        for (int i = 1; i < 50; i++)
        {
            if(i%2==1)
            {
                continue; //It skips the condition in every iteration where ever it satisfies
            }
            System.out.println(i);
        }
    }
}


