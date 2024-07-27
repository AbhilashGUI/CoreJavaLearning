package CentricToAll10.OOPS.Innerclasses;

public class Lab166 {
    public static void main(String[] args) {

        Car car = new Car("TataMotors");
        Car.Engine engine= car.new Engine("400cc");
        car.drive();
        engine.start();


    }

}
     //Outerclass.Innerclass innerclassref=outerclassref.new Innerclass();

class  Car
{

    String CarManufacturingcompany;
    public Car(String carManufacturingcompany) {
        CarManufacturingcompany = carManufacturingcompany;
    }
    void drive()
    {
        System.out.println("You can drive");
    }
 class  Engine
 {
     String horsepower;
     public Engine(String horsepower) {
         this.horsepower = horsepower;
     }

     void start()
     {
         System.out.println("Engine is started");
     }
 }
}










