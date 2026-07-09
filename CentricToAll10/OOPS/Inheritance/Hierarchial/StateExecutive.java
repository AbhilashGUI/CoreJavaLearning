package CentricToAll10.OOPS.Inheritance.Hierarchial;


public class StateExecutive extends StateGovernment {

    String Executivebody1;
    String Executivebody2;
    String Executivebody3;


    StateExecutive(String executivebody1, String executivebody2, String executivebody3)
    {
     this.Executivebody1=executivebody1;
     this.Executivebody2=executivebody2;
     this.Executivebody3=executivebody3;
    }

    void functionsastheyinstructed()
    {
        System.out.println("Prime person-->"+ Executivebody1);
        System.out.println("Decison Maker-->"+ Executivebody2);
        System.out.println("Agreed to the superior-->"+Executivebody3);
    }

}
