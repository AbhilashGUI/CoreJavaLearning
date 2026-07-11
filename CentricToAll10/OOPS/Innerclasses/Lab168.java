package CentricToAll10.OOPS.Innerclasses;

public class Lab168
{
    public static void main(String[] args)
    {


        Mainbalance mainbalance= new Mainbalance();
        Mainbalance.Secondarybalance secondarybalance= new Mainbalance.Secondarybalance();
        secondarybalance.show();

     //Note: Change in syntax, incase of the static class.

    }
}

class Mainbalance {


    static int b = 200;
    int a = 10;  //instance variable


    static class Secondarybalance {
        void show() {
            //System.out.println(a);   //Static class cannot access instance variable
            System.out.println(b);
        }
    }
}

