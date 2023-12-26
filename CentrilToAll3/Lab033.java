package CentrilToAll3;

public class Lab033
{

    public static void main(String[] args) {
        //Ternary operator: Is similar like if condition >> If this is T print i else print j

        /*int i =true ? 10 : 20;   //In this case it is printing the true condition
        int i2=45>60 ? 90 : 120;  //In this case it is printing false condition
        System.out.println(i);
        System.out.println(i2);

        String covideffected=2<3 ? "first wave" : "Third wave";
        System.out.println(covideffected);*/


        //Simple example
        /*int i =20;
        int j=40;
        int min=i<j ? i:j;
        int max=j>i ? j:i;
        System.out.println(min);
        System.out.println(max);*/

        //Critical example
        int i = 45;
        int j = 54;
        int k = 69;
        int Min = (i < j) ? ((i < k) ? i : j) : ((k > j) ? k : j);
        System.out.println(Min);

    }
}
