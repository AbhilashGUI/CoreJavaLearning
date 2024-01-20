package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;

public class Car implements Engine,Break
{


    void start()
    {

        System.out.println("Starting the car");
        startEngine();
        Break();
    }


    @Override
    public void Break() {
        System.out.println("Break is working fine");

    }

    @Override
    public void startEngine()
    {
        System.out.println("Engine Started");

    }
}
