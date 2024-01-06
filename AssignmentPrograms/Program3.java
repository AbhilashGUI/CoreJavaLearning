package AssignmentPrograms;
import java.util.Scanner;
public class Program3
{
 public static void main(String[] args) {
     //Swapping of two numbers

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of A");
     int a = sc.nextInt();
     System.out.println("Enter the value of B");
     int b = sc.nextInt();


     int temp = a;
     a = b;
     b=temp;



     System.out.println("Value of A------>" + a);
     System.out.println("Value of B------>" + b);
 }



 }
