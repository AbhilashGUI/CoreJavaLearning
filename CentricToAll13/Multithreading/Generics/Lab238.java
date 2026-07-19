package CentricToAll13.Multithreading.Generics;

public class Lab238 {

    //Defining the main method and arguments outside the class


    public static <Generic> void Aspirant(Generic id1) {
        System.out.println(id1);
    }


    public static void main(String[] args) {
        Aspirant("Registered for Java with selenium");
        Aspirant('M'); //Morning batch
        Aspirant(10000); //fee
        Aspirant(3.5); //Duration in months


    }
}