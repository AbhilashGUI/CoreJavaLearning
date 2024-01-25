package CentricToAll10.OOPS.Exceptions;

public class Lab183 {
    public static void main(String[] args) {
        extracted2();
        System.out.println("Main Method Execution");
    }



        private static void extracted2()
        {
            extracted1();
            System.out.println("Extracted2 will be  Executed");
        }


        private static void extracted1()
        {
            extracted();
            System.out.println("Extracted1 will be  Executed");
        }


        private static void extracted()
        {
            try {

                String name = null;
                name.length();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

