package CentricToAll7;

public class Lab127
{
    public static void main(String[] args)
    {
        int c=mod(225,15);
        System.out.println(c);
        int c1=mod(5,15,327);
        System.out.println(c1);

    }


    static int mod(int input_1,int input_2)
    {
        return input_1%input_2;  //It displays the value of remainder
    }
    static int mod(int input_1,int input_2,int input_3)
    {
        return input_3%input_2;  //It displays the value of remainder
    }


}



