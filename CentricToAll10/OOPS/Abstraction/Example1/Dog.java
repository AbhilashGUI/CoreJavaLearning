package CentricToAll10.OOPS.Abstraction.Example1;

public class Dog extends Animal{

    Dog() {
        super();
    }

    @Override
    void domesticanimal() {
        super.domesticanimal();
    }

    @Override
    void pet() {
       System.out.println("My name is tuffy");
    }
}
