package CentricToAll7;

public class Lab127
{
   public static void main(String[] args)
   {

       int i=mod(230,78);
       System.out.println(i);
       double j= mod(514,116);
       System.out.println(j);

   }

   static int mod(int input1, int input2)
   {
       return input1%input2;
   }
   static double mod(double input3,double input4)
   {
       return input3%input4;
   }


}


