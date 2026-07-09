package CentricToAll9.OOPS.Constructors;

import java.util.Scanner;

public class Emailservices {

    //Attributes

    String emailaddress1;
    String emailaddress2;
    String emailaddress3;
    String emailaddress4;


    /**
     * Defining the default constructor
     * Emailservices() {
     * System.out.println("I'm a default constructor");
     * }
     **/


    //Initializing parameter constructor
    Emailservices(String emailaddress1) {
        this.emailaddress1 = emailaddress1;
        this.emailaddress2 = emailaddress2;
        this.emailaddress3 = emailaddress3;
        this.emailaddress4 = emailaddress4;

    }


    void printdetails() {
        System.out.println("Your email address -->" +emailaddress1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the emailaddress");
        String emailaddress1 = sc.nextLine();
        Emailservices es = new Emailservices(emailaddress1);
        es.printdetails();



    }
}
