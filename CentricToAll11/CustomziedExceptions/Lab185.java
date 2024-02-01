package CentricToAll11.CustomziedExceptions;

public class Lab185
{
    public static void main(String[] args) throws ArithmeticException {

        //extracted(10);       //Extracting the method by generating using shortcuts. Passing a param/argument.
        extracted(0);
        throw new ArithmeticException("Handling the exception at the method level");   //Adding a throw keyword, which is vulnerable to this code.
    }

    private static void extracted(int b) {
        int a;
        if(b==0){
            throw new ArithmeticException("B can't be executed");
        }
        else{
            a =10/b;
        }

        System.out.println(a);                      //It throws a default Arithmetic exception by JVM
    }
}
//Note:We are using the throw and throws keyword, in-order to create a customized exception
