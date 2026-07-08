package CentricToAll8;

public class Lab140
{
    public static void main(String[] args)
    {

        //Real-time example

        //Since it is immutable, password can't be updated
        String Password="onfire@369";


        // StringBuffer or StringBuilder are mutable, password can be changed as many  times as required

        StringBuilder password=new StringBuilder("recon@1");
        password.append("45");
        System.out.println(password);

        StringBuffer  password1=new StringBuffer("testcheck");
        password1.append(23);
        System.out.println(password1);




    }
}
