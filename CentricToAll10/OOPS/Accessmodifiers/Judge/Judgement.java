package CentricToAll10.OOPS.Accessmodifiers.Judge;

public class Judgement {

    public String punishtheaccused;


    public Judgement(String punishtheaccused) {
        this.punishtheaccused = punishtheaccused;
    }


    protected void verdict()
    //Note:If we declare as public, giving access to Accused class and Lawyer class
    //Note: If we declare as protected, only lawyer class can access
    //Note: If we declare as private, only Accused class  can access




    {
        System.out.println("Has the superpower in doing justice");
    }
}



