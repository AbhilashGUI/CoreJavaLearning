package CentricToAll10.OOPS.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab181
{
    public static void main(String args[]) throws FileNotFoundException {

        String path="D/Documents/Image1.jpg";
        File file=new File(path);
        FileReader fileReader=new FileReader(file);


        //Note: Here, we are using throws keyword and importing the relevant packages.
    }
}
