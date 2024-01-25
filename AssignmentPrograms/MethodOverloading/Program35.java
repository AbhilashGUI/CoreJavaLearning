package AssignmentPrograms.MethodOverloading;

public class Program35

{
    //Create a class of ATB
    //Concept of Methodoverloading

    void ATB(String Coursename)
    {
        Coursename="Automation Tester batch 5x";
        System.out.println("Name is String : "+Coursename);
    }

    void ATB(char I)
    {
        System.out.println("I is a character : " + I);  //I Represent: Interest
    }
    void ATB(int Strength)
    {
        System.out.println("Strength is an integer: "+Strength);
    }







}
