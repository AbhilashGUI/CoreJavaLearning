package CentricToAll7;

public class Lab123 {
    public static void main(String[] args) {
        int c = sum(3, 4);         //Declaring 2 arguments
        System.out.println(c);
        int c1 = sum(5);    //Declaring 1 argument
        System.out.println(c1);
        int c2 = sum();            //Not declaring  argument
        System.out.println(c2);

    }


    //Defining the code outside the main method is known as function. Refer below
    static int sum(int input_1, int input_2)  //Definition of the function
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
