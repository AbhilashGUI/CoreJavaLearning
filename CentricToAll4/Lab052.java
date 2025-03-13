package CentricToAll4;
import java.util.Scanner;
public class Lab052
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the itemcode: ");
      int itemcode=sc.nextInt();
      switch (itemcode) {
          case 1, 2, 3:
              System.out.println("Groceries");
              break;
          case 4, 5:
              System.out.println("Household goods");
              break;
          case 6, 7:
              System.out.println("Apparel");
              break;
          case 8, 9:
              System.out.println("Fashion");
              break;
          case 10:
              System.out.println("Healthcare");
              break;
          default:
              System.out.println("out of context");
      }

      }

}

