package CentricToAll9.OOPS.DefaultvaluesofPDTandNonPDT;

public class DefaultvaluesofPDTandNonPDT

{

        //Attributes
        //Default values of primitive and non-primitive data types
        //Applicant details
        String name;
        char gender;
        boolean ismarried;
        byte pincode;
        short familymembers;
        int age;
        long moiblenumber;
        double height;
        float weight;


        //Behaviour

        void name()
        {
            System.out.println(name);
        }

        static boolean ismarried()
        {
            return ismarried();

        }
        static char gender()
        {
            return gender();

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
        System.out.println(familymembers);   //0
        System.out.println(age);             //0
        System.out.println(moiblenumber);    //0
        System.out.println(height);          //0.0
        System.out.println(weight);          //0.0
    }
}



