package CentricToAll6;
import java.util.Scanner;
public class Lab112
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ordervalue = new int[5];
        System.out.println("Enter the order value"); //GC
        ordervalue[0] = sc.nextInt();
        System.out.println("Enter the order value"); //MB
        ordervalue[1] = sc.nextInt();
        System.out.println("Enter the order value"); //EC
        ordervalue[2] = sc.nextInt();
        System.out.println("Enter the order value"); //FA
        ordervalue[3] = sc.nextInt();
        System.out.println("Enter the order value"); //Fu
        ordervalue[4] = sc.nextInt();

        for (int i = 0; i < ordervalue.length; i++)
        {
            if(ordervalue[i]>100000)
            {
             System.out.println("You availed 10% discount worth of coupon on "+ ordervalue[i]) ;
             System.out.println(ordervalue[i]);
            }

        }

    }

}
