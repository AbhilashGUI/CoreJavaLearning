package CentricToAll10.OOPS.Exceptions;

import java.io.File;
import java.io.FileReader;
public class Lab181
{
    public static void main(String[] args)
    {
        try {

            String path = "C/Abhilash/Assignment1.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }





    }
}
