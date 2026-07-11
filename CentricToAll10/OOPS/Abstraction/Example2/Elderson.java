package CentricToAll10.OOPS.Abstraction.Example2;

public class Elderson extends Father {


    @Override
    void ownaproperty() {
        super.ownaproperty();
        System.out.println("Being a elderson, I should share the property equally");
    }

    @Override
    void debt10cr() {
        System.out.println("I'm ready to pay 5cr, if brother agrees to pay the other half");
    }
}