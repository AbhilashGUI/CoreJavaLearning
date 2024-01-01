package CentricToAll5;

public class Lab085
{
    public static void main(String[] args)
    {
        //Since we are using the continue statement to execute odd condition. It prints all the even numbers
        for (int i = 1; i < 30; i++)
        {
            if(i%2==1)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}


