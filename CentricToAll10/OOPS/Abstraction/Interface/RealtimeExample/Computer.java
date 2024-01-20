package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;

public class Computer implements SMPS,Processor,RAM
{
    void turnonCPU()
    {
        System.out.println("Computer should be working");
        startprocessor();
        startram();
        powersupply();
    }


    @Override
    public void startprocessor()
    {
        System.out.println("To perform computer operations");

    }

    @Override
    public void startram()
    {
        System.out.println("To store the data");

    }

    @Override
    public void powersupply()
    {
      System.out.println("Yeah, we have uninterrupted power supply");
    }
}
