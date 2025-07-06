package CentricToAll10.OOPS.Polymorphism.methodoverloading;

public class Methodoverloading1 {


    public static void main(String[] args)
    {

       new Methodoverloading1().selected(15);
       new Methodoverloading1().selected(10);
       new Methodoverloading1().selected(5);

    }

    void  selected(int round1)
    {
        System.out.println(round1 + " are selected for round1/round2/round3 ");
    }

    void selected(byte round2)
    {
        System.out.println(round2 + "are selected for round2 ");
    }
    void selected(short round3)
    {
        System.out.println(round3 + "are selected for round3");
    }

}
