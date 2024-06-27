package CentricToAll6;
import java.util.Scanner;
public class Lab112
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ordervalue = new int[5];
        System.out.println("Enter the order value of Refrigerator:"); //GC
        ordervalue[0] = sc.nextInt();
        System.out.println("Enter the order value Washing Machine:"); //MB
        ordervalue[1] = sc.nextInt();
        System.out.println("Enter the order value Television:"); //EC
        ordervalue[2] = sc.nextInt();
        System.out.println("Enter the order value Laptop:"); //FA
        ordervalue[3] = sc.nextInt();
        System.out.println("Enter the order value Air conditioner:"); //Fu
        ordervalue[4] = sc.nextInt();

        for (int i = 0; i < ordervalue.length; i++)
        {
            if(ordervalue[i]>100000)
            {
             System.out.println("You availed 10% discount worth of coupon on "+ ordervalue[i]) ;

            }

        }

    }

}
