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
//Note:Instead of using throws keyword in the 2nd piece of code, here we are using try&catch block. Relate with the example pipe and a patch