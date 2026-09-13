package CentricToAll6;

public class Lab098
{
    public static void main(String [] args)
    {
  String[] rolledout={"Abhilash", "Apurva","Nirmal","Suraj","Nirmala","Suvan","Ananth","Swamy","Uday"};
  System.out.println(rolledout[0]);
  System.out.println(rolledout[1]);
  System.out.println(rolledout[2]);
  System.out.println(rolledout[3]);
  System.out.println(rolledout[4]);
  System.out.println(rolledout[5]);
  System.out.println(rolledout[6]);
  System.out.println(rolledout[7]);
  System.out.println(rolledout[8]);
 //System.out.println(rolledout[9]);//It will throw an error
        // Since we are declaring the index, which is not a part of array. Hence it is throwing an Array indexout of bound exception.

 String[] month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep"};
 System.out.println(rolledout[0] + " enrolled in "+ month[0]);
 System.out.println(rolledout[1] + " enrolled in "+ month[1]);
 System.out.println(rolledout[2] + " enrolled in "+ month[2]);
 System.out.println(rolledout[3] + " enrolled in "+ month[3]);
 System.out.println(rolledout[4] + " enrolled in "+ month[4]);
 System.out.println(rolledout[5] + " enrolled in "+ month[5]);
 System.out.println(rolledout[6] + " enrolled in "+ month[6]);
 System.out.println(rolledout[7] + " enrolled in "+ month[7]);
 System.out.println(rolledout[8] + " enrolled in "+ month[8]);




    }
}

