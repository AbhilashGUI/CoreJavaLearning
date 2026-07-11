package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;

public class Computer implements SMPS,Processor,RAM,Storage {
    void turnonCPU() {
        System.out.println("Computer should be working");
        sourceofpowersupply();
        performanceoffetchingresults();
        processinstructions();
        ssd();

    }

    @Override
    public void sourceofpowersupply() {
        System.out.print("SMPS is Working fine");
    }

    @Override
    public void processinstructions() {
        System.out.println("Processor is Working fine");
    }

    @Override
    public void performanceoffetchingresults() {
        System.out.println("RAM is Working fine");
    }

    @Override
    public void ssd() {
        System.out.println("Storage is working fine");
    }
}