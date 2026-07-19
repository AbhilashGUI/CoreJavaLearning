package CentricToAll13.Multithreading.Generics;

public class Lab233 {
    public static void main(String[] args) {

        Multi_datatype("Abhilash");
        Multi_datatype('M');
        Multi_datatype(32);
        Multi_datatype(false);
        Multi_datatype(9563258742l);


    }

    public static <Gen> void Multi_datatype(Gen Customerdetails)
    {
        System.out.println(Customerdetails);
    }

}
