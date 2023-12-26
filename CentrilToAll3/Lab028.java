package CentrilToAll3;

public class Lab028
{
   public static void main(String[] args)
    {
        String name="Abhilash";  //It is created in String constant pool --In the JVM architecture
        System.out.println(name);

        //new operator is used to create a object of class in object area/heap area
        String name1= new String("Vicky"); //String is created in heap area --In the JVM architecture
        System.out.println(name1);
        System.out.println(new String("king"));  //String is created in heap are--In the JVM architecture


    }
}
