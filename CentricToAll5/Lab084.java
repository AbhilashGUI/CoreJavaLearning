package CentricToAll5;

public class Lab084
{
    public static void main(String[] args)
    {
        //Since we are using the continue statement to execute even condition. It prints all the odd numbers
        for (int i = 0; i < 50; i++)
        {
            if(i%2==0)
            {
                continue; //It skips the condition in every iteration where ever it satisfies
            }
            System.out.println(i);
        }
    }
}
