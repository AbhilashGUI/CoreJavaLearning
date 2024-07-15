package CentricToAll9.OOPS.DefaultvaluesofPDTandNonPDT;

public class DefaultvaluesofPDTandNonPDT

{

        //Attributes
        //Default values of primitive and non-primitive data types
        //Applicant details
        String name;
        boolean ismarried;
        char gender;
        byte pincode;
        short assetsearned;
        int age;
        long moiblenumber;
        double height;
        float weight;


        void name()
        {
            System.out.println(name);
        }

        static boolean ismarried()
        {
            return ismarried();

        }
        static char c()
        {
            return c();

        }


        static byte balance()
        {
            return balance();
        }

        static short familymembers()
        {
            return familymembers();
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
        System.out.println(ismarried);   //false
        System.out.println(gender);          //empty
        System.out.println(pincode);         //0
        System.out.println(assetsearned);   //0
        System.out.println(age);             //0
        System.out.println(moiblenumber);    //0
        System.out.println(height);          //0.0
        System.out.println(weight);          //0.0
    }
}



