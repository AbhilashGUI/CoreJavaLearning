package CentricToAll10.OOPS.Innerclasses;

public class Lab169
{
    public static void  main(String[] args)
    {

        Abhilash ab=new Abhilash();
        Abhilash.Disciple disciple=new Abhilash.Disciple();
        disciple.learning();

    }


}

class Abhilash {
    int age = 30;
    void striving() {
        System.out.println("For a good career");
    }


    static class Disciple {     //Make class as non-static my removing it

        void learning() {

            //System.out.println(age);   //If the class is non-static can use instance variable
            System.out.println("Upgrading skills");  //Static class cannot access instance variable and functions defined in non-static class

        }


    }
}
