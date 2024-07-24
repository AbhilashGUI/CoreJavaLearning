package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;

public class Car implements Engine,Break,Accelerator
{


    void start()
    {

        System.out.println("Starting the car");
        startEngine();
        accelerator();
        Break();

    }



    @Override
    public void startEngine()
    {
        System.out.println("Engine Started");

    }


    @Override
    public void accelerator() {
        System.out.println("Accelerator is working");


    }

    @Override
    public void Break() {
        System.out.println("Break is working fine");

    }
}
