package CentricToAll6;

public class Lab113
{
    public static void main(String[] args)
    {
        //1D array
        int[] agegroups=new int[4];
        agegroups[0]=20;
        agegroups[1]=25;
        agegroups[2]=30;
        agegroups[3]=40;

        for (int i=0;i<agegroups.length;i++)
        {
            System.out.println(agegroups[i]);
        }
             System.out.println("Length "+ agegroups.length);

      //Same using the while loop
        int i=0;
        while (i<agegroups.length)
        {
            System.out.println(agegroups[i]);
            i++;
        }


    }
}
