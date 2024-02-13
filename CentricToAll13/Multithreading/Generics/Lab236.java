package CentricToAll13.Multithreading.Generics;

public class Lab236 {
    public static void main(String[] args) {
        //Maximum of three numbers(Int)  using the function


        int maxnum = Maximumofnumbers(45, 64, 75);
        System.out.println(maxnum);

    }


    public static int Maximumofnumbers(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    }





