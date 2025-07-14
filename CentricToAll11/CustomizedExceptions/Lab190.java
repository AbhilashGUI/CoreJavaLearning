package CentricToAll11.CustomizedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab190 {
    public static void main(String[] args) {
        String path = "C:/a.txt";
        try {
            FileInputStream f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
        //In this case, we have a choice of using try&catch block or throws keyword at the method level



