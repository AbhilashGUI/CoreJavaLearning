package AssignmentPrograms;

public class Largestelementinanarray {

    public static void main(String[] args) {

        int[] array={25,85,36,47,75,89,52};

        int largest=array[0];

        for (int i=0;i<=array.length-1;i++)
        {
            if (array[i]>largest)
            {
                largest=array[i];
            }
        }

        System.out.println("The Largest element in an array: "+largest);
    }
}