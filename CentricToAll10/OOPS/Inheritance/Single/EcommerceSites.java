package CentricToAll10.OOPS.Inheritance.Single;

import java.util.jar.Attributes;

public class EcommerceSites {

    //Attributes

       String apparel;
       String electronics;
       String groceries;
       String Health;
       int discount;



       EcommerceSites(String ap,String ec, String gr,String He, int dis) {
           this.apparel = ap;
           this.electronics = ec;
           this.groceries = gr;
           this.Health = He;
           this.discount = dis;

       }


       void printdetails()
       {
           System.out.println("apparel - "+ this.apparel);
           System.out.println("electronics - "+ this.electronics);
           System.out.println("groceries - " + this.groceries);
           System.out.println("Health products - "+this.Health);
           System.out.println("Flat discout - " +this.discount);



    //


}

















}
