package CentricToAll7;

public class Lab126
{
    public static void main(String[] args)
    {
       int c=div(100,5);  //Declaring 2 arguments
       System.out.println(c);
        int c1=div(100,5,2);  //Declaring 2 arguments
        System.out.println(c1);

    }



    static int div(int input_1,int input_2)
    {
        return input_1/input_2;   //It displays the value of Quotient
    }
    static int div(int input_1,int input_2,int input_3)
    {
        return input_1/input_3;   //It displays the value of Quotient
    }
    }


