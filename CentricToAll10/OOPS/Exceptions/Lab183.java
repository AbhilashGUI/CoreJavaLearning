package CentricToAll10.OOPS.Exceptions;

public class Lab183 {
    public static void checkeligibility(int age)
    {


            if(age<18)
            {
                throw new ArithmeticException("Not eligible to vote");
            }
            else
            {
                System.out.println("You are eligible to vote");
            }
        }

        public static void main(String[] args)
        {
            try
            {
             checkeligibility(19);
            }catch(ArithmeticException e)
            {

                System.out.println(e.getMessage());

            }

        }
}


