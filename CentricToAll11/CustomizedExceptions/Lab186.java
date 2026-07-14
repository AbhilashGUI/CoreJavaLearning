package CentricToAll11.CustomizedExceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab186 {


    public static void main(String[] args) throws Exception {
        //Note:Throws keyword is used to safeguard the entire code
        ///Declaring the params of the function in the main method and then try executing.
        //Vulnerable = Prone to error


        filenamecheck("Abhilash");


    }
    //Defining a function outside the main method


    static void filenamecheck(String filename) throws FileNotFoundException {
        if (filename.length() == 0) {                    // Checks the length of the STRING, not the file!
            throw new FileNotFoundException("Filename is correct");
        }
        File file = new File(filename);              // Creates a File object// Attempts to open the file
        if (!file.exists()) {
            throw new FileNotFoundException("File does not exist");
        }
        FileReader fr = new FileReader(filename);
        System.out.print("Through a customized exception");
    }

}

