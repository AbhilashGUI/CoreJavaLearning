package CentricToAll10.OOPS.Accessmodifiers.Police;

public class Cop {
    public int gunwithbullets;

    //Modifier with return type and  name_variable

    //Defining  the constructor

    public Cop(int gunwithbullets)
    {
        this.gunwithbullets= gunwithbullets;
    }


    protected void CanIshoot()

    //Note:If we declare as public, access granted to thief class and junior cop class
    //Note: If we declare as protected, only junior cop class can access
    //Note: If we declare as private, only cop class  can access




    {

        System.out.println("Of-course, you can shoot");
    }
}