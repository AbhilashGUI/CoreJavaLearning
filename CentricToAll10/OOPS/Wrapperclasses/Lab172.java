package CentricToAll10.OOPS.Wrapperclasses;

public class Lab172
{

    public static void main(String[] args)
    {

        int i=10;

        //Converting of primitive to wrapper class

        Integer i2= Integer.valueOf(i);
        System.out.println(i2);
        //Wrapper class we use in collection framework

       // Converting of  wrapper classes to primitive
        Character gender='M';  //This concept is known as unboxing
        char c=gender;
        System.out.println(c);




        //The core advantage of using the wrapper classes are , we have multiple in-built functions.


        System.out.println(Integer.valueOf("255"));
        System.out.println(Integer.max(64,85));
        System.out.println(Integer.min(125,63));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}
