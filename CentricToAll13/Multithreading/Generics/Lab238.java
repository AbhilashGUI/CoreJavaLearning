package CentricToAll13.Multithreading.Generics;

public class Lab238 {

    //Defining the main method and arguments outside the class

   public static <Generic>void Studentdetails(Generic student1)
   {
       System.out.println(student1);
   }

   public static void main(String[] args)
   {
       Studentdetails("Abhilash");
       Studentdetails('M');
       Studentdetails(29.8);
       Studentdetails(true);
       Studentdetails(4);

   }
}