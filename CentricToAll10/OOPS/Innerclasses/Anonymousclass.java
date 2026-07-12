package CentricToAll10.OOPS.Innerclasses;

public class Anonymousclass {

    public static void main(String[] args)
    {
        Strength strength= new Strength() {
            @Override
            public void setname() {
                System.out.println("This is an implmentation of anonymousclass");

            }
        };
        strength.setname();

        Secondstandard secondstandard= new Secondstandard() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };

        //Note: We are creating an objects for abstract class  with the help of anonymous class


    }

}


abstract class Secondstandard{
    int a=10;

}

interface Strength{
    int b=20;
    void setname();

}