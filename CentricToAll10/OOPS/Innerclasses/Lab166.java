package CentricToAll10.OOPS.Innerclasses;

public class Lab166
{
    public static void main(String[] args)
    {
     Car c=new Car("Tata Motors");
     Car.Engine engine=c.new Engine("400cc");
     engine.start();
     c.drive();



     //Outerclass.Innerclass innerclassref=outerclassref.new Innerclass();

    }
}


class Car{                  //Outerclass



    String carmanufacturingcompany;   //Instance variable

    public Car(String carmanufacturingcompany) {
        this.carmanufacturingcompany = carmanufacturingcompany;   //Adding the param constructor
    }

    void drive() //method/function
    {
        System.out.println("You can drive a car");

    }

 class Engine{               //Innerclass


     String horsepower;     //Instance variable

     public Engine(String horsepower) {               //Adding the param constructor
         this.horsepower = horsepower;
     }

     void start()
     {
         System.out.println("Engine is started");

     }



 }

}
