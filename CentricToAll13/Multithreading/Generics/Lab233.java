package CentricToAll13.Multithreading.Generics;

public class Lab233 {
    public static void main(String[] args) {

          Multidatatype("Abhilash");
          Multidatatype('M');
          Multidatatype(29.8);
          Multidatatype(false);
          Multidatatype(30);


    }


    public static <Gen> void Multidatatype(Gen Applicantdetails) {
        System.out.println(Applicantdetails);





    }
}
