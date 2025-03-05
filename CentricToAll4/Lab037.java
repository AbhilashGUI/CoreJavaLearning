package CentricToAll4;
import java.util.Scanner;
public class Lab037
{
    public static void main(String[] args)
    {
        //if-else statement using the scanner class. Taking the user inputs from the keyboard
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number, to know the even or odd : ");
      int number= sc.nextInt();

   if(number%2==0)
    {
    System.out.println("It is an even number");
    }
   else
   {
   System.out.println("It is an odd number");
   }

}
}
