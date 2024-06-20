package CentricToAll4;
import java.util.Scanner;
public class Lab052
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the itemcode: ");
      int itemcode=sc.nextInt();
      switch (itemcode)
      {
          case 1,2,3:   //Adding multiple values in the case is allowed from JDK 13 version
              System.out.println("Belongs to Groceries");
              break;
          case 4,5:
              System.out.println("Belongs to household goods");
              break;
          case 6,7,8:
              System.out.println("Belongs to shopping/Fashion");
              break;
          case 9,10:
              System.out.println("Belongs utility payments");
              break;
          default:
              System.out.println("Running out of money");


      }

}
}
