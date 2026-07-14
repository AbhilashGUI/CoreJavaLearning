package CentricToAll10.OOPS.Exceptions;

public class Lab183 {

   public static void main(String[] args)
   {

       checkeligibility(20);

   }

   static void checkeligibility(int age)
   {
       if(age>=18)
       {
           System.out.println("You are eligible for vote");
       }
       else
       {
           System.out.println("You are not eligible for vote");
       }
   }
}