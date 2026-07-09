package CentricToAll10.OOPS.Inheritance.Hierarchial;

public class Lab155
{

    public static  void main(String[] args)
    {

        //RUNNER OF GOVERNMENTOFINDIA//

        Governmentofindia GOI=new Governmentofindia();
        GOI.Governmentofindia();

        Executive ec=new Executive("President","Prime Minister","Cabinet Ministers");
        ec.Decisionmakers();

        Legislatureofparliament lp=new Legislatureofparliament("Loksabha","Rajyasabha");
        lp.headedby();

        Judiciary jd= new Judiciary("Supreme court of india");
        jd.finaljusticeseek();

        Governmentofindia GOI1= new Executive("P","PM","COM");
        GOI1.Governmentofindia();

        Governmentofindia GOI2= new Legislatureofparliament("PM","VP");
        GOI2.Governmentofindia();

        Governmentofindia GOI3= new Judiciary("SC");
        GOI.Governmentofindia();







    }

}
