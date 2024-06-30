package CentricToAll7;

public class Lab125 {
    public static void main(String[] args) {
        int c = mul(12, 16);    //Declaring 2 arguments
        System.out.println(c);
        int c1 = mul(17, 10, 33);   //Declaring 3 arguments
        System.out.println(c1);
        int c2 = mul1(17, 10, 33);   //Declaring 3 arguments
        System.out.println(c2);


    }



    static int mul(int input_1, int input_2)  //Definition of the function
            //mul represents the name of the function
    {
        return input_1 * input_2;
    }

    static int mul(int input_1, int input_2, int input_3)
    {
        return input_1 * input_3;
    }

    static int mul1(int input_1, int input_2, int input_3)
    {
        return input_2 * input_3;


    }
}

