package CentricToAll7;

public class Lab127
{
    public static void main(String[] args)
    {
        int c=mod(225,15);   //declaring 2 arguments
        System.out.println(c);
        int c1=mod(5,15,327); //declaring 3 arguments
        System.out.println(c1);

    }


    static int mod(int input_1,int input_2) //Defintion of function
            //mod represents name of the function
    {
        return input_1%input_2;  //It displays the value of remainder
    }
    static int mod(int input_1,int input_2,int input_3)
    {
        return input_3%input_1;  //It displays the value of remainder
    }


}



