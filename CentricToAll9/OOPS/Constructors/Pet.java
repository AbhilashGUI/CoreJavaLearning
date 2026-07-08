package CentricToAll9.OOPS.Constructors;

public class Pet {

    //Declaring attributes

    String Petname;
    String Petbreed;
    String PetOrigin;
    String Petcolor;
    int Petheight;
    int Petweight;
    int Lifespan;


    //Behaviour

    static void bark()
    {
        System.out.println("Dog is a very loyal pet");
    }
    static void observe()
    {
        System.out.println("Dog remains active most of the time");
    }

    static int height()
    {
        return 65;
    }

}