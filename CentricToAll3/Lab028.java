package CentricToAll3;

public class Lab028
{
   public static void main(String[] args)
   {

     String name="Abhilash"; //It is created in String constant pool --In the JVM architecture
     System.out.println(name);
     String name1="Abhilash"; // since the value is same,it is pointing to the same string.
     name1="Vemula"; // Since we are replacing the name, it creates a memory in SCP
     String name2="Vemula"; // since the value is same,it is  pointing to the same string.
     System.out.println(name1);
     System.out.println(name2);

       //new operator is used to create an object of a class in object area/heap area
      String name3= new String("Sharma"); //String is created in heap area --In the JVM architecture
      System.out.println(name3);
      System.out.println(new String("Vemula Abhilash Sharma"));
      //String is created in heap area because of using new operator


   }
}
