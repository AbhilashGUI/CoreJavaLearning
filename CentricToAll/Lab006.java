package CentricToAll;

public class Lab006
{
    public static void main(String[] args)
    {
        //long is of 8bytes=64bits =9.2233720368548E+18
        //ICCID: Integrated circuit card id/sim number contains 19 digit number : 92233720368547758071
        long ICCID=9223372036854775807l;
        //ICCID=9423372036864521978l;
        System.out.println("ICCID is <= to long value ");
        System.out.print(ICCID);

    }
}
