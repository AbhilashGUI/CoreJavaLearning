package CentricToAll5;

public class Lab083
{
    public static void main(String[] args){

        //
        for (int i = 10; i > 1; i--)
        {
            System.out.println(i); //If we are printing the statement before continue statement.
            // It does not skip the condition

            if(i==4)
            {
                continue; //It skips the provided condition and prints rest/ other numbers
            }

        }
    }
}

