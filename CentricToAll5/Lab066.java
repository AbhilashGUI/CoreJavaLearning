package CentricToAll5;

public class Lab066 {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            if (i == 4) //Breaking the statement at the assigned condition
            {
                break;  //Since we are printing the statement after the break. It breaks at the provided condition

            }
            System.out.println("Value is " + i);
        }
        System.out.println("Breaked the condition at 4");
    }


}