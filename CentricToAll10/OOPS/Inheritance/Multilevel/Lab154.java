package CentricToAll10.OOPS.Inheritance.Multilevel;

public class Lab154 {
    public static void main(String[] args) {

        //RUNNER OF FOUNDERCLASS//

        Founder founder = new Founder();
        founder.established();

        Runner runner = new Runner();
        runner.established();

        Gamechanger gamechanger = new Gamechanger();
        gamechanger.established();

        Ruiner ruiner= new Ruiner();
        ruiner.established();


        //Inheritance concept
        Founder f1 = new Ruiner();
        f1.established();

        Runner r1= new Ruiner();
        r1.established();

        Gamechanger g1=new Ruiner();
        g1.established();

        Ruiner u1= new Ruiner();
        u1.established();


    }

}
