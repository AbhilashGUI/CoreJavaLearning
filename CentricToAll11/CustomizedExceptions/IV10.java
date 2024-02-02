package CentricToAll11.CustomizedExceptions;

public class IV10 {

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
        throw new NullPointerException();
    }
}


