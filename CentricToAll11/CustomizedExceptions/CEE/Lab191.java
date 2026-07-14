package CentricToAll11.CustomizedExceptions.CEE;

public class Lab191 {


    public static void main(String[] args) throws CustomException {

        Bank JPMorgan= new Bank("USD",150);
        Bank HSBC = new Bank("USD",200);
        Bank ICICI= new Bank("INR",300);
        Bank HDFC= new Bank("INR",500);

        System.out.println(HDFC.add(ICICI));
        System.out.println(HDFC.add(HSBC));


    }
}





