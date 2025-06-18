package CentricToAll9.OOPS.Constructors;

import java.util.jar.Attributes;

public class Person1
{
    //Attributes
    //Default values of primitive data types
     String name;

     String emailaddress;

     long  mobilenumber;

     String nationality;

     String locality;
     boolean married;



    //Initializing default constructor
     Person1()             //Constructor name Should be same as the class name
     {
         name="Abhilash";
         emailaddress="vemulaabhilash4321@gmail.com";
         mobilenumber= 123459875;
         nationality="India";
         locality="hyderabad";
         married=false;
     }


     //Initializing the parameter constructor
   Person1 (String valuefromreferenceobject)
    {
       this.name=valuefromreferenceobject;
       this.emailaddress=valuefromreferenceobject;
       this.nationality=valuefromreferenceobject;
       this.locality=valuefromreferenceobject;



    }


    //Behaviour

    static void read()
    {
        System.out.println("Able to read");
    }



    void printdetails() {
        System.out.println(name);
        System.out.println(emailaddress);
        System.out.println(mobilenumber);
        System.out.println(nationality);
        System.out.println(locality);
        System.out.println(married);


    }
    }



