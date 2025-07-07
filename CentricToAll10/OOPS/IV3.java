package CentricToAll10.OOPS;

public class IV3
{
    public static void main(String[] args)
    {

    mentor m1=new mentor();
    System.out.println(m1.b);
        mentor m2=null;
        System.out.println(m2.a);
        // Since, we declared the object as null cannot access the value, which throws an exception

    }

}

class mentor{

    int a;  //By default the int value is null
    int b=10;

}
