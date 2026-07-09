package CentricToAll9.OOPS.Constructors;

public class BankAccount
{


    //Note: If you don't define the parameter constructor. It works as  default constructor

    //Attributes
    String bankname;
    String bankcode;
    int balance;
    String Location;




    //Initializing the default constructor

    /***BankAccount()   //Post creating and assigning the values against default constructor.
    //Ideally it will be printing the assigned values.
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


    }***/



    //Initializing the parameter constructor

     BankAccount (String bn,String bc, int bal,String loc)
     {
         this.bankname=bn;
         this.bankcode=bc;
         this.balance=bal;
         this.Location=loc;


    }


    //In parameterised constructor reference value already changed using this keyword.

    void printinfo()
    {
        System.out.println("BankName : -->" +bankname);
        System.out.println("BankCode : -->" +bankcode);
        System.out.println("Balance  : -->" +balance);
        System.out.println("Location : -->" +Location);


    }



}
