package CentricToAll6;

public class Lab120 {
    public static void main(String[] args)
    {
        String[][] names={{"Vemula","Abhilash","Sharma"},{"Vicky","Sharma","B.tech"}};
        for (int i = 0; i < names.length; i++)
        {
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[i][j]+ "\t");
            }
            System.out.println();
        }
        }

}
