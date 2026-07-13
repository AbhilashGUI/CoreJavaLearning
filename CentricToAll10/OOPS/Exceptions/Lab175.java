package CentricToAll10.OOPS.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab175
{
    public static void main(String[] args) {
        //Checked exceptions: Are known as compile time exception. It is like JVM is aware about the occurrence of an error
        //Example:

        try {
            FileInputStream fs = new FileInputStream("Abhi.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Handling the exception, which is identified by the JVM and manipulating the same using the keywords");
        }

        //Note: If we do not use try, catch blocks , it will throw a file not found exception
        //Unchecked exceptions: Are known as run time exception.

        try {


            String str = null; //It is Unpredictable
            str.trim();  //In this case, though there is an error which  cannot detect by JVM.
            // Hence, it throws an error as "Nullpointerexception"
        }catch (Exception e)
        {
            System.out.println("Handling the exception,which cannot be recognized by JVM");
        }
    }





    }
