package CentricToAll13.Multithreading.SyncExample;


public class BankAppDemo
{
    public static void main(String[] args)
    {
        Bank b=new Bank();
        Runnable runnable=new Account(b);
        Thread t1=new Thread(runnable,"Abhilash");
        t1.start();
        Thread t2=new Thread(runnable,"Vicky");
        t2.start();

//It displays the result one by one

    }
}

class Account implements Runnable {
    Bank bank;

    public Account(Bank accService)
    {
        this.bank = accService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
        {
         bank.withdraw(250);
         if (bank.getbalance() <0)
         {
             System.out.println("Amount Max out!!");
         }
        }
    }
}

class Bank {
    int balance=1000;

    synchronized void withdraw(int amountTo){
        Thread t=Thread.currentThread();
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
