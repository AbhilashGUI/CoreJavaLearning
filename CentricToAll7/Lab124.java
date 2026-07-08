package CentricToAll7;

public class Lab124
{
    public static void main(String[] args)
    {
      int a=sub(150,73);
      System.out.println(a);
      int b=sub(96);
      System.out.println(b);
      int c=sub();
      System.out.println(c);


    }

    static int sub(int input1, int input2)
    {
        return input1-input2;
    }

    static int sub(int input2)
    {
        return input2;
    }
    static int sub()
    {
        return 17;
    }
}