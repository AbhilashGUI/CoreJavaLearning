package CentricToAll10.OOPS;

public class IV9 {

public static void main(String[] args)
{

    Financialinstitutes fi= new Financialinstitutes() {
        @Override
        public void accounts() {
           System.out.println ("The are currently two types of account");
        }
    };

    bank b= new bank() {
        @Override
        void savingsaccount() {
            System.out.println("For savings");
        }

        @Override
        void salaryaccount() {
            System.out.println("For expenses");
        }

        @Override
        public void accounts() {

        }
    };

    hdfc h= new hdfc();
    fi.accounts();
    h.salaryaccount();
    b.salaryaccount();
    h.savingsaccount();
    b.savingsaccount();





}
}


interface  Financialinstitutes{

    int accounts=100;
    void accounts();
}

abstract class bank implements Financialinstitutes{

    abstract  void savingsaccount();
    abstract  void salaryaccount();
}

class hdfc extends bank{


    @Override
    void savingsaccount() {
        System.out.println("Savings will be moved to this account");
    }

    @Override
    void salaryaccount() {
        System.out.println("Salary will be credited to this account");
    }

    @Override
    public void accounts() {

    }
}