package CentricToAll5;

public class Lab081
{
    public static void main(String[] args){

        //
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i); //If we are printing the statement before continue statement.
            // It does not skip the condition

            if(i==4)
            {
                continue;//It skips the provided condition and prints rest/ other numbers
            }

        }
    }
}


