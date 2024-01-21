package CentricToAll10.OOPS.Innerclasses;

public class Anonymousclass {
    public Anonymousclass() {
        super();
    }

    public static void main(String[] args) {

        //Note: we cannot create an object for abstract class and interface class. However, we can create a anonymous class for the abstract and interface class

        Strength s = new Strength() {
            @Override
            public void strength() {

            }
        };

        s.strength();
    }




     Secondstandard ss=new Secondstandard() {
         @Override
         public int hashCode() {
             return super.hashCode();      //This is the way to create a anonymous class for abstract class
         }
     };




    abstract class Secondstandard {     //Abstractclass

        int a = 2;
    }

    interface Strength {                //Interfaceclass

        int a = 12;

        void strength();  //Incomplete function
    }

}

