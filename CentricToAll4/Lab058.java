package CentricToAll4;
import java.util.Scanner;
public class Lab058
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of x");
     double x=sc.nextInt();
     System.out.println("Enter the value of y");
     double y=sc.nextInt();
     System.out.println("Enter the value of z");
     double z=sc.nextInt();

     double result;


        result=Math.sqrt(Math.pow(x,5)+Math.pow(y,5)-Math.abs(z));
        System.out.print(result);

      // To know the cube root of number list refer-->https://byjus.com/maths/square-root/
    }
}
