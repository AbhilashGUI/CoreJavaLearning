package CentricToAll10.OOPS.Accessmodifiers.Judge;

public class Judgement {

    public String punishtheaccused;


    public Judgement(String punishtheaccused) {
        this.punishtheaccused = punishtheaccused;
    }

    private void verdict()
    {
        System.out.println("Has the superpower in doing justice ");
    }

    protected void verdict1()
    //Note:If we declare as public, granting access to Accused class and Lawyer class
    //Note: If we declare as protected, only lawyer class can access
    //Note: If we declare as private, only Accused class  can access



    {
        System.out.println("Requesting for expedite");
    }

    public void verdict2()
    {
        System.out.println("Bringing to notice");
    }
    public static void main(String [] args)
    {
     Judgement judgement= new Judgement("My lord");
     judgement.verdict();
     System.out.println("My judgement is final");
    }
}



