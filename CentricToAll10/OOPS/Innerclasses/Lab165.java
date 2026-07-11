package CentricToAll10.OOPS.Innerclasses;

public class Lab165 {


    class  Outerclass
    {
        int a=10;

        void oc()
        {
            System.out.println(a);
            //System.out.println(f);  //Outerclass variables cannot accessed by innerclasses.
        }


    class Innerclass
    {
        float f=10.2f;

        void ic()
        {
            System.out.println(a);
            System.out.println(f);
        }
    }
    }
}