package CentricToAll10.OOPS.VariableTypes;

public class StaticDemo
{

    //Static variable:Cannot be a local variable

    public static String college_name="The Testing Academy";

    //Non-Static variable=Local variable or instance variable
    //Instance variable: Is declared with the class but outside the body of the method. It cannot be declared as static
    //local variable: Is declared with the body of the method. It cannot be declared as static

    public int version=3;

    //Static method
 public static void printName(){
     int age=30;
     System.out.println("Name is :" + college_name);
     //We cannot have instance variable in the static method
     //System.out.println("Version is " + version);
 }


 //Non-static method
    public  void printVersion()
    {
        int age=30;
        System.out.println("Version is " + version);
        System.out.println("Name is :" + college_name);
    }




}
