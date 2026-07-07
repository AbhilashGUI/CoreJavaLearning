package CentricToAll6;

public class Lab098
{
    public static void main(String [] args)
    {
  String[] rolledout={"Abhilash", "Apurva","Nirmal","Suraj","Nirmala","Suvan"};
  System.out.println(rolledout[0]);
  System.out.println(rolledout[1]);
  System.out.println(rolledout[2]);
  System.out.println(rolledout[3]);
  System.out.println(rolledout[4]);
  System.out.println(rolledout[5]);
 //System.out.println(rolledout[6]);//It will throw an error
        // Since we are declaring the index, which is not a part of array. Hence it is throwing an Array indexout of bound exception.

 String[] month={"Jan","Feb","Mar","Apr","May","Jun"};
 System.out.println(rolledout[0] + " enrolled in "+ month[0]);
 System.out.println(rolledout[1] + " enrolled in "+ month[1]);
 System.out.println(rolledout[2] + " enrolled in "+ month[2]);
 System.out.println(rolledout[3] + " enrolled in "+ month[3]);
 System.out.println(rolledout[4] + " enrolled in "+ month[4]);
 System.out.println(rolledout[5] + " enrolled in "+ month[5]);



    }
}

