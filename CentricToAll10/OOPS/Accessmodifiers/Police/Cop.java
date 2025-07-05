package CentricToAll10.OOPS.Accessmodifiers.Police;

public class Cop {


    public int gunwithbullets;

    //Modifier with return type and  name_variable

    //Defining  the constructor

    public Cop(int gunwithbullets)
    {
        this.gunwithbullets= gunwithbullets;
    }


    private void CanIshoot()
    {
        System.out.println("Only I'm allowed to shoot at site");
    }

    public void CanIshoot1()

    //Note:If we declare as public, access granted to thief class and junior cop class
    //Note: If we declare as protected, only junior cop class can access
    //Note: If we declare as private, only cop class  can access


    {

        System.out.println("Of-course, you can shoot");
    }

    public void CanIshoot2()
    {
        System.out.println("Yes, since it is public you may get access but it is considered as violating");
    }

    public static void main(String[] args)
    {

        Cop cop= new Cop(5);
        cop.CanIshoot();
        System.out.println("You are allowed to take additional bullets if needed");
        //cop.CanIshoot1();   Since
        //cop.CanIshoot2();
    }
}