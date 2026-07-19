package CentricToAll13.Multithreading.Generics;

public class Lab242A {


    public static void main(String[] args)
    {

        userdefined<Integer> i= new userdefined<>(100);
        System.out.println(i.getObjects());
        userdefined<String> s= new userdefined<>("Abhilash");
        System.out.println(s.getObjects());
        userdefined<Character> c= new userdefined<>('A');
        System.out.println(c.getObjects());
        userdefined<Float> f= new userdefined<>(22.7f);
        System.out.println(f.getObjects());


    }
}

//Operation: D is replaced with the datatype passed , executes accordingly and displays the results

class userdefined<O>{

    public O getObjects() {
        return Objects;
    }

    O Objects;

    public userdefined(O objects) {
        Objects = objects;
    }


}