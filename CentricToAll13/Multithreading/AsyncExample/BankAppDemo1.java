package CentricToAll13.Multithreading.AsyncExample;

public class BankAppDemo1 {

    public static void main(String[] args)
    {

     Bankrepo1 bankrepo1= new Bankrepo1();
     Runnable runnable= new Account(bankrepo1);
     Thread t1= new Thread(runnable,"Vivek");
     t1.start();
     Thread t2= new Thread(runnable,"Vishwank");
     t2.start();

    }
}


class Account implements Runnable
{
    Bankrepo1 bankrepo1;
    public Account(Bankrepo1 bankrepo1) {
        this.bankrepo1 = bankrepo1;
    }

    public void run()
    {
        for(int i=0;i<5;i++)
        {
            bankrepo1.withdraw(250);
            if(bankrepo1.getBalance()<0)
            {
                System.out.println("Amount Max out!!");
            }
        }
    }
}

class Bankrepo1{

    int balance=1500;
    void withdraw(int Amount)
    {
        Thread t=Thread.currentThread();
        if(balance>Amount)
        {
            System.out.println("Withdraw-->"+Amount+ "\t"+t.getName());
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            balance=balance-Amount;
            System.out.println(balance+ " Available bal ");
        }
        else
        {
            System.out.println("Low balance, cannot dispense cash");
        }

    }
    public int getBalance()
    {
        return balance;
    }
}