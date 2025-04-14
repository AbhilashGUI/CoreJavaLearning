package CentricToAll6;

public class Lab120 {
    public static void main(String[] args)
    {
        String[][] names={{"Vemula","Abhilash",},{"Vicky","Abhi"}};
        for (int i = 0; i < names.length; i++)
        {
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[i][j]+ " ");  //It creates space between numbers
            }
            System.out.println();
        }
        }

}
