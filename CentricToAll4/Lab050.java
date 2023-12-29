package CentricToAll4;
import java.util.Scanner;
public class Lab050
{
    public static void main(String[] args)
    {
        //Price and Product based code
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Product name, will help you with the price and the description");
        String Product=sc.next();
        switch (Product)
        {
            case "Unibic":
                System.out.println("It is a biscuit, which cost from rs=10-300");
                break;
            case "Maaza":
                System.out.println("It is a cool drick, which cost from rs=10-150");
                break;
            case "Cake":
                System.out.println("It is a Pastry, which cost from rs=350-15000");
                break;
            default:
                System.out.println("Out of stock");
        }

        System.out.println("End of the program");
    }

}
