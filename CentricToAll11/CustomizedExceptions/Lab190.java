package CentricToAll11.CustomizedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab190 {

    public Lab190() throws FileNotFoundException {
    }

    public static void main(String[] args)  {
        String path = "C://Aadhar.jpg";
        try {
            FileInputStream f = new FileInputStream(path);

            }catch (Exception e)
        {
            e.printStackTrace();
        }

        }

        String path= "C://Aadhar.pdf";

      FileInputStream fileInputStream= new FileInputStream(path);

    }

        //In this case, we have a choice of using try&catch block or throws keyword using the constructor



