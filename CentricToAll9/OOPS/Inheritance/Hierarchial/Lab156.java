package CentricToAll9.OOPS.Inheritance.Hierarchial;

import CentricToAll9.OOPS.Inheritance.Hierarchial.StateExecutive;
import CentricToAll9.OOPS.Inheritance.Hierarchial.StateGovernment;
import CentricToAll9.OOPS.Inheritance.Hierarchial.StateJudiciary;
import CentricToAll9.OOPS.Inheritance.Hierarchial.StateLegislature;

public class Lab156
{

    public static void main(String[] args)
    {

        //RUNNER OF STATEGOVERNMENTCLASS//

        //Hierarchal concept
        //StateGovernment sg= new StateGovernment();


        StateExecutive se=new StateExecutive();
        se.instructionsof();

        StateLegislature sl=new StateLegislature();
        sl.instructionsof();

        StateJudiciary sj=new StateJudiciary();
        sj.instructionsof();







    }
}
