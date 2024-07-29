package CentricToAll10.OOPS.Innerclasses;

public class Anonymousclass {

    public Anonymousclass() {
        super();
    }

    public static void main(String[] args) {
        Strength s = new Strength() {
            @Override
            public void setname() {
             System.out.println("Anonymous class");

            }
        };
        s.setname();
        Secondstandard secondstandard= new Secondstandard() {
            @Override
            public int hashCode() {
                return super.hashCode();
                //Note: We are creating an objects for abstract class  with the help of anonymous class
            }

        };


    }
}

abstract class Secondstandard
{
    int a =2;
        }
 interface  Strength
 {
     int b=12;
     void setname();



 }