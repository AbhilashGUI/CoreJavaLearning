package CentricToAll10.OOPS.Abstraction.Interface;

public class Interfaceexample2 {

    public static void main(String [] args)
    {

         //As we know, one cannot create an object for interface class

        System.out.println(A1.a);  //Can access the declared variable
       // System.out.println(B1.b);  //B1 is an abstract class

    }

}

interface A1
{
   int a=10;   //Static and Final variable
}

abstract class B1
{
    int b=20;    //instance variable
}