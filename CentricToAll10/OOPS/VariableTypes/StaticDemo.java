package CentricToAll10.OOPS.VariableTypes;

public class StaticDemo {

    //Static variable
    //Static variable:Cannot be a local variable

    public static String institutename = "The Testing Academy";

    //instance variable

    public int enrolled_year = 2024;
    //Non-Static variable=Local variable or Instance variable
    //Instance variable: Is declared with the class but outside the body of the method. It cannot be declared as static
    //local variable: Is declared with the body of the method. It cannot be declared as static


    //Static method

    public static void printname() {
        System.out.println("Name  of the institute :" + institutename);
        //Cannot have a instance variable in the static method
        //System.out.println("Enrolled in the year"+enrolled_year);
    }

    //Non-static method

    public void printyear() {
        //But we can have static variable in non-static method

        System.out.println("Name of the institute : "+institutename);
        System.out.println("Enrolled in the year : " +enrolled_year);

    }

    public void completionyear()
    {
        System.out.println("Completed in the year> 2025");
        System.out.println("Revised in the year> 2026");
    }
}