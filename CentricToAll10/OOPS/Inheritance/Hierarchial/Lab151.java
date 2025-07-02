package CentricToAll10.OOPS.Inheritance.Hierarchial;

public class Lab151
{
    public static void main(String[] args)
    {
        //RUNNER OF PROGRAMMINGLANGUAGESCLASS//


     PROGRAMMINGLANG pl=new PROGRAMMINGLANG();
        // In this case, only parent class is invoked
        //Java j=new Java();
     //Both parent and child classes are invoked.


        PROGRAMMINGLANG pl2=new Java("Verbose","Faster");  //Parent reference can be allowed to use  child object
        //Java J=new PROGRAMMINGLANG();     //Child reference cannot be allowed to use parent object



       //Single inheritance concept, where child objects referring to the parent class

        Java j1=new Java("Verbose", "Faster");
        j1.printdetails();  //Printing paramters

        j1.java_author();
        j1.java_oops_author();










    }
}
