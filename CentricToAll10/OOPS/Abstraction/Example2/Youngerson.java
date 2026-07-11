package CentricToAll10.OOPS.Abstraction.Example2;

public class Youngerson extends Father {


    @Override
    void ownaproperty() {
        super.ownaproperty();
        System.out.println("Let the elder one take the decision");
    }

    @Override
    void debt10cr() {
        System.out.println("As instructed, I'll pay the other half");
    }
}