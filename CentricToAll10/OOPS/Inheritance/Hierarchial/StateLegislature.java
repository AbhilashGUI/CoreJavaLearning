package CentricToAll10.OOPS.Inheritance.Hierarchial;

public class StateLegislature extends StateGovernment {
    String Legislativebody1;
    String Legislativebody2;

     StateLegislature(String legistlativebody1, String legislativebody2) {
         this.Legislativebody1 = legistlativebody1;
         this.Legislativebody2 = legislativebody2;
     }

    void electedby()
    {
        System.out.println("Elected by people-->"+Legislativebody1);
        System.out.println("Nominated by govenor-->"+Legislativebody2);


    }
}
