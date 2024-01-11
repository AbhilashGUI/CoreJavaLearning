package CentricToAll9.OOPS;

public class BankAccount
{


    //Note: If you don't define the parameter constructor. It works as  default constructor

    //Attributes

    String bankname;   //null
    int balance;      //0

    String bankcode;


    //Initializing the default constructor

    /*BankAccount()   //Post creating and assigning the values against default constructor. Ideally it will be printing the assigned values.
    {
        bankname="sbi";
        balance=150000;
        bankcode="SBI1023";
    }


    void printdetails()
    {
        System.out.println(bankname);
        System.out.println(balance);
        System.out.println(bankcode);


    }*/



    //Initializing the parameter constructor

    BankAccount(String bn,String bc,int bal)
    {
        this.bankname=bn;
        this.bankcode=bc;
        this.balance=bal;
    }

    /*void  printdetails()
    {
     System.out.println("BankName : -->" + this.bankname);
     System.out.println("BankCode : -->" + this.bankcode);
     System.out.println("Balance  : -->" + this.balance);

    }*/


    //In parameterised constructor reference value already changed using this keyword.

    void printdetails()
    {
        System.out.println("BankName : -->" +bankname);
        System.out.println("BankCode : -->" +bankcode);
        System.out.println("Balance  : -->" +balance);


    }



}
