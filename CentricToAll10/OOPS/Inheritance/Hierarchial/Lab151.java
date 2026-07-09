package CentricToAll10.OOPS.Inheritance.Hierarchial;

public class Lab151 {

    public static void main(String[] args)
    {


        Proglanguages pl= new Proglanguages();
        pl.java_author();
        // In this case, only parent class is invoked

        //Java j= new Java();


        //Single inheritance concept, where child objects referring to the parent class

        //pl=new Java("Verbose","Faster");
        Proglanguages pl1=new Java("Verbose","Faster");
        //Parent reference can be allowed to use  child object

        //Java java=new Proglanguages() //Child reference cannot be allowed to use parent object

        //Above both works in the same way

        Java java= new Java("Verbose","Faster");
        java.printdetails();
        java.java_author();

    }
}


