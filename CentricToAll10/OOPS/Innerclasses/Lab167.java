package CentricToAll10.OOPS.Innerclasses;

public class Lab167
{

    public static void main(String[] args)
    {

  Mobile m=new Mobile("Apple");
  Mobile.Processor processor=m.new Processor("Apple A14 Bionic");
  m.turnon();
  processor.operations();


    }
}
class Mobile{

    String mobilemanufacturingcompany;
    public Mobile(String mobilemanufacturingcompany) {
        this.mobilemanufacturingcompany = mobilemanufacturingcompany;
    }

     void turnon()
     {
         System.out.println("Access granted");
     }


class   Processor{

    String Processor;
    public Processor(String processor) {
        Processor = processor;
    }

        void operations()
        {
            System.out.println("For the performance of smartphone");
        }
}



}