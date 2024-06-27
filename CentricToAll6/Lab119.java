package CentricToAll6;

public class Lab119
{
    public static void main(String[] args)
    {
        char[][] arr={{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        for (int i = 0; i <= arr.length-1 ; i++)
        {
            for (int j = 0; j <= arr.length-1; j++) {
                System.out.print(arr[i][j] + "\t");  //It creates space
            }
            System.out.println();
        }
    }
}
