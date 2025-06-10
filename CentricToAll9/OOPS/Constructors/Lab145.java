package CentricToAll9.OOPS.Constructors;

import CentricToAll9.OOPS.Constructors.Animal;

public class Lab145

{

    public static void main(String[] args)
    {

        //RUNNER OF ANIMALCLASS//

    Animal dog =new Animal();
    dog.Dog="Tuffy";
    dog.Breed="German Shepard";  //Referring to the instance variables created in the source file with the same  class name
    dog.Origin="German";
    dog.Colour="Brown";
    dog.Height=65; //In cm's
    dog.Weight=40; //In kg's
    dog.Lifespan=15;
    System.out.println(dog.Dog);
    System.out.println(dog.Breed);
    System.out.println(dog.Origin);
    System.out.println(dog.Colour);
    System.out.println(dog.Height);
    System.out.println(dog.Weight);
    System.out.println(dog.Lifespan);




    }
}

