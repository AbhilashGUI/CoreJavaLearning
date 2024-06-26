package CentricToAll6;

public class Lab113
{
    public static void main(String[] args)
    {
        int age[]=new int[4];
        age[0]=12;
        age[1]=22;
        age[2]=32;
        age[3]=42;

        for (int i = 0; i <= age.length-1; i++)
        {
          System.out.println(age[i]);
        }
        System.out.println(age.length);


        //Using whileloop
        int i=0;
        while (i<=age.length-1)
        {
            System.out.println(age[i]);

            i++;   //This is a 1D array
        }




    }
}
