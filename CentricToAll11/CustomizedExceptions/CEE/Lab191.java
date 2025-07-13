package CentricToAll11.CustomizedExceptions.CEE;

public class Lab191 {

    public static void main(String[] args) throws CustomException {

     Bank JPMorgan= new Bank("USD",100);
     Bank HDFC=new Bank("INR",100);
     Bank ICICI=new Bank("INR",150);

     System.out.println(HDFC.add(ICICI));
     System.out.println(HDFC.add(JPMorgan));  //This statement throws the custom exception



    }
}





