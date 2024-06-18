package CentricToAll4;
import java.util.Scanner;
public class Lab050
{
    public static void main(String[] args)
    {
        //Price and Product based code
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Product name, will help you with the category type");
        String Product=sc.next();
        switch (Product)
        {
            case "Biscuits":
                System.out.println("It comes under snacks");
                break;
            case "Cooldrinks":
                System.out.println("It comes under beverages");
                break;
            case "Cakes":
                System.out.println("It comes under desserts");
                break;
            default:
                System.out.println("Out of stock");
        }

        System.out.println("End of the program");
    }

}
