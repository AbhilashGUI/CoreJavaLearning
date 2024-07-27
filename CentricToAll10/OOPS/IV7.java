package CentricToAll10.OOPS;

public class IV7 {

    public static void main(String[] args)
    {
        Grandfather.GrandSon1 gfgs=new Grandfather.GrandSon1();
        gfgs.v1();
        gfgs.v2();

    }
}

abstract  class Grandfather {

    abstract void v1();  //Incomplete function will always have abstract keyword

    abstract void v2();

    void GEP() {
        System.out.println("Earned single property");
    }

    abstract class Father extends Grandfather {

        abstract void v3();  //incomplete function

        abstract void v4();


    }

    static class GrandSon1 extends Grandfather {
        @Override
        void v1() {
            System.out.println("Grandfather  is a property owner");
        }

        @Override
        void v2() {
            System.out.println("Grandson is a legal heir");
        }


    }
}







