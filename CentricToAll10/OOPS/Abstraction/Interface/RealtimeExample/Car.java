package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;


public class Car implements Engine,Clutch,Accelerator,Brake,Horn{


     void startcar()
     {
         System.out.println("Starting the car");
         startengine();
         clutch();
         accelarte();
         brake();
         horn();
     }

    @Override
    public void startengine() {
        System.out.println("Engine is working fine");
    }

    @Override
    public void clutch() {
        System.out.println("Clutch is working fine");
    }

    @Override
    public void accelarte() {
        System.out.println("Accelarator is working fine");
    }

    @Override
    public void brake() {
        System.out.println("Brake is working fine");
    }

    @Override
    public void horn() {
        System.out.println("Horn is working fine");
    }
}