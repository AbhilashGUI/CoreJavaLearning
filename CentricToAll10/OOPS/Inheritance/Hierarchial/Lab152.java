package CentricToAll10.OOPS.Inheritance.Hierarchial;

public class Lab152 {

    public static void main(String[] args)
    {
        Proglanguages pl= new Proglanguages();
        pl.python_author();

        pl=new Python("Simple","Slower"); //Expected
        //Python python= new Proglanguages();  //Not allowed

        Python python= new Python("Simple","Slower");
        python.printdetails();
        python.python_author();




    }
}