package CentricToAll3;

public class Lab026
{
    public static void main(String[] args)
    {
    //Casting : Mold
    //Widening : Is a process of converting lower datatype to higher datatype. It's safe and default operation

        byte b=43;
        short s=b;
        System.out.println(s);
         //short s= (short) b;  Explicit casting JVM is not responsible for it.


        //Narrowing : Is a process of converting higher datatype to lower datatype. It is critical and cannot predict the o/p

        short s1=500;
        byte b1= (byte) s1;
        System.out.println(b1);


        int i1=1000;
        short s2= (short) i1;
        System.out.println(s2);

        int i2=1500;
        byte b2= (byte) i2;
        System.out.println(b2);

        //Note: Refer notes to convert decimal to binary
            }
}
