package CentricToAll13.Multithreading.NonGenerics;

public class Lab237
{


  public static void main(String[] args)
  {

     int Minout=Minnumber(150,75,25);
     System.out.println(Minout);


  }

    //Non-Generic, here we are specifying the datatype

   public static int Minnumber(int a, int b, int c)
   {
       int min=a;
       if(b<min)
       {
           min=b;
       }
       if(c<min)
       {
           min=c;
       }
       return c;
   }
}
