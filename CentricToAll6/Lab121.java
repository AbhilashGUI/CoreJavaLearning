package CentricToAll6;

public class Lab121
{
    public static void main(String[] args) {
        int[][] arr = {{3,5,8},{12,23,37,45}, {52, 63,74,89,94}};
        System.out.println("Length of Row1 :" + arr[0].length);
        System.out.println("Length of Row2 :" + arr[1].length);
        System.out.println("Lenght of Row3 :" + arr[2].length);
        System.out.println(arr[0][0]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][2]);
        System.out.println(arr[1][3]);
        System.out.println(arr[2][4]);
    }
}