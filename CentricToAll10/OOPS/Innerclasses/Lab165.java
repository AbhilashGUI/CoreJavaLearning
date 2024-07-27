package CentricToAll10.OOPS.Innerclasses;

public class Lab165 {


    class outerclass {       //Outerclass cannot access the Innerclass

        int a = 10;

        void oc()
        {
            System.out.println(a);
            //System.out.println(b);
        }


         class innerclass {
             //Innerclass can access outerclass and innerclass.
             // Hence, it is considered as a security mechanism

            int b = 10;

            void ic() {
                System.out.println(a);
                System.out.println(b);
            }

        }
    }
}
