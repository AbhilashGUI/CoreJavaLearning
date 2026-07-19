package CentricToAll13.Multithreading.Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab232
{
    public static void main(String[] args)
    {

  //Generics allow the reusability of code, where one single method can be used for different
        //data-type variables or objects using the diamond operator


        //Example of generic code


        List Multi_datatype= new ArrayList();
        Multi_datatype.add("Abhilash");
        Multi_datatype.add('M');
        Multi_datatype.add(32);
        Multi_datatype.add(false);
        Multi_datatype.add(8.5f);
        Multi_datatype.add(8655745963l);
        System.out.println(Multi_datatype);

    }
}
