package CentricToAll10.OOPS.Inheritance.Hierarchial;

import CentricToAll10.OOPS.Inheritance.Hierarchial.StateExecutive;
import CentricToAll10.OOPS.Inheritance.Hierarchial.StateGovernment;
import CentricToAll10.OOPS.Inheritance.Hierarchial.StateJudiciary;
import CentricToAll10.OOPS.Inheritance.Hierarchial.StateLegislature;

public class Lab156
{

    public static void main(String[] args) {

        //RUNNER OF STATEGOVERNMENTCLASS//

        //Hierarchal concept
        //StateGovernment sg = new StateGovernment();

        StateExecutive se=new StateExecutive("Governor","Chief Minister","Council Of Ministers");
        se.functionsastheyinstructed();

        StateLegislature sl=new StateLegislature("Legislative Assembly","Legislative Council");
        sl.electedby();

        StateJudiciary sj= new StateJudiciary("Highcourt","Districtcourt","Othercourts");
        sj.judgeappointedby();


        StateGovernment stateGovernment= new StateExecutive("G","CM","COM");
        stateGovernment.StateGovernment();

        StateGovernment stateGovernment1= new StateLegislature("MLA","MLC");
        stateGovernment1.StateGovernment();

        StateGovernment stateGovernment2= new StateJudiciary("Judge1","Judge2","Judge3");
        stateGovernment2.StateGovernment();

    }
}
