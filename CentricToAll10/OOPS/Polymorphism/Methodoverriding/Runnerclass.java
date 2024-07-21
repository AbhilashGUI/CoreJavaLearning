package CentricToAll10.OOPS.Polymorphism.Methodoverriding;

public class Runnerclass
{
    public static void main(String[] args)
    {
         Dog D= new Dog();
         D.bark();
//bark() is a method, which is used in both subclass and parent class

         Hound H=new Hound();
         H.bark();
//

         Dog D1=new Hound();
         D1.bark();             //Assigning child object to parent class


         //Hound h=new Dog(); //Cannot Assign parent object to child class

    }
}
