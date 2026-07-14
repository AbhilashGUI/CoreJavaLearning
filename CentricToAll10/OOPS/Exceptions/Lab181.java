package CentricToAll10.OOPS.Exceptions;

import java.io.File;
import java.io.FileReader;
public class Lab181
{

    public static void main(String[] args)
    {
      String path="C:/Abhilash/Assigment.txt";
      File file= new File(path);
        try {
            FileReader fileReader= new FileReader(file);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
