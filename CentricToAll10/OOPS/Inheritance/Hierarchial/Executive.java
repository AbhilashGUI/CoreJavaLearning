package CentricToAll10.OOPS.Inheritance.Hierarchial;


public class Executive extends Governmentofindia
{

    String Executive1;
    String Executive2;
    String Executive3;


    Executive(String executive1, String executive2, String executive3)
    {
        this.Executive1=executive1;
        this.Executive2=executive2;
        this.Executive3=executive3;
    }

    void Decisionmakers()

    {
        System.out.println(Executive1);
        System.out.println(Executive2);
        System.out.println(Executive3);
    }





}
