package CentricToAll7;

public class Lab125 {

    public static void main(String[] args)
    {

        int a=mul(32,44);
        System.out.println(a);
        int b=mul(23,37,51);
        System.out.println(b);
        float f=mul(23.2f,45.4f,66.3f);
        System.out.print(f);

    }


    static  int mul(int input1, int input2)
    {
        return input1*input2;
    }
    static  int mul(int input1, int input2,int input3)
    {
        return input3*input2;
    }
    static  float mul(float input1, float input2,float input3)
    {
        return input3*input1;
    }

}