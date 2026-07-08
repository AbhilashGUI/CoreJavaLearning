package CentricToAll7;

public class  Lab123 {

    public static void main(String[] args)
    {
      int a=sum(22,23);   //Declaring 2 arguments
      System.out.println(a);
      int a1=sum(50);  //Declaring 1 argument
      System.out.println(a1);
      int a2=sum();   //Not declaring an argument
      System.out.println(a2);

    }

    //Defining the code outside the main method is known as function. Refer below
    static int sum(int input1, int input2)  //Definition of the function
    //Sum represents the name of the function

    {
        return input1+input2;
    }

    //Few more examples

    static int sum(int input1)
    {
        return input1;
    }

    static int sum()
    {
        return 55;
    }

}