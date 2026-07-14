package CentricToAll11.CustomizedExceptions;

import java.io.File;
import java.io.FileReader;

public class Lab188 {
    public static void main(String[] args) throws Exception {
        employee("vicky");
        //employee("Abhilash");

    }

    static void employee(String employeename) throws Exception {
       if(employeename.equals("Micky"))

        //Note:In-this case, it is executing inbuilt function of the  primary object ,
            // whose parameters are declared within the function.

        {
            throw new ArithmeticException();
        }
        System.out.println("Through a customized exception");


    }
}

