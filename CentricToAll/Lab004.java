package CentricToAll;

public class Lab004
{
    public static void main(String[] args)
    {
        //Byte is of 1byte=8bits= 128
        byte amount=100;
        //amount=145;  /Occurence of error incompatible
        //Note: Since we declared the amount > the byte value, an error is thrown

        amount=125;
        System.out.println("Declared Amount value is less than the Byte value " +  amount );

        System.out.println("Sum of byte value and given value");
        System.out.println(amount+13) ; //No error
    }
}
