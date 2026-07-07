package CentricToAll5;

public class Lab077 {
    public static void main(String[] args) {
        //Since we are breaking the even condition, the output breaks at the first condition.

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                break;
            }
            System.out.println(i); //It breaks and print the condition
        }

        for (int j=10;j>=0;j--)
        {
            if(j%2==0)
            {
                System.out.println(j); //It prints and break the condition
            }
            break;
        }
    }
}





