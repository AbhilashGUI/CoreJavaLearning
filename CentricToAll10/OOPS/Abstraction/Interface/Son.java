package CentricToAll10.OOPS.Abstraction.Interface;

public class Son implements FatherInterface{
    @Override
    public void loan10K() {
        FatherInterface.print2();
        System.out.println("I will pay the loan!");
    }
}
