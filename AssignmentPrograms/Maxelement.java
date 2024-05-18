package AssignmentPrograms;

public class Maxelement {
    public static void main(String[] args)

    {
        //Maximum element in an array

        int[] array = {6, 14, 24, 37, 93, 66, 78,};

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum element in an array :" + max);
    }


}





