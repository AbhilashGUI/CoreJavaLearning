package CentricToAll4;

public class Lab051
{
    public static void main(String[] args)
    {
        byte b=127;
        switch (b)
        {
            case 127:
            System.out.println("78 falls under byte range");
            break;
           //case 127:
                //System.out.println("-128 falls under byte range");
                //break;  //Since the case values are similar, it is throwing an exception as "Duplicate case"
            default:
                System.out.println("Exceeding the byte range");

        }




    }
}
