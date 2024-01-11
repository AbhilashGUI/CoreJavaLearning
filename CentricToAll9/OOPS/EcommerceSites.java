package CentricToAll9.OOPS;

import java.util.jar.Attributes;

public class EcommerceSites
{

    //Attributes

    String fashion;
    String mobiles;
    String electronics;
    String grocery;

     int  discount;

    //

    EcommerceSites(String TC, String IID,String MC,String FD,int RD)
            //RD stands for reduction in %age
    {

        this.fashion=TC;
        this.mobiles=IID;
        this.electronics=MC;
        this.grocery=FD;
        this.discount=RD;



    }


    void printdetails()
    {
        System.out.println("Fashion : " + fashion);
        System.out.println("Mobiles : " + mobiles);
        System.out.println("Electronics : " + electronics);
        System.out.println("Grocery : " + grocery);
        System.out.println("Discount :" + discount);







    }







}
