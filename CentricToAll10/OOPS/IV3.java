package CentricToAll10.OOPS;

public class IV3
{
    public static void main(String[] args)
    {
    mentor m=null;
    mentor m2=new mentor();
    //System.out.println(m.a);
        // Since, we declared the object as null cannot access the value, which throws an exception
    System.out.println(m2.a);

    }

}

class mentor{

    //int a;  //By default the int value is null
    int a=10;

}
