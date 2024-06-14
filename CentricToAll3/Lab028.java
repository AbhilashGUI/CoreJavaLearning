package CentricToAll3;

public class Lab028
{
   public static void main(String[] args)
    {
        String name="Abhilash";  //It is created in String constant pool --In the JVM architecture
        System.out.println(name);
        String name1="Abhilash"; //Even this is also pointing to the same string, since it is similar
        name1="V.Abhilash";  //It creates a new string in the SCP
        System.out.println(name1);

        //new operator is used to create a object of class in object area/heap area
        String name2= new String("Vicky"); //String is created in heap area --In the JVM architecture
        System.out.println(name2);
        System.out.println(new String("king"));  //String is created in heap area because of using new operator



    }
}
