package CentricToAll9.OOPS.DefaultvaluesofPDT;

public class DefaultvaluesofPDT

{

        //Attributes
        //Default values of primitive data types
        String name;
        boolean maritalStatus;
        char c;
        byte balance;
        short credit;
        int age;
        long moibleNumber;

        double height;

        float weight;


        void name()
        {
            System.out.println(name);
        }

        static boolean maritalStatus()
        {
            return maritalStatus();

        }
        static char c()
        {
            return c();

        }


        static byte balance()
        {
            return balance();
        }

        static short credit()
        {
            return credit();
        }

        static int age()
        {
            return age();
        }

        static long moibleNumber()
        {
            return moibleNumber ();

        }

        static  double height()
        {
            return height();
        }
        static float weight()
        {
            return weight();
        }


    public void printDetails()
    {
        System.out.println(name);            //null
        System.out.println(maritalStatus);   //false
        System.out.println(c);               //0
        System.out.println(balance);         //0
        System.out.println(credit);          //0
        System.out.println(age);             //0
        System.out.println(moibleNumber);    //0
        System.out.println(height);          //0.0
        System.out.println(weight);          //0.0
    }
}



