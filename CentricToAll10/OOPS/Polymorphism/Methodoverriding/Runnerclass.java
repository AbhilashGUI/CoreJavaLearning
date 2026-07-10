package CentricToAll10.OOPS.Polymorphism.Methodoverriding;

public class Runnerclass
{
    public static void main(String[] args)
    {
         Dog dog= new Dog();
         dog.bark();
        //bark() is a method, which is used in both subclass and parent class

         Hound hound=new Hound();
         hound.bark();


         Dog dog1=new Hound();
         dog1.bark();             //Assigning child object to parent class


         //Hound h=new Dog(); //Cannot Assign parent object to child class

    }
}
