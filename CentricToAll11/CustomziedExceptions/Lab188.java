package CentricToAll11.CustomziedExceptions;

import java.io.File;
import java.io.FileReader;

public class Lab188 {
    public static void main(String[] args) throws Exception {
        main("Abhilash");

    }

    static void main(String a) throws Exception {
        FileReader f = new FileReader(new File("C://Abhilash.txt"));

        if (a.equalsIgnoreCase("a"))
        //Note:In-this case, it is executing inbuilt function of the  primary object , whose parameters are declared within the function.

        {
            throw new ArithmeticException();
        }

        System.out.println("Abhilash file is not found");
    }
}

