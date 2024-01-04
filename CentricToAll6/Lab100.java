package CentricToAll6;

public class Lab100
{

    //Example: ArrayIndexOutOfBoundsException

    public static void main(String[] args)
    {
        String[]  stationery={"Pencil","Eraser","Sharper","Pen","Whitener"};
        System.out.println(stationery[0]);
        System.out.println(stationery[1]);
        System.out.println(stationery[2]);
        System.out.println(stationery[3]);
        System.out.println(stationery[4]);
        System.out.println(stationery.length);
        System.out.println(stationery[5]);//Since we are declaring the index, which is not a part of array.Hence it is throwing an exception.


    }
}
