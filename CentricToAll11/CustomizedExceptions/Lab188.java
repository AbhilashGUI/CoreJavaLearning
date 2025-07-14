package CentricToAll11.CustomizedExceptions;

import java.io.File;
import java.io.FileReader;

public class Lab188 {
    public static void main(String[] args) throws Exception {
        employee("Abhilash");

    }

    static void employee(String a) throws Exception {
        FileReader f = new FileReader(new File("C://Abhilash.txt"));

        if (a.equalsIgnoreCase("Vicky"))
        //Note:In-this case, it is executing inbuilt function of the  primary object , whose parameters are declared within the function.

        {
            throw new ArithmeticException();
        }


    }
}

