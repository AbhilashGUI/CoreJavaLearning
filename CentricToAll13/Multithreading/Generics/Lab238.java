package CentricToAll13.Multithreading.Generics;

public class Lab238 {

    //Defining the main method and arguments outside the class

   public static <Generic>void Studentdetails(Generic a)
   {
       System.out.println(a);
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