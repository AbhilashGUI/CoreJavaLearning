package CentricToAll;

public class Lab004
{
    public static void main(String[] args)
    {
        //Byte is of 1byte=8bits
        byte amount=100;
        //amount=145;
        //Note: Since we declared the amount > the byte value, an error is thrown
        System.out.println("Declared Amount value is less than the Byte value");
        amount=125; //Occurence of error
        System.out.print(amount+13); //No error
    }
}
