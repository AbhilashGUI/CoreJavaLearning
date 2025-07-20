package CentricToAll13.Multithreading.Generics;

public class Lab236 {
    public static void main(String[] args) {
        //Maximum of three numbers(Int)  using the function


       int maxnum=maximumnumber(10,20,30);
       System.out.println(maxnum);
    }


    //Non-Generic, here we are specifying the datatype

    public static int maximumnumber(int a, int b, int c)
    {
        int max=a;
            if (b>max)
            {
                max=b;
            }
            if (c>max)
            {
                max=c;
            }
            return max;
        }

    }






