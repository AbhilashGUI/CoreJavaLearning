package CentricToAll11.CustomizedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IV9 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C://Abhilash.txt";
       /* try {
            FileInputStream f = new FileInputStream(path);
        }catch (FileNotFoundException e)                            //1st method using try catch block
        {
         throw new RuntimeException(e);
        }*/


        FileInputStream f = new FileInputStream(path);             //2nd method using Throws keyword

    }
}
