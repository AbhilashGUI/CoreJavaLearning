package CentricToAll9.OOPS.Constructors;

public class Lab145
{
    public static void main()
    {

        Pet p= new Pet();
        p.Petname="Tuffy";
        p.Petbreed="Germanshepard";
        p.PetOrigin="German";
        p.Petcolor="Brown";
        p.Petheight=60;
        p.Petweight=80;
        p.Lifespan=15;

        System.out.println("My pet details");
        System.out.println(p.Petname);
        System.out.println(p.PetOrigin);
        System.out.println(p.Petbreed);
        System.out.println(p.Petcolor);
        System.out.println(p.Lifespan);
        System.out.println(p.Petheight);
        System.out.println(p.Petweight);



    }
}