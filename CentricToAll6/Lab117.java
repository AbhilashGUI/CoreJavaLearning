package CentricToAll6;

public class Lab117 {
    public static void main(String[] args) {

        //3 rows and 4 columns
        int[][] arr={{5,10,15,20},{25,30,35,40},{45,50,55,60}};
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + "\t");  //It creates space between numbers
            }
            System.out.print("\n");  //It moves to next line
        }


    }
}


