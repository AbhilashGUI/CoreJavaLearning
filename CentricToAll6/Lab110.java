package CentricToAll6;

public class Lab110
{
    public static void main(String[] args)
    {
        //Using Array with all Primitive data types and non-primitive data types like string

        boolean[] b={true,false};
        char[] c={'c','d','e','f'};
        byte[] e={14,26,72,127};
        short[] s={128,256,512,1024,23654};
        int[] i={2048,4096,8192,16384};
        long[] l={204148,4850096,859192,16425384};
        double[] d={45.4d,65.6d,78.9d};
        float[] f={21.1f,32.5f,64.7f};

        String[] names={"Vemula","Abhilash","Sharma"};
        System.out.println(i.length); //Length of an integer array;
        System.out.println(l.length); //Length of a long array
        System.out.println(c.length);//Length of a char array
        System.out.println(d.length);//Length of a double  array
        System.out.println(names.length); //Length of a String array
        for (int j = 0; j <= names.length-1; j++)
        {
          System.out.println(names[j]);
        }









    }
}
