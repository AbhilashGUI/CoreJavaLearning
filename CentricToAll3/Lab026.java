package CentricToAll3;

public class Lab026
{
    public static void main(String[] args)
    {
    //Casting : Mold
    //Widening : Is a process of converting lower datatype to higher datatype. It's safe and default operation

        byte b=23;
        int c=b;//Implicit casting--JVM is responsible for it.
        //int c= (int) b;//Explicit casting--JVM is not responsible for it.
        System.out.println(c);

    //Narrowing : Is a process of converting higher datatype to lower datatype. It is critical and cannot predict the o/p
        int a1=500;
        byte b1= (byte) a1; // This is explicit casting
        System.out.println(b1);



        short s=30000;
        byte t= (byte) s; //This is explicit casting
        System.out.println(t);


        //Note: Refer the notes to convert decimal to binary and more.
            }
}
