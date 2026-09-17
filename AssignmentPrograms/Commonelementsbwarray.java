package AssignmentPrograms;

public class Commonelementsbwarray {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {30, 40, 60, 70, 80};

        System.out.println("Common elements: ");

        for (int i=0;i<=array1.length-1;i++)
        {
            for (int j=0;j<=array2.length-1;j++)
            {
                if(array1[i]==array2[j])
                {
                    System.out.println(array1[i]);
                }
            }
        }

    }
}


