package CentricToAll11.CustomizedExceptions;

public class IV11 {

    public static void main(String[] args)
    {

   //Note:Example of throw keyword
        Number N=new Number();
        N.join();


    }

}
class Number{

    public int join()
    {
        //int a=10/0;                                       //If we uncheck, we get to see arithmetic exception
        throw new NullPointerException();
    }
}


