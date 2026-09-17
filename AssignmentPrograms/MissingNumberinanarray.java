package AssignmentPrograms;

public class MissingNumberinanarray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5};

        for (int i=1;i<=numbers.length+1;i++)

        {
            boolean found=false;

            for (int number:numbers)
            {
                if(number==i)
                {
                    found=true;
                    break;
                }
            }

         if(!found)
         {
             System.out.println("Missing number:"+i);
             break;
         }
        }
    }
}