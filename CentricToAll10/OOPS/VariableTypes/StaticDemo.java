package CentricToAll10.OOPS.VariableTypes;

public class StaticDemo
{

    //Static variable:Cannot be a local variable

   public static String Institute_name="The Testing Academy";

    //Non-Static variable=Local variable or Instance variable
    //Instance variable: Is declared with the class but outside the body of the method. It cannot be declared as static
    //local variable: Is declared with the body of the method. It cannot be declared as static

   public int enrolledyear=2024;

    //Static method
      public static void printname()
      {
          int completion=1;
          System.out.println("Name of the Institute:"+Institute_name);
     //We cannot have instance/non-static variable in the static method
        // System.out.println("Enrolled in " + enrolledyear);
 }


 //Non-static method

        public void  printyear()
        {
            int completion=1;
        //But we can have static variable in non-static method
            System.out.println("Name of the institute"+Institute_name);
            System.out.println("Enrolled in the year "+enrolledyear);
    }

         public void printcompletionyear()
       {
          System.out.println("Completed in the year 2025");
       }


}
