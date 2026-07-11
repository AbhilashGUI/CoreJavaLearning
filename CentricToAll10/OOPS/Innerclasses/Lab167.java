package CentricToAll10.OOPS.Innerclasses;

public class Lab167 {

    public static void main(String[] args)
    {

        Socialmedia socialmedia= new Socialmedia("It has large number of active users");
        Socialmedia.Utilization utilization= socialmedia.new Utilization("Info exchange");
        socialmedia.compatible();
        utilization.usedfor();

    }

}



class Socialmedia{

    public Socialmedia(String watsapp) {
        this.watsapp = watsapp;
    }

    String watsapp;

    void compatible()
    {
        System.out.println("It is compatible for android and ios");
    }

    class Utilization
    {
        public Utilization(String feature) {
            this.feature = feature;
        }

        String feature;

        void usedfor()
        {
            System.out.println("It is widely used for sharing information");
        }
    }
}





