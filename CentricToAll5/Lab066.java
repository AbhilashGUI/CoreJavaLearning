package CentricToAll5;

public class Lab066 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) { //Breaking the statement at this condition
                break;
                //Since we are printing the statement after the break. It breaks at the provided condition

            }
            System.out.println("i= " + i);
        }
        System.out.println("Breaks the condition at 5");
    }
}
