package CentricToAll10.OOPS.Inheritance.Hierarchial;

public class Java extends Proglanguages {

    String Feature1;
    String Feature2;


    Java(String feature1, String feature2) {
        this.Feature1 = feature1;
        this.Feature2 = feature2;
    }


    void printdetails() {

        System.out.println("Syntax-->"+Feature1);
        System.out.println("Performance-->"+Feature2);

    }
}