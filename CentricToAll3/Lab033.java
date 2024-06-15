package CentricToAll3;

public class Lab033
{

    public static void main(String[] args) {
        //Ternary operator: Is similar like if condition >> If this is T print i else print j

        int i =true ? 10 : 20;   //In this case it is printing the true condition
        int i2=45>60 ? 90 : 120;  //In this case it is printing false condition
        System.out.println(i);
        System.out.println(i2);

        String covideffected=1<3 ? "Huge effect of first wave" : "Less effect of third wave";
        System.out.println(covideffected);


        //Simple example
        int a =20;
        int b=40;
        int min=a<b ? a:b ;
        int max=b>a ? b:a;
        System.out.println(min);
        System.out.println(max);

        //Critical example
        int c = 45;
        int d = 54;
        int e = 69;
        int Min = (c < d) ? ((c < e) ? c : d) : ((e > d) ? e: d);
        System.out.println(Min);

    }
}
