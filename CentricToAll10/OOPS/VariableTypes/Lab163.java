package CentricToAll10.OOPS.VariableTypes;

public class Lab163{

    public static void main(String[] args)
    {
        //calling the variable of  static method

        System.out.println(StaticDemo.institutename);
        StaticDemo.printname();

        StaticDemo staticDemo= new StaticDemo();
        staticDemo.printyear();
        staticDemo.enrolled_year=2025; //Re-enrolled
        staticDemo.printyear();
        //It prints new enrolled year with college name

        StaticDemo staticDemo1=new StaticDemo();
        staticDemo1.completionyear();



    }
}