package CentricToAll6;

public class Lab103
{
    public static void main(String[] args)
    {
        /*Important in terms of interview. This understanding is based on declaring the final keyword for the length,
        which is static However, the values are varied*/


        final int[] i= new int[5];
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
        i[0]=15;
        i[1]=25;
        i[2]=35;
        i[3]=45;
        i[4]=55;
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);


        final int[] marks={36,44,43,71,52};
        System.out.println(marks[4]);
        marks[4]=67;
        System.out.println(marks[4]);

        //It works fine for String as well
        final String[] Qualities={"Passion","Ambitious"};
        {
            System.out.println(Qualities[0]);
            Qualities[0]="Enthusiasm";
            System.out.println(Qualities[0]);


        }












    }
}
