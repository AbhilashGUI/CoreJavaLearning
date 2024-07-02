package CentricToAll8;

public class Lab140
{
    public static void main(String[] args)
    {

        //Real-time example

        //Since it is immutable, password can't be changed
        String Password="onfire@369";


        //Since it is mutable, password can be changed as many number times as required
        //Can go with StringBuffer or StringBuilder
        StringBuilder sb=new StringBuilder("recon@123");
        sb.append("45");
        System.out.println(sb);






    }
}
