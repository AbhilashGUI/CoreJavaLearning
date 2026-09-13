package CentricToAll5;

public class Lab080
{
    public static void main(String[] args)
    {

        for (int i=0;i<10;i++)
        {
            if (i==5)
            {
                 continue;
            }
            System.out.println("i = "+i);
        }
        System.out.println("It skips the respective condition and prints the rest");
    }

        }


