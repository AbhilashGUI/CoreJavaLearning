package CentricToAll4;
import java.util.Scanner;
public class Lab052
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code, it will fetch the category");
        int productcode=sc.nextInt();

        switch (productcode)
        {
            case 1,2,3:
                System.out.println("Fashion");
                break;
            case 4,5:
                System.out.println("Mobiles");
                break;
            case 6,7:
                System.out.println("Beauty");
                break;
            case 8:
                System.out.println("Electronics");
                break;
            case 9:
                System.out.println("Home & Appliances");
                break;
            case 10:
                System.out.println("Food & Healthcare");
                break;
            default:
                System.out.println("Out of stock");

        }


    }
}

