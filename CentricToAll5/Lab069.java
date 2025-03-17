package CentricToAll5;

public class Lab069 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            if (i == 7) {
                break;  //Since we are printing the statement before the break.

            }
        }
        System.out.print("It prints the provided condition and then breaks");
    }
}


