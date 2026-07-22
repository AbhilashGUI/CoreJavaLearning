package CentricToAll13.Multithreading.SyncExample;

public class BankAppDemo {

    public static void main(String[] args)
    {

        Bankrepo bankrepo=new Bankrepo();
        Runnable runnable=new Account(bankrepo);
        Thread t1=new Thread(runnable,"Abhi");
        t1.start();
        Thread t2= new Thread(runnable,"Tinku");
        t2.start();

    }
}

class Account implements Runnable
{
    Bankrepo bankrepo;
    public Account(Bankrepo bankrepo) {
        this.bankrepo = bankrepo;
    }

    public void run()
    {
        for(int i=0;i<5;i++)
        {
            bankrepo.withdraw(100);
            if(bankrepo.getBalance()<0)
            {
                System.out.println("Amount Maxout");
            }
        }
    }

}

class Bankrepo{

    int balance=1000;

    synchronized void withdraw(int Amount)
    {
        Thread t= Thread.currentThread();
        if(balance>Amount)
        {
            System.out.println("Withdraw--> "+ Amount +"\t"+ t.getName());
            try {
                Thread.sleep(3000);
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            balance=balance-Amount;
            System.out.println(balance + " Available bal");
        }
        else
        {
            System.out.println("Low balance, cannot dispense cash");
        }
    }
    public synchronized int getBalance()
    {
        return balance;
    }
}