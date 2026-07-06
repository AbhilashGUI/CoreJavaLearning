package CentricToAll4;

public class Lab040
{
    public static void main(String[] args) {
        //3rd example

        byte b=125;
        int i=450;
        long l=1200;

        if(i<b)
        {
            System.out.println("Intentionally failing the criteria");
        }
        else if(l<i)
        {
            System.out.println("Intentionally failing the criteria");

        }
        else
        {
            System.out.println("Condition is satisfied");
        }

    }


}
