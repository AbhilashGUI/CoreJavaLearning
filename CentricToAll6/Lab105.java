package CentricToAll6;

public class Lab105
{
    public static void main(String[] args)
    {
        String[] Dairy={"Milk","Curd","Butter","Cheese","Ghee"};
        String[] Dairy2={"Vijaya","Heritage","Amul","Cheese","Gowardhan"};
        String[] Dairy3=Dairy;
        System.out.println(Dairy.equals(Dairy2));
        System.out.println(Dairy3.equals(Dairy));

        //In case of string, we will compare the values. Based on the similar values JVM validates and displays the output


        //Tricky question
       Dairy[0]="Milk";
       System.out.println(Dairy3[0]);
       //Since, Dairy=Dairy3. If any changes made in arr1, it reflect in arr3 as well.
    }
}
