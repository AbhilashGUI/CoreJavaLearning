package CentricToAll10.OOPS.Inheritance.Single;

public class Programminglanguages {
    //Attributes

    String language;

    int Foundedyear;

    //Note: Bydefault, Default constructor will be executed and shown as output

    /**
     * Programminglanguages()
     * {
     * System.out.println("Default constructor");
     * }
     **/

    Programminglanguages(String language, int FOY) {
        this.language = language;
        this.Foundedyear = FOY;
    }


    void printinfo() {
        //System.out.println(language);
        //System.out.println(Foundedyear);
        System.out.println("Language-->" + this.language + " was founded in---> " + this.Foundedyear);
    }


}









