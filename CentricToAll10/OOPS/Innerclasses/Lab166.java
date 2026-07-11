package CentricToAll10.OOPS.Innerclasses;

public class Lab166 {

    public static void main(String[] args) {

        Car car= new Car("Tata Motors");
        Car.Engine engine=car.new Engine("1000cc");
        car.drive();
        engine.startengine();

    }
}

    class Car {
        String Carmanufacturingcompany;

        public Car(String carmanufacturingcompany) {
            Carmanufacturingcompany = carmanufacturingcompany;
        }

        void drive() {
            System.out.println("Car is a mode of transport");
        }


        class Engine {

            String horsepower;

            public Engine(String horsepower) {
                this.horsepower = horsepower;
            }

            void startengine() {
                System.out.println("Lets go for a long drive");
            }

        }
    }

