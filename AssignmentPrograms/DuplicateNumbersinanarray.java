package AssignmentPrograms;

public class DuplicateNumbersinanarray {

    public static void main(String[] args)
    {

        int[] number={10,30,40,10,25,40};

        System.out.println("Duplicate numbers:");

        for (int i=0;i<=number.length-1;i++)
        {
            for (int j=i+1;j<=number.length-1;j++)
            {
                if(number[i]==number[j])
                {
                    System.out.println(number[i]);
                }
            }
        }


    }
}