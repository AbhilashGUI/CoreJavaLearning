package CentricToAll13.Multithreading.Generics;

public class Lab240 {
    //Note: Generics are widely used in API Automation
    //Finding out the maximum number using compareto() method, for which we have to use comparable interface which can even compare strings and characters

    public static <Generic extends Comparable<Generic>> Generic maximumof(Generic a, Generic b, Generic c) {
        //Note: Here the Generic in the diamond operator is a customised class

        Generic max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;

    }

     public static void main(String[] args)
     {
      System.out.println(maximumof("Abhilash","Vicky","Cow"));
      System.out.println(maximumof('V','A','S'));
      System.out.println(maximumof(12,17,36));
      System.out.println(maximumof(24.5,74.5,99.9));

    }
}