package CentricToAll5;

public class Lab068 {

    public static void main(String[] args) {


        for (int i = 10; i > 1; i--) {

            if (i == 3) {
                break;//Since we are printing the statement after the break. It breaks at the provided condition
            }
            System.out.println("value is "+ i);
        }

     System.out.print("Breaked at the condition 3");
    }
}

