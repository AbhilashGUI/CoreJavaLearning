package CentricToAll13.Multithreading.Generics;

public class Lab242A {

    public static void main(String[] args) {
        user<Integer> i=new user<Integer>(50);
        System.out.println(i.getObjects());
        user<Double> i2=new user<Double>(12.74);
        System.out.println(i2.getObjects());
        user<String> i3=new user <String>("Abhilash");
        System.out.println(i3.getObjects());


    }
}

//Operation: D is replaced with the datatype passed , executes accordingly and displays the results
class  user <D> {
    D Objects;
    public user(D objects) {
        Objects = objects;     //Generating the constructor
    }

    public D getObjects() {
        return Objects;        //Generating the Getter method
    }



}
