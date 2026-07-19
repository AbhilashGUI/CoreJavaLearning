package CentricToAll13.Multithreading.NonGenerics;

public class Lab236 {
    public static void main(String[] args) {
        //Maximum of three numbers(Int)  using the function

        int Maxout=Maxnumber(15,75,150);
        System.out.println(Maxout);

    }

        //Non-Generic, here we are specifying the datatype

        public static int Maxnumber( int a, int b, int c)
        {
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






