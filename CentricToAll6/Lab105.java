package CentricToAll6;

public class Lab105
{
    public static void main(String[] args)
    {
        String[] Dairyproducts1={"Milk","Curd","Butter","Cheese","Ghee"};
        String[] Dairyproducts2={"Cream","Yogurt","Frozen","Custurd","Buttermilk"};
        String[] Dairyproducts3=Dairyproducts1;
        System.out.println(Dairyproducts1.equals(Dairyproducts2));
        System.out.println(Dairyproducts3.equals(Dairyproducts1));

        //In case of string, we will compare the values.
        // Based on the similar values JVM validates and displays the output


        //Tricky question
       Dairyproducts3[0]="Milk";
       System.out.println(Dairyproducts1[0]);
       //Since, product1=product3. If any changes made in arr1, it reflect in arr3 as well.
    }
}
