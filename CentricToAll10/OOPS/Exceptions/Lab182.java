package CentricToAll10.OOPS.Exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab182
{
    public static void main(String[] args) throws FileNotFoundException {
        contactnumber(20);


    }

    static void contactnumber(int landlinecode) throws FileNotFoundException {
        if(landlinecode == 10)
        {
            System.out.println("It's correct number, please wait while we are connecting your call");
        }
        else

        {
            System.out.println("Incorrect number, please enter the correct landline code");
        }

        String path="D:/Documents/Images.jpg";
        File file= new File(path);
        FileReader fileReader= new FileReader(file);
    }

}
