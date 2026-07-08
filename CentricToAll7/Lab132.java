package CentricToAll7;

public class Lab132
{
    public static void main(String[] args)
    {
       float f= sum(135,475.4f,724.7f);
       System.out.println(f);
       float f1=sub(145.25f,789.23f,462.5f);
       System.out.println(f1);
    }


    public static float sum(float number1, float number2, float number3)
    {
        return number1+number3;
    }

    public static float sub(float number4, float number5, float number6)
    {
        return number5-number4;
    }
}