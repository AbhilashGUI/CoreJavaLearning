package CentricToAll6;

public class Lab098
{
    public static void main(String[] args)

    {
        //No. of students
        String[] Students={"Vinay","Vishal","Vimal","Vishanth","Vicky","Vignesh"};
        System.out.println(Students[0]);
        System.out.println(Students[1]);
        System.out.println(Students[2]);
        System.out.println(Students[3]);
        System.out.println(Students[4]);
        System.out.println(Students[5]);
        //System.out.println(Students[6]);  //It will throw an error
        // Since we are declaring the index, which is not a part of array.Hence it is throwing an Array indexout of bound exception.

        System.out.println("No. of students = " + Students.length);

        int[] Class={2,4,6,7,8,9};
        System.out.println(Students[0] + " belongs to class "+ Class[0]);
        System.out.println(Students[1] + " belongs to class "+ Class[1]);
        System.out.println(Students[2] + " belongs to class "+ Class[2]);
        System.out.println(Students[3] + " belongs to class "+ Class[3]);
        System.out.println(Students[4] + " belongs to class "+ Class[4]);
        System.out.println(Students[5] + " belongs to class "+ Class[5]);



    }
}

