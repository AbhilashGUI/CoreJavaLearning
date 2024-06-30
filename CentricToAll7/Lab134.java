package CentricToAll7;

import java.util.Scanner;

public class Lab134
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name :");
        System.out.println(sc.next());

    }

    //Though we are defining multiple main methods with different arguments , JVM executes the one method.
    //This concept is called as Methodoverloading
    public static void main(int a)
    {
        a=10;
        System.out.println(a);
    }


        public static int sum(int input1,int input2)
        {
            return 23;

         }


}
