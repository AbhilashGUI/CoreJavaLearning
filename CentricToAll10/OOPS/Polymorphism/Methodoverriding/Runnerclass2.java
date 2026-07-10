package CentricToAll10.OOPS.Polymorphism.Methodoverriding;

public class Runnerclass2 {

    public static void main(String[] args)
    {
        Education education= new Education();
        education.enlightment();

        Education education1= new Schooling();
        education1.enlightment();

        Education education2= new Diploma();
        education2.enlightment();

        Education education3= new Graduate();
        education3.enlightment();


    }



}
