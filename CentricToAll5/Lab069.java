package CentricToAll5;

public class Lab069 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = "+i);
            //Since we are printing the statement before the condition, it prints and then breaks.
            if (i == 4) {
                break;
            }
        }
        System.out.println("It breaks after printing the condition 4");
    }
}

