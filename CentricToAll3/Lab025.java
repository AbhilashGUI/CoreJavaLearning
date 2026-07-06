package CentricToAll3;

public class Lab025
{
    public static void main(String[] args)
    {
        //Not(!) is also considered as a part of logical operators
        //lets see some examples using not operator


         boolean b1=true;
         System.out.println(b1);
         boolean b2=false;
         b2=(!(false));
         b2=(!(true));
         System.out.println(b2);

         //Examples
        int a=25;
        int b=37;
        int c=49;
        System.out.println(a<c);
        System.out.println(b<a);


        //Using the logical operators
        boolean x= (a<b) && (c>a);
        boolean y= (a>b) || (b<c);
        boolean z= a==b;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        //Using bitwise operators

        boolean x1= (a>b) & (b>a);
        boolean y1= (a>b) | (a<c);
        boolean z1= !(a==b);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);

    }
}
