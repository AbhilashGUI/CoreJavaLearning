package CentricToAll7;

public class Lab126
{

    public static void main(String[] args)
    {

       int a= div(225,15);
       System.out.println(a);
       double b=div(45.3,122.4);
       System.out.println(b);
       double c= div(141.2,151.7,66.2);
       System.out.println(c);


    }

    static int div(int input1, int input2)
    {
        return input1%input2;
    }
    static double div(double input1, double input2)
    {
        return input2%input1;
    }
    static double div(double input3,double input4,double input5)
    {
        return input4%input5;
    }


}