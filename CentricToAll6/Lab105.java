package CentricToAll6;

public class Lab105
{
    public static void main(String[] args)
    {
        String[] Dairy1={"Milk","Curd","Butter","Cheese","Ghee"};
        String[] Dairy2={"Cream","Yogurt","Frozen","Custurd","Buttermilk"};
        String[] Dairy3=Dairy1;
        System.out.println(Dairy1.equals(Dairy2));
        System.out.println(Dairy3.equals(Dairy1));

        //In case of string, we will compare the values.
        // Based on the similar values JVM validates and displays the output


        //Tricky question
       Dairy1[0]="Milk";
       System.out.println(Dairy3[0]);
       //Since, Dairy1=Dairy3. If any changes made in arr1, it reflect in arr3 as well.
    }
}
