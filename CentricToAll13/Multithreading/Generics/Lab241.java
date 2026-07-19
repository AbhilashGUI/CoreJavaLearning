package CentricToAll13.Multithreading.Generics;

public class Lab241 {


    public static <Gen1 extends Comparable<Gen1>> Gen1 Minimumof(Gen1 a, Gen1 b, Gen1 c) {
        Gen1 min = a;

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