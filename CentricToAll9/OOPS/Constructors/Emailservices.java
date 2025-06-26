package CentricToAll9.OOPS.Constructors;

import java.util.Scanner;

public class Emailservices {

    //Passing the attributes
    String emailaddress1;
    String emailaddress2;
    String emailaddress3;
    String emailaddress4;

    //Deifining the function

    /***Emailservices() {
     System.out.println("Calling the default constructor");
     }***/


    Emailservices(String emailaddress1) {
        this.emailaddress1 = emailaddress1;
        this.emailaddress2 = emailaddress2;
        this.emailaddress3 = emailaddress3;
        this.emailaddress4 = emailaddress4;

    }


    void printdetails() {
        System.out.println("Your email address " + this.emailaddress1);


    }
    //Creation of object in the main method to invoke default constructor

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first email address");
        String emailaddress1 = sc.next();
        Emailservices es = new Emailservices(emailaddress1);
        es.printdetails();

        System.out.println("Enter the second email address");
        String emailaddress2 = sc.next();
        Emailservices es1 = new Emailservices(emailaddress2);
        es1.printdetails();

        System.out.println("Enter the third email address");
        String emailaddress3=sc.next();
        Emailservices es2= new Emailservices(emailaddress3);
        es2.printdetails();

        System.out.println("Enter the fourth email address");
        String emailaddress4=sc.next();
        Emailservices es3=new Emailservices(emailaddress4);
        es3.printdetails();


    }

}
