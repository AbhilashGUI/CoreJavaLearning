package CentricToAll13.Multithreading.AsyncExample;


public class BankAppDemo1
{
    public static void main(String[] args)
    {
        Bank b1=new Bank();
        Runnable runnable=new AccountThread(b1);
        Thread t=new Thread(runnable,"Abhilash");
        t.start();
        Thread t2=new Thread(runnable,"vicky");
        t2.start();

//It displays the result randomly
    }
}

class AccountThread implements Runnable {
    Bank bank;

    public AccountThread(Bank accservice) {
        this.bank = accservice;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
        {
            bank.withdraw(300);
         if (bank.getbalance()<0)
         {
             System.out.println("Amount Max out!!");
         }
        }
    }
}

class Bank {
    int balance=1000;
     void withdraw (int amountTo){
        Thread t =Thread.currentThread();
        if (balance >=amountTo)
        {
            System.out.println("Withdraw -->" +amountTo + "\t"+t.getName());
            try {
                Thread.sleep(1000);
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            balance=balance-amountTo;
            System.out.println(balance + "done-->\t"+t.getName());
        }
        else
        {
            System.out.println("Low Balance");
        }
    }
    public int getbalance()
    {
        return balance;
    }
}




