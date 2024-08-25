package CentricToAll11.CustomizedExceptions.CEE;

import CentricToAll11.CustomizedExceptions.CEE.Bank;
import CentricToAll11.CustomizedExceptions.CEE.CustomException;

public class Lab190 {

    public static void main(String[] args) throws CustomException {

     Bank JPMorgan= new Bank("USD",100);
     Bank HDFC=new Bank("INR",100);
     Bank ICICI=new Bank("INR",150);

     //System.out.println(HDFC.add(JPMorgan));  //This statement throws the custom exception
     System.out.println(HDFC.add(ICICI));


    }
}





