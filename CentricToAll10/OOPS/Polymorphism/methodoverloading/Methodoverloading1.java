package CentricToAll10.OOPS.Polymorphism.methodoverloading;

public class Methodoverloading1 {


    public static void main(String[] args)
    {

       new Methodoverloading1().selected(15);
       new Methodoverloading1().selected(10.0);
       new Methodoverloading1().selected(5.0f);

    }

    void  selected(int round1)
    {
        System.out.println(round1 + " candiates are selected round 1 ");
    }

    void selected(double round2)
    {
        System.out.println(round2 + " are selected for round 2 ");
    }
    void selected(float round3)
    {
        System.out.println(round3 + " are selected for round 3");
    }

}
