package CentricToAll;

public class Lab006
{
    public static void main(String[] args)
    {
        //long is of 8bytes=64bits =9.2233720368548E+18
        //ICCID: Integrated circuit card id/sim number contains 19 digit number : 92233720368547758071
        long ICCID=9223372036854775807l;
        //long ICCID=9423372036864521978l; //It throws an error
        System.out.println("ICCID contains 19 digits");
        System.out.print(ICCID);

    }
}
