package CentricToAll5;

public class Lab071 {
    public static void main(String[] args) {
        for (int i = 10; i > 1; i--) {
            System.out.println(i);

            if (i == 3) {
                break;//Since we are printing the statement before the break.
            }
        }
        System.out.print("It prints the provided condition and then breaks");
    }
}

