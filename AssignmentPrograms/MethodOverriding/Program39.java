package AssignmentPrograms.MethodOverriding;

import AssignmentPrograms.MethodOverriding.Program37;
import AssignmentPrograms.MethodOverriding.Program38;

public class Program39
{
    public static void main(String[] args)
    {
        //Note: Runner class for the Programs37and38




        Program37 p1=new Program37();
        p1.course();                     //Parent class  to Parent object

        Program38 p=new Program38();
        p.course();                      //Child class to Child object



        Program37 p2=new Program38();
        p2.course();                     //Parent class to Child object








    }






}
