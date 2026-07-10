package CentricToAll10.OOPS.Polymorphism.methodoverloading;

public class Methodoverloading {
    public static void main(String[] args) {

     new Methodoverloading().applicantdetails("Abhilash");
     new Methodoverloading().applicantdetails(30);
     new Methodoverloading().applicantdetails('M');
     new Methodoverloading().applicantdetails(6598741236l);
     new Methodoverloading().applicantdetails(63.5);
     new Methodoverloading().applicantdetails(5.4f);

    }


    void applicantdetails(String Name) {
        System.out.println("My name :" + Name);
    }

    void applicantdetails(int i) {
        System.out.println("My age :" + i);
    }

    void applicantdetails(char c) {
        System.out.println("Gender :" + c);
    }

    void applicantdetails(long l) {
        System.out.println("My contact number :" + l);

    }

    void applicantdetails(double d) {
        System.out.println("Weight :" + d);
    }

    void applicantdetails(float f) {
        System.out.println("Height :" + f);
    }
}
