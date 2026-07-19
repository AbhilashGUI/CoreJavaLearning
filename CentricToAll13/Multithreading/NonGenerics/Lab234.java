package CentricToAll13.Multithreading.NonGenerics;

import java.util.ArrayList;
import java.util.List;

public class Lab234
{
    public static void main(String[] args)
    {
        //Non-Generic allows only the specific datatype, which is defined with in the diamond operator

        List<Integer> Unique_datatype=new ArrayList();
        //Unique_datatype.add("Thief");
          Unique_datatype.add(123);
          Unique_datatype.add(365);

        System.out.println(Unique_datatype);








    }
}
