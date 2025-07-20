package CentricToAll13.Multithreading.Generics;

public class Lab241 {


    public static <Generic1 extends Comparable<Generic1>> Generic1 Minimumof(Generic1 a, Generic1 b, Generic1 c) {
        Generic1 min = a;

        if (b.compareTo(min) <0) {
            b = min;
        }
        if (c.compareTo(min) < 0) {
            c = min;
        }
        return min;
    }

      public static void main(String[] args)
        {
            //Note: The first value should be always minimum to satisfy the condition
         System.out.println(Minimumof("Abhilash", "Sharma", "Vemula"));
         System.out.println(Minimumof('A','V','S'));
         System.out.println(Minimumof(14,25,37));
         System.out.println(Minimumof(12.3,14.7,16.8));
        }
}