package CentricToAll9.OOPS.Constructors;

import CentricToAll9.OOPS.Constructors.BankAccount;

public class Lab148
{
public static void main(String[] args)
{

    //RUNNER OF BANKACCOUTCLASS//

    //BankAccount sbi=new BankAccount();
    //sbi.printdetails();


    BankAccount hdfc_ref=new BankAccount("HDFC","HDFC1590",0,"Miyapur");
    hdfc_ref.printdetails();;

    BankAccount icici_ref=new BankAccount("ICICI","ICIC00169",0,"Malakpet");
    icici_ref.printdetails();

    BankAccount union_ref=new BankAccount("UNION","UNI00125",0,"Chandrayangutta");
    union_ref.printdetails();

    BankAccount bandhan_ref=new BankAccount("Bandhan","BD001226",0,"Mehdipatnam");
    bandhan_ref.printdetails();
}



}
