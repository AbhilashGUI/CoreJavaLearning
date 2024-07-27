package CentricToAll10.OOPS.Innerclasses;

public class Lab167
{

    public static void main(String[] args)
    {

  Mobile mobile=new Mobile("Apple");
  Mobile.Processor processor=mobile.new Processor("Apple A14 Bionic");
  mobile.turnon();
  processor.operations();


    }
}
class Mobile{    //Outer class

    String mobilemanufacturingcompany;
    public Mobile(String mobilemanufacturingcompany) {     //Parma cons.
        this.mobilemanufacturingcompany = mobilemanufacturingcompany;
    }

     void turnon()    //function/method
     {
         System.out.println("Access granted");
     }


class   Processor{   //Innerclasss

    String Processor;
    public Processor(String processor) {   //Param cons.
        Processor = processor;
    }

        void operations()  //Functions/method
        {
            System.out.println("For performing various operations in smartphone");
        }
}



}