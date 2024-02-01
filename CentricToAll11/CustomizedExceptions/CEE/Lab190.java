package CentricToAll11.CustomizedExceptions.CEE;

import CentricToAll11.CustomizedExceptions.CEE.Bank;
import CentricToAll11.CustomizedExceptions.CEE.CustomException;

public class Lab190 {

    public static void main(String[] args) throws CustomException {

        Bank JPMOrgan= new Bank("USD",100);
        Bank HDFC= new Bank("INR",100);
        Bank ICICI= new Bank("INR",100);


        System.out.println(HDFC.add(JPMOrgan));    //Note: Though it is executing primarily, It cannot add USD to INR
        System.out.println(HDFC.add(ICICI));
    }
}





