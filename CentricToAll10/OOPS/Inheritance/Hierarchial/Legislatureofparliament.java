package CentricToAll10.OOPS.Inheritance.Hierarchial;


public class Legislatureofparliament extends Governmentofindia

{

    String Legislature1;
    String Legislature2;

    Legislatureofparliament(String legislature1, String legislature2)
    {
        this.Legislature1=legislature1;
        this.Legislature2=legislature2;
    }
    void headedby()
    {
        System.out.println("Prime minister is the leader of the house-->" +Legislature1);
        System.out.println("Vice President is the  leader of the house-->"+Legislature2);
    }



}
