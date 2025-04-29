package CentricToAll7;

public class Lab124
{
    public static void main(String[] args)
    {
        int b=sub(17,12);  //Declaring 2 arguments
        System.out.println(b);
        int b1=sub(62);  //Declaring 1 argument
        System.out.println(b1);
        int b2=sub();
        System.out.println(b2);

    }



 static int sub(int input_1,int input_2)    //Definition of the
         //Sub represent the name of the function
    {
        return input_1-input_2;
    }

    static int sub(int input_1)

    {
        return input_1;
    }
    static int sub()

    {
        return 74;
    }






}





