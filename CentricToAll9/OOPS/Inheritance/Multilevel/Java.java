package CentricToAll9.OOPS.Inheritance.Multilevel;

import CentricToAll9.OOPS.Inheritance.Multilevel.Programminglanguages;

public class Java extends Programminglanguages
{
    //Attributes
    String feature1;
    String feature2;
    String feature3;
    String feature4;

    Java()
    {
        System.out.println("Invoking the Default constructor");
    }






    void printdetails()

    {
        System.out.println("1st feature of java : " + feature1);
        System.out.println("2nd feature of java : " + feature2);
        System.out.println("3rd feature of java : " + feature3);
        System.out.println("4rth  feature of java : " + feature4);
    }



}
