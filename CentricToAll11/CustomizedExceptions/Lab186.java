package CentricToAll11.CustomizedExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab186 {

    public static void main(String[] args) throws Exception{      //Note:Throws keyword is used to safeguard the entire code
         readfile("C://Abhilash.txt");   ///Declaring the params of the function in the main method and then try executing.
        //Vulnerable = Prone to error
    }


//Defining a function outside the main method

    static void readfile(String Filename) throws Exception {
        File f = new File(Filename);
        FileReader fileReader = new FileReader(Filename);
        if (Filename.length() == 0) {
            throw new FileNotFoundException();

        }
        System.out.println("File not found exception");

    }
}