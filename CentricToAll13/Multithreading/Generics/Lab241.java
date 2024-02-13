package CentricToAll13.Multithreading.Generics;

public class Lab241 {
    //Note: Generics are widely used in API Automation
    //Finding out the minimum number using compareto() method, for which we have to use comparable interface which can even compare strings and characters
    //Defining the main method and arguments outside the class

    public static  <Common extends Comparable<Common>> Common Minimumnumberof(Common a, Common b, Common c)
    {
        //Note: Here the common in the diamond operator is a customised class
     Common min=a;
     if(b.compareTo(min)<0)
     {
      b=min;
     }
     if(c.compareTo(min)<0)
     {
         c=min;
     }
     return min;
    }

    public static void main(String[] args)

    {
        //Note: The first value should be always minimum to satisfy the condition

        System.out.println(Minimumnumberof(12,72,14));
        System.out.println(Minimumnumberof(1.7,16.2,14.2));
        System.out.println(Minimumnumberof('A','L','Z'));
        System.out.println(Minimumnumberof("Manoj","Sainath","Abhilash"));


    }



}
