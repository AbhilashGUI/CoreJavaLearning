package CentricToAll10.OOPS.Abstraction.Example4;

public class RC {

    public static void main(String[] args) {
        Production p = new Production() {
            @Override
            void plastic() {
                System.out.println("Are manufactured in this unit");
            }
        };
        p.plasticmaterial();
        p.plastic();

    }
}
