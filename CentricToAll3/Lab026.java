package CentricToAll3;

public class Lab026
{
    public static void main(String[] args)
    {
    //Casting : Mold
    //Widening : Is a process of converting lower datatype to higher datatype. It's a safe and default operation

        /*byte b=23;
        //int c=b;//Implicit casting--JVM is responsible for it.
        int c= (int) b;//Explicit casting--JVM is responsible for it.
        System.out.println(c);*/

    //Narrowing : Is a process of converting higher datatype to lower datatype. It is critical and cannot predict the o/p
        int a=500;
        byte b= (byte) a; // This is explicit casting
        System.out.println(b);



        short s=30000;
        byte t= (byte) s; //This is explicit casting
        System.out.println(t);


        //Note: Refer the notes to convert decimal to binary and more.
            }
}
