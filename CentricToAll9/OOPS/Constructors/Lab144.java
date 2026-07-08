package CentricToAll9.OOPS.Constructors;

public class Lab144 {

    //Runner class
    public static void main(String [] args)
    {
        Person p= new Person();
        p.Name="Abilash";
        p.Gender='M';
        p.age=30;
        p.married=false;
        p.Occupation="IT professional";
        p.mobilenumber=5656539874l;
        p.annualctc=7.5f;

        System.out.println("Following are the applicant details");
        System.out.println(p.Name);
        System.out.println(p.Gender);
        System.out.println(p.age);
        System.out.println(p.married);
        System.out.println(p.Occupation);
        System.out.println(p.mobilenumber);
        System.out.println(p.annualctc);


    }
}