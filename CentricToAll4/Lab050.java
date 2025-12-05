package CentricToAll4;
import java.util.Scanner;
public class Lab050 {
    public static void main(String[] args) {
        //Product and category based code

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the product, will let you know the category type");
        String product=sc.next();

        switch (product)
        {
            case  "Biscuits":
                System.out.println("It comes under Snakcs");
                break;
            case "Cooldrinks":
                System.out.println("It comes under beverages");
                break;
            case "Cakes":
                System.out.println("It comes under Pastery");
            break;
        }

    }
}
