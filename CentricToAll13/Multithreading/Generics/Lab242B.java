package CentricToAll13.Multithreading.Generics;

public class Lab242B {

    public static void  main(String[] args)
    {
        person <String> name=new person<String>("Abhilash");
        System.out.println(name.getObjects());
        person <Character> gender= new person<Character>('M');
        System.out.println(gender.getObjects());
        person <Integer> age= new person<Integer>(25);
        System.out.println(age.getObjects());
        person <String> occupation= new person<String>("Software Professional");
        System.out.println(occupation.getObjects());
    }
}

class person <p>{

    p Objects;
    public person(p objects) {
        Objects = objects;
    }


    public p getObjects() {
        return Objects;
    }


}