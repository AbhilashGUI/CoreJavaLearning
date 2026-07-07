package CentricToAll6;
import java.util.Scanner;
public class Lab111
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Rate yourself on the skills provided ");
        int [] scaleofrating=new int[5];

        System.out.println("Functionl Testing");
        scaleofrating[0]=sc.nextInt();

        System.out.println("Database Testing");
        scaleofrating[1]=sc.nextInt();

        System.out.println("API Testing");
        scaleofrating[2]=sc.nextInt();

        System.out.println("Java with Restassured");
        scaleofrating[3]=sc.nextInt();

        System.out.println("Java with selenium");
        scaleofrating[4]=sc.nextInt();

        int Overallrating=scaleofrating[0]+scaleofrating[1]+scaleofrating[2]+scaleofrating[3]+scaleofrating[4];
        System.out.println(Overallrating+ "-Not bad");


    }

}



