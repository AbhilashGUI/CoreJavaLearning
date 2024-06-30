package CentricToAll7;

public class Lab124
{
    public static void main(String[] args)
    {
        int c=sub(17,12);  //Declaring 2 arguments
        System.out.println(c);
        int c1=sub(62);  //Declaring 1 argument
        System.out.println(c1);
        int c2=sub();
        System.out.println(c2);

    }



 static int sub(int input_1,int input_2)    //Definition of the
         //Sub represent the name of the function
    {
        return input_1-input_2;
    }

    static int sub(int input_2)

    {
        return input_2;
    }
    static int sub()

    {
        return 74;
    }






}





