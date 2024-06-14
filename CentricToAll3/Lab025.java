package CentricToAll3;

public class Lab025
{
    public static void main(String[] args)
    {
        //Not(!) is also considered as a part of logical operators
        //lets see some examples using not operator

       boolean b1=true;
        b1=(!(true));
        System.out.println(b1);
        System.out.println(!b1);
         int a=15;
         int b=18;
         int c=21;
         System.out.println(a>b);
         System.out.println(!(a>b));

        //Using logical operators
         boolean d= (a<b) && (b<c);
         boolean e= (a>b) || (c>b);
         System.out.println(d);
         System.out.println(e);



    }
}
