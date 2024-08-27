package CentricToAll11.CustomizedExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab189 {
    public static void main(String[] args) throws FileNotFoundException {

        //int a=10/0;     //Note: This is an example of unchecked exception. Where JVM doesn't know about the error in advance.


        /*try
        {
        FileReader f= new FileReader(new File("C://Abhilash.txt"));          //Note:This is an example of checked exception.Where JVM is aware about the error in advance
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }*/


        FileReader f= new FileReader(new File("C://Abhilash.txt"));




        }
}
//In the first piece of code, we have used try&catch block , where as in the
//Second piece of code, we have used throws keyword at the method level
//Relates with the example pipe and a patch