package CentricToAll10.OOPS.Accessmodifiers.Police;

public class Cop {

    int Gunwithbullets;
    public Cop(int gunwithbullets) {
        Gunwithbullets = gunwithbullets;
    }


    private  void CanIshoot()
    {
        System.out.println("You are allowed to shoot at site");
    }
    protected void CanIshoot1()
    {
        System.out.println("Yes, You are allowed to shoot");
    }
    public void CanIshoot2()
    {
        System.out.println("Yes,since it is public in nature");
    }

    public static void main(String[] args)
    {
        Cop cop= new Cop(6);
        cop.CanIshoot();
        cop.CanIshoot1();
        cop.CanIshoot2();

    }





}