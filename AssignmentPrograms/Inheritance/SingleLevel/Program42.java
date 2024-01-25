package AssignmentPrograms.Inheritance.SingleLevel;

public class Program42 {



    String affiliation;

    int schoolcode;


    public Program42(String affiliation, int schoolcode) {
        this.affiliation = affiliation;
        this.schoolcode = schoolcode;
    }

      void printdetails()
      {
          System.out.println("Affiliation state  board : "+affiliation);
          System.out.println("Schoolcode : "+ schoolcode + " is affiliated to " + affiliation);

    }

}
