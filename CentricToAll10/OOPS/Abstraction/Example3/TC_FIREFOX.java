package CentricToAll10.OOPS.Abstraction.Example3;

public class TC_FIREFOX extends  Browser {
    @Override
    String openbrowser() {
        System.out.println("Starting Firefox");
        return "";
    }

    @Override
    String closebrowser() {
        System.out.println("Closing Firefox");
        return "";
    }

    @Override
    void printlog() {
        super.printlog();
    }
}



