package CentricToAll10.OOPS;

public class IV5 {

    public static void main(String[] args)
    {

   System.out.println(I.a);
   System.out.println(I.b);
   System.out.println(I.c);



    }


}

interface I {


    //In interface, the declared variables are the static variables, which can be invoked without creating the objects
    public static final int a = 10;
    public static final int b = 20;
    int c = 45;              //These variables are by-default public static final

    void m1();  //Creating the empty function, This is a non-static function.


}







