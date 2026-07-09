package CentricToAll9.OOPS.Constructors;

public class Techgaints {

    String Name;
    String Company;
    String Role;
    int Since;



    Techgaints(String Name, String Company, String Role, int Since)
    {
        this.Name=Name;
        this.Company=Company;
        this.Role=Role;
        this.Since=Since;
    }


    void printdetails()
    {
        System.out.println("Name : "+Name);
        System.out.println("Company : "+Company);
        System.out.println("Role : "+Role);
        System.out.println("Since : "+Since);


    }


    public static void main(String[] args)
    {
        Techgaints techie=new Techgaints("Shantanu Narayen","Adobe","Chairman & CEO",2007);
        techie.printdetails();

        Techgaints techie2=new Techgaints("Jayashree Ullal","Arista Networks","President & CEO",2008);
        techie2.printdetails();

        Techgaints techie3=new Techgaints("Satya Nadella","Microsoft","Chairman & CEO",2014);
        techie3.printdetails();

        Techgaints techie4=new Techgaints("George Kurian","NetApp","CEO",2015);
        techie4.printdetails();

        Techgaints techie5=new Techgaints("Sundar Pichai","Google"," CEO",2015);
        techie5.printdetails();

        Techgaints techie6=new Techgaints("Sunjay Mehrotra","Micron","President & CEO",2017);
        techie6.printdetails();

        Techgaints techie7=new Techgaints("Nikesh Arora","Palo Alto Networks","Chariman & CEO",2018);
        techie7.printdetails();

        Techgaints techie8=new Techgaints("Arvind Krishna","IBM","Chariman & CEO",2020);
        techie8.printdetails();

        Techgaints techie9=new Techgaints("Neal Mohan","Youtube"," CEO",2023);
        techie9.printdetails();

        Techgaints techie10=new Techgaints("Anjali Sud","Tubi"," CEO",2023);
        techie10.printdetails();




    }
}