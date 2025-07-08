package CentricToAll10.OOPS.Abstraction.Example5;

public class Swipein extends Attendance {

    @Override
    String swipein() {
        System.out.println("Logged in");
        return "";
    }

    @Override
    String swipeout() {
        System.out.println("Logged out");
        return "";
    }
}


