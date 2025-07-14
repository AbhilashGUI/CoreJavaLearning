package CentricToAll11.CustomizedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IV10 {
    public static void main(String[] args) throws FileNotFoundException {


        String path= "C://Abhilash.txt";
        try {
            FileInputStream f= new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
   //1st method using try-catch
        FileInputStream f1= new FileInputStream(path);
    }//2nd method using throws
}
