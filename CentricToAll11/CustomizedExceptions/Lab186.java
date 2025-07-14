package CentricToAll11.CustomizedExceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab186 {

    public static void main(String[] args) throws Exception {
        //Note:Throws keyword is used to safeguard the entire code
        ///Declaring the params of the function in the main method and then try executing.
        //Vulnerable = Prone to error


        readfiledata("D://Abhilash.txt");
    }
    //Defining a function outside the main method


    private static void readfiledata(String filedata) throws FileNotFoundException {
        File f= new File(filedata);
        FileReader fr= new FileReader(filedata);
        if(filedata.length() == 16){
            throw new FileNotFoundException();
        }
        }

}


