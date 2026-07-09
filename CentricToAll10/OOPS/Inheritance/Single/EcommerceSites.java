package CentricToAll10.OOPS.Inheritance.Single;


public class EcommerceSites {

    //Attriubtes
    String Fashion;
    String Mobiles;
    String Electronics;
    String HomeAppliances;
    String Food;
    String Healthcare;
    int Quantity;
    double Discount;

    EcommerceSites(String fashion,String mobiles,String electronics,String homeAppliances,String food,String healthcare,int quantity, int discount)
    {
        this.Fashion=fashion;
        this.Mobiles=mobiles;
        this.Electronics=electronics;
        this.HomeAppliances=homeAppliances;
        this.Food=food;
        this.Healthcare=healthcare;
        this.Quantity=quantity;
        this.Discount=discount;
    }


    void printdetails()
    {
        System.out.println("Fashion-->"+Fashion);
        System.out.println("Mobiles-->"+Mobiles);
        System.out.println("Electronics-->"+Electronics);
        System.out.println("HomeAppliances-->"+HomeAppliances);
        System.out.println("Food-->"+Food);
        System.out.println("Healthcare-->"+Healthcare);
        System.out.println("Quantity-->"+Quantity);
        System.out.println("Discount-->"+Discount);



    }

}

