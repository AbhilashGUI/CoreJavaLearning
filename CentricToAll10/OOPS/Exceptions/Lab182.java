package CentricToAll10.OOPS.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab182
{
    public static void main(String args[]) throws FileNotFoundException {

        String path="D/Documents/Image01.jpg";  //Image document
        File file=new File(path);
        FileReader fileReader=new FileReader(file);


        //Note: Here, we are using throws keyword and importing the relevant packages.
    }
}
