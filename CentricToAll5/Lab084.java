package CentricToAll5;

public class Lab084
{
    public static void main(String[] args)
    {
        //Since we are using the continue statement to execute even condition. It prints all the odd numbers
        for (int i = 1; i < 30; i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
