package CentricToAll4;
import java.util.Scanner;
public class Lab057
{
    public static void main(String[] args)
            // 3/ x^2+y^2-|z| abs|z|-->It coverts -ve num to +ve num and +ve num to -ve num
            //abs: Absolute value
            //Example:A=x^2+B=y^2-C=|z| abs|z|  -1=+1, -4=+4

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x =sc.nextDouble();
        System.out.println("Enter the value of y");
        double y =sc.nextDouble();
        System.out.println("Enter the value of z");
        double z =sc.nextDouble();




        double result;

        result=Math.cbrt(Math.pow(x,2)+Math.pow(y,3)-Math.abs(z));
        System.out.print(result);


          sc.close();



        /*Calculation part: x=14,y=13 and z=7
        14*14=196
        13*13*13=2197
        Math operation=196+2197=2393-7=2386
        To know the cube root of number list refer -->https://byjus.com/maths/cube-root-of-numbers
         */

    }


}
