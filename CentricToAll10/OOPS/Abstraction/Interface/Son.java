package CentricToAll10.OOPS.Abstraction.Interface;

public class Son implements Father {

    @Override
    public void loan10K() {

        System.out.println("I'll pay the balance amount");
    }

    @Override
    public void print() {
        System.out.println("I Have a loan of 10k");
        Father.super.print();
    }



}



