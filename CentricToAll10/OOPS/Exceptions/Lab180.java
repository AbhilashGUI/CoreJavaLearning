package CentricToAll10.OOPS.Exceptions;

public class Lab180 {

    public static void main(String args[]) {
        try {


            int Amount_debited = 1000;
            int atm_txn = 0;
            int result = Amount_debited / atm_txn;

        } catch (Exception e) {
           System.out.println("Do not worry, amount will be credited back in 24 hours");
        }


    }
}





