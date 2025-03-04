package CentricToAll3;

public class Lab034
{
    public static void main(String[] arg)
    {
        //Unary operators are called as increment operators

        //pre and post
        int i=120;
        i+=5;//Append
        i=i+5;//Append
        System.out.println(i);



        //a++ means post increment=First prints and then increment
        //++a means pre increment=First increment and then prints

        int a=10;
        System.out.println(a++);
        System.out.println(++a);


        //sum of pre and post
        //Increment operation
        System.out.println(++a + a++ + ++a);
        //It prints 1+12 =13 ,13,1+14=15 sum of all=41
        System.out.println(a); //15


        //Increment & Decrement operation
        int b=39;
        System.out.println(++b + b++ - --b);
        //It prints 40 +40  and increments by 1=81. 41 is decremented by 1=40 ==>80-40=40
        System.out.println(b);//Finally the value of b=40

        //Decrement operation
        int c=11;
        System.out.println(--c + --c + c--);
        //It prints 10+9+9=28
        System.out.println(c);//8


        //Increment and decrement operator
        int d=23;
        System.out.println(++d + d--);
        //It prints 24+24=48
        System.out.println(d);
        //After printing 24 it is decremented by 1=23


    }
}
