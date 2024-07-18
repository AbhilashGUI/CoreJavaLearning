package CentricToAll10.OOPS.Inheritance.Multilevel;

import CentricToAll10.OOPS.Inheritance.Multilevel.Python;

public class Lab152
{

    public static void main(String[] args)
    {
           //RUNNER OF PYTHONCLASS//

        PROGRAMMINGLANG pl=new PROGRAMMINGLANG();
        // In this case, only parent class is invoked
        Python P=new Python();
        //Both parent and child classes are invoked.


        PROGRAMMINGLANG pl2=new PROGRAMMINGLANG();  //Parent reference can be allowed to use  child object
        //Python P=new PROGRAMMINGLANG();     //Child reference cannot be allowed to use parent object


        //Single inheritance concept, where child objects referring to the parent class

      Python p=new Python();
      p.python_author();
      p.python_oops_author();





    }
}
