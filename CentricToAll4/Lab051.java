package CentricToAll4;

public class Lab051
{
    public static void main(String[] args)
    {
        byte b=127;
        switch (b)
        {
            case 127:
            System.out.println("127 falls under byte range");
            break;
            /**case 127:
                System.out.println("-128 falls under byte range");
                break;**/ //Since it is a duplicate , JVM throws an error as duplicate case label
            default:
                System.out.println("Exceeding the byte range");

        }




    }
}
