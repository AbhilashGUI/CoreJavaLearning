package CentricToAll10.OOPS.Inheritance.Hierarchial;

public class StateJudiciary extends StateGovernment
{

    String Judiciarybody1;
    String Judiciarybody2;
    String Judiciarybody3;


    StateJudiciary(String judiciarybody1, String judiciarybody2, String judiciarybody3)
    {
     this.Judiciarybody1=judiciarybody1;
     this.Judiciarybody2=judiciarybody2;
     this.Judiciarybody3=judiciarybody3;
    }


    void judgeappointedby()
    {

        System.out.println("Appointed by chief justice on India--> "+Judiciarybody1);
        System.out.println("Appointed by chief justice of respective state--> "+ Judiciarybody2);
        System.out.println("Appointed on the basis of exam evaluation--> "+Judiciarybody3);
    }
}
