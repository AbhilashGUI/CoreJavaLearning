package CentricToAll9.OOPS.Constructors;

public class Lab148
{
public static void main(String[] args)
{

    //RUNNER OF BANKACCOUTCLASS//

    //BankAccount sbi=new BankAccount();
    //sbi.printdetails();


    BankAccount hdfc_ref=new BankAccount("HDFC","HDFC001",150,"Jubillehills");
    hdfc_ref.printinfo();

    BankAccount icici_ref=new BankAccount("ICICI","ICIC0012",125,"Nanakramguda");
    icici_ref.printinfo();

    BankAccount bandhan_ref=new BankAccount("Bandhan","BAN152",253,"Dilsuknagar");
    bandhan_ref.printinfo();


    BankAccount union_ref=new BankAccount("Union","UN0123",782,"Moosarambagh");
    union_ref.printinfo();

}



}
