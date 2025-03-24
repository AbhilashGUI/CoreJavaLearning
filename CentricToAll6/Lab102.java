package CentricToAll6;

public class Lab102
{
    public static void main(String[] args)
    {
        int[] i=new int[5]; //Assigning the int value with new operator, which represents the length of an array in this case.
        //By default the index value from 0to4 is 0 =int[0,0,0,0,0]
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
        i[0]=49; //Replaces 0 with 49 in memory index
        System.out.println(i[0]);

        i[1]=67;
        i[0]=96;///Replaces 49 with 96 in memory index
        System.out.println(i[0]);
        System.out.println(i[1]);




    }
}
