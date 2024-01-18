package CentricToAll9.OOPS.Constructors;

public class Lab144
{
    public static void main(String[] args)
    {

        //RUNNER OF PERSONCLASS//


     Person p = new Person();
     p.Name="Abhilash";   //Referring to the instance variables created in the source file with the same class name
     p.Age=27;
     p.Gender="Male";
     System.out.println(p.Name);
     System.out.println(p.Age);
     System.out.println(p.Gender);

     Person p2=new Person();
     p2.Name="Vicky";
     p2.Occupation="Selfemployed";
     p2.Package=4.2f;
     System.out.println(p2.Name);
     System.out.println(p2.Occupation);
     System.out.println(p2.Package);

    new Person();//The moment you enter new a  object is created in OA
    Person p3=null;  //
    System.out.println(p3);








    }
}
