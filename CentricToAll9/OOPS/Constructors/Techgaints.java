package CentricToAll9.OOPS.Constructors;

public class Techgaints {
    String name;
    String company;
    String industry;
    int since;


    Techgaints(String name, String company, String industry, int since) {
        this.name = name;
        this.company = company;
        this.industry = industry;
        this.since = since;

    }
        void printdetails()
        {
            System.out.println("name-->" + this.name);
            System.out.println("company-->" + this.company);
            System.out.println("industry-->" + this.industry);
            System.out.println("since-- >" + this.since);
        }




        public static void main (String[] args)
        {

            Techgaints techie = new Techgaints("SundarPichari","Google","IT",2015);
            techie.printdetails();
            Techgaints techie2= new Techgaints("Satyanadella","Microsoft","IT",2014);
            techie2.printdetails();
            Techgaints techie3= new Techgaints("Shantanu narayen","Adobe","IT",2007);
            techie3.printdetails();
            Techgaints techie4= new Techgaints("ArvindKrishna","IBM","IT",2020);
            techie4.printdetails();


        }
    }
