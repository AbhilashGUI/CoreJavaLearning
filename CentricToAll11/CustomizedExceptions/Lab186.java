package CentricToAll11.CustomizedExceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab186 {

    public static void main(String[] args) throws Exception {
        //Note:Throws keyword is used to safeguard the entire code
        ///Declaring the params of the function in the main method and then try executing.
        //Vulnerable = Prone to error


        namecheck("Abhilash");

    }
    //Defining a function outside the main method


    static void namecheck(String file) throws FileNotFoundException {
        if (file.length() == 0) {                    // Checks the length of the STRING, not the file!
            throw new FileNotFoundException("Filename string is empty!");
        }
        File f = new File(file);              // Creates a File object// Attempts to open the file
        if (f.exists()) {
            throw new FileNotFoundException("File does not exist at path:" +file);
        }
        FileReader fr = new FileReader(file);
        System.out.print("Through a customized exception");
    }

}


