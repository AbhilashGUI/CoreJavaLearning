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
             case "biscuits":
                 System.out.println("It comes under snacks");
                 break;
             case "Cooldrinks":
                 System.out.println("It comes under beverages");
                 break;
             case "Cakes":
                 System.out.println("It comes under desserts");
                 break;
             default:
                 System.out.println("Out of context");
         }
    }
}

