package CentricToAll10.OOPS;

public class IV5 {

    public static void main(String[] args)
    {

   System.out.println(i.a);
   System.out.println(i.b);
   System.out.println(i.c);



    }


}



interface  i{

    //In interface class, the declared variables are the static variables, which can be invoked without creating the objects
    public static final int a=10;
    public static final int b=20;
    //Bydefault it is static
    int c=30;

    void m1();   ////Creating an empty function, This is a non-static function.
}




