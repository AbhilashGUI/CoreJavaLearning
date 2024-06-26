package CentricToAll6;

public class Lab122
{
    public static void main(String[] args)
    {
        String[][] names={{"TTA","Pramod","DipakPardesi"},{"Abhilash","Aman Gupta","Shivani","Sravanthi","Hitesh"}};
        System.out.println("Length of Row 1 : " + names[0].length);
        System.out.println("Length of Row 2 : " + names[1].length);
        System.out.println(names[0][0]);  //To retrieve the data of 1st element of 1st slab/phase
        System.out.println(names[0][2]);  //To retrieve the data of 3rd element of 1st slab/phase
        System.out.println(names[1][1]);  //To retrieve the data of 2nd element of 2nd slab/phase
        System.out.println(names[1][3]);  //To retrieve the data of 4rth element of 2nd slab/phase
    }
}