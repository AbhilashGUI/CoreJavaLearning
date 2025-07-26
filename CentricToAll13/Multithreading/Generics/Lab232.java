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


        List  Multidatatype=new ArrayList<>();
        Multidatatype.add("Abhilash");
        Multidatatype.add('M');
        Multidatatype.add(29.8);
        Multidatatype.add(false);
        Multidatatype.add(30);
        System.out.println(Multidatatype);


    }
}
