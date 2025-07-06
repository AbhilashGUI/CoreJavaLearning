package CentricToAll10.OOPS.Polymorphism.methodoverloading;

public class Methodoverloading {
    public static void main(String[] args) {


        new Methodoverloading().Applicantdetails("Sai");
        new Methodoverloading().Applicantdetails('M');
        new Methodoverloading().Applicantdetails(30);
        new Methodoverloading().Applicantdetails(4532698745l);
        new Methodoverloading().Applicantdetails(36.7);


    }
    //Defining the functions

    void Applicantdetails(String name)
    {
        name="vicky";
        System.out.println("Applicant name : "+ name);

    }
    void Applicantdetails(int age)
    {
        System.out.println("Applicant age : "+ age);

    }

    void Applicantdetails(char Gender)
    {

        System.out.println("Applicant Gender: "+ Gender);

    }
    void Applicantdetails(long mobilenumber)
    {

        System.out.println("Applicant mobilenumber: "+ mobilenumber);

    }

   void Applicantdetails(double earning)
   {
       System.out.println("Applicant earning:" +earning);
   }




}
