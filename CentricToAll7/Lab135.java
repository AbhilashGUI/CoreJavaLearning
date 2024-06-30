package CentricToAll7;

public class Lab135
{
    public static void main(String[] ref_name)   //Replacing the argument with ref_name
    {
        System.out.println("Executable declared arguments");

        int c=main(101);
        System.out.println(c);
        String c1=main("Abhilash ");
        System.out.println(c1);
    }


    static int main(int a)
    {
        return a+99;
    }
    static String main(String a)
    {
        return a+"Sharma";
    }





}




