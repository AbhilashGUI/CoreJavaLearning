package CentricToAll6;

public class Lab103
{
    public static void main(String[] args)
    {
        /*Important in terms of interview. This understanding is based on declaring the final keyword for the length,
        which is static However, the values are varied*/


        final int[] a = new int[4];
        //a[0] to a[2] =0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=30;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        //As discussed the above elements in array are varied though we are using final keyword for an array/array index.
        // Which is correct as per the logic.

        final int[] a1 = {10,20,30};
        a1[0]=100;
        System.out.println(a1[0]);

    }
}
