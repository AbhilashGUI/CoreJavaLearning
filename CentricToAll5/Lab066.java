package CentricToAll5;

public class Lab066 {
    public static void main(String[] args) {

//Breaking the integer
        for(int i=0;i<10;i++)
        {
            if(i==7) //Breaking the statement at this condition
            {
                break; //Since we are printing the statement after the break. It breaks at the provided condition

            }
            System.out.println("i = "+i);
        }
        System.out.print("Breaking the condition at 7");

    }



}