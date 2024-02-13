package CentricToAll13.Multithreading.Generics;

public class Lab242 {

    //Defining the generic class and passing different data types in argument

    public static void main(String[] args)
    {

    Test<Integer> i=new Test<Integer>(50);
    System.out.println(i.getObjects());
    Test<Double> i2=new Test<Double>(12.74);
    System.out.println(i2.getObjects());
    Test<String> i3=new Test<String>("Abhilash");
    System.out.println(i3.getObjects());


    }
}

//Operation: T is replaced with the datatype passed , executes accordingly and displays the results
class  Test <T> {
    T Objects;
    public Test(T objects) {
        Objects = objects;     //Generating the constructor
    }

    public T getObjects() {
        return Objects;        //Generating the Getter method
    }



}