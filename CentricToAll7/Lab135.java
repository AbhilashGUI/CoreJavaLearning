package CentricToAll7;

public class Lab135
{
    public static void main(String[] ref_name)   //Replacing the argument with ref_name
    {
        System.out.println("Executable declared arguments");

        int c=main(101);
        System.out.println(c);
        String c1=main1("Abhilash","Vemula");
        System.out.println(c1);
    }


    static int main(int a)
    {
        return a+99;
    }
    static String main1(String a, String b)
    {
        return a+ " Sharma " +b;
    }





}




