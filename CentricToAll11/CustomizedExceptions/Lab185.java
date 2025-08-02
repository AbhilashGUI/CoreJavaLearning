package CentricToAll11.CustomizedExceptions;

public class Lab185 {
    public static void main(String[] args) throws Exception {

        //int a=10/0;
        //System.out.println(a);   // In this case, JVM will throw an exception


        //Note: Throw keyword is used at the object level and throws keyword is used at the method level
        //Note:We are using  throw and throws keyword, in-order to create a customized exception

        //Here we are extracting method using private keyword

        extracted(0);   //Passing parameter
        throw new Exception("Combination of throw and throws keyword");
        //Adding a throw keyword, which is vulnerable to this code.


    }

    private static void extracted(int c) {
        int b;
        if (c == 0) {
            throw new ArithmeticException("Intentionally failing the case");
        } else {
            b = 10 / c;
            System.out.println(b);

        }
    }
}
