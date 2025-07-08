package CentricToAll10.OOPS.Abstraction.Example5;

public class RC {

    public static void main(String[] args) {

        Attendance ac = new Attendance() {
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
        };

        ac.printattendence();
        ac.swipein();
        ac.swipeout();
    }
}







