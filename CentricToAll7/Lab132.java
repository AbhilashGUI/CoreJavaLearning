package CentricToAll7;

public class Lab132 {
    public static void main(String[] args) {


        float f=sum(25.3f,36.3f,45.7f);
        System.out.println(f);
        double d=sub(56.3,78.5,41.3);
        System.out.println(d);


    }




    public static float sum(float num1, float num2, float num3)
    {
        return num1+num3;
    }
    public static double sub(double num1, double num2, double num3)
    {
        return num3-num2;
    }


}
