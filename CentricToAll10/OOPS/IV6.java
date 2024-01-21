package CentricToAll10.OOPS;

public class IV6
{
    public static void main(String[] args)
    {

     Fruit f=new Favorite();
     Apple A=new Favorite();
     Favorite fav=new Favorite();

     f.fullofvitamins();
     A.goodforhealth();




    }
}

interface Fruit{

    int a =10;  //Static variable

    void fullofvitamins();  //Non-static function

}

abstract class Apple implements Fruit{

    abstract void goodforhealth();

}

//Note:Only concrete classes has objects
class  Favorite extends Apple{


    @Override
    public void fullofvitamins()
    {
        System.out.println("It contains the vitamin A");

    }

    @Override
    void goodforhealth()
    {
        System.out.println("An apple a day keeps the doctor away");
    }
}
