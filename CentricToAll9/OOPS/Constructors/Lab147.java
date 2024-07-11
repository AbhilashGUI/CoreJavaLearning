package CentricToAll9.OOPS.Constructors;

public class Lab147
{
    public static void main(String [] args)
    {

        //RUNNER OF PERSON1//

        Person1 p1=new Person1();//Default constructor
        p1.printdetails();
        // Since we have assigned values against default constructor.Same are reflected as an o/p, when executed this.


        //Person1 p3=new Person1();
        //p3.printdetails();
        // Since we are using the same class for the reference type p3. It is picking the default constructor values

        //Person1 p1=new Person1();
        //p1.name="Vicky";   //Since we are reassigning the name, new name reflects in the o/p along with the other attributes
        //p1.printdetails();


        //Parameter constructor  : Assigning  the parameters in the main method. and referring to the objects declared using this keyword.
        Person1 p2=new Person1("Abhilash");
        System.out.println(p2.name);
        Person1 p3=new Person1("vemulaa412@gmail.com");
        System.out.println(p3.emailaddress);
        Person1 p4=new Person1("Indian");
        System.out.println(p4.nationality);
        Person1 p5=new Person1("Hyderabad");
        System.out.println(p5.locality);


        //String s;                    // Local Variable default value is never assigned by JVM
        //System.out.println(s);


    }
}
