package CentricToAll13.Multithreading.Generics;

public class Lab240 {
    //Note: Generics are widely used in API Automation
    //Finding out the maximum number using compareto() method, for which we have to use comparable interface which can even compare strings and characters
    //Defining the main method and arguments outside the class
    public static <Generic extends Comparable<Generic>> Generic Maximumof(Generic a, Generic b, Generic c) {
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
      System.out.println(Maximumof(25,75,45));
      System.out.println(Maximumof(74.23,36.24,47.3));
      System.out.println(Maximumof("Abhilash","Sainath","Manoj"));
      System.out.println(Maximumof('L','C','M'));
      //Note:Strings and character are calculated on the basis on number system.




    }



}
