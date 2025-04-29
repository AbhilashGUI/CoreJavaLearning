package CentricToAll7;

public class    Lab123 {

    public static void main(String[] args) {
        int a = sum(13, 14);         //Declaring 2 arguments
        System.out.println(a);
        int a1 = sum(5);    //Declaring 1 argument
        System.out.println(a1);
        int a2 = sum();            //Not declaring  argument
        System.out.println(a2);

    }


    //Defining the code outside the main method is known as function. Refer below
    static int sum(int input_1, int input_2)  //Definition of the function
    //Sum represents the name of the function
    {
        return input_1 + input_2;
    }
    //Defining multiple static methods

    static int sum(int input_1)  //Definition of the function
    {
        return input_1;
    }

    static int sum()  //Definition of the function
    {
        return 66;
    }



}
