package CentricToAll10.OOPS.Polymorphism;

public class Methodoverloading {
    public static void main(String[] args) {


        new Methodoverloading().Applicantdetails("Sai");
        new Methodoverloading().Applicantdetails('M');
        new Methodoverloading().Applicantdetails(29);



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






}
