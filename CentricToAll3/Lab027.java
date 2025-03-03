package CentricToAll3;

public class Lab027 {
    public static void main(String[] args) {

        //using floating point variables
        float Milk_perliter = 40;
        float state_gst = 1;
        float central_gst = 1;
        double invoice = Milk_perliter + state_gst + central_gst;
        System.out.println(invoice);


        int cashwithdrawl=100000;
        int cashhandlingcharges=500;
        int gst_oncashhandlingcharges=90;
        long debitedTransaction=cashwithdrawl+cashhandlingcharges+gst_oncashhandlingcharges;
        System.out.println(debitedTransaction);






    }
}

